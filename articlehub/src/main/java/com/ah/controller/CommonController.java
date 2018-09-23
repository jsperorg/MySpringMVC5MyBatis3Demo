package com.ah.controller;

import com.ah.model.Article;
import com.ah.service.CommonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jianyuchen on 2018/9/22.
 *
 * 通用控制器
 * 使用本控制器,可以不建实体类,因为内部使用map传递数据.
 * 本控制器的目的是结合mybatis配置,用map代替实体类,接收map参数,执行增删改查,查询表中数据返回map结果.
 * 在web应用表较少(10张以下),为了提高开发效率,简化程序构成,可以完全使用本控制器完成功能.
 * 本控制器同时也可以和实体类控制器搭配使用,用来做多表关联查询.
 */
@Controller
@RequestMapping("/common")//如果整个web应用不需要实体类,仅仅使用此控制器,那么这个可以去掉.
public class CommonController {


    @Resource
    CommonService commonService;


    //localhost:8080/common/article/add
    @GetMapping("/article/add")
    public String articleAdd(){

        return "common_article_add";
    }


    //localhost:8080/common/article/save
    @PostMapping("/article/save")
    public String save(@RequestParam HashMap param, Model model){
        commonService.insertArticle(param);
        System.out.println(param.get("articleTitle"));
        model.addAttribute("result",param);
        return "show";
    }



    //localhost:8080/common/article/findArticleBy?id=1
    @GetMapping("/article/findArticleBy")
    public String findArticleBy(@RequestParam HashMap param, Model model){
        HashMap result = commonService.findArticleBy(param);

        model.addAttribute("result",result);
        return "common_article_map_show";
    }


    //localhost:8080/common/article/delete/1
    @GetMapping("/article/delete/{id}")
    public String save(@PathVariable(value="id") Integer id,Model model){
        commonService.deleteArticle(id);
        return "show";
    }



}
