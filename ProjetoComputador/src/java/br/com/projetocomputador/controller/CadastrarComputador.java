
package br.com.projetocomputador.controller;

import br.com.projetocomputador.dao.ComputadorDAOImpl;
import br.com.projetocomputador.dao.GenericDAO;
import br.com.projetocomputador.model.Computador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CadastrarComputador", urlPatterns = {"/CadastrarComputador"})
public class CadastrarComputador extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String fornecedorComputador = request.getParameter("fornecedorComputador");
            Integer precoComputador = Integer.parseInt(request.getParameter("precoComputador"));
            Integer ssdComputador = Integer.parseInt(request.getParameter("ssdComputador"));
            Integer ramComputador = Integer.parseInt(request.getParameter ("ramComputador"));
            String mensagem = null;

            Computador computador  = new Computador ();
            
            computador.setFornecedorComputador(fornecedorComputador);
            computador.setPrecoComputador(precoComputador);
            computador.setSsdComputador(ssdComputador);
            computador.setRamComputador(ramComputador);
  
            try {
                GenericDAO dao = new ComputadorDAOImpl();
                if (dao.cadastrar(computador)) {
                    mensagem = "Computador cadastrado com sucesso!";
                } else {
                    mensagem = "ERRO!";
                }
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("cadastrarcomputador.jsp").forward(request, response);
            } catch (Exception ex) {
                System.out.println("Problemas no Servlet ao cadastrar Computador! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
