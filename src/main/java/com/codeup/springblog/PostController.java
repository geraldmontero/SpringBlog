package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/posts")
    @RequestMapping(path= "/posts", method = RequestMethod.GET)
    @ResponseBody
    public String posts(){
        return "POST INDEX PAGE";
    }

    @RequestMapping(path= "/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String posts(@PathVariable String id){
        return "view post " + id;
    }

    @RequestMapping(path= "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String create(){
        return "Create form will be here";
    }
    @PostMapping("/posts/create")
    @ResponseBody

    public String newPost(){
        return "new blog posts here";
    }
}
