package com.ah.dao;


import java.util.HashMap;

/**
 * Created by jianyuchen on 2018/9/21.
 */
public interface CommonDao {

    int insertArticle(HashMap data);
    HashMap findArticleBy(HashMap data);

    int deleteArticle(Integer id);
}
