package com.ah.service.impl;

import com.ah.dao.CommonDao;
import com.ah.service.CommonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * Created by jianyuchen on 2018/9/21.
 */
@Service
public class CommonServiceImpl implements CommonService {

    @Resource
    CommonDao commonDao;

    public void insertArticle(HashMap data){
        commonDao.insertArticle(data);
    }


    public HashMap findArticleBy(HashMap data){
        HashMap result = commonDao.findArticleBy(data);

        return result;
    }


    public void deleteArticle(Integer id){
        commonDao.deleteArticle(id);
    }
}
