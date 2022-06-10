<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <title>홈쇼핑 회원매출조회</title>

    <style>
        * {
            margin: 0;
        }

        ul,
        ol,
        li {
            list-style: none;
            margin: 0;
            padding: 0;
        }

        header {
            width: 1000px;
            height: 100px;
            margin: 0 auto;
            background-color: blue;
        }

        header>h1 {
            color: #fff;
            text-align: center;
            line-height: 100px;
        }

        nav {
            width: 1000px;
            height: 40px;
            background-color: skyblue;
            margin: 0 auto;
        }

        nav>ul>li>a {
            float: left;
            color: #fff;
            text-decoration: none;
            margin: 10px 30px 0px;
        }

        section {
            width: 1000px;
            height: 600px;
            background-color: #ddd;
            margin: 0 auto;
            text-align: center;
        }

        section>h2 {
            color: #000;
            text-align: center;
            line-height: 100px;
        }

        table,
        th,
        td {
            border: 1px solid #666;
        }

        /* margin: 50px auto 0 : 위:50px, auto:양쪽, 0:아래 */
        table {
            width: 700px;
            margin: 0 auto;
        }

        th { width: 300px; }

        th, td {  padding: 5px;  }

        footer {
            width: 1000px;
            height: 50px;
            margin: 0 auto;
            background-color: blue;
        }

        footer>p {
            color: #fff;
            text-align: center;
            line-height: 50px;
            font-size: 12px;
        }
    </style>
</head>

<body>
    <header>
        <h1>쇼핑몰 회원관리 ver1.0</h1>
    </header>
    <nav>
        <ul>
            <li><a href="joinForm.jsp">회원등록></a></li>
            <li><a href="list.jsp">회원목록 조회/수정</a></li>
            <li><a href="sales.jsp">회원매출조회</a></li>
            <li><a href="index.jsp">홈으로</a></li>
        </ul>
    </nav>

    <section>
        <h2>회원매출조회</h2>
        <table>
                <tr>
                    <th>회원번호</th>
                    <th>회원성명</th>
                    <th>고객등급</th>
                    <th>매출</th>
                   
                </tr>
                <tr>
                     <td><input type="text" id="id" name="id" size="10"></td>
                     <td><input type="text" id="name" name="name" size="10"></td>
                     <td><input type="text" id="grade" name="grade" size="15"></td>
                     <td><input type="text" id="sale" name="sale" size="10"></td>
                </tr>
        </table>
    </section>

    <footer>
        <p>HRDKOREA Copyright&copy2016 All rights reseved. Human Resources Devlopment Service of Korea</p>
    </footer>
</body>

</html>