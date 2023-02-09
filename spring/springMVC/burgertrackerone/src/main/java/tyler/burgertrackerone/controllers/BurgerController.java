package tyler.burgertrackerone.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tyler.burgertrackerone.models.Burger;
import tyler.burgertrackerone.services.BurgerService;

@Controller
public class BurgerController {

    @GetMapping("/")
    public String index(Model model){
        List<Burger> burgers = BurgerService.allBurgers();
        
        return "index.jsp";
    }
    
}
