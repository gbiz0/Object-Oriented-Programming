<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de Cadastro</title>
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
        <h1>Cadastrar</h1>
        <form name="cadastrarfuncionario" action="CadastrarFuncionario" method="POST">
            <table align="center" border="0">
                    <tr>
                        <th colspan="2" align="center">Cadastro de Funcionario</th>
                    </tr>

                    <tr>
                        <th colspan="2" align="center">${mensagem}</th>
                    </tr>
                
                    <tr>
                        <td>Nome:</td>
                        <td><input type="text" name="nameFuncionario"></td>
                    </tr>
                    
                    <tr>
                        <td>CPF:</td>
                        <td><input type="text" name="cpfFuncionario"></td>
                    </tr>

                    <tr>
                        <td>Cidade:</td>
                        <td><input type="text" name="cityFuncionario"></td>
                    </tr>
                    
                     <tr>
                        <td>Telefone:</td>
                        <td><input type="number" name="cellFuncionario"></td>
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
