package com.ah.model;
import lombok.Data;

import java.util.Date;

/**
 * Created by jianyuchen on 2018/9/21.
 */
@Data
public class Article {

    private String id;
    private String articleClass;
    private String articleTitle;
    private String articleRemark;
    private String articleContent;
    private String articleFrom;
    private Date articlePublishDate;
    private Integer status;
    private Integer readCount;
    private Date creationTime;
    private Date modificationTime;





}
