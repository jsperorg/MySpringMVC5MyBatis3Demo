<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="cn">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- allow search engine to index and get links for this page. -->
        <meta name="robots" value="index, follow">
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <title>new article</title>

    </head>
    <body>
        <form action="/article/save" method="post">
            <input type="text" name="articleClass" value="javascript"/><br>
            <input type="text" name="articleTitle" value="title"/><br>
            <input type="text" name="articleRemark" value=""/><br>
            <textarea name="articleContent">article content...</textarea><br>
            <input type="text" name="articleFrom" value="https://www.jb51.net/javascript/ljsdofiejf.html"/><br>
            <input type="text" name="articlePublishDate" value="2018/9/21 22:06"/><br>
            <br>

            <input type="submit" value="submit"/>

        </form>


    </body>
</html>
