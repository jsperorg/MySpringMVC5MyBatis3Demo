package com.ah.service.impl;

import com.ah.dao.ArticleDao;
import com.ah.model.Article;
import com.ah.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by jianyuchen on 2018/9/21.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    ArticleDao articleDao;

    public void insertArticle(Article article){

        articleDao.insertArticle(article);

    }

}
