package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller

public class DiceController {
    @GetMapping("/rollDice")
    public String diceStart(){

        return "rollDice";
    }


    @GetMapping("/rollDice/{num}")
    public String rolldice(@PathVariable int num, Model model){
        model.addAttribute("num", num);
        int randomNum= (int) Math.floor(Math.random()*(6-1+1)+1);
        String message ="";
        if(randomNum == num){
            message = "number matched";
        }else {
            message= "no match found";
        }
        return "rollDice";
    }


}
