<%@page pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<form method="POST" action="/giang-vien/store">
    <div>
        <label>Họ tên</label>
        <input type="text" name="name" />
    </div>
    <div>
        <label>Địa chỉ</label>
        <input type="text" name="diaChi" />
    </div>
    <div>
        <label>Giới tính</label>
        <input type="radio" name="gioiTinh" value="1" /> <label>Nam</label>
        <input type="radio" name="gioiTinh" value="0" /> <label>Nữ</label>
    </div>
    <button>Submit</button>
</form>

</body>
</html>