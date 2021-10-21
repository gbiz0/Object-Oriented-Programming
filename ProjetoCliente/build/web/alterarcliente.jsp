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
        <form name="alterarcliente" action="AlterarCliente" method="POST">
            <table align="center" border="0">
                    <tr>
                        <th colspan="2" align="center">Alteração de Clientes</th>
                    </tr>

                    <tr>
                        <th colspan="2" align="center">${mensagem}</th>
                    </tr>
                
                    <tr>
                        <td>ID Cliente:</td>
                        <td><input type="text" name="idCliente" value="${cliente.idCliente}" readonly="true"></td>
                    </tr>
                    
                    <tr>
                        <td>Nome:</td>
                        <td><input type="text" name="nomeCliente" value="${cliente.nomeCliente}"></td>
                    </tr>
                    
                    <tr>
                        <td>CPF:</td>
                        <td><input type="text" name="cpfCliente" value="${cliente.cpfCliente}"></td>
                    </tr>

                    <tr>
                        <td>Endereço:</td>
                        <td><input type="text" name="enderecoCliente" value="${cliente.enderecoCliente}"></td>
                    </tr>
                    
                    <tr>
                        <td>Cidade:</td>
                        <td><input type="text" name="cidadeCliente" value="${cliente.cidadeCliente}"></td>
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
