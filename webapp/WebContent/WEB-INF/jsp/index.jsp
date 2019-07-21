<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Details</title>
<link rel="stylesheet" type="text/css" href="A://Eclipse-1//webapp/WebContent//WEB-INF/css/mycss.css" />
<link rel="stylesheet" type="text/css" href="A://Eclipse-1//webapp/WebContent//WEB-INF/css/all.css" />
<link rel="stylesheet" type="text/css" href="A://Eclipse-1//webapp/WebContent//WEB-INF/css/bootstrap.min.css" />
<script type="text/javascript" src="A://Eclipse-1//webapp/WebContent//WEB-INF/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="A://Eclipse-1//webapp/WebContent//WEB-INF/js/jquery.min.js"></script>
<style>
    body{
/*     background-image:  url("A:/Eclipse-1/webapp/WebContent/WEB-INF/img/abc.jpg");*/
     background-color:  url("A:/Eclipse-1/webapp/WebContent/WEB-INF/img/abc.jpg");

</style>
</head>
<body>
    <div align="center">
        <h1>Employee List</h1>
        <table border="1">
 
            <th>Employee Name</th>
            <th>Employee No.</th>
            <th>Depatment</th>
            <th>Compensation</th>
            <th>Hire Date</th>
            <th>Job Type</th>
            <th>Manager</th>
            <th>Salary</th>
 
             <c:forEach var="employee" items="${empList}">
                <tr>
 					<td>${employee.empName}</td>
                    <td>${employee.empNo}</td>
                    <td>${employee.deptNo}</td>
                    <td>${employee.comm}</td>
                    <td>${employee.hireDate}</td>
                    <td>${employee.jobType}</td>
                    <td>${employee.mgr}</td>
                    <td>${employee.salary}</td>
                    <td><img src="https://drive.google.com/uc?id=1z9Tz-YlBxWC26IACEhr5xR-XYffO7aiZ"/></td>
                </tr>8
            </c:forEach>
        </table>
    </div>
</body>
</html>