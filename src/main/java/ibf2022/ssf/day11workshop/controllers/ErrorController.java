package ibf2022.ssf.day11workshop.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@ControllerAdvice
@RequestMapping(path = {"/error"}, produces = MediaType.TEXT_HTML_VALUE)
public class ErrorController {

    @GetMapping
    public String getError(){  
       return "error";

    }

}
