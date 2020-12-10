package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import bd.*;

public final class datosventa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
            String s_idventa;
            String s_total;
            String s_idcliente;
            


        
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
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"blue\">\n");
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
      out.write("                        \n");
      out.write("        \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("                        ");

            try {
                ConectaBd bd = new ConectaBd();
                cn = bd.getConnection();
                cn1 = bd.getConnection();
                
                s_accion = request.getParameter("f_accion");
                        if (s_accion != null && s_accion.equals("B2")) {
                            
                            
                                    s_idventa = request.getParameter("f_idventa");
                                    s_total = request.getParameter("f_total");

                                    consulta = "update venta "
                                            + "set "
                                            + "fecha=CURDATE(), "
                                            + "total='" + s_total+ "', "
                                            + "estado='A' "
                                            + "where idventa= " + s_idventa+";";
                                    //out.print(consulta);
                                    pst = cn.prepareStatement(consulta);
                                    
                                    pst.executeUpdate();
                                    
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    <div id=\"login-page\" class=\"row\" style=\"width: 200px;\">\n");
      out.write("                                        <div class=\"col s12 z-depth-4 card-panel\">\n");
      out.write("                                            <div class=\"col s12 center\">\n");
      out.write("                        <p class=\"center\" style=\"font-size:10px;\"><a>su boleta fue guardada con exito!!</a></p>\n");
      out.write("                    </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div></div>\n");
      out.write("                                    \n");
      out.write("                                    ");

                                    
                            
                        }
                                    
                             if (s_accion != null && s_accion.equals("ver")) {
                                 
                                 s_idventa = request.getParameter("f_idventa");
                                 s_idcliente = request.getParameter("f_idcliente");
                                 
                               
      out.write("\n");
      out.write("                               <div style=\"margin: auto; width: 600px\">\n");
      out.write("\n");
      out.write("                                   <div id=\"login-page\" class=\"row\">\n");
      out.write("                                       <div class=\"col s12 z-depth-4 card-panel\">\n");
      out.write("\n");
      out.write("                                           <div class=\"input-field col s12 center\">\n");
      out.write("                                               <p class=\"center login-form-text\">PRODUCTOS Y ABORROTES S.A.C.</p>\n");
      out.write("                                           </div>\n");
      out.write("                                           ");
                    consulta = "select numero, CURDATE() from venta where idventa= " + s_idventa + ";";
                                               //out.print(consulta);
                                               pst = cn.prepareStatement(consulta);
                                               rs = pst.executeQuery();
                                               if (rs.next()) {

                                           
      out.write("\n");
      out.write("                                           <p style=\"text-align:center\"><a>Nro de Boleta: </a>");
out.print(rs.getString(1));
      out.write(" ⠀⠀  ⠀⠀ <a>Fecha:</a> ");
out.print(rs.getString(2));
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                           ");
}
                                               consulta = "select nombre, apellido, direccion, dni from cliente where idcliente= " + s_idcliente + ";";
                                               //out.print(consulta);
                                               pst = cn.prepareStatement(consulta);
                                               rs = pst.executeQuery();
                                               if (rs.next()) {

                                           
      out.write("\n");
      out.write("\n");
      out.write("                                           <p style=\"text-align:left\"><a>Nombre:</a> ");
out.print(rs.getString(2).toUpperCase() + ", " + rs.getString(1));
      out.write("</p>\n");
      out.write("                                           <p style=\"text-align:left\"><a>DNI:</a> ");
out.print(rs.getString(4));
      out.write("</p>\n");
      out.write("                                           <p style=\"text-align:left\"><a>Direccion:</a> ");
out.print(rs.getString(3));
      out.write("</p>\n");
      out.write("\n");
      out.write("                                           ");

                                               }
                                           
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                           <div>\n");
      out.write("\n");
      out.write("\n");
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

                                                       consulta = "select detalle_venta.iddetalle_venta, producto.nombre, detalle_venta.precioventa, detalle_venta.cantidad from detalle_venta, producto where producto.idproducto=detalle_venta.idproducto and detalle_venta.idventa='" + s_idventa + "';";
                                                       //out.print(consulta);
                                                       pst = cn.prepareStatement(consulta);
                                                       rs = pst.executeQuery();
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
                                                           cantidad = rs.getString(3);
                                                           precio = rs.getString(4);
                                                           num++;
                                                   
      out.write("\n");
      out.write("                                                   <div class=\"rown\">\n");
      out.write("                                                       <div class=\"cell\" data-title=\"Num\">\n");
      out.write("                                                           ");
 out.print(num);
      out.write("\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\" data-title=\"Nombre\">\n");
      out.write("                                                           ");
 out.print(rs.getString(2)); 
      out.write("\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\" data-title=\"Apellido\">\n");
      out.write("                                                           ");
 out.print(cantidad); 
      out.write("\n");
      out.write("                                                       </div>\n");
      out.write("                                                       <div class=\"cell\" data-title=\"Apellido\">\n");
      out.write("                                                           ");
 out.print(precio); 
      out.write("\n");
      out.write("                                                       </div>\n");
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
      out.write("                                                       <div class=\"cell\">\n");
      out.write("                                                           <a>Monto: </a>");
out.print("S/" + monto + "0");
      out.write("\n");
      out.write("                                                       </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                   </div>\n");
      out.write("                                               </div>\n");
      out.write("                                               <div class=\"input-field col s12 center\">\n");
      out.write("                                                   <p class=\"center login-form-text\"></p>\n");
      out.write("                                               </div>\n");
      out.write("                                           </div>\n");
      out.write("\n");
      out.write("                                       </div>\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("                                 ");

                             }     
                                    
                                    
                                    
                                    
                                    
                                    
                                    
      out.write("\n");
      out.write("  \n");
      out.write("                        <div>\n");
      out.write("                        \n");
      out.write("                            \n");
      out.write("                            <div id=\"login-page\" class=\"row\">\n");
      out.write("                                <div class=\"col s12 z-depth-4 card-panel\">\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"input-field col s12 center\">\n");
      out.write("                                        <p class=\"center login-form-text\" >Tabla Ventas</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col s12 center\">\n");
      out.write("                                        <p class=\"center\" style=\"font-size:10px;\"><a>listado de Boletas</a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"table\">\n");
      out.write("                                        <div class=\"rown header\">\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Nro\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Fecha\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Nro De Boleta\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Cliente\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                DNI\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Monto\n");
      out.write("                                            </div>\n");
      out.write("                                           \n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Acciones\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                       ");


                            consulta = "SELECT venta.idventa, venta.fecha, venta.numero, cliente.nombre, cliente.apellido, cliente.dni, venta.idcliente, venta.total from venta, cliente WHERE cliente.idcliente=venta.idcliente and venta.estado='A' ORDER by fecha ASC;";
                            //out.print(consulta);
                            pst = cn.prepareStatement(consulta);
                            rs = pst.executeQuery();
                            int num = 0;
                            String idp;
                            String idc;
                            while (rs.next()) {
                                idp = rs.getString(1);
                                idc = rs.getString(8);
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
      out.write("                                            <div class=\"cell\" data-title=\"Nombre\">\n");
      out.write("                                                ");
 out.print(rs.getString(3)); 
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\" data-title=\"Nombre\">\n");
      out.write("                                                ");
 out.print(rs.getString(5).toUpperCase()+ ", " +rs.getString(4)); 
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\" data-title=\"Nombre\">\n");
      out.write("                                                ");
 out.print(rs.getString(6)); 
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\" data-title=\"Nombre\">\n");
      out.write("                                                ");
 out.print("S/"+ rs.getString(7)); 
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\" data-title=\"Eliminar\">\n");
      out.write("                                                <a href=\"datosventa.jsp?f_accion=ver&f_idventa=");
out.print(idp);
      out.write("&f_idcliente=");
out.print(idc);
      out.write("\" style=\"color:#0091ea\"><i class=\"icon-eye-open icon-large \" ></i></a>\n");
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
      out.write("\n");
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
      out.write("                            </div>\n");
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
      out.write("</html>  ");
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
