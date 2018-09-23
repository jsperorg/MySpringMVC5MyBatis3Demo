# My SpringMVC5 MyBatis3 Demo
This is my private project demo for Maven+Spring5+SpringMVC5+MyBatis3.4+log4j2+MySQL5.  

里面包含一个通用的controller，接收map参数，返回map结果，目的是为了用map取代实体类。  
如果是微服务，或者很小的项目，若数据库表很少的话，完全不必要建实体类，建实体类意味着建一大堆无聊的文件，降低了效率，容易出错。  
在表少的情况下，直接用map高效省事。同时map也非常适合用于多表关联查询。  

本Demo是对一个文章article表的增、查、删，包含实体和map两种实现模式。  

建表脚本：  
```sql

#文章表：
drop table if exists `article`;
create table `article`
(
  `id` int auto_increment primary key,
  `article_class` varchar(200) not null,			#文章类别id
  `article_title` varchar(200) not null,			#英文标题
  `article_remark` varchar(2000) null,			#说明、备注
  `article_content` text not null,			#中文内容
  `article_from` varchar(200),		#英文文章内容来自地址
  `article_publish_date` datetime,		#文章发布日期
  `status` int not null DEFAULT 0,	#状态,1:正常,0:待审核,-1:未通过,-2:禁用

  `read_count` int default 0,	#查看次数
  `creation_time`      DATETIME DEFAULT   CURRENT_TIMESTAMP,
  `modification_time`  DATETIME ON UPDATE CURRENT_TIMESTAMP

)charset=utf8 auto_increment=1;

select * from article;
```









