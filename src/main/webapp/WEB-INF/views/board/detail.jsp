<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Board Detail</title>
    <!-- 필요한 CSS 파일이 있다면 여기에 추가 -->
</head>
<body>
<h1>게시물 상세 정보</h1>
<div>
    <p><strong>게시번호:</strong> ${board.idx}</p>
    <p><strong>제목:</strong> ${board.title}</p>
    <p><strong>내용:</strong> ${board.content}</p>
</div>
<!-- 필요한 JavaScript 파일이 있다면 여기에 추가 -->
</body>
</html>