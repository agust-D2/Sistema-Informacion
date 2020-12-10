package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.*;
import bd.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String consulta;
            Connection cn;
            Statement pst;
            ResultSet rs;
            
            String consulta2;
            Connection cn2;
            Statement pst2;
            ResultSet rs2;

            String consulta1;
            Connection cn1;
            Statement pst1;
            ResultSet rs1;
            
            String consulta3;
            Connection cn3;
            Statement pst3;
            ResultSet rs3;
            
            String url = "jdbc:mysql://localhost:3306/ventas_si";
            String user = "root";
            String password = "12345678";
            
            String s_usuario;
            String s_clave;
            String s_boton_login;
            String s_boton_regresar;
            String s_idusuario;
            
            String s_nombre;
            String s_apellido_pat;
            String s_apellido_mat;
            String s_tipo;
            String s_estado;
            String resultado="";
    

        
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   \n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/tabla.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"msapplication-tap-highlight\" content=\"no\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Menu</title>\n");
      out.write("        <link rel=\"icon\" href=\"images/favicon/favicon-32x321.png\" sizes=\"32x32\">\n");
      out.write("        <link href=\"css/materialize.min.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("        <link href=\"css/style.min.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("        <link href=\"css/layouts/page-center.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        ");
      out.write("\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:#c1432e\">\n");
      out.write("       \n");
      out.write("       \n");
      out.write("    <!-- Start Page Loading -->\n");
      out.write("    <div id=\"loader-wrapper\">\n");
      out.write("        <div id=\"loader\"></div>        \n");
      out.write("        <div class=\"loader-section section-left\"></div><!-- panel para la derecha -->\n");
      out.write("        <div class=\"loader-section section-right\"></div><!-- panel para la izquierda -->\n");
      out.write("    </div>\n");
      out.write("    <!-- End Page Loading -->\n");
      out.write("    \n");
      out.write("    ");

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConectaBd.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            s_usuario=request.getParameter("f_usuario");
            s_clave=request.getParameter("f_clave");
            s_boton_login=request.getParameter("f_boton_login");
            s_boton_regresar=request.getParameter("f_boton_regresar");
            s_idusuario=request.getParameter("f_idusuario");
            
           try {        
           if (s_boton_regresar==null) {
               if (s_boton_login==null) {
                response.sendRedirect("login.jsp");
               }
           }
           
           if (s_boton_login!=null) {
           consulta1 = "select count(*) from usuario where usuario='"+s_usuario+"' and clave='"+ s_clave+"';";
           out.print(consulta1);
           
                cn1 = DriverManager.getConnection(url,user,password);
                pst1 = cn1.createStatement();
                rs1 = pst1.executeQuery(consulta1);
                if(rs1.next()){
                      resultado=rs1.getString(1);
                }
                    rs1.close();
                    pst1.close();
                    cn1.close();
            
            
            if(resultado.equals("0")) {
                        response.sendRedirect("login.jsp?f_error=1");
            }else{
                        consulta2 = "select idusuario, estado from usuario where usuario='"+s_usuario+"' and clave='"+ s_clave+"';";
                        out.print(consulta1);
                        
                        cn2 = DriverManager.getConnection(url,user,password);
                        pst2 = cn2.createStatement();
                        rs2 = pst2.executeQuery(consulta2);
                        if(rs2.next()){
                           s_idusuario=rs2.getString(1);
                           s_estado=rs2.getString(2);
                        }
                        rs2.close();
                        pst2.close();
                        cn2.close();
                        if(s_estado.equals("D")){
                            response.sendRedirect("login.jsp?f_error=2");
                        }
        }
                     
        }
                        consulta3 = "select usuario.usuario, usuario.nombre, usuario.apellido_pat,usuario.apellido_mat, tipo_usuario.nombre from usuario, tipo_usuario where tipo_usuario.idtipo_usuario=usuario.id_tipo_usuario and idusuario='"+s_idusuario+"'";
                        
                        cn3 = DriverManager.getConnection(url,user,password);
                        pst3 = cn3.createStatement();
                        rs3 = pst3.executeQuery(consulta3);
                        if(rs3.next()){
                            s_usuario = rs3.getString(1);
                            s_nombre = rs3.getString(2);
                            s_apellido_pat = rs3.getString(3);
                            s_apellido_mat = rs3.getString(4);
                            s_tipo = rs3.getString(5);
                        }
                        rs3.close();
                        pst3.close();
                        cn3.close();

                   
                        
      out.write("\n");
      out.write("   <div style=\"padding: 0px; margin-bottom: 0px;\" class=\"row\">\n");
      out.write("         <div style=\"background-color:#1d1d1f; width: 600px; padding: 0px; margin-bottom: 0px; margin-top: 0px;\" class=\"center col s12 z-depth-4 card-panel\">\n");
      out.write("                    <div style=\"padding: 0px; margin-bottom: 0px;\"  class=\"input-field col s12 center\">\n");
      out.write("                        <img style=\"padding: 0px; margin-bottom: 0px; margin-top: 0px;\" src=\"images/icons/profile.png\" alt=\"iconmenu\">\n");
      out.write("                        <p style=\"padding: 0px; margin-bottom: 0px; margin-top: 0px; color: #d5d5d5\" class=\"center login-form-text\">@");
 out.print(s_usuario); 
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"center\" style=\"padding: 0px; margin-bottom: 15px; margin-top: 0px;\">\n");
      out.write("                        <p class=\"center\" style=\"font-size:10px;\"><a style=\"color:#d5d5d5\">");
 out.print(s_nombre+" "+s_apellido_pat+" "+s_apellido_mat);
      out.write(" <strong style=\"color:#2195cc\">(");
 out.print(s_tipo.toUpperCase()); 
      out.write(")</strong></a></p>\n");
      out.write("                    </div>\n");
      out.write("        </div>\n");
      out.write("     </div>\n");
      out.write("    <div id=\"login-page\" class=\"row\">\n");
      out.write("        <div class=\"col s12 z-depth-4 card-panel\">\n");
      out.write("                    <div class=\"input-field col s12 center\">\n");
      out.write("                        <p class=\"center login-form-text\" >Tabla MENU</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col s12 center\">\n");
      out.write("                        <p class=\"center\" style=\"font-size:10px;\"><a>presione un REGISTRO</a></p>\n");
      out.write("                    </div>\n");
      out.write("            \n");
      out.write("            <div class=\"table\">\n");
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("                \n");
      out.write("                        \n");
      out.write("                        \n");

            
            
                 
    
    
                        
                        consulta = "select idacceso, nombre, url from privilegios where estado='A' order by orden asc";
                        out.print(consulta);
                         

                        
                cn = DriverManager.getConnection(url,user,password);
                pst=cn.createStatement();
                rs=pst.executeQuery(consulta);
                        
                        while (rs.next()) {
                
      out.write("\n");
      out.write("                <div class=\"rown\">\n");
      out.write("                    <div class=\"cell\" data-title=\"Name\">\n");
      out.write("                        \n");
      out.write("                            <a style=\"color:#22262e \" href=\"");
 out.println(rs.getString(3)); 
      out.write('"');
      out.write('>');
out.println(rs.getString(2)); 
      out.write("</a>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");

                        }
                        rs.close();
                        pst.close();
                        cn.close();
                    } catch (SQLException ex) {
                Logger.getLogger(ConectaBd.class.getName()).log(Level.SEVERE, null, ex);
            }


                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("\n");
      out.write("       \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                    <script type=\"text/javascript\" src=\"js/plugins/jquery-1.11.2.min.js\"></script>\n");
      out.write("                    <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("                    <script type=\"text/javascript\" src=\"js/plugins/perfect-scrollbar/perfect-scrollbar.min.js\"></script>\n");
      out.write("                    <script type=\"text/javascript\" src=\"js/plugins.min.js\"></script>\n");
      out.write("                    <script type=\"text/javascript\" src=\"js/custom-script.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
