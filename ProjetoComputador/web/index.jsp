<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Raleway&display=swap" rel="stylesheet">
        <title>Página Inicial</title>
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
            ul li{
                display: inline-block;
                margin-top: 20rem;
                margin-left: 27rem;
                margin-right: -20rem;
                justify-content: space-between;
            }
            ul li a{
                color: white;
                text-transform: uppercase;
                text-decoration: none;
                transition: 0.2s;
                font-size: 2rem;
            }
            a:hover{
                color: #8257e6;
                font-size: 2rem;
                opacity: 2;
                display: block;
            }
        </style>
        
        <main>
            <h1>Controle de Computadores</h1><br><br>
            
            <ul>
                <li><a href="cadastrarcomputador.jsp">Cadastrar</a></p></li>
                
                <li><a href="ListarComputador">Listar</a></li>
            </ul>
           
        </main>
        
    </body>
</html>
