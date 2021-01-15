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

public final class datosusuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String consulta;
            Connection cn;
            Statement pst;
            ResultSet rs;
            String s_accion;
            String s_idusuario;
            String s_idusuario1;
            String s_usuario;
            String s_clave;
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
      out.write("        \n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"msapplication-tap-highlight\" content=\"no\">\n");
      out.write("  <title>Datos Usuario</title>\n");
      out.write("  <link rel=\"icon\" href=\"images/favicon/favicon-32x321.png\" sizes=\"32x32\">\n");
      out.write("  <link rel=\"apple-touch-icon-precomposed\" href=\"images/favicon/apple-touch-icon-152x152.png\">\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <link href=\"css/legend_1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  <link href=\"css/separador/datosusuarios.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  <link href=\"css/tabla1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  <link href=\"css/materialize.min.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("  <link href=\"css/style.min.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("  <link href=\"css/custom/custom.min.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("  <link href=\"css/layouts/page-center.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("  <link href=\"js/plugins/perfect-scrollbar/perfect-scrollbar.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:#c1432e\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <div id=\"contenedor\">\t\n");
      out.write("                        \n");
      out.write("        \n");
      out.write("                            \n");
      out.write("     <div>⠀⠀</div>                       \n");
      out.write("                        \n");
      out.write("                        ");

             try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConectaBd.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                s_accion = request.getParameter("f_accion");
                s_idusuario = request.getParameter("f_idusuario");
                s_idusuario1 = request.getParameter("f_idusuario1");
                
                  cn = DriverManager.getConnection(url,user,password);         

                if (s_accion != null && s_accion.equals("M1")) {
                    consulta = "select usuario, clave "
                            + " from usuario "
                            + " where "
                            + " idusuario = " + s_idusuario1;
                    //out.print(consulta);
                    
                    pst = cn.createStatement();
                    rs = pst.executeQuery(consulta);
                    if (rs.next()) {

        
      out.write("\n");
      out.write("       <fieldset style=\"margin:auto\" class=\"z-depth-4\" >\n");
      out.write("    \n");
      out.write("           <form method=\"post\" class=\"login-form\" id=\"form\" name=\"f_EditarDatosPersona\" action=\"datosusuarios.jsp\">\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"input-field col s12 center\">\n");
      out.write("                        <p class=\"center login-form-text\">Editar Usuario</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("        <div>\n");
      out.write("                    <div class=\"input-field col s12 center\">\n");
      out.write("                        <p class=\"center\" style=\"font-size:10px;\" ><a>Complete los campos</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("       \n");
      out.write("                <div class=\"row margin\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"mdi-social-person-outline prefix\"></i>\n");
      out.write("                        <input name=\"f_usuario\" id=\"username\" type=\"text\" required value=\"");
      out.print(rs.getString(1));
      out.write("\">\n");
      out.write("                        <label for=\"username\">Usuario</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"row margin\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"mdi-action-lock-outline prefix\"></i>\n");
      out.write("                        <input name=\"f_clave\" id=\"password\" type=\"text\" required value=\"");
      out.print(rs.getString(2));
      out.write("\">\n");
      out.write("                        <label for=\"password\">Password</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <input class=\"btn waves-effect waves-light col s12\" style='width:100%' type=\"submit\" value=\"Editar\" name=\"f_editar\" />                  \n");
      out.write("                    <input type=\"hidden\" value=\"M2\" name=\"f_accion\" />\n");
      out.write("                    <input type=\"hidden\" value=\"");
      out.print(s_idusuario);
      out.write("\" name=\"f_idusuario\" />\n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("            </form>\n");
      out.write("           \n");
      out.write("            </fieldset>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("        \n");
      out.write("                \n");
      out.write("                        \n");
      out.write("        \n");
      out.write("        ");
  }
        } else {
                    
                    s_accion = request.getParameter("f_accion");
                //out.print(s_accion);
                if (s_accion != null && s_accion.equals("C1")) {
                    

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<fieldset style=\"margin:auto\" class=\"z-depth-4\" >\n");
      out.write("    \n");
      out.write("                \n");
      out.write("                <form method=\"post\" action=\"datosusuarios.jsp\" class=\"login-form\" id=\"form\" name=\"f_datospersonaformulario\">\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                    <div class=\"input-field col s12 center\">\n");
      out.write("                        <p class=\"center login-form-text\">Registrar Nuevo Usuario</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                    <div class=\"input-field col s12 center\">\n");
      out.write("                        <p class=\"center\" style=\"font-size:10px;\" ><a>Complete los campos</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row margin\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"mdi-social-person-outline prefix\"></i>\n");
      out.write("                        <input name=\"f_usuario\" id=\"username\" type=\"text\" required >\n");
      out.write("                        <label for=\"username\">Usuario</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"row margin\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"mdi-action-lock-outline prefix\"></i>\n");
      out.write("                        <input name=\"f_clave\" id=\"password\" type=\"text\" required>\n");
      out.write("                        <label for=\"password\">Password</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>       \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <input class=\"btn waves-effect waves-light col s12\" style='width:100%' type=\"submit\" value=\"Registrar\" name=\"f_registrar\" />                  \n");
      out.write("                    <input type=\"hidden\" name=\"f_accion\" value=\"C\" size=\"15\" />\n");
      out.write("                </div>\n");
      out.write("                 </form>\n");
      out.write("            </fieldset>\n");
      out.write("\n");
  }}
        
      out.write("\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("        <div>⠀⠀</div>\n");
      out.write("                        <div>\n");
      out.write("                        \n");
      out.write("                            \n");
      out.write("                            <div id=\"login-page\" class=\"row\">\n");
      out.write("                                <div class=\"col s12 z-depth-4 card-panel\">\n");
      out.write("                                    <div class=\"input-field col s12 center\">\n");
      out.write("                                        <p class=\"center login-form-text\" >Tabla Usuario</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col s12 center\">\n");
      out.write("                                        <p class=\"center\" style=\"font-size:10px;\"><a>listado de USUARIOS</a></p>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"table\">\n");
      out.write("                                        <div class=\"rown header\">\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Num\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Usuario\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Clave\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Acciones\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        ");

                    //out.print("Accion: " + s_accion + "-----");
                    if (s_accion != null) {
                        if (s_accion.equals("E")) {
                            consulta = " delete from usuario "
                                    + " where idusuario = " + s_idusuario + " ; ";
                            //out.print(consulta);
                            
                pst = cn.createStatement();
                pst.executeUpdate(consulta);
                        } else if (s_accion.equals("M2")) {
                            //out.print("Editar --> " + s_idpersona);
                            s_usuario = request.getParameter("f_usuario");
                            s_clave = request.getParameter("f_clave");
                            consulta = " update usuario "
                                    + " set "
                                    + " usuario = '" + s_usuario + "', "
                                    + " clave = '" + s_clave + "' "
                                    + " where"
                                    + " idusuario = " + s_idusuario+ "; ";
                            //out.print(consulta);
                            pst = cn.createStatement();
                pst.executeUpdate(consulta);
                        } else if (s_accion.equals("C")) {
                            s_usuario = request.getParameter("f_usuario");
                            s_clave = request.getParameter("f_clave");
                            //out.println("Registrando nuevo estudiante...");
                            consulta = " insert into usuario (usuario, clave) "
                                    + " values ('" + s_usuario + "','" + s_clave + "'); ";
                            //out.print(consulta);
                            pst = cn.createStatement();
                pst.executeUpdate(consulta);
                        }
                    }
                    consulta = "select idusuario, usuario, clave from usuario";
                    //out.print(consulta);
                    pst = cn.createStatement();
                    rs = pst.executeQuery(consulta);
                    int num = 0;
                    String idp;
                    while (rs.next()) {
                        idp = rs.getString(1);
                        num++;
                
      out.write("\n");
      out.write("                                        <div class=\"rown\">\n");
      out.write("                                            <div class=\"cell\" data-title=\"Num\">\n");
      out.write("                                                ");
 out.print(num);
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\" data-title=\"Nombre\">\n");
      out.write("                                                ");
 out.print(rs.getString(2)); 
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\" data-title=\"Apellido\">\n");
      out.write("                                                ");
 out.print(rs.getString(3)); 
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\" data-title=\"Eliminar\">\n");
      out.write("                                                <a href=\"datosusuarios.jsp?f_accion=E&f_idusuario=");
out.print(idp);
      out.write("\"><i class=\"icon-trash icon-large\"></i></a>\n");
      out.write("                                            ⠀⠀\n");
      out.write("                                                <a href=\"datosusuarios.jsp?f_accion=M1&f_idusuario=");
out.print(idp);
      out.write("\" style=\"color:#0091ea\"><i class=\"icon-pencil icon-large \" ></i></a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        ");

                                                }
                                                rs.close();
                                                pst.close();
                                                cn.close();
                                           
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"rown\">\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                <a href=\"datosusuarios.jsp?f_accion=C1\" class=\"center\"><i class=\"icon-plus icon-large\"></i></a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                    </div><div class=\"center\" style=\"text-align: center; padding-top: 0px; margin-top: 0px; padding-bottom: 15px; margin-bottom: 15px;\">\n");
      out.write("                                            <form action=\"menu.jsp\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" value=\"1\" name=\"f_boton_regresar\" />\n");
      out.write("                        <input type=\"hidden\" value=\"");
 out.println(s_idusuario); 
      out.write("\" name=\"f_idusuario\" />\n");
      out.write("                        <input style=\"color:#c1432e\" type=\"submit\" value=\"Volver\" />\n");
      out.write("                        </form>\n");
      out.write("                                        </div>\n");
      out.write("                                            </div>\n");
      out.write("                        \n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("    </div>\t\n");
      out.write("    \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("    <!-- jQuery Library -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/plugins/jquery-1.11.2.min.js\"></script>\n");
      out.write("  <!--materialize js-->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("  <!--scrollbar-->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/plugins/perfect-scrollbar/perfect-scrollbar.min.js\"></script>\n");
      out.write("\n");
      out.write("      <!--plugins.js - Some Specific JS codes for Plugin Settings-->\n");
      out.write("    <script type=\"text/javascript\" src=\"js/plugins.min.js\"></script>\n");
      out.write("    <!--custom-script.js - Add your own theme custom JS-->\n");
      out.write("    <script type=\"text/javascript\" src=\"js/custom-script.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html> ");
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
