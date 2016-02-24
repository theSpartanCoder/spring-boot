package com.spartancoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpartanController {

    @Autowired
    private SpartanService spartanService;

    @RequestMapping("/salute")
    @ResponseBody
    public ResponseEntity<String> salute(@RequestParam String saluteId) {
        if(saluteId.equals("hello") || saluteId.equals("goodbye")){
            return new ResponseEntity<>(spartanService.getSaluteMessage(saluteId), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(spartanService.getSaluteMessage(saluteId), HttpStatus.BAD_REQUEST);
        }
    }
}