package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.*;
import bd.*;

public final class consulta_002dpor_002dNIS_002do_002dMEDIDOR_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String consulta;
            Connection cn;
            Statement pst;
            ResultSet rs;
            
            String consulta1;
            Connection cn1;
            Statement pst1;
            ResultSet rs1;
            
            String s_accion;
            String s_idventa;
            String s_total;
            String s_idcliente;
            
             String url = "jdbc:mysql://localhost:3306/ventas_si";
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
      out.write("        <link href=\"//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"msapplication-tap-highlight\" content=\"no\">\n");
      out.write("  <title>Datos Venta</title>\n");
      out.write("  <link rel=\"icon\" href=\"images/favicon/favicon-32x321.png\" sizes=\"32x32\">\n");
      out.write("  <link rel=\"apple-touch-icon-precomposed\" href=\"images/favicon/apple-touch-icon-152x152.png\">\n");
      out.write("  \n");
      out.write("  <link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"css/search.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  <link href=\"css/legend_1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  <link href=\"css/separador/datosproveedores.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  <link href=\"css/tabla1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  <link href=\"css/materialize.min.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("  <link href=\"css/style.min.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("  <link href=\"css/custom/custom.min.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("  <link href=\"css/layouts/page-center.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("  <link href=\"js/plugins/perfect-scrollbar/perfect-scrollbar.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("  <link href=\"css/NOIMPRIMIR.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body style=\"background-color:#c1432e\">\n");
      out.write("        \n");
      out.write("    <!-- Start Page Loading -->\n");
      out.write("    <div id=\"loader-wrapper\">\n");
      out.write("        <div id=\"loader\"></div>        \n");
      out.write("        <div class=\"loader-section section-left\"></div><!-- panel para la derecha -->\n");
      out.write("        <div class=\"loader-section section-right\"></div><!-- panel para la izquierda -->\n");
      out.write("    </div>\n");
      out.write("    <!-- End Page Loading -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <div>⠀⠀</div>\n");
      out.write("        \n");
      out.write("    \t\n");
      out.write("    <script language=javascript>\n");
      out.write("        function mayus(e) {\n");
      out.write("    e.value = e.value.toUpperCase();\n");
      out.write("}\n");
      out.write("    </script>\n");
      out.write("        \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("                        ");

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConectaBd.class.getName()).log(Level.SEVERE, null, ex);
            }            


