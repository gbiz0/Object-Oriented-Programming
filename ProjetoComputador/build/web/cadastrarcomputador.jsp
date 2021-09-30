<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <style>
            *{
                font-family: arial;
                padding: auto;
                margin: auto;
            }
            body{
                background-color: #d3d3d3;
            }
            h1{ 
                margin-top: 1rem;
                text-align: center;
                color: #8257e6;
            }
        </style>
        <h1>Cadastrar</h1>
        <form name="cadastrarcomputador" action="CadastrarComputador" method="POST">
            <table align="center" border="0">
                    

                    <tr>
                        <th colspan="2" align="center">${mensagem}</th>
                    </tr>
                
                    <tr>
                        <td>Fornecedor:</td>
                        <td><input type="text" name="fornecedorComputador"></td>
                    </tr>
                    
                    <tr>
                        <td>Preço:</td>
                        <td><input type="text" name="precoComputador"></td>
                    </tr>

                    <tr>
                        <td>Ram:</td>
                        <td><input type="text" name="ramComputador"></td>
                    </tr>
                    
                     <tr>
                        <td>Ssd:</td>
                        <td><input type="text" name="ssdComputador"></td>
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
