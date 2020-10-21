<%--
  Created by IntelliJ IDEA.
  User: OusmaneMballo
  Date: 20/10/2020
  Time: 09:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:layout title="Client | Home">
    <jsp:attribute name="body_area">
        <div class="card text-center">
            <div class="card-header">
                Espace village
            </div>
            <div class="card-body">
                <div class="row">
                    <div class="col-md-6">
                        <form method="post" action="${pageContext.request.contextPath}/client">
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label for="prenom_nom">Prenom & Nom</label>
                                    <input type="text" class="form-control" id="prenom_nom" name="prenom_nom">
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="telephone">Telephone</label>
                                    <input type="text" class="form-control" id="telephone" name="telephone">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputAddress">Address</label>
                                <input type="text" class="form-control" name="adresse" id="inputAddress" placeholder="1234 Main St">
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label for="village">Village</label>
                                    <select id="village" name="village" class="form-control">
                                        <option value="0" selected>Choose...</option>
                                        <c:forEach items="${villages}" var="village">
                                            <option value="${village.id}">${village.nom}</option>
                                        </c:forEach>
                                    </select>
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
                                <th scope="col">Nom Prenom</th>
                                <th scope="col">Telephone</th>
                                <th scope="col">Village</th>
                                <th scope="col">Actions</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${clients}" var="client">
                                <tr>
                                    <th scope="col">${client.nom}</th>
                                    <th scope="col">${client.telephone}</th>
                                    <th scope="col">${client.village.nom}</th>
                                    <th scope="col">
                                        <a href="<c:url value="village"></c:url>">
                                            <button type="button" class="btn btn-outline-info">Details</button>
                                        </a>
                                        <a href="<c:url value="village"></c:url>">
                                            <button type="button" class="btn btn-outline-warning">Edit</button>
                                        </a>
                                        <a href="<c:url value="village"></c:url>">
                                            <button type="button" class="btn btn-outline-danger">Supprimer</button>
                                        </a>
                                    </th>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="card-footer text-muted">
                &lt;/mballoS&gt;  Developpeur Java Php full-stack, Integrateur solutions CLOUD
            </div>
        </div>
  <div>
  </div>
</jsp:attribute>
</t:layout>
