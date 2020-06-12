<%----%><%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>

    <body>
        <h3>Calculadora, <%=request.getAttribute("login")%> </h3> 
        <div class="box">   
        <form method="get" 
         action= "calculo.action">
            <p>X:</p> <input name="x"/><br/>
            <p>Y:</p> <input name="y"/><br/>
            <p>Resultado:</p> <input name="y"/><br/>
            <input type="submit">
        </form> 
            <br />
                <a href = historico.action> Historico </a>
            
        </div>           
    </body>
</html>
