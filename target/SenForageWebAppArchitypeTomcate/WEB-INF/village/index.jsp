<%--
  Created by IntelliJ IDEA.
  User: OusmaneMballo
  Date: 20/10/2020
  Time: 09:57
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:layout title="Village | Home">
    <jsp:attribute name="body_area">
        <div class="card text-center">
            <div class="card-header">
                Espace village
            </div>
            <div class="card-body">
                <div class="row">
                    <div class="col-md-6">
                        <form method="post" action="${pageContext.request.contextPath}/village">
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label for="prenom_nom">Nom du village</label>
                                    <input type="text" class="form-control" id="prenom_nom" name="nom" placeholder="Nom du village">
                                </div>
                            </div>
                            <input type="text" hidden name="action" value="add">
                            <div class="form-row">
                                <button type="submit" class="btn btn-primary">Ajouter</button>
                            </div>
                        </form>
                    </div>
                    <div class="col-md-6">
                        <table class="table">
                            <thead>
                            <tr>
                                <th scope="col">Nom Village</th>
                                <th scope="col">Actions</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${villages}" var="village">
                                <tr>
                                    <th scope="col">${village.nom}</th>
                                    <th scope="col"></th>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="card-footer text-muted">
                2 days ago
            </div>
        </div>
</jsp:attribute>
</t:layout>

