package tyler.dojoandninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tyler.dojoandninjas.models.Dojo;
import tyler.dojoandninjas.models.Ninja;
import tyler.dojoandninjas.services.DojoService;
import tyler.dojoandninjas.services.NinjaService;


@Controller
public class MainController {

    @Autowired DojoService dojoService;
    @Autowired NinjaService ninjaService;
    
    @RequestMapping(value={"/dojos/new"})
    public String newDojo(@ModelAttribute("dojo")Dojo dojo){
        return "dojos/new.jsp";
    }

    @PostMapping("/dojos")
    public String createDojo(@ModelAttribute("dojo")Dojo dojo){
        dojoService.addDojo(dojo);
        return "redirect:/";
    }

    @GetMapping("/dojos/{id}")
    public String showDojo(@PathVariable("id")Long id, Model model){
        Dojo dojo = dojoService.getOne(id);
        System.out.println(dojo.getNinjas());
        model.addAttribute("dojo", dojo);
        return "dojos/show.jsp";

    }
    
    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninja")Ninja ninja, Model model){
        List<Dojo> dojos = dojoService.getAll();
        model.addAttribute("dojos", dojos);
        return "ninjas/new.jsp";
    }

    @PostMapping("/ninjas")
    public String createNinja(@ModelAttribute("ninja")Ninja ninja){
        ninjaService.addNinja(ninja);
        return "redirect:/";
    }
}
