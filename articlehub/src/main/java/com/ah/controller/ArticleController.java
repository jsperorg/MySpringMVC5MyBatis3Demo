package com.ah.controller;

import com.ah.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.ah.model.Article;

import javax.annotation.Resource;

/**
 * Created by jianyuchen on 2018/9/20.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Resource
    ArticleService articleService;


    @GetMapping("/add")
    public String add(){

        return "article_add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Article article, Model model){


        articleService.insertArticle(article);

        model.addAttribute("result",article);


        return "show";
    }
}
