<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Board Detail</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        #boardDetail {
            width: 80%;
            margin: 20px auto;
            border: 1px solid #ddd;
            padding: 20px;
            background-color: #f9f9f9;
        }
        #boardDetail p {
            margin: 0;
            padding: 5px 0;
        }
        #boardDetail p strong {
            font-weight: bold;
        }
        a {
            color: #007bff;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div id="boardDetail">
    <h1>게시물 상세 정보</h1>
    <p><strong>게시번호:</strong> <span id="boardIdx"></span></p>
    <p><strong>제목:</strong> <span id="boardTitle"></span></p>
    <p><strong>내용:</strong> <span id="boardContents"></span></p>
</div>

<script type="text/javascript">
    function loadDetail(idx) {
        $.ajax({
            url: '/detail',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify({ idx: idx }),
            success: function (response) {
                if (response.code === 0) {
                    let boardDetail = response.data;
                    $("#boardIdx").text(boardDetail.idx);
                    $("#boardTitle").text(boardDetail.title);
                    $("#boardContents").text(boardDetail.contents);
                } else {
                }
            },
            error: function(xhr, status, error) {
                console.error("AJAX request failed:", error);
            }
        });
    }

    $(document).ready(function() {
        let idx = "${pageIdx}";
        loadDetail(idx);
    });
</script>
</body>
</html>