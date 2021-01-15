package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.*;
import bd.*;
import java.sql.*;
import java.util.*;

public final class newjsp1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String consulta;
            Connection cn;
            PreparedStatement pst;
            ResultSet rs;
            String s_accion;
            String s_idusuario;
            String s_usuario;
            String s_clave;
            String s_archivo;
             String url = "jdbc:mysql://localhost:3306/ventas_avance";
            String user = "root";
            String password = "12345678";

        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registro Cliente</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"blue\">\n");
      out.write("        <div id=\"contenedor\">\t\n");
      out.write("                      \n");
      out.write("        ");

               try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConectaBd.class.getName()).log(Level.SEVERE, null, ex);
                
            }  
                s_accion = request.getParameter("f_accion");
                s_archivo = request.getParameter("f_archivo");
                
      out.write("\n");
      out.write("                <form form method=\"GET\" class=\"login-form\" id=\"form\" name=\"f_RegistrarCliente\" action=\"registrocliente.jsp\"  enctype>\n");
      out.write("            <div>\n");
      out.write("                    <div class=\"input-field col s12 center\">\n");
      out.write("                        <p class=\"center login-form-text\">Registrar cliente</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            <div>\n");
      out.write("                <label for=\"archivo\"><strong>Archivo:</strong></label>\n");
      out.write("                <input type=\"file\" name=\"f_archivo\" id=\"archivo\">\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" value=\"Enviar\" name=\"\" />\n");
      out.write("            <input type=\"hidden\" value=\"M1\" name=\"f_accion\" />\n");
      out.write("        </form>\n");
      out.write("        ");

                if (s_accion != null && s_accion.equals("M1")) {
                    consulta = " LOAD DATA INFILE 'C:/Users/Usuario/Desktop/" + s_archivo + "' "
                              + " INTO TABLE clientes "
                              + " FIELDS TERMINATED BY ',' "
                              + " LINES TERMINATED BY '&bsol;n'"; 
                    out.print(consulta);
                    pst = cn.prepareStatement(consulta);
                    pst.executeUpdate();                    
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("  ");
  }      
        
      out.write("\n");
      out.write("        \n");
      out.write("    \n");
      out.write("         </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
