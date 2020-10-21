<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@tag description="Layout" isELIgnored="false" pageEncoding="UTF-8"%>
<%@attribute name="title"%>
<%@attribute name="body_area" fragment="true" %>

<html>
<head>
    <!-- CSS -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/template/css/style.css"/>
    <title>${title}</title>
</head>
<body>
<div class="wrapper d-flex align-items-stretch">
    <nav id="sidebar">
        <div class="p-4 pt-5">
            <a href="#" class="img logo rounded-circle mb-5" style="background-image: url(${pageContext.request.contextPath}/template/images/logo.jpg);"></a>
            <p>Vous êtes ${ sessionScope.prenom } ${ sessionScope.nom } !</p>
            <ul class="list-unstyled components mb-5">
                <c:if test="${ sessionScope.role=='Caissier' }">
                    <li class="active">
                        <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Gestion Abonnement</a>
                        <ul class="collapse list-unstyled" id="homeSubmenu">
                            <li>
                                <a href="<c:url value="client"></c:url>">Clients</a>
                            </li>
                            <li>
                                <a href="<c:url value="village"></c:url>">Villages</a>
                            </li>
                        </ul>
                    </li>
                </c:if>
                <c:if test="${ sessionScope.role=='Admin' }">
                    <li>
                        <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Administration</a>
                        <ul class="collapse list-unstyled" id="pageSubmenu">
                            <li>
                                <a href="#">Caissiers</a>
                            </li>
                            <li>
                                <a href="#">Compteurs</a>
                            </li>
                            <li>
                                <a href="#">Facturation</a>
                            </li>
                        </ul>
                    </li>
                </c:if>
            </ul>

            <div class="footer">
                <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                    Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="icon-heart" aria-hidden="true"></i> by <a href="https://github.com/OusmaneMballo " target="_blank">Github ousmane MBALLO</a>
                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
            </div>

        </div>
    </nav>
    <!-- Page Content  -->
    <div id="content" class="p-4 p-md-5">

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">

                <button type="button" id="sidebarCollapse" class="btn btn-primary">
                    <i class="fa fa-bars"></i>
                    <span class="sr-only">Toggle Menu</span>
                </button>
                <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <i class="fa fa-bars"></i>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="nav navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">About</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Portfolio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Contact</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <jsp:invoke fragment="body_area"/>
    </div>
</div>
<script src="${pageContext.request.contextPath}/template/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/template/js/popper.js"></script>
<script src="${pageContext.request.contextPath}/template/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/template/js/main.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</body>
</html>