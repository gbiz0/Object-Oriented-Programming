<%@page import="br.com.projetofuncinarios.model.Funcionario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Cadastro</title>
    </head>
    <body>
        <style>
            body{
                background-color: aquamarine; 
                font-family: arial;
                color: blue;
                text-align: center;
            }
            
        </style>
        <h1>Lista de funcionarios</h1>
         <table align="center" border="1">
            <tr>
                <td colspan="7" align="center">Lista de Clientes</td>
            </tr>
            
            <tr>
                <th align="center">ID</th>
                <th align="center">Nome</th>
                <th align="center">CPF</th>
                <th align="center">Cidade</th>
                <th align="center">Telefone</th>
                <th align="center" colspan="2">Editar</th>
            </tr>
            
            <%
                List<Funcionario> funcionarios = (List<Funcionario>) request.getAttribute("funcionarios");
                for(Funcionario funcionario:funcionarios){
            %>
            <tr>
                <td align="center"><%=funcionario.getIdFuncionario()%></td>
                <td align="center"><%=funcionario.getNameFuncionario()%></td>
                <td align="center"><%=funcionario.getCpfFuncionario()%></td>
                <td align="center"><%=funcionario.getCityFuncionario()%></td>
                <td align="center"><%=funcionario.getCellFuncionario()%></td>
                <td align="center"><a href="ExcluirFuncionario?IdFuncionario=<%=funcionario.getIdFuncionario()%>">Excluir</a></td>
                <td align="center"><a href="CarregarFuncionario?idFuncionario=<%=funcionario.getIdFuncionario()%>">Alterar</a></td>
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
