<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Raleway&display=swap" rel="stylesheet">
        <title>JSP Page</title>
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
                margin-top: 1rem;
                font-size: 3rem;
                text-align: center;
                font-weight: 700;
            }
            p{
                text-align: center;
                font-size: 1.3rem;
                color: white;
            }
            input{
                display: flex;
                margin-left: auto;
                margin-right: auto;
            }
            ul li{
                display: flex;
                justify-content: center;
            }
            ul li a{
                color: white;
                text-transform: uppercase;
                text-decoration: none;
                transition: 0.2s;
                font-size: 1.5rem;
                align-items: center;
            }
            a:hover{
                color: #8257e6;
                font-size: 1.5rem;
                opacity: 2;
                display: block;
            }
            .cadastrar{
                font-size: 1.5rem;
                background-color: #8257e6; 
                color: white;
                text-decoration: none;
                border: none;
                
            }
        </style>
        
        <h1>Cadastrar</h1>
        <form name="cadastrarcomputador" action="CadastrarComputador" method="POST">
                  <br><br><br>
                        <p colspan="2" align="center">${mensagem}</p>
                        
                        <p>Fornecedor:</p>
                        <input type="text" name="fornecedorComputador">
                        
                        <p>Preço:</p>
                        <input type="text" name="precoComputador">
                        
                        <p>Ram:</p>
                        <input type="text" name="ramComputador">
                        
                        <p>Ssd:</p>
                        <input type="text" name="ssdComputador">
                        
                        <br>
                        <br>
                        <input class="cadastrar" type="submit" name="cadastrar" value="Cadastrar">
                    <br>
                    <ul>
                        <li><a href="index.jsp">Voltar</a></li>
                    </ul>
        </form>    
    </body>
</html>
