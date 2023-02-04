package tyler.hellohuman.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @RequestMapping("/")
    public String index(
        @RequestParam(value = "name", required = false, defaultValue = "Human") String name,
        @RequestParam(value = "lname", required = false, defaultValue = "") String lname,
        @RequestParam(value = "num", required = false, defaultValue = "1") String num)
        {
        // return "Hello " + name + " " + lname;
        String out = String.format(" Hello %s %s", name, lname);
 
        return out.repeat(Integer.parseInt(num));
    }
}
