package com.spartancoder;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class SpartanController {
    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}