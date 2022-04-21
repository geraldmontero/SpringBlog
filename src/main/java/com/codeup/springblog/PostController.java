package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {

    @GetMapping("/posts")
    @RequestMapping(path= "/posts", method = RequestMethod.GET)
    @ResponseBody
    public String postsIndex(Model model){
        ArrayList<Post> allPosts = new ArrayList<>();
        allPosts.add(new Post("title of post ", "post body here"));
        model.addAttribute("allPost",allPosts);


        return "posts/index";
    }

    @RequestMapping(path= "/posts/{id}", method = RequestMethod.GET)

    public String Viewposts(@PathVariable Long id, Model model){
        model.addAttribute("singlePost",new Post("Stuff goes Here for blog","this is the body "));
        return "posts/show " + id;
    }

    @RequestMapping(path= "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String createPost(){
        return "Create form will be here";
    }


    @PostMapping("/posts/create")
    @ResponseBody

    public String newPost(){
        return "new blog posts here";
    }
}
