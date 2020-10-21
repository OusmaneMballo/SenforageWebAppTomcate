package controller;

import dao.ClientDAO;
import dao.IClient;
import dao.IVillage;
import dao.VillageDAO;
import entities.Client;
import entities.Village;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ClientServlet", urlPatterns = "/client")
public class ClientServlet extends HttpServlet {

    @EJB
    private IClient clientdao=new ClientDAO();
    @EJB
    private IVillage villagedao=new VillageDAO();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action!=null){
            Client c=new Client();
            c.setAdresse(request.getParameter("adresse"));
            c.setNom(request.getParameter("prenom_nom"));
            c.setTelephone(request.getParameter("telephone"));
            Village v=villagedao.findById(Integer.parseInt(request.getParameter("village")));
            if(v!=null){
                c.setVillage(v);
                clientdao.add(c);
                response.sendRedirect("client?action=list");
            }
            else{
                response.getWriter().println("Client non ajoute!...");
            }

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action=request.getParameter("action");
        if(action!=null){
            switch (action){
                case "list":
                    request.setAttribute("clients",clientdao.findAll());
                    request.setAttribute("villages", villagedao.findAll());
                    getServletContext().getRequestDispatcher("/WEB-INF/client/index.jsp").forward(request, response);
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
            request.setAttribute("clients",clientdao.findAll());
            request.setAttribute("villages", villagedao.findAll());
            getServletContext().getRequestDispatcher("/WEB-INF/client/index.jsp").forward(request, response);
        }
    }
}
