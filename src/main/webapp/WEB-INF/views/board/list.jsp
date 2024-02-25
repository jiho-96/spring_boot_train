<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Board</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        #boardTable {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        #boardTable th, #boardTable td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        #boardTable th {
            background-color: #f2f2f2;
        }

        #boardTable tbody tr:hover {
            background-color: #f5f5f5;
        }
    </style>
</head>
<body>
<table id="boardTable">
    <thead>
    <tr>
        <th style="width: 10%">게시번호</th>
        <th style="width: 60%">제목</th>
        <th style="width: 30%">작성일</th>
    </tr>
    </thead>
    <tbody id="body">
    </tbody>
</table>


<script type="text/javascript">
    function Listloading(e){
        $.ajax({
            url: '/list',
            type: 'POST',
            contentType: 'application/json',
            data: {},
            success: function (response){
                if (response.code === 0){
                    let tableContent = "";
                    $.each(response.data, function (index, item){
                        tableContent += "<tr>";
                        tableContent += "<td>" + item.idx + "</td>";
                        tableContent += "<td><a href='#' onclick='showDetail(" + item.idx + ")'>" + item.title + "</a></td>";
                        tableContent += "<td>" + item.createTime + "</td>";
                        tableContent += "</tr>";
                    });
                    $("#boardTable tbody").html(tableContent);
                } else {
                    console.error("Failed to load data:", '오류발생');
                }
            },
            error: function(xhr, status, error) {
                console.error("AJAX request failed:", 'error');
            }
        });
    }

    function showDetail(idx) {
        window.location.href = '/board/detail/' + idx;
    }

    $(window).on("load", function() {
        Listloading();
    });
</script>
</body>
</html>