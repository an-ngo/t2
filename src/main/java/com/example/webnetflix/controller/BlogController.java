package com.example.webnetflix.controller;

import com.example.webnetflix.model.Blog;
import com.example.webnetflix.service.blog.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin("*")
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @GetMapping("/list")
    public ModelAndView showListBlog(){
        Iterable<Blog> blogs = blogService.findAll();
        ModelAndView modelAndView = new ModelAndView("blog/list");
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }
    @GetMapping
    public ResponseEntity<Iterable<Blog>> showAllBlog(){
        return new ResponseEntity<>(blogService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Blog> getBlog(@PathVariable Long id){
        return new ResponseEntity<>(blogService.findById(id).get(), HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity<Blog> addBlog(@RequestBody Blog blog){
        blogService.save(blog);
        return new ResponseEntity<>(blog, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Blog> deleteBlog(@PathVariable Long id){
        blogService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
