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
                <td><input type="text" value="${result.articleClass }"/></td>
            </tr>
            <tr>
                <td>标题</td>
                <td><input type="text" value="${result.articleTitle}"/></td>
            </tr>
            <tr>
                <td>备注:</td>
                <td><input type="text" value="${result.articleRemark}"/></td>
            </tr>
            <tr>
                <td>内容:</td>
                <td><input type="text" value="${result.articleContent}"/></td>
            </tr>

        </table>


    </body>
</html>
