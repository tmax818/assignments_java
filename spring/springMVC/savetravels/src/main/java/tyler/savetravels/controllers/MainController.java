package tyler.savetravels.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tyler.savetravels.models.Travel;
import tyler.savetravels.services.TravelService;

@Controller
public class MainController {
    
    @Autowired TravelService travelService;

    @GetMapping("/travels")
    public String index(@ModelAttribute("travel") Travel travel, Model model){
        List<Travel> travels = travelService.allTravels();
        model.addAttribute("travels", travels);
        return "index.jsp";
    }

    @PostMapping("/travels")
    public String create(@ModelAttribute("travel") Travel travel){
        System.out.println(travel);
        travelService.createTravel(travel);
        return "redirect:/travels";

    }
}
