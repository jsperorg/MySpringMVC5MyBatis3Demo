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


    </head>
    <body>

        <table width="100%" border=1>
            <tr>
                <td>类别</td>
                <td><input type="text" value="${result.article_class }"/></td>
            </tr>
            <tr>
                <td>标题</td>
                <td><input type="text" value="${result.article_title}"/></td>
            </tr>
            <tr>
                <td>备注:</td>
                <td><input type="text" value="${result.article_remark}"/></td>
            </tr>
            <tr>
                <td>内容:</td>
                <td><input type="text" value="${result.article_content}"/></td>
            </tr>

        </table>


    </body>
</html>
