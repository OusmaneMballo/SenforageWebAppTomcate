package controller;

import dao.IUser;
import dao.UserDAO;
import entities.Client;
import entities.User;
import entities.Village;

import javax.ejb.EJB;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "UserServlet", urlPatterns = "/user")
public class UserServlet extends HttpServlet {

    @EJB
    private IUser userdao =new UserDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User u=new User();
        u=userdao.findByLoginPasswd(request.getParameter("login"), request.getParameter("passwd"));
        if(u!=null){
            HttpSession session=request.getSession();
            session.setAttribute("nom", u.getNom());
            session.setAttribute("email", u.getEmail());
            session.setAttribute("role", u.getRole().getLibelle());
            getServletContext().getRequestDispatcher("/WEB-INF/client/index.jsp").forward(request, response);
        }
        else {
            getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //response.getWriter().println("okey1");
        getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);


    }
}
