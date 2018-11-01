package lana.controllers;


import lana.model.Count;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("counter")
public class MyCounterController {

    @ModelAttribute("counter")
    public Count setUpCount() {
        return new Count(0);
    }
    @GetMapping("/")
    public String toIndex(@ModelAttribute("counter") Count count, Model model){
        count.increment();
        return "index";
    }

}
