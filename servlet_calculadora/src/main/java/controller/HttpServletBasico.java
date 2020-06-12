package controller;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"*.action","/"})
public class HttpServletBasico extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req,
                       HttpServletResponse res){
        
        String path = req.getServletPath();
        ServletContext sc = req.getServletContext();
        System.out.println(path); 
        switch (path){
            case "/":
               try{
                    sc.getRequestDispatcher("/jsp/login.jsp").forward(req, res);
                } catch (Exception e){}
               break;
               
            case "/login.action":
                try{
                    req.setCharacterEncoding("UTF-8");
                    String login = req.getParameter("login");
                    String senha = req.getParameter("senha");
                    res.setContentType("text/html");
                    res.setCharacterEncoding("UTF-8");
                    req.setAttribute("login", login);
                    req.setAttribute("senha", senha);
                    sc.getRequestDispatcher("/jsp/resultado.jsp").forward(req, res);
                }catch (Exception e){}
            break;

            case "/calculo.action":
                try{
                req.setCharacterEncoding("UTF-8");
                    String x = req.getParameter("x");
                    String y = req.getParameter("y");
                    res.setContentType("text/html");
                    res.setCharacterEncoding("UTF-8");
                    req.setAttribute("x", x);
                    req.setAttribute("y", y);
                    sc.getRequestDispatcher("/jsp/resultado.jsp").forward(req, res);
                }catch (Exception e){}
                 case "/historico.action":
                try{
                    sc.getRequestDispatcher("/jsp/historico.jsp").forward(req, res);
                }catch (Exception e){}
            default:
                try{
                   sc.getRequestDispatcher("/jsp/404.jsp").forward(req, res);
                }catch (Exception e){}               
        }
        
    }  
}