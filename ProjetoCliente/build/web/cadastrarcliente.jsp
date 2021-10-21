<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerenciamento de Clientes</title>
    </head>
    <body>
        <h1 align="center">Etec de Fernandópolis</h1>
        <hr />
        <form name="cadastrarcliente" action="CadastrarCliente" method="POST">
            <table align="center" border="0">
                    <tr>
                        <th colspan="2" align="center">Cadastro de Clientes</th>
                    </tr>

                    <tr>
                        <th colspan="2" align="center">${mensagem}</th>
                    </tr>
                
                    <tr>
                        <td>Nome:</td>
                        <td><input type="text" name="nomeCliente"></td>
                    </tr>
                    
                    <tr>
                        <td>CPF:</td>
                        <td><input type="text" name="cpfCliente"></td>
                    </tr>

                    <tr>
                        <td>Endereço:</td>
                        <td><input type="text" name="enderecoCliente"></td>
                    </tr>
                    
                    <tr>
                        <td>Cidade:</td>
                        <td><input type="text" name="cidadeCliente"></td>
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
