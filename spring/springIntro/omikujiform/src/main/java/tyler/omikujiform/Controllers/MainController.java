package tyler.omikujiform.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "index.jsp";
    }

    @RequestMapping("/show")
    public String show(
        @RequestParam(value="number") String number,
        @RequestParam(value="city") String city,
        @RequestParam(value="person") String person,
        Model model
    ){
        model.addAttribute("number", number);    
        model.addAttribute("city", city);    
        model.addAttribute("person", person);    
        System.out.println(number);
        return "show.jsp";
    }
    
}
