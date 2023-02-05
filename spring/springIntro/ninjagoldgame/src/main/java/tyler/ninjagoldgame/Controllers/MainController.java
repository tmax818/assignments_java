package tyler.ninjagoldgame.Controllers;

import javax.servlet.http.HttpSession;

import java.util.Date;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    
    @RequestMapping("/")
    public String index(HttpSession session, Model model) {
        if(session.getAttribute("gold") == null){
            session.setAttribute("gold", 0);
            session.setAttribute("log", "");
        } 

        return "index.jsp";
    }

    @PostMapping("/gold")
    public String gold(
        @RequestParam(value="place")String place, HttpSession session){
        System.out.println(place);
        Random rand = new Random();
        Date date = new Date();
        System.out.println(rand.nextInt(11));
        System.out.println(date);
        Integer gold = (Integer)session.getAttribute("gold");
        String log = (String)session.getAttribute("log");
        switch(place){
            case "farm":
                int added = 10 + rand.nextInt(11);
                String message = String.format("You entered a %s and earned %d gold (%s)\n", place, added, date);
                session.setAttribute("gold", gold += added  );
                session.setAttribute("log", log += message );
                break;
            case "cave":
                session.setAttribute("gold", gold += (5 + rand.nextInt(6)));
                break;
            case "house":
                session.setAttribute("gold", gold += (2 + rand.nextInt(4)));
                break;
                case "quest":
                Integer num = rand.nextInt(1000);
                if(num % 2 == 0){
                    session.setAttribute("gold", gold += (rand.nextInt(51)));
                    
                } else {
                    session.setAttribute("gold", gold -= (rand.nextInt(51)));
                }
        }
        return "redirect:/";
    }
}
