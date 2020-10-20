package controller;

import dao.IRole;
import dao.RoleDAO;
import entities.Role;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RoleServlet", urlPatterns = "/role")
public class RoleServlet extends HttpServlet {

    @EJB
    private IRole roledao= new RoleDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* Role role=new Role();
        role.setLibelle("Admin");
        role.setUsers(null);
        role.setId(2);
        roledao.add(role);
        response.getWriter().println("Good! RoleServlet!");*/
    }
}
