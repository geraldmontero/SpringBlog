package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @GetMapping("/hello/{name}")

    public String hello(@PathVariable String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
//@RequestMapping(path= "/hello/{name}/and/{age}", method = RequestMethod.GET)
//    @ResponseBody
//    public String helloNameAge(@PathVariable String name, @PathVariable int age){
//        return "hey user "+ name +"you are " + age;
//}


}