try {

                
                
                                                
                                 
                                 
                                 
                                 
                               
      out.write("\n");
      out.write("        <form action=\"consulta-por-NIS-o-MEDIDOR.jsp\" method=\"post\" class=\"center\">\n");
      out.write("                                   \n");
      out.write("        <div style=\"padding: 0px; margin-bottom: 0px;\" class=\"row\">\n");
      out.write("         <div style=\"background-color:#1d1d1f; width: 700px; padding: 0px; margin-bottom: 0px; margin-top: 0px;\" class=\"center col s12 z-depth-4 card-panel\">\n");
      out.write("                    <div style=\"padding: 0px; margin-bottom: 0px;\"  class=\"input-field col s12 center\">\n");
      out.write("                        <p style=\"padding: 0px; margin-bottom: 0px; margin-top: 0px; color: #d5d5d5\" class=\"center login-form-text\">CONSULTA POR N.I.S. / MEDIDOR</p>\n");
      out.write("                    </div>\n");
      out.write("             <div></div>\n");
      out.write("                    <div class=\"center\" style=\"padding: 0px; padding-left:15px; margin-bottom: 15px; margin-top: 10px;\" >\n");
      out.write("                        <p class=\"center\" style=\"font-size:10px; color:#c1432e; font-size: 12px;\"><strong style=\"color:#c1432e\">N.I.S.: </strong><a style=\"color:#d5d5d5; margin-right: 50px;\"><input style=\"padding: 0px; width: 80px; margin-bottom: 0px; margin-top: 0px; font-size: 12px;\"  type=\"text\" id=\"NIS\" name=\"f_num_nis\" onkeyup=\"mayus(this);\"></a><a style=\"color:#d5d5d5\"><strong style=\"color:#c1432e\">MEDIDOR: </strong> <input style=\"padding: 0px; width: 150px; margin-bottom: 0px; margin-top: 0px; font-size: 12px;\"  type=\"text\" id=\"NIS\" name=\"f_num_nis\" onkeyup=\"mayus(this);\"></a></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\"padding: 0px; padding-left:15px; margin-bottom: 15px; margin-top: 10px;\">\n");
      out.write("                        <p style=\"font-size:10px; color:#2195cc; font-size: 12px;\"><strong style=\"color:#2195cc\">Dir. Suministro: </strong><a style=\"color:#d5d5d5;\"> </a></p>\n");
      out.write("                        <p style=\"font-size:10px; color:#2195cc; font-size: 12px;\"><strong style=\"color:#2195cc\">Titular de la Conexión: </strong><a style=\"color:#d5d5d5;\"> </a></p>\n");
      out.write("                    </div>\n");
      out.write("             <div style=\"padding: 0px; padding-left:15px; margin-bottom: 15px; margin-top: 10px;\" class=\"center\">\n");
      out.write("                    <input class=\"center btn waves-effect waves-light\"  type=\"submit\" value=\"BUSCAR\" name=\"f_buscar\" />\n");
      out.write("                    </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("                               ");
      out.write("\n");
      out.write("                               <div style=\"margin: auto; width: 700px; height: 500px\">\n");
      out.write("\n");
      out.write("                                   <div id=\"login-page\" class=\"row\">\n");
      out.write("                                       <div class=\"col s12 z-depth-4 card-panel\" style=\"padding: 0px\">\n");
      out.write("                                           \n");
      out.write("                                           \n");
      out.write("                                           <style>\n");
      out.write(".navbar {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #1d1d1f;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar a {\n");
      out.write("  float: left;\n");
      out.write("  font-size: 12px;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("  float: left;\n");
      out.write("  overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown .dropbtn {\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-size: 0px;  \n");
      out.write("  border: none;\n");
      out.write("  outline: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 7px 7px;\n");
      out.write("  background-color: inherit;\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar a:hover, .navbar a:focus, .dropdown:hover .dropbtn, .dropbtn:focus {\n");
      out.write("  background-color: red;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("  display: none;\n");
      out.write("  position: absolute;\n");
      out.write("  background-color: #f9f9f9;\n");
      out.write("  min-width: 160px;\n");
      out.write("  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("  z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("  float: none;\n");
      out.write("  color: black;\n");
      out.write("  padding: 0px 0px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: block;\n");
      out.write("  text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("#computadora { display: none; }​\n");
      out.write("#pantalla1 { display: none; }​\n");
      out.write("#grifo { display: block; }​\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("/* When the user clicks on the button, \n");
      out.write("toggle between hiding and showing the dropdown content */\n");
      out.write("\n");
      out.write("function showGrifo() { \n");
      out.write("            div = document.getElementById('grifo'); \n");
      out.write("            div.style.display = \"block\";\n");
      out.write("            div1 = document.getElementById('pantalla');\n");
      out.write("            div1.style.display = \"none\"; \n");
      out.write("            div2 = document.getElementById('computadora'); \n");
      out.write("            div2.style.display = \"none\";\n");
      out.write("}\n");
      out.write("function showPantalla() { \n");
      out.write("            div = document.getElementById('pantalla');\n");
      out.write("            div.style.display = \"block\"; \n");
      out.write("            div1 = document.getElementById('computadora'); \n");
      out.write("            div1.style.display = \"none\";\n");
      out.write("            div2 = document.getElementById('grifo'); \n");
      out.write("            div2.style.display = \"none\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("function showComputadora() { \n");
      out.write("            div = document.getElementById('pantalla');\n");
      out.write("            div.style.display = \"none\"; \n");
      out.write("            div1 = document.getElementById('computadora'); \n");
      out.write("            div1.style.display = \"block\";\n");
      out.write("            div2 = document.getElementById('grifo'); \n");
      out.write("            div2.style.display = \"none\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                           <div class=\"navbar\" style=\"margin-left: 0px; margin-right: 0px; padding-left: 0px; padding-right: 0px; padding: 0px\">\n");
      out.write("                                                   <a style=\"margin-left: 0px; margin-right: 0px; padding-left: 0px; padding-right: 0px; padding: 0px\" class=\"dropdown\"><button class=\"dropbtn\" onclick=\"javascript:showGrifo()\"><img style=\"margin: 5px 5px;\" width=\"25px\" height=\"25px\" src=\"images/icons/grifo1.svg\" alt=\"icongrifo1\"></button></a>\n");
      out.write("                                                   <a style=\"margin-left: 0px; margin-right: 0px; padding-left: 0px; padding-right: 0px; padding: 0px\" class=\"dropdown\"><button class=\"dropbtn\" onclick=\"javascript:showPantalla()\"><img style=\"margin: 5px 5px;\" width=\"25px\" height=\"25px\" src=\"images/icons/pantalla.svg\" alt=\"iconpantalla\"></button></a>\n");
      out.write("                                                   <a style=\"margin-left: 0px; margin-right: 0px; padding-left: 0px; padding-right: 0px; padding: 0px\" class=\"dropdown\"><button class=\"dropbtn\" onclick=\"javascript:showComputadora()\"><img style=\"margin: 5px 5px;\" width=\"25px\" height=\"25px\" src=\"images/icons/computadora.svg\" alt=\"iconcomputadora\"></button></a>\n");
      out.write("                                                   <a><img width=\"25px\" height=\"25px\" src=\"images/icons/reporte.svg\" alt=\"iconreporte\"></a>\n");
      out.write("                                           </div>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".tg  {border-collapse:collapse;border-spacing:0;}\n");
      out.write(".tg td{border-color:black;border-style:transparent;border-width:1px;font-family:Arial, sans-serif;font-size:12px;\n");
      out.write("  overflow:hidden;padding:5px 5px;word-break:normal;}\n");
      out.write(".tg th{border-color:black;border-style:transparent;border-width:1px;font-family:Arial, sans-serif;font-size:12px;\n");
      out.write("  font-weight:normal;overflow:hidden;padding:5px 5px;word-break:normal;}\n");
      out.write(".tg .tg-73oq{border-color:#000000;text-align:left;vertical-align:top}\n");
      out.write(".tg .tg-0lax{text-align:left;vertical-align:top}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"margin-top: 5px; margin-bottom: 5px; margin-left: 5px; margin-right: 5px;\" id=\"grifo\"\">\n");
      out.write("<div style=\"border: 1px solid black; \"> \n");
      out.write("<table class=\"tg\">\n");
      out.write("\n");
      out.write("<tbody>\n");
      out.write("   <tr>\n");
      out.write("    <td class=\"tg-0lax\" ><a style=\"color:#d5d5d5;\"><strong style=\"color:#2195cc\">Tarifa: </strong> </a></th>\n");
      out.write("    <td class=\"tg-0lax\"><a style=\"color:#d5d5d5;\"><strong style=\"color:#2195cc\">Estado del Suministro: </strong></a></th>\n");
      out.write("  </tr> \n");
      out.write("  <tr>\n");
      out.write("    <td class=\"tg-0lax\" ><a style=\"color:black;\"><strong style=\"color:#2195cc\">F. Conex.: </strong> 00/00/000 \n");
      out.write("        <strong style=\"color:#2195cc; margin-left: 20px;\">F. Baja: </strong> 00/00/0000 </a></td>\n");
      out.write("    <td class=\"tg-0lax\"><a style=\"color:#d5d5d5;\"><strong style=\"color:#2195cc\">Periodicidad Facturación: </strong> </a></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td class=\"tg-0lax\" ><a style=\"color:black;\"><strong style=\"color:#2195cc\">C.U.A.: </strong> </a></td>\n");
      out.write("    <td class=\"tg-0lax\"><a style=\"color:#d5d5d5;\"><strong style=\"color:#2195cc\">Periodicidad de lectura: </strong> </a></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td class=\"tg-0lax\" ><a style=\"color:black;\"><strong style=\"color:#2195cc\">Of. Com.: </strong> </a></td>\n");
      out.write("    <td class=\"tg-0lax\"><a style=\"color:#d5d5d5;\"><strong style=\"color:#2195cc\">Diámetro Conexión Agua: </strong> </a></td>\n");
      out.write("  </tr>\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("        \n");
      out.write("                   \n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("<div style=\" display: none; margin-top: 5px; margin-bottom: 5px; margin-left: 5px; margin-right: 5px;\" id=\"pantalla\">\n");
      out.write("                                           <div class=\"table\" >\n");
      out.write("                                               <div class=\"rown\" style=\"background-color:#c1432e; color: white \">\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           N° Medidor\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           Marca\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           Tipo Medidor\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           Estado\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           Tipo Consumo\n");
      out.write("                                                       </div>\n");
      out.write("                                                </div>\n");
      out.write("                                               <div class=\"rown\" >\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           ㅤ\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                </div>\n");
      out.write("                                               <div class=\"rown\" >\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           ㅤ\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                </div>\n");
      out.write("                                           </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div style=\"margin-top: 5px; margin-bottom: 5px; margin-left: 5px; margin-right: 5px;\" id=\"computadora\">\n");
      out.write("                                           <div class=\"table\" >\n");
      out.write("                                               <div class=\"rown\" style=\"background-color:#c1432e; color: white \">\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           N° Medidor\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           Marca\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           Tipo Medidor\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           Estado\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           Fecha Instalación\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           Fecha Levantamiento\n");
      out.write("                                                       </div>\n");
      out.write("                                                </div>\n");
      out.write("                                               <div class=\"rown\" >\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           ㅤ\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                </div>\n");
      out.write("                                               <div class=\"rown\" >\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           ㅤ\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                </div>\n");
      out.write("                                           </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                           <div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                               ");
      out.write("\n");
      out.write("                                               <div class=\"table\">\n");
      out.write("                                                   <div class=\"rown header\">\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           Num\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           Producto\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           Precio\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           Cantidad\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           SubTotal\n");
      out.write("                                                       </div>\n");
      out.write("                                                       \n");
      out.write("\n");
      out.write("\n");
      out.write("                                                   </div>\n");
      out.write("\n");
      out.write("                                                   ");

                                               
                                                       //en esta consulta pedimos los datos necesarios de la tabla detalle_venta
                                                       consulta = "select detalle_venta.iddetalle_venta, producto.nombre, detalle_venta.precioventa, detalle_venta.cantidad from detalle_venta, producto where producto.idproducto=detalle_venta.idproducto and detalle_venta.idventa='24';";
                                                       //out.print(consulta);
                                                       pst=cn.createStatement();
                                                       rs=pst.executeQuery(consulta);
                                                       
                                                       //variables de apoyo para calcular el subtotal y el monto
                                                       int num = 0;
                                                       String idp;
                                                       String cantidad;
                                                       String precio;
                                                       double subtotal;
                                                       double A;
                                                       double B;
                                                       double monto = 0.00;

                                                       while (rs.next()) {
                                                           idp = rs.getString(1);
                                                           precio = rs.getString(3);
                                                           cantidad = rs.getString(4);
                                                           num++;
                                                   
      out.write("\n");
      out.write("                                                   <div class=\"rown\">\n");
      out.write("                                                       \n");
      out.write("                                                       ");
      out.write("\n");
      out.write("                                                       <div class=\"cell\" data-title=\"Num\">\n");
      out.write("                                                           ");
 out.print(num);
      out.write("\n");
      out.write("                                                       </div>\n");
      out.write("                                                       \n");
      out.write("                                                       ");
      out.write("\n");
      out.write("                                                       <div class=\"cell\" data-title=\"Nombre\">\n");
      out.write("                                                           ");
 out.print(rs.getString(2)); 
      out.write("\n");
      out.write("                                                       </div>\n");
      out.write("                                                       \n");
      out.write("                                                       ");
      out.write("\n");
      out.write("                                                       <div class=\"cell\" data-title=\"Apellido\">\n");
      out.write("                                                           ");
 out.print(precio); 
      out.write("\n");
      out.write("                                                       </div>\n");
      out.write("                                                       \n");
      out.write("                                                       ");
      out.write("\n");
      out.write("                                                       <div class=\"cell\" data-title=\"Apellido\">\n");
      out.write("                                                           ");
 out.print(cantidad); 
      out.write("\n");
      out.write("                                                       </div>\n");
      out.write("                                                       \n");
      out.write("                                                       ");
      out.write("\n");
      out.write("                                                       <div class=\"cell\" data-title=\"Apellido\">\n");
      out.write("                                                           ");

                                                               A = Double.parseDouble(cantidad);
                                                               B = Double.parseDouble(precio);
                                                    subtotal = A * B;
                                                    monto = monto + subtotal;

                                                    out.print(subtotal); 
      out.write("\n");
      out.write("                                                       </div>\n");
      out.write("                                                       \n");
      out.write("                                                   </div>\n");
      out.write("                                                   ");

                                                       }

                                                   
      out.write("\n");
      out.write("\n");
      out.write("                                                   <div class=\"rown\">\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("\n");
      out.write("                                                       </div>\n");
      out.write("                                                       \n");
      out.write("                                                       ");
      out.write("\n");
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           <a>Monto: </a>");
out.print("S/" + monto + "0");
      out.write("\n");
      out.write("                                                       </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                   </div>\n");
      out.write("                                               </div>\n");
      out.write("                                                       \n");
      out.write("                                                       \n");
      out.write("                                                           <table style=\"margin:auto\"  id=\"parte1\">\n");
      out.write("                                                               <tr>\n");
      out.write("                                                                   <td>⠀</td>\n");
      out.write("                                                                   <td>\n");
      out.write("                                                                       \n");
      out.write("                                            ");
      out.write("\n");
      out.write("                                            <form style=\"margin:auto\" method=\"post\" id=\"form\" name=\"f_formbuscarcliente\" action=\"Venta.jsp\">\n");
      out.write("                                                <input class=\"btn waves-effect waves-light\" style='width:250px' type=\"submit\" value=\"Emitir Nueva Boleta\" name=\"f_buscarcliente\" />                  \n");
      out.write("                                            </form>\n");
      out.write("                                            \n");
      out.write("                                                                   </td>\n");
      out.write("                                                                   <td>\n");
      out.write("                                                                       \n");
      out.write("                                            ");
      out.write("\n");
      out.write("                                            <form style=\"margin:auto\" method=\"post\" id=\"form\" name=\"f_formbuscarcliente\" action=\"menu.jsp\">\n");
      out.write("                                                <input class=\"btn waves-effect waves-light\" style='width:250px' type=\"submit\" value=\"Volver al Menu\" name=\"f_buscarcliente\" />                  \n");
      out.write("                                            </form>\n");
      out.write("                                                                   </td>\n");
      out.write("                                                           </tr>\n");
      out.write("                                                          </table> \n");
      out.write("                                                \n");
      out.write("                                               <div class=\"input-field col s12 center\">\n");
      out.write("                                                   <p class=\"center login-form-text\"></p>\n");
      out.write("                                               </div>\n");
      out.write("                                           </div>\n");
      out.write("\n");
      out.write("                                       </div>\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("                                 ");
  

                                                rs.close();
                                                pst.close();
                                                cn.close();
                                             } catch (SQLException ex) {
                Logger.getLogger(ConectaBd.class.getName()).log(Level.SEVERE, null, ex);
            }
                                        
      out.write("\n");
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
      out.write("</html>\n");
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
