package tyler.daikichiroutes.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class Controller {

    @RequestMapping("")
    public String index(){
        return "<h1>Welcome!</h1><p><a href=\"/\">home</a></p>";
    }

    @RequestMapping("/today")
    public String today(){
        return "Today you will find luck in all your endeavors!<p><a href=\"/\">home</a></p>";
    }

    @RequestMapping("/tomorrow")
    public String tomorrow(){
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!<p><a href=\"/\">home</a></p>";
    }
    
}
