package br.com.projetofuncinarios.controller;

import br.com.projetofuncinarios.dao.FuncionarioDAOImpl;
import br.com.projetofuncinarios.dao.GenericDAO;
import br.com.projetofuncinarios.model.Funcionario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CadastrarFuncionario", urlPatterns = {"/CadastrarFuncionario"})
public class CadastrarFuncionario extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String nameFuncionario = request.getParameter("nameFuncionario");
            String cpfFuncionario = request.getParameter("cpfFuncionario");
            String cityFuncionario = request.getParameter("cityFuncionario");
            String cellFuncionario = request.getParameter ("cellFuncionario");
            String mensagem = null;

            Funcionario funcionario = new Funcionario();
            
            funcionario.setNameFuncionario(nameFuncionario);
            funcionario.setCpfFuncionario(cpfFuncionario);
            funcionario.setCityFuncionario(cityFuncionario);
            funcionario.setCellFuncionario(cellFuncionario);
  
            try {
                GenericDAO dao = new FuncionarioDAOImpl();
                if (dao.cadastrar(funcionario)) {
                    mensagem = "Cliente cadastrado com sucesso!";
                } else {
                    mensagem = "ERRO!";
                }
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("cadastrarfuncionario.jsp").forward(request, response);
            } catch (Exception ex) {
                System.out.println("Problemas no Servlet ao cadastrar Cliente! Erro: " + ex.getMessage());
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
