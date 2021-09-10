<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Computadores</title>
    </head>
    <body>
        <h1>Página de Cadastro</h1>
        <br>
        <form name="cadastrarcomputador" action="CadastarComputador" method="POST">
            <table>
               <p>Nome do Fornecedor:</p>
               <input type="text" name="fornecedorComputador">

               <p>Preço:</p>
               <input type="number" name="precoComputador">

               <p>Ram:</p>
               <input type="text" name="ramComputador">

               <p>Ssd:</p>
               <input type="text" name="ssdComputador">

               <input type="submit" name="cadastrar" value="Cadastrar">
               <a href="index.jsp">Voltar</a>

            </table>
         </form>
    </body>
</html>
