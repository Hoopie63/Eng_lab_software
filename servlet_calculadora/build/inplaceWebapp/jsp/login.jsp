<%----%><%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head> 
        <title> Login </title>
        <meta charset="utf-8">
    </head>
    <body>
       
        <h3>Faça seu login:</h3>
        <div class=" box">
        <form method="get" 
         action="login.action">
            <p>Usuario:</p> <input name="login"/><br/>
            <p>Senha:</p> <input name="senha"/><br/>
            <input type="submit">
        </form>
        </div>
    </body>    
</html>