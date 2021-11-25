<%@page import="br.com.projetocomputador.model.Computador"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
         <style>
            *{
                font-family: 'Raleway', sans-serif;
                padding: 0;
                margin: 0;
            }
            body{
                background-image: url(train.jpg);
                background-size: cover;
                background-repeat: no-repeat;
            }
            h1{
                color: #8257e6;
                margin-top: 4rem;
                font-size: 3rem;
                text-align: center;
                font-weight: 700;
            }
            th{
                color: white;
            }
            </style>
<h1>Lista de Computadores</h1>
        <div>
         <table align="center" border="1">
             
            <tr>
                <th align="center">ID</th>
                <th align="center">Fornecedor</th>
                <th align="center">Preço</th>
                <th align="center">Ssd</th>
                <th align="center">Ram</th>
                <th align="center" colspan="2">Editar</th>
            </tr>
            
            <%
                List<Computador> computadores = (List<Computador>) request.getAttribute("computadores");
                for(Computador computador:computadores){
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
            </div>
    </body>
</html>
