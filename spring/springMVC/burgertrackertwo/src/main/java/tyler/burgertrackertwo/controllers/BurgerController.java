package tyler.burgertrackertwo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tyler.burgertrackertwo.models.Burger;
import tyler.burgertrackertwo.services.BurgerService;

@Controller
public class BurgerController {


    private final BurgerService burgerService;
    public BurgerController(BurgerService burgerService){
        this.burgerService = burgerService;
    }

    
    
    @GetMapping("/")
    public String index(Model model, @ModelAttribute("burger") Burger burger ){
        List<Burger> burgers = burgerService.allBurgers();
        System.out.println(burgers);
        model.addAttribute("burgers", burgers);
        return "index.jsp";
    }
    
    @PostMapping("/burgers")
    public String create(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model
    ){
        if(result.hasErrors()){
            List<Burger> burgers = burgerService.allBurgers();
            System.out.println(burgers);
            model.addAttribute("burgers", burgers);
            return "index.jsp";
        } else {
            burgerService.createBurger(burger);
            return "redirect:/";
        }
    }

    @RequestMapping("/burgers/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model){
        Burger burger = burgerService.findBurger(id);
        model.addAttribute("burger", burger);
        return "edit.jsp";
    }

    @PutMapping("/burgers/{id}")
    public String update(@Valid @ModelAttribute("burger")Burger burger, BindingResult result){
        if(result.hasErrors()){
            return "edit.jsp";
        } else {
            return "redirect:/";
        }
    }

    
}

