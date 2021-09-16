<%@page import="br.com.projetocomputador.model.Computador"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
<h1>Lista de Computadores</h1>
         <table align="center" border="1">
            <tr>
                <td colspan="7" align="center">Lista de Clientes</td>
            </tr>
            
            <tr>
                <th align="center">ID</th>
                <th align="center">Fornecedor</th>
                <th align="center">Preço</th>
                <th align="center">Ssd</th>
                <th align="center">Ram</th>
                <th align="center" colspan="2">Editar</th>
            </tr>
            
            <%
                List<Computador> computador = (List<Computador>) request.getAttribute("computador");
                for(Computador computador:computador){
            %>
            <tr>
                <td align="center"><%=computador.getIdComputador()%></td>
                <td align="center"><%=computador.getFornecedorComputador()%></td>
                <td align="center"><%=computador.getPrecoComputador()%></td>
                <td align="center"><%=computador.getSsdComputador()%></td>
                <td align="center"><%=computador.getRamComputador()%></td>
                <td align="center"><a href="ExcluirComputador?IdComputador=<%=computador.getIdComputador()%>">Excluir</a></td>
                <td align="center"><a href="CarregarComputador?idComputador=<%=computador.getIdComputador()%>">Alterar</a></td>
            </tr>
            
            <%
                }
            %>
            
            <tr>
                    <td align="center" colspan="7"><a href="index.jsp">Voltar</a></td>
            </tr>
        </table>    
    </body>
</html>
