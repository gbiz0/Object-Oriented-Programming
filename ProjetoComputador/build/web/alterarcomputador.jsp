<%-- 
    Document   : alterarcomputador
    Created on : 22/10/2021, 14:41:03
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">Etec de Fernandópolis</h1>
        <hr />
        <form name="alterarcomputador" action="AlterarComputador" method="POST">
            <table align="center" border="0">
                    <tr>
                        <th colspan="2" align="center">Alteração de Computadores</th>
                    </tr>

                    <tr>
                        <th colspan="2" align="center">${mensagem}</th>
                    </tr>
                
                    <tr>
                        <td>ID:</td>
                        <td><input type="text" name="idComputador" value="${computador.idComputador}" readonly="true"></td>
                    </tr>
                    
                    <tr>
                        <td>Fornecedor</td>
                        <td><input type="text" name="fornecedorComputador" value="${computador.fornecedorComputador}"></td>
                    </tr>
                    
                    <tr>
                        <td>Preço:</td>
                        <td><input type="text" name="precoComputador" value="${computador.precoComputador}"></td>
                    </tr>

                    <tr>
                        <td>Ram:</td>
                        <td><input type="text" name="ramComputador" value="${computador.ramComputador}"></td>
                    </tr>
                    
                    <tr>
                        <td>Ssd:</td>
                        <td><input type="text" name="ssdComputador" value="${computador.ssdComputador}"></td>
                    </tr>
                 
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" name="cadastrar" value="Cadastrar">
                    </td>
                </tr>

                <tr>
                    <td align="center" colspan="2"><a href="index.jsp">Voltar</a></td>
                </tr>
            </table>
        </form>
    </body>
</html>
