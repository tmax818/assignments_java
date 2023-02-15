package tyler.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import tyler.savetravels.models.Travel;
import tyler.savetravels.services.TravelService;

@Controller
public class MainController {
    
    @Autowired TravelService travelService;

    //! CREATE and READ ALL
    @GetMapping("/travels")
    public String index(@ModelAttribute("travel") Travel travel, Model model){
        List<Travel> travels = travelService.allTravels();
        model.addAttribute("travels", travels);
        return "index.jsp";
    }


    @PostMapping("/travels")
    public String create(@Valid @ModelAttribute("travel") Travel travel, BindingResult result){
        if(result.hasErrors()){
            return "index.jsp";
        } else {}
        travelService.createTravel(travel);
        return "redirect:/travels";

    }

    //! READ ONE

    @GetMapping("/travels/{id}")
    public String show(@PathVariable("id")Long id, Model model){
        Travel travel = travelService.findTravel(id);
        model.addAttribute("travel", travel);
        return "show.jsp";
    }

    //! UPDATE
    @GetMapping("/travels/{id}/edit")
    public String edit(@PathVariable("id")Long id, Model model){
        Travel travel = travelService.findTravel(id);
        model.addAttribute("travel",travel);
        return "edit.jsp";
    }

    @PutMapping("/travels/{id}")
    public String update(@Valid @ModelAttribute("travel") Travel travel, BindingResult result) {
        if(result.hasErrors()){
            return "edit.jsp";
        } else {
            travelService.updateTravel(travel);
            return "redirect:/travels";
        }


    }

    // ! DELETE
    @DeleteMapping("/travels/{id}")
    public String destroy(@PathVariable("id")Long id){
        Travel travel = travelService.findTravel(id);
        travelService.deleteTravel(travel);
        return "redirect:/travels";
    }
}
