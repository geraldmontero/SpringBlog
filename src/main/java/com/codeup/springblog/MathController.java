package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
    @GetMapping("/add")

    @RequestMapping(path= "/add/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public int add (@PathVariable int num1, @PathVariable int num2){
        return (num1 + num2);
    }
    @GetMapping("/subtract")
    @RequestMapping(path= "/subtract/{num1}/from/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public int sub (@PathVariable int num1, @PathVariable int num2){
        return (num2 - num1);
    }
    @GetMapping("/multiply")
    @RequestMapping(path= "/multiply/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public int multiply (@PathVariable int num1, @PathVariable int num2){
        return (num2 * num1);
    }
    @GetMapping("/divide")
    @RequestMapping(path= "/divide/{num1}/by/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public int divide (@PathVariable int num1, @PathVariable int num2){
        return (int) ((double)num1 / (double) num2);
    }

}
