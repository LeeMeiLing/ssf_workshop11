package ibf2022.ssf.day11workshop.controllers;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = {"/","/index.html"}, produces = MediaType.TEXT_HTML_VALUE)
public class NumbersController {
    
    private Logger logger =Logger.getLogger(NumbersController.class.getName());

    @GetMapping
    public String getIndex(Model model){  // inject a model

        Random rand = new Random();
        int number = rand.nextInt(31);
        String imagePath = "/numbers/number" + number + ".jpg";

        // String imageURL = "/numbers/number%d.jpg".formatted(number);

        logger.log(Level.INFO, "number = %d".formatted(number));

        // Bind the value to model
        model.addAttribute("image", imagePath);
        model.addAttribute("number", number);

        // render the template with the model
        return "index";

    }

}
