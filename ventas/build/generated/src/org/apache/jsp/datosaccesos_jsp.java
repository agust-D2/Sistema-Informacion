package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import bd.*;

public final class datosaccesos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String consulta;
            Connection cn;
            PreparedStatement pst;
            ResultSet rs;
            
            String consulta1;
            Connection cn1;
            PreparedStatement pst1;
            ResultSet rs1;
            
            String s_accion;
            String s_idacceso;
            String s_nombre;
            String s_url;
            String s_orden;
            String s_estado;

        
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("       <link href=\"//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("       <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/> \n");
      out.write("        \n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"msapplication-tap-highlight\" content=\"no\">\n");
      out.write("  <title>Datos Accesos</title>\n");
      out.write("  <link rel=\"icon\" href=\"images/favicon/favicon-32x321.png\" sizes=\"32x32\">\n");
      out.write("  <link rel=\"apple-touch-icon-precomposed\" href=\"images/favicon/apple-touch-icon-152x152.png\">\n");
      out.write("  \n");
      out.write("  <link href=\"css/legend_1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  <link href=\"css/separador/separadoracceso.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("    <body class=\"blue\">\n");
      out.write("        \n");
      out.write("        <!-- Start Page Loading -->\n");
      out.write("    <div id=\"loader-wrapper\">\n");
      out.write("        <div id=\"loader\"></div>        \n");
      out.write("        <div class=\"loader-section section-left\"></div><!-- panel para la derecha -->\n");
      out.write("        <div class=\"loader-section section-right\"></div><!-- panel para la izquierda -->\n");
      out.write("    </div>\n");
      out.write("    <!-- End Page Loading -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \t\n");
      out.write("                        \n");
      out.write("        \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("                        ");

            try {
                ConectaBd bd = new ConectaBd();
                cn = bd.getConnection();
                s_accion = request.getParameter("f_accion");
                s_idacceso = request.getParameter("f_idacceso");

                if (s_accion != null && s_accion.equals("M1")) {
                    consulta = "select nombre, orden, url, estado"
                            + " from accesos "
                            + " where "
                            + " idacceso = " + s_idacceso;
                    //out.print(consulta);
                    pst = cn.prepareStatement(consulta);
                    rs = pst.executeQuery();
                    if (rs.next()) {

        
      out.write("\n");
      out.write("        \n");
      out.write("            <div>⠀⠀</div>\n");
      out.write("        <fieldset style=\"margin:auto\" class=\"z-depth-4\" >\n");
      out.write("    <form method=\"post\" class=\"login-form\" id=\"form\" name=\"f_EditarDatosPersona\" action=\"datosaccesos.jsp\">\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"input-field col s12 center\">\n");
      out.write("                        <p class=\"center login-form-text\">Editar Acceso</p>\n");
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
      out.write("                        <i class=\"icon-table icon-2x prefix\"></i>\n");
      out.write("                        <input name=\"f_nombre\" id=\"username\" type=\"text\" required value=\"");
      out.print(rs.getString(1));
      out.write("\">\n");
      out.write("                        <label for=\"username\">Nombre</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row margin\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"icon-list-ol icon-2x prefix\"></i>\n");
      out.write("                        <input name=\"f_orden\" id=\"username1\" type=\"text\" required value=\"");
      out.print(rs.getString(2));
      out.write("\">\n");
      out.write("                        <label for=\"username1\">orden</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row margin\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"icon-paste icon-2x prefix \"></i>\n");
      out.write("                        <input name=\"f_url\" id=\"username2\" type=\"text\" required value=\"");
      out.print(rs.getString(3));
      out.write("\">\n");
      out.write("                        <label for=\"username2\">url</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row margin\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <select name=\"f_estado\" required=\"\">\n");
      out.write("                               <option value=\"\" disabled hidden>Estado</option>\n");
      out.write("                               <option value=\"A\" ");
 if(rs.getString(4).equals('A')){
      out.write("  selected ");
}
      out.write(" >Activo</option>\n");
      out.write("                               <option value=\"D\" ");
 if(rs.getString(4).equals('D')){
      out.write("  selected ");
}
      out.write(" >Desactivo</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <input class=\"btn waves-effect waves-light col s12\" style='width:100%' type=\"submit\" value=\"Editar\" name=\"f_editar\" />                  \n");
      out.write("                    <input type=\"hidden\" value=\"M2\" name=\"f_accion\" />\n");
      out.write("                    <input type=\"hidden\" value=\"");
      out.print(s_idacceso);
      out.write("\" name=\"f_idacceso\" />\n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("            </form>\n");
      out.write("            </fieldset>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("                \n");
      out.write("        \n");
      out.write("        ");
  }
        } else {
             s_accion = request.getParameter("f_accion");
                //out.print(s_accion);
                if (s_accion != null && s_accion.equals("C1")) {
        
      out.write("\n");
      out.write("<div>⠀⠀</div>\n");
      out.write("<div>⠀⠀</div>\n");
      out.write("       <fieldset style=\"margin:auto\" class=\"z-depth-4\" >\n");
      out.write("    <form method=\"post\" action=\"datosaccesos.jsp\" class=\"login-form\" id=\"form\" name=\"f_datospersonaformulario\">\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"input-field col s12 center\">\n");
      out.write("                        <p class=\"center login-form-text\">Registrar Nuevo Acceso</p>\n");
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
      out.write("                        <i class=\"icon-table icon-2x prefix\"></i>\n");
      out.write("                        <input name=\"f_nombre\" id=\"username\" type=\"text\" required >\n");
      out.write("                        <label for=\"username\">Nombre</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row margin\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"icon-list-ol icon-2x prefix\"></i>\n");
      out.write("                        <input name=\"f_orden\" id=\"username1\" type=\"text\" required >\n");
      out.write("                        <label for=\"username1\">Orden</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row margin\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"icon-paste icon-2x prefix  \"></i>\n");
      out.write("                        <input name=\"f_url\" id=\"username2\" type=\"text\" required >\n");
      out.write("                        <label for=\"username2\">URL</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>   \n");
      out.write("                <div class=\"row margin\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <select name=\"f_estado\" required=\"\">\n");
      out.write("                               <option value=\"\" disabled hidden selected>Estado</option>\n");
      out.write("                               <option value=\"A\">Activo</option>\n");
      out.write("                               <option value=\"D\">Desactivo</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>   \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <input class=\"btn waves-effect waves-light col s12\" style='width:100%' type=\"submit\" value=\"Registrar\" name=\"f_registrar\" />                  \n");
      out.write("                    <input type=\"hidden\" name=\"f_accion\" value=\"C\" size=\"15\" />\n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("            </fieldset>\n");
      out.write("            \n");
      out.write("         \n");
      out.write("            \n");
      out.write("           \n");
      out.write("\n");
      out.write("        ");
            }}
        
      out.write("\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div>⠀⠀</div>\n");
      out.write("                        <div>\n");
      out.write("                        \n");
      out.write("                            \n");
      out.write("                            <div id=\"login-page\" class=\"row\">\n");
      out.write("                                <div class=\"col s12 z-depth-4 card-panel\">\n");
      out.write("                                    <div class=\"input-field col s12 center\">\n");
      out.write("                                        <p class=\"center login-form-text\" >Tabla Accesos</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col s12 center\">\n");
      out.write("                                        <p class=\"center\" style=\"font-size:10px;\"><a>listado de ACCESOS</a></p>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"table\">\n");
      out.write("                                        <div class=\"rown header\">\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Num\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Nombre\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Orden\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                URL\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Estado\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Acciones\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        ");

                    //out.print("Accion: " + s_accion + "-----");
                    if (s_accion != null) {
                        if (s_accion.equals("E")) {
                            consulta = " delete from accesos "
                                    + " where idacceso = " + s_idacceso + " ; ";
                            //out.print(consulta);
                            pst = cn.prepareStatement(consulta);
                            pst.executeUpdate();
                        } else if (s_accion.equals("M2")) {
                            //out.print("Editar --> " + s_idpersona);
                            s_nombre = request.getParameter("f_nombre");
                            s_orden = request.getParameter("f_orden");
                            s_url = request.getParameter("f_url");
                            s_estado = request.getParameter("f_estado");
                            consulta = " update accesos "
                                    + " set "
                                    + " nombre = '" + s_nombre + "', "
                                    + " orden = '" + s_orden + "', "
                                    + " estado = '" + s_estado + "', "
                                    + " url = '" + s_url + "' "
                                    + " where"
                                    + " idacceso = " + s_idacceso;
                            //out.print(consulta);
                            pst = cn.prepareStatement(consulta);
                            pst.executeUpdate();
                        } else if (s_accion.equals("C")) {
                            s_nombre = request.getParameter("f_nombre");
                            s_orden = request.getParameter("f_orden");
                            s_url = request.getParameter("f_url");
                            s_estado = request.getParameter("f_estado");
                            //out.println("Registrando nuevo estudiante...");
                            consulta = " insert into accesos (nombre,orden,url,estado) "
                                    + " values ('" + s_nombre + "','" + s_orden + "','" + s_url + "','" + s_estado + "'); ";
                            //out.print(consulta);
                            pst = cn.prepareStatement(consulta);
                            pst.executeUpdate();
                        }
                    }
                    consulta = "select idacceso, nombre, orden, url, estado from accesos order by orden asc";
                    //out.print(consulta);
                    pst = cn.prepareStatement(consulta);
                    rs = pst.executeQuery();
                    int num = 0;
                    String idp;
                    String ida;
                    while (rs.next()) {
                        idp = rs.getString(1);
                        ida = rs.getString(5);
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
      out.write("                                            <div class=\"cell\" data-title=\"DNI\">\n");
      out.write("                                                ");
 out.print(rs.getString(4)); 
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\" data-title=\"DNI\">\n");
      out.write("                                                ");
 
                                                
                                                 if (ida.equals("A")) {
                                                     
                            out.print("Activo");
                        } else{
                                            out.print("Desactivo");         
                                                 }
                                                
                                                
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\" data-title=\"Eliminar\">\n");
      out.write("                                                <a href=\"datosaccesos.jsp?f_accion=E&f_idacceso=");
out.print(idp);
      out.write("\"><i class=\"icon-trash icon-large\"></i></a>\n");
      out.write("                                            ⠀⠀\n");
      out.write("                                                <a href=\"datosaccesos.jsp?f_accion=M1&f_idacceso=");
out.print(idp);
      out.write("\" style=\"color:#0091ea\"><i class=\"icon-pencil icon-large \" ></i></a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        ");

                                                }
                                                rs.close();
                                                pst.close();
                                                cn.close();
                                            } catch (SQLException e) {
                                                System.out.println("Error: " + e.getMessage());
                                            }
                                        
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"rown\">\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                <a href=\"datosaccesos.jsp?f_accion=C1\" class=\"center\"><i class=\"icon-plus icon-large\"></i></a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
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
      out.write("                                        <div class=\"rown\">\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                <a href=\"menu.jsp\" class=\"center\"><i class=\"icon-arrow-left icon-large\"></i></a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("  \t\n");
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
      out.write("</html>  \n");
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
