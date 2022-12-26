<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/21/2022
  Time: 8:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Furama Resort</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</head>
<body>
<div>
    <div class="header" style="height: 10%">
        <a class="navbar-brand"><img src="https://www.furama.com/images/LOGOFurama_4C_Normal.png" alt=""
                                     style="width: 20%"></a>
        <span style="color: green">Hồ Quốc Bảo Huy</span>
    </div>
    <div class="row  " style="height: 10%">
        <c:import url="../../navbar.jsp"></c:import>;
    </div>
    <div class="row  " style="height: 70%">
        <div class="col-3 col-md-3">
            <ul class="list-group vh-100 overflow-scroll" style="border: 1px solid #7952b3">
                <li class="list-group-item" aria-current="true">An active item</li>
                <li class="list-group-item">A second item</li>
                <li class="list-group-item">A third item</li>
                <li class="list-group-item">A fourth item</li>
                <li class="list-group-item">And a fifth one</li>
                <li class="list-group-item" aria-current="true">An active item</li>
                <li class="list-group-item">A second item</li>
                <li class="list-group-item">A third item</li>
                <li class="list-group-item">A fourth item</li>
                <li class="list-group-item">And a fifth one</li>
                <li class="list-group-item" aria-current="true">An active item</li>
                <li class="list-group-item">A second item</li>
                <li class="list-group-item">A third item</li>
                <li class="list-group-item">A fourth item</li>
                <li class="list-group-item">And a fifth one</li>
                <li class="list-group-item" aria-current="true">An active item</li>
                <li class="list-group-item">A second item</li>
                <li class="list-group-item">A third item</li>
                <li class="list-group-item">A fourth item</li>
                <li class="list-group-item">And a fifth one</li>
            </ul>
        </div>
    </div>
    <div class="col-9">
        <table class="table table-striped">
            <tr>
                <th>id</th>
                <th>Name</th>
                <th>Area</th>
                <th>Price</th>
                <th>Person</th>
                <th>rent Type Id</th>
                <th>standard</th>
                <th>other service description</th>
                <th>Pool area</th>
                <th>floor</th>
                <th>Free service</th>
            </tr>
            <c:forEach var="service" items="${listService}" varStatus="status">
                <tr>
                    <td>${status.count}</td>
                    <td>${service.getId()}</td>
                    <td>${service.getName()}</td>
                    <td>${service.getArea()}</td>
                    <td>${service.getRentPrice()}</td>
                    <td>${service.getMaxPerson()}</td>
                    <td>${service.getRentTypeId()}</td>
                    <td>${service.getStandard()}</td>
                    <td>${service.getOtherServiceDescription()}</td>
                    <td>${service.getPoolArea()}</td>
                    <td>${service.getFloor()}</td>
                    <td>${service.getfFeeService()}</td>
                    <td>
                        <button type="button" class="btn btn-danger">Edit</button>
                    </td>
                    <td>
                        <button type="button" onclick="deleteInfo('${student.id}','${student.name}')"  class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                            Delete
                        </button>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
<div style="height: 10%">
<%--    <c:import url="../../footer.jsp"></c:import>--%>
</div>
</div>
</body>
</html>
