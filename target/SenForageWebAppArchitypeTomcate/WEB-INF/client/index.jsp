<%--
  Created by IntelliJ IDEA.
  User: OusmaneMballo
  Date: 20/10/2020
  Time: 09:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:layout title="Client | Home">
    <jsp:attribute name="body_area">
  <div>
      <form>
          <div class="form-row">
              <div class="form-group col-md-6">
                  <label for="prenom_nom">Prenom & Nom</label>
                  <input type="text" class="form-control" id="prenom_nom">
              </div>
              <div class="form-group col-md-6">
                  <label for="telephone">Telephone</label>
                  <input type="text" class="form-control" id="telephone">
              </div>
          </div>
          <div class="form-group">
              <label for="inputAddress">Address</label>
              <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
          </div>
          <div class="form-row">
              <div class="form-group col-md-4">
                  <label for="village">Village</label>
                  <select id="village" class="form-control">
                      <option selected>Choose...</option>
                      <option>...</option>
                  </select>
              </div>

          </div>
          <button type="submit" class="btn btn-primary">Sign in</button>
      </form>
  </div>
</jsp:attribute>
</t:layout>
