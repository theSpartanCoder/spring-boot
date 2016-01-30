package com.spartancoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpartanController {

    @Autowired
    private SpartanService spartanService;

    @RequestMapping("/salute/{type}")
    @ResponseBody
    public String salute(@PathVariable String type) {
        return spartanService.getSaluteMessage(type);
    }
}