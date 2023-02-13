package tyler.counter.Controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {

    @RequestMapping("/")
    public String index(HttpSession session) {
        Integer count = (Integer)session.getAttribute("count");
        if(session.getAttribute("count") == null){
            session.setAttribute("count", 0);
        } else {
            session.setAttribute("count", count += 1);
        }
        return "index.jsp";
    }

    @RequestMapping("/counter")
    public String showCounter(HttpSession session){
        return "show.jsp";

    }


    
}
