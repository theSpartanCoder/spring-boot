package com.spartancoder;

import org.springframework.stereotype.Service;

@Service
public class SpartanService {
    public String getSaluteMessage(String type){
        if(type.equals("hello")){
            return "Spartans, what is your profession? -Ahoo, ahoo, ahoo";
        }
        if(type.equals("goodbye")){
            return "Spartans, prepare for glory!";
        }
        else {
            return "Sorry, no message available for " + type;
        }
    }
}
