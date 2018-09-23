package com.ah.service;


import java.util.HashMap;

/**
 * Created by jianyuchen on 2018/9/21.
 */
public interface CommonService {

    void insertArticle(HashMap data);

    HashMap findArticleBy(HashMap data);
    void deleteArticle(Integer id);
}
