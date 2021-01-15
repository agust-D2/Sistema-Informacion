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

public final class Solicitar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String s_accion;
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
            
            String consulta4;
            Connection cn4;
            PreparedStatement pst4;
            ResultSet rs4;
            
            
            
             String url = "jdbc:mysql://localhost:3306/ventas_avance";
            String user = "root";
            String password = "12345678";
            
            String s_usuario;
            String s_clave;
            String s_boton_login;
            String s_boton_regresar;
            String s_idusuario;
            String s_idacceso;
            
             String s_estado_medidor;
            String s_nombre;
            String s_apellido_pat;
            String s_apellido_mat;
            String s_tipo="";
            String s_estado;
            String resultado="";
            String s_num_medidor;
                                    String s_marca;
                                    String s_tipo_medidor;
                                    String s_diametro;
                                    String s_material;

        
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


             s_usuario=request.getParameter("f_usuario");
            s_clave=request.getParameter("f_clave");
            s_boton_login=request.getParameter("f_boton_login");
            s_boton_regresar=request.getParameter("f_boton_regresar");
            s_idusuario=request.getParameter("f_idusuario");
            s_idacceso=request.getParameter("f_idacceso");
            s_accion=request.getParameter("f_accion");
                 
           if (s_boton_regresar==null) {
               if (s_boton_login==null) {
                response.sendRedirect("login.jsp");
               }
           }
           
           if (s_boton_login!=null) {   
                
                                                
           consulta1 = "select count(*) from usuario where usuario='"+s_usuario+"' and clave='"+ s_clave+"';";
           
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
      out.write("        <div style=\"padding: 0px; margin-bottom: 0px;\" class=\"row\">\n");
      out.write("         <div style=\"background-color:#1d1d1f; width: 700px; padding: 0px; margin-bottom: 0px; margin-top: 0px;\" class=\"center col s12 z-depth-4 card-panel\">\n");
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
      out.write("        </div>\n");
      out.write("                               \n");
      out.write("                            \n");
      out.write("                               \n");
      out.write("                               <div style=\"margin: auto; width: 700px;\">\n");
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
      out.write("\n");
      out.write("#pantalla { display: none; }​\n");
      out.write("#tabla { display: block; }\n");
      out.write("#tabla { display: none; }\n");
      out.write("#agregar { display: none; }\n");
      out.write("</style>\n");
      out.write("\n");
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
      out.write("            div2 = document.getElementById('tabla'); \n");
      out.write("            div2.style.display = \"none\";\n");
      out.write("}\n");
      out.write("function showPantalla() { \n");
      out.write("            div = document.getElementById('pantalla');\n");
      out.write("            div.style.display = \"block\"; \n");
      out.write("            div1 = document.getElementById('tabla'); \n");
      out.write("            div1.style.display = \"none\";\n");
      out.write("            div2 = document.getElementById('grifo'); \n");
      out.write("            div2.style.display = \"none\";\n");
      out.write("}\n");
      out.write("function showLista() { \n");
      out.write("            div = document.getElementById('tabla');\n");
      out.write("            div.style.display = \"block\"; \n");
      out.write("            div1 = document.getElementById('pantalla'); \n");
      out.write("            div1.style.display = \"none\";\n");
      out.write("            div2 = document.getElementById('grifo'); \n");
      out.write("            div2.style.display = \"none\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                           <div class=\"navbar\" style=\"margin-left: 0px; margin-right: 0px; padding-left: 0px; padding-right: 0px; padding: 0px\">\n");
      out.write("                                                   <a style=\"margin-left: 0px; margin-right: 0px; padding-left: 0px; padding-right: 0px; padding: 0px\" class=\"dropdown\"><button class=\"dropbtn\" onclick=\"javascript:showGrifo()\"><img style=\"margin: 5px 5px;\" width=\"25px\" height=\"25px\" src=\"images/icons/buscar_cliente.svg\" alt=\"iconbuscar_cliente\"></button></a>\n");
      out.write("                                                   <a style=\"margin-left: 0px; margin-right: 0px; padding-left: 0px; padding-right: 0px; padding: 0px\" class=\"dropdown\"><button class=\"dropbtn\" onclick=\"javascript:showPantalla()\"><img style=\"margin: 5px 5px;\" width=\"25px\" height=\"25px\" src=\"images/icons/file.svg\" alt=\"iconpantalla\"></button></a>\n");
      out.write("                                                   <a style=\"margin-left: 0px; margin-right: 0px; padding-left: 0px; padding-right: 0px; padding: 0px\" class=\"dropdown\"><button class=\"dropbtn\" onclick=\"javascript:showLista()\"><img style=\"margin: 5px 5px;\" width=\"25px\" height=\"25px\" src=\"images/icons/table.svg\" alt=\"iconlista\"></button></a>\n");
      out.write("                                           \n");
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

    if(s_accion != null){
                                    s_num_medidor = request.getParameter("f_num_medidor");
                                    s_marca = request.getParameter("f_marca");
                                    s_tipo_medidor = request.getParameter("f_tipo_medidor");
                                    s_diametro = request.getParameter("f_diametro");
                                    s_material = request.getParameter("f_material");
                                    

                                    consulta4 = "insert into medidores (num_medidor, marca, tipo_medidor, estado_medidor, diametro, material_medidor)" 
                                    + "values('" + s_num_medidor + "' , '" + s_marca + "' , '" + s_tipo_medidor + "' , 'LPSI', '" + s_diametro + "' , '" + s_material + "');";
    
                                    
                                    
                 try
{                                   
                cn3 = DriverManager.getConnection(url,user,password);
                pst3 = cn3.createStatement();
                pst3.executeUpdate(consulta4);
                
                    pst3.close();
                    cn3.close();}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
    }
    


    
      out.write("\n");
      out.write("\n");
      out.write("   <div style=\" display: block; margin-top: 5px; margin-bottom: 5px; margin-left: 5px; margin-right: 5px;\" id=\"tabla\">\n");
      out.write("                                           \n");
      out.write("    <table class=\"tg\" style=\"border: 1px solid black; text-align:center; \">\n");
      out.write("        <thead >\n");
      out.write("            <tr>\n");
      out.write("                <th tg-73oq>\n");
      out.write("                    <a style=\"color:#d5d5d5;\"><strong style=\"color:#2195cc\">N° Medidor</strong> </a>\n");
      out.write("                </th>\n");
      out.write("                <th tg-73oq>\n");
      out.write("                    <a style=\"color:#d5d5d5;\"><strong style=\"color:#2195cc\">Marca</strong> </a>\n");
      out.write("                </th>\n");
      out.write("                <th tg-73oq>\n");
      out.write("                    <a style=\"color:#d5d5d5;\"><strong style=\"color:#2195cc\">Tipo Medidor</strong> </a>\n");
      out.write("                </th>\n");
      out.write("                <th tg-73oq>\n");
      out.write("                    <a style=\"color:#d5d5d5;\"><strong style=\"color:#2195cc\">Estado</strong> </a>\n");
      out.write("                </th>\n");
      out.write("                <th tg-73oq>\n");
      out.write("                    <a style=\"color:#d5d5d5;\"><strong style=\"color:#2195cc\">Diametro</strong> </a>\n");
      out.write("                </th>\n");
      out.write("                <th tg-73oq>\n");
      out.write("                    <a style=\"color:#d5d5d5;\"><strong style=\"color:#2195cc\">Material</strong> </a>\n");
      out.write("                </th>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("<tbody>\n");
      out.write("    ");

    consulta3 = "select num_medidor, marca, tipo_medidor, estado_medidor, diametro, material_medidor from medidores where estado_medidor='LPSI'";
                        
                        cn3 = DriverManager.getConnection(url,user,password);
                        pst3 = cn3.createStatement();
                        rs3 = pst3.executeQuery(consulta3);
                        while(rs3.next()){
                            
                        
      out.write("\n");
      out.write("                        \n");
      out.write("   <tr>\n");
      out.write("    <td class=\"tg-0lax\">");
 out.print(rs3.getString(1));
      out.write("</td>\n");
      out.write("    <td class=\"tg-0lax\">");
 out.print(rs3.getString(2));
      out.write("</td>\n");
      out.write("    <td class=\"tg-0lax\">");
 out.print(rs3.getString(3));
      out.write("</td>\n");
      out.write("    <td class=\"tg-0lax\">");
 out.print(rs3.getString(4));
      out.write("</td>\n");
      out.write("    <td class=\"tg-0lax\">");
 out.print(rs3.getString(5));
      out.write("</td>\n");
      out.write("    <td class=\"tg-0lax\">");
 out.print(rs3.getString(6));
      out.write("</td>\n");
      out.write("  </tr> \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        ");
}

                        rs3.close();
                        pst3.close();
                        cn3.close();   
                        
      out.write("\n");
      out.write("   <tr>\n");
      out.write("       <td class=\"tg-0lax\" colspan=\"6\" style=\"text-align: center; padding-bottom: 20px;\"><form action=\"menu.jsp\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" value=\"1\" name=\"f_boton_regresar\" />\n");
      out.write("                        <input type=\"hidden\" value=\"");
 out.println(s_idusuario); 
      out.write("\" name=\"f_idusuario\" />\n");
      out.write("                        <input style=\"color:#c1432e\" type=\"submit\" value=\"Volver\" />\n");
      out.write("                        </form></td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("    </div>  \n");
      out.write("   \n");
      out.write("    \n");
      out.write("<div style=\"display: none; margin-top: 5px; margin-bottom: 5px; margin-left: 5px; margin-right: 5px;\" id=\"grifo\"\">\n");
      out.write("<div style=\"border: 1px solid black; \"> \n");
      out.write("    <form action=\"medidores.jsp\" method=\"post\">\n");
      out.write("    <table class=\"tg\">\n");
      out.write("\n");
      out.write("<tbody >\n");
      out.write("   <tr>\n");
      out.write("       <td class=\"tg-0lax\" style=\"text-align: right\"><a style=\"color:black;\"><strong style=\"color:#2195cc\">Num. Medidor: </strong> <input style=\"padding: 0px; width: 80px; margin-bottom: 0px; margin-top: 0px; font-size: 12px;\"  maxlength=\"10\" type=\"text\" id=\"NIS\" name=\"f_num_medidor\" onkeyup=\"mayus(this);\" required>\n");
      out.write("                            </a>ㅤㅤ</td>\n");
      out.write("    <td class=\"tg-0lax\">ㅤㅤ<a style=\"color:black;\"><strong style=\"color:#2195cc\">Marca: </strong> <input style=\"padding: 0px; width: 80px; margin-bottom: 0px; margin-top: 0px; font-size: 12px;\" maxlength=\"45\" type=\"text\" id=\"NIS\" name=\"f_marca\" required onkeyup=\"mayus(this);\">\n");
      out.write("                            </a></td>\n");
      out.write("    <td>ㅤㅤ</td>\n");
      out.write("  </tr> \n");
      out.write("  <tr>\n");
      out.write("    <td class=\"tg-0lax\" style=\"text-align: right\"><a style=\"color:black;\"><strong style=\"color:#2195cc\">Tipo de Medidor: </strong><input style=\"padding: 0px; width: 80px; margin-bottom: 0px; margin-top: 0px; font-size: 12px;\" maxlength=\"45\" type=\"text\" id=\"NIS\" name=\"f_tipo_medidor\" required\"></a>ㅤㅤ</td>\n");
      out.write("    <td class=\"tg-0lax\">ㅤㅤ<a style=\"color:black;\"><strong style=\"color:#2195cc\">Diametro: </strong><input style=\"padding: 0px; width: 80px; margin-bottom: 0px; margin-top: 0px; font-size: 12px;\" maxlength=\"9\" type=\"text\" id=\"NIS\" name=\"f_diametro\" required> </a></td>\n");
      out.write("    <td>ㅤ</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td class=\"tg-0lax\" style=\"text-align: right\"><a style=\"color:black;\"><strong style=\"color:#2195cc\">Material: </strong> <input style=\"padding: 0px; width: 80px; margin-bottom: 0px; margin-top: 0px; font-size: 12px;\" maxlength=\"45\" type=\"text\" id=\"NIS\" name=\"f_material\" required \"></a>ㅤㅤ</td>\n");
      out.write("    <td class=\"tg-0lax\" style=\"padding-top: 15px;\">ㅤㅤ<a style=\"color:black;\"><strong style=\"color:#2195cc\">Estado: </strong>LPI (Listo Para Instalación)</a></td>\n");
      out.write("    <td>ㅤ</td>\n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write("  <tr>\n");
      out.write("    <td colspan=\"3\" style=\"padding-top: 15px; padding-bottom: 15px; text-align: center\"><input style=\"color:#c1432e\" type=\"submit\" value=\"AGREGAR\" name=\"f_agregar\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("      \n");
      out.write("  </tr>\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("                        <input type=\"hidden\" value=\"1\" name=\"f_boton_regresar\" />\n");
      out.write("                        <input type=\"hidden\" value=\"I\" name=\"f_accion\" />\n");
      out.write("                        <input type=\"hidden\" value=\"");
 out.println(s_idacceso); 
      out.write("\" name=\"f_idacceso\" />\n");
      out.write("                        <input type=\"hidden\" value=\"");
 out.println(s_idusuario); 
      out.write("\" name=\"f_idusuario\" />\n");
      out.write("     </form>   \n");
      out.write("                   \n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("     \n");
      out.write("                       \n");
      out.write("\n");
      out.write("<div style=\" display: none; margin-top: 5px; margin-bottom: 5px; margin-left: 5px; margin-right: 5px;\" id=\"pantalla\">\n");
      out.write("                                           \n");
      out.write("<table class=\"tg\" style=\"border: 1px solid black; text-align:center; \">\n");
      out.write("       \n");
      out.write("  <input type=\"file\" id=\"file-input\" />\n");
      out.write("<p>Contenido del archivo:</p>\n");
      out.write("<pre id=\"contenido-archivo\"></pre>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script language=javascript>\n");
      out.write("        \n");
      out.write("  function leerArchivo(e) {\n");
      out.write("  var archivo = e.target.files[0];\n");
      out.write("  if (!archivo) {\n");
      out.write("    return;\n");
      out.write("  }\n");
      out.write("  var lector = new FileReader();\n");
      out.write("  lector.onload = function(e) {\n");
      out.write("    var contenido = e.target.result;\n");
      out.write("    var lineas = contenido.split('\\n');\n");
      out.write("    \n");
      out.write("    mostrarContenido(lineas);\n");
      out.write("    \n");
      out.write("  };\n");
      out.write("  lector.readAsText(archivo);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("function mostrarContenido(contenido) {\n");
      out.write("  var elemento = document.getElementById('contenido-archivo');\n");
      out.write("  elemento.innerHTML = contenido;\n");
      out.write("  div = document.getElementById('agregar');\n");
      out.write("  div.style.display = \"block\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("document.getElementById('file-input')\n");
      out.write("  .addEventListener('change', leerArchivo, false);\n");
      out.write("  </script>\n");
      out.write("  <a id=\"agregar\" style=\"text-align: center; padding-bottom: 20px;\" ><input style=\"color:#c1432e\" type=\"submit\" value=\"AGREGAR\" name=\"f_agregar\" /></a>\n");
      out.write("</table>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                           \n");
      out.write("\n");
      out.write("\n");
      out.write("                                          \n");
      out.write("\n");
      out.write("                                       </div>\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("                                 ");
  

                                        
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
