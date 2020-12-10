package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String s_error;
            
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"msapplication-tap-highlight\" content=\"no\">\n");
      out.write("  <title>Login</title>\n");
      out.write("\n");
      out.write("  <!-- Favicons-->\n");
      out.write("  <link rel=\"icon\" href=\"images/favicon/favicon-32x321.png\" sizes=\"32x32\">\n");
      out.write("  <!-- Favicons-->\n");
      out.write("  <link rel=\"apple-touch-icon-precomposed\" href=\"images/favicon/apple-touch-icon-152x152.png\">\n");
      out.write("  <!-- For iPhone -->\n");
      out.write("  <meta name=\"msapplication-TileColor\" content=\"#00bcd4\">\n");
      out.write("  <meta name=\"msapplication-TileImage\" content=\"images/favicon/mstile-144x144.png\">\n");
      out.write("  <!-- For Windows Phone -->\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- CORE CSS-->\n");
      out.write("  \n");
      out.write("  <link href=\"css/materialize.min.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("  <link href=\"css/style.min.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("    <!-- Custome CSS-->    \n");
      out.write("    <link href=\"css/custom/custom.min.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("  <link href=\"css/layouts/page-center.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("\n");
      out.write("  <!-- INCLUDED PLUGIN CSS ON THIS PAGE -->\n");
      out.write("  <link href=\"js/plugins/perfect-scrollbar/perfect-scrollbar.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("            ");
      out.write("  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<!-- cambiar el color del fondo -->\n");
      out.write("<body style=\"background-color:#c1432e\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        ");
 
        s_error=request.getParameter("f_error");
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div id=\"login-page\" class=\"row\">\n");
      out.write("        <!-- class= \"card-panel\" le da el panel blanco y z-depth-4 le da la sombra a las cosas-->\n");
      out.write("        <div class=\"col s12 z-depth-4 card-panel\">\n");
      out.write("            <form method=\"post\" action=\"menu.jsp\" class=\"login-form\" id=\"form\">\n");
      out.write("                <!-- class= \"row\" aumenta el margen entre los parrafos -->\n");
      out.write("                <!-- class= \"center\"centra el texto y \"login-form-text\" cambia el texto -->\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"input-field col s12 center\">\n");
      out.write("                        <p class=\"center login-form-text\">Iniciar Sesion</p>\n");
      out.write("        ");

        if(s_error!=null){
            
        if(s_error.equals("1")){
        
      out.write("\n");
      out.write("        \n");
      out.write("                        <p class=\"center\" style=\"font-size:15px;\" ><a>clave o usuario invalido</a></p>\n");
      out.write("                    \n");
      out.write("        ");

            }

            if(s_error.equals("2")){

      out.write("\n");
      out.write("        \n");
      out.write("                        <p class=\"center\" style=\"font-size:15px;\" ><a>el usuario se encuentra desactivado</a></p>\n");
      out.write("                    \n");
      out.write("        ");

            }
        }
        
        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("        \n");
      out.write("                \n");
      out.write("                <!-- class= \"margin\" reduce el margen entre los parrafos -->\n");
      out.write("                <div class=\"row margin\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"mdi-social-person-outline prefix\"></i>\n");
      out.write("                        <input name=\"f_usuario\" id=\"username\" type=\"text\" required>\n");
      out.write("                        <label for=\"username\">Username</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"row margin\">\n");
      out.write("                    \n");
      out.write("                    <!-- darle estilo al input: class=\"input-field col s12\" -->\n");
      out.write("                    <!-- invoca y da estilo a la imagen candado: class=\"mdi-action-lock-outline prefix\" -->\n");
      out.write("                    <!-- <i> cursiva </i>\n");
      out.write("                    <!-- darle click a \"nombre\" y que te envie al input id=\"nombre:\n");
      out.write("                    <label for=\"password\">Password</label>\n");
      out.write("                    \n");
      out.write("                    <input name=\"f_clave\" id=\"password\" type=\"password\">\n");
      out.write("                    -->\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"mdi-action-lock-outline prefix\"></i>\n");
      out.write("                        <input name=\"f_clave\" id=\"password\" type=\"password\" required>\n");
      out.write("                        <label for=\"password\">Password</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- para el boton: class=\"btn waves-effect waves-light col s12\" -->\n");
      out.write("                    <input type=\"hidden\" value=\"1\" name=\"f_boton_login\" />\n");
      out.write("                    <input class=\"btn waves-effect waves-light col s12\" style='width:100%' type=\"submit\" value=\"login\" name=\"enviar\" />\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <!-- <a href=\"javascript:void(0);\" onclick=\"document.getElementById('form').submit();\" class=\"btn waves-effect waves-light col s12\">Login</a>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                    <div class=\"input-field col s6 m6 l6\">\n");
      out.write("                        <p class=\"margin medium-small\"><a href=\"register.jsp\">Registrate Ahora</a></p>\n");
      out.write("                    </div>         \n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                    -->\n");
      out.write("                </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- ================================================\n");
      out.write("    Scripts\n");
      out.write("    ================================================ -->\n");
      out.write("\n");
      out.write("  <!-- jQuery Library -->\n");
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
      out.write("\n");
      out.write("</body>\n");
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
