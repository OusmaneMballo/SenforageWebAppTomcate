package controller;

import dao.IVillage;
import dao.VillageDAO;
import entities.Village;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "VillageServlet", urlPatterns = "/village")
public class VillageServlet extends HttpServlet {

    @EJB
    private IVillage villagedao=new VillageDAO();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String action=request.getParameter("action");
            if(action!=null){
                Village village=new Village();
                village.setNom(request.getParameter("nom"));
                int var=villagedao.add(village);
                if(var==1){
                    response.sendRedirect("village?action=list");
                    //getServletContext().getRequestDispatcher("/WEB-INF/village/index.jsp").forward(request, response);
                }
            }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //getServletContext().getRequestDispatcher("/WEB-INF/village/index.jsp").forward(request, response);
        //response.getWriter().println("Good! ClientServlet!");
        String action=request.getParameter("action");
        if(action!=null){
            switch (action){
                case "list":
                    request.setAttribute("villages",villagedao.findAll());
                    getServletContext().getRequestDispatcher("/WEB-INF/village/index.jsp").forward(request, response);
                    break;
                case "edit":
                    break;
                case "delete":
                    break;
                default:
                    break;

            }

        }
        else{
            request.setAttribute("villages",villagedao.findAll());
            getServletContext().getRequestDispatcher("/WEB-INF/village/index.jsp").forward(request, response);
        }
    }
}
