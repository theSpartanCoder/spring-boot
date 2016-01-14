package com.spartancoder;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class SpartanController {
    @RequestMapping("/hello")
    @ResponseBody
    public String home() {
        return "Spartans, what is your profession? -Ahoo, ahoo, ahoo";
    }
}