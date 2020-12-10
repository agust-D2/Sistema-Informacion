package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import bd.*;

public final class Venta_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            //consulta
            String consulta;
            Connection cn;
            PreparedStatement pst;
            ResultSet rs;
            
            //consulta 1
            String consulta1;
            Connection cn1;
            PreparedStatement pst1;
            ResultSet rs1;
            String count;
            
            //acciones en la pagina
            String s_accion;
            String s_CRUD;
            String s_error;
            String s_agregarproducto;
            
            //tabla cliente
            String s_idcliente;
            String s_nombre;
            String s_dni;
            String s_direccion;
            String s_apellido;
            String s_estado;
            
            //tabla venta
            String s_idventa;
            String s_numero;
            
            //tabla producto
            String s_codigo;
            String s_producto;
            
            //tabla detaalle_venta
            String s_cantidad;
            String s_precioventa;
            String s_idproducto;
            String s_total;
            String s_iddetalleventa;


        
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
      out.write("        <link href=\"//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"msapplication-tap-highlight\" content=\"no\">\n");
      out.write("  <title>Emitir Boleta</title>\n");
      out.write("  <link rel=\"icon\" href=\"images/favicon/favicon-32x321.png\" sizes=\"32x32\">\n");
      out.write("  <link rel=\"apple-touch-icon-precomposed\" href=\"images/favicon/apple-touch-icon-152x152.png\">\n");
      out.write("  \n");
      out.write("  \n");
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
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("   <div>⠀⠀</div>\n");
      out.write("        \n");
      out.write("  \n");
      out.write("  \n");
      out.write("   \n");
      out.write("   \n");
      out.write("    ");

            try {
                
                
                s_accion = request.getParameter("f_accion");
                s_numero = request.getParameter("f_numero");
                s_CRUD = request.getParameter("f_CRUD");
                
                //coneccion de la base de datos
                ConectaBd bd = new ConectaBd();
                cn = bd.getConnection();
                cn1 = bd.getConnection();
                
                
                //Aqui verificamos si el numero de boleta que ingresamos ya existe o no
                if(s_accion != null && s_accion.equals("CrearBoleta")){
                    
                    //lo verificamos mediante un contador, si es "1" signica que existe y si es "0" significa que no existe, que puede avanzar con normalidad
                    consulta = "select count(*) from venta where numero='"+s_numero+"';";
                    //out.print(consulta);
                    pst = cn.prepareStatement(consulta);
                    rs = pst.executeQuery();
                    String resultado1="";
                    if(rs.next()){
                      resultado1=rs.getString(1);
                    }
                    
                    //En caso que sea uno:
                    if (resultado1.equals("1")) {
                        
                        //cambiamos la accion CrearBoleta por la accion BuscarCliente para volver a ingresar el numero de boleta
                        s_accion="BuscarCliente"; 
      out.write("\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        ");
      out.write("\n");
      out.write("                        <div id=\"login-page\" class=\"row\" style=\"width: 300px;\">\n");
      out.write("                            <div class=\"col s12 z-depth-4 card-panel\">\n");
      out.write("                                <div class=\"col s12 center\">\n");
      out.write("                                    <p class=\"center\" style=\"font-size:10px;\"><a>El numero de boleta ya existe, pruebe nuevamente</a></p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                                    <div></div>\n");
      out.write("                        \n");
      out.write("                        ");

                    } 
                }
                
                
                //Aqui se realizan las acciones editar y eliminar de detalle_venta
                if (s_CRUD != null) {
                    
                                s_iddetalleventa = request.getParameter("f_iddetalleventa");
                                
                                
                                //Si crud es E, entonces elimanos el registro seleccionado
                                if (s_CRUD.equals("E")) {
                                    
                                    //aqui hacemos la consulta para eliminar
                                    consulta = " delete from detalle_venta where iddetalle_venta=" + s_iddetalleventa + " ; ";
                                    //out.print(consulta);
                                    pst = cn.prepareStatement(consulta);
                                    pst.executeUpdate();
                                
                                //Editar paso 2: Si crud es M2 entonces editamos el registros con los datos ingresados en el crud M1
                                } else if (s_CRUD.equals("M2")) {
                                    s_codigo = request.getParameter("f_codigo");
                                    s_cantidad = request.getParameter("f_cantidad");
                                    
                                    //con esta consulta pedimos el idproducto de la tabla producto gracias al nombre del codigo, hacemos esta consulta porque en la tabla detalle_venta solo existe idproducto no codigo
                                    //tambien pedimos precioventa ya que necesitamos el precio de nuevo producto
                                    consulta = "select idproducto, precioventa from producto where codigo='" + s_codigo + "';";
                                    //out.print(consulta);
                                    pst = cn.prepareStatement(consulta);
                                    rs = pst.executeQuery();
                                    
                                    if (rs.next()) {
                                        //aqui guardamos los valores que pedimos en la consulta
                                        s_idproducto=rs.getString(1);
                                        s_precioventa=rs.getString(2);
                                    }
                                    
                                    //ya con los valores obtenidos podemos hacer el update en la tabla detalle_venta
                                    consulta = "update detalle_venta "
                                            + "set "
                                            + "idproducto='" + s_idproducto+ "', "
                                            + "cantidad='" + s_cantidad+ "', "
                                            + "precioventa='" + s_precioventa+ "' "
                                            + "where iddetalle_venta= " + s_iddetalleventa +";";
                                    //out.print(consulta);
                                    pst = cn.prepareStatement(consulta);
                                    pst.executeUpdate();

                                }
                }
                
                
                
                
                
                
                s_idcliente = request.getParameter("f_idcliente");
                s_dni = request.getParameter("f_dni");
                
                
                
                
                /*  ----------- ETAPA 2 -----------  */
                
                
                
                //Aqui hacemos el proceso de buscar cliente
                if (s_accion != null && s_accion.equals("BuscarCliente")) {
                    
                    //en esta consulta pedimos los datos del DNI que ingresamo en la ETAPA 1
                    consulta = "select nombre, apellido, direccion, estado, idcliente from cliente where dni= " + s_dni + ";";
                        //out.print(consulta);
                    pst = cn.prepareStatement(consulta);
                    rs = pst.executeQuery();
                    String idc;
                    String ida;
                    if (rs.next()) {
                        idc=rs.getString(5);
                        ida=rs.getString(4);
                        
      out.write("\n");
      out.write("                    \n");
      out.write("                ");
      out.write("        \n");
      out.write("                ");
 if(ida.equals("D")){
      out.write("\n");
      out.write("                \n");
      out.write("                ");
      out.write("    \n");
      out.write("                <div id=\"login-page\" class=\"row\" style=\"width: 300px;\">\n");
      out.write("                    <div class=\"col s12 z-depth-4 card-panel\">\n");
      out.write("                        <div class=\"col s12 center\">\n");
      out.write("                            <p class=\"center\" style=\"font-size:10px;\"><a>EL cliente no esta disponible, se encuentra inhabilitado</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                                    <div></div>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                \n");
      out.write("            <fieldset style=\"margin:auto\" class=\"z-depth-4\" >\n");
      out.write("            <form method=\"post\" class=\"login-form\" id=\"form\" name=\"f_formbuscarcliente\" action=\"Venta.jsp\">\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"input-field col s12 center\">\n");
      out.write("                        <p class=\"center login-form-text\">Resultado</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                ");
      out.write("    \n");
      out.write("                ");
 if(ida.equals("A")){
      out.write(" \n");
      out.write("                <p style=\"text-align:left\"><a>Nro de Boleta:</a> <input  style=\"width : 150px\" name=\"f_numero\" id=\"username\" type=\"text\" required value=\"\"></p>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <p style=\"text-align:left\"><a>Nombre:</a> ");
out.print(rs.getString(2).toUpperCase()+", "+rs.getString(1));
      out.write("</p>\n");
      out.write("                <p style=\"text-align:left\"><a>Direccion:</a> ");
out.print(rs.getString(3));
      out.write("</p>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");
      out.write("    \n");
      out.write("                ");
 if(ida.equals("A")){
      out.write("   \n");
      out.write("                <p style=\"text-align:left\"><a>Estado:</a> Activado</p>\n");
      out.write("                <input class=\"btn waves-effect waves-light col s12\" style='width:100%' type=\"submit\" value=\"Iniciar\" name=\"f_buscarcliente\" />                  \n");
      out.write("                \n");
      out.write("                ");
      out.write("    \n");
      out.write("                <input type=\"hidden\" value=\"CrearBoleta\" name=\"f_accion\" />\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(idc);
      out.write("\" name=\"f_idcliente\" />\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(s_dni);
      out.write("\" name=\"f_dni\" />\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");
      out.write("    \n");
      out.write("                ");
} if(ida.equals("D")){
      out.write("   \n");
      out.write("                <p style=\"text-align:left\"><a>Estado:</a> Desactivado</p>\n");
      out.write("                <input class=\"btn waves-effect waves-light col s12\" style='width:100%' type=\"submit\" value=\"Volver\" name=\"f_buscarcliente\" />\n");
      out.write("                \n");
      out.write("                ");
}
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            </fieldset>\n");
      out.write("                        \n");
      out.write("                        ");

                    }
                    
                    
                } else 
                    
                    if(s_accion != null ){
                        
                        
                        
                    /*  ----------- ETAPA 3 -----------  */
                        
                        
                    //si la accion es CrearBoleta o IngresarProducto entramos a la etapa 3
                    if(s_accion.equals("CrearBoleta") || s_accion.equals("IngresarProducto")){
                            
                            //si la accion es crear boleta, creamos un regsitro fantasma en la tabla venta
                            if(s_accion.equals("CrearBoleta")){
                                
                            s_numero = request.getParameter("f_numero");
                            s_idcliente = request.getParameter("f_idcliente");
                            
                            //en esta consulta creamos el registro con datos inexistentes
                            consulta = " insert into venta (numero, fecha, total, estado, idcliente) "
                                    + " values ('" + s_numero + "', CURDATE(), '0', 'D', '"+ s_idcliente + "'); ";
                            //out.print(consulta);
                            pst = cn.prepareStatement(consulta);
                            pst.executeUpdate();
                            }
                            
                        
                        s_numero = request.getParameter("f_numero");
                        s_idcliente = request.getParameter("f_idcliente");
                        
                        //en esta consulta obtenemos el idventa gracias al numero de boleta que es unico, al obtener el idventa solo nos faltaria el idproducto para ingresar registros en la tabla detalle_venta
                        consulta = "select idventa from venta where numero='"+ s_numero +"' and idcliente='"+ s_idcliente +"';";
                        //out.print(consulta);
                        pst = cn.prepareStatement(consulta);
                        rs = pst.executeQuery();
                        if (rs.next()) {
                                    
                                    //guardamos el idventa
                                    s_idventa = rs.getString(1);
                        }

                        
                        
                        //Editar paso 1: Aqui pedimos los datos para hacer el update
                        if(s_CRUD != null && s_CRUD.equals("M1")){
                            
                            s_iddetalleventa = request.getParameter("f_iddetalleventa");
                        
                        //en esta consulta pedimos la cantidad y el idproducto del registro que seleccionamos para editar
                        consulta = "select cantidad, idproducto from detalle_venta where iddetalle_venta= " + s_iddetalleventa + ";";
                        //out.print(consulta);
                        pst = cn.prepareStatement(consulta);
                        rs = pst.executeQuery();
                        
                        if (rs.next()) {
                            s_idproducto=rs.getString(2);
                        
                            
      out.write("\n");
      out.write("            <fieldset style=\"margin:auto\" class=\"z-depth-4\" >\n");
      out.write("            <form method=\"post\" class=\"login-form\" id=\"form\" name=\"f_formbuscarcliente\" action=\"Venta.jsp\">\n");
      out.write("                \n");
      out.write("                <div>\n");
      out.write("                    <div class=\"input-field col s12 center\">\n");
      out.write("                        <p class=\"center login-form-text\">Editar Producto</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"row margin\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"icon-barcode icon-2x prefix\"></i>\n");
      out.write("                        <input name=\"f_codigo\" id=\"username\" type=\"text\" required value=\"");

                            
                            //en esta consulta pedimos el codigo gracias al idproducto, queremos el codigo porque es lo que nos piden ingresar
                            consulta1 = "select codigo from producto where idproducto='" + s_idproducto + "';";
                            //out.print(consulta);
                            pst1 = cn1.prepareStatement(consulta1);
                            rs1 = pst1.executeQuery();
                            if (rs1.next()) {
                                
                                //aqui mostramos el codigo en pantalla
                                out.print(rs1.getString(1));
                                
                            }
                        
                        
      out.write("\">\n");
      out.write("                        <label for=\"username\">Codigo</label>\n");
      out.write("                    </div>     \n");
      out.write("                </div>\n");
      out.write("                        \n");
      out.write("                ");
      out.write("        \n");
      out.write("                <div class=\"row margin\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"icon-shopping-cart icon-2x prefix\"></i>\n");
      out.write("                        <input name=\"f_cantidad\" id=\"username1\" type=\"text\" required value=\"");
      out.print(rs.getString(1));
      out.write("\">\n");
      out.write("                        <label for=\"username1\">Cantidad</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                        \n");
      out.write("                ");
      out.write("        \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <input class=\"btn waves-effect waves-light col s12\" style='width:100%' type=\"submit\" value=\"Editar\" name=\"f_buscarcliente\" />                  \n");
      out.write("                    \n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <input type=\"hidden\" value=\"IngresarProducto\" name=\"f_accion\" />\n");
      out.write("                    \n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <input type=\"hidden\" value=\"M2\" name=\"f_CRUD\" /> \n");
      out.write("                    <input type=\"hidden\" value=\"");
out.print(s_iddetalleventa);
      out.write("\" name=\"f_iddetalleventa\" /> \n");
      out.write("                    <input type=\"hidden\" value=\"");
out.print(s_idcliente);
      out.write("\" name=\"f_idcliente\" /> \n");
      out.write("                    <input type=\"hidden\" value=\"");
out.print(s_numero);
      out.write("\" name=\"f_numero\" /> \n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            </fieldset>\n");
      out.write("                            \n");
      out.write("                            ");

                        }}else{
                
      out.write("\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            ");
      out.write("\n");
      out.write("            <fieldset style=\"margin:auto\" class=\"z-depth-4\" >\n");
      out.write("            <form method=\"post\" class=\"login-form\" id=\"form\" name=\"f_formbuscarcliente\" action=\"Venta.jsp\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div>\n");
      out.write("                    <div class=\"input-field col s12 center\">\n");
      out.write("                        <p class=\"center login-form-text\">Agregar Producto</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"row margin\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"icon-barcode icon-2x prefix\"></i>\n");
      out.write("                        <input name=\"f_codigo\" id=\"username\" type=\"text\" required >\n");
      out.write("                        <label for=\"username\">Codigo</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"row margin\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"icon-shopping-cart icon-2x prefix\"></i>\n");
      out.write("                        <input name=\"f_cantidad\" id=\"username1\" type=\"text\" required >\n");
      out.write("                        <label for=\"username1\">Cantidad</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <input class=\"btn waves-effect waves-light col s12\" style='width:100%' type=\"submit\" value=\"Agregar\" name=\"f_buscarcliente\" />                  \n");
      out.write("                    \n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <input type=\"hidden\" value=\"IngresarProducto\" name=\"f_accion\" /> \n");
      out.write("                    \n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <input type=\"hidden\" value=\"SI\" name=\"f_agregarproducto\" /> \n");
      out.write("                    <input type=\"hidden\" value=\"");
out.print(s_idcliente);
      out.write("\" name=\"f_idcliente\" /> \n");
      out.write("                    <input type=\"hidden\" value=\"");
out.print(s_numero);
      out.write("\" name=\"f_numero\" /> \n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            </fieldset>\n");
      out.write("                ");
 }
                    
                    s_agregarproducto = request.getParameter("f_agregarproducto");
                    
                    
                    //Si agregarproducto es SI entonces hacemos un insert en la tabla detalle_venta
                    if (s_agregarproducto != null && s_agregarproducto.equals("SI")) {
                            s_codigo = request.getParameter("f_codigo");
                            s_cantidad = request.getParameter("f_cantidad");
                            
                            
                            //en esta consulta pedimos el idproducto y el precioventa gracias al codigo que ingresamos, pedimos estos datos porque son necesarios para el insert de detalle_venta
                            consulta = "select idproducto, precioventa from producto where codigo='" + s_codigo + "';";
                            //out.print(consulta);
                            pst = cn.prepareStatement(consulta);
                            rs = pst.executeQuery();
                            if (rs.next()) {
                                
                                //guardamos el idproducto y el precioventa
                                s_idproducto=rs.getString(1);
                                s_precioventa=rs.getString(2);
                            }
                            
                            //en esta consulta recien hacemos el insert ya que ya tenemos todos los datos necesarios
                            consulta = " insert into detalle_venta (cantidad, precioventa, idventa, idproducto) "
                                    + " values ('" + s_cantidad + "','" + s_precioventa + "','" + s_idventa + "','" + s_idproducto + "'); ";
                            //out.print(consulta);
                            pst = cn.prepareStatement(consulta);
                            pst.executeUpdate();
                    }        

                
                
      out.write("\n");
      out.write("                <div>⠀⠀</div>\n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("                <div style=\"width: 600px;\">\n");
      out.write("                        \n");
      out.write("                            <div id=\"login-page\" class=\"row\">\n");
      out.write("                                <div class=\"col s12 z-depth-4 card-panel\">\n");
      out.write("                                    \n");
      out.write("                    <div class=\"input-field col s12 center\">\n");
      out.write("                        <p class=\"center login-form-text\">PRODUCTOS Y ABARROTES S.A.C.</p>\n");
      out.write("                    </div>\n");
      out.write("                ");

                    
                //en esta consulta pedimos el numero y la fecha actual de la tabla venta
                consulta = "select numero, CURDATE() from venta where idventa= " + s_idventa + ";";
                    //out.print(consulta);
                        pst = cn.prepareStatement(consulta);
                        rs = pst.executeQuery();
                        if (rs.next()) {
                
      out.write("\n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("                <p style=\"text-align:center\"><a>Nro de Boleta: </a>");
out.print(rs.getString(1));
      out.write(" ⠀⠀ <a>Fecha:</a> ");
out.print(rs.getString(2));
      out.write("</p>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");
}
                
                        //en esta consulta pedimos los datos del cliente
                        consulta = "select nombre, apellido, direccion, dni from cliente where idcliente= " + s_idcliente + ";";
                        //out.print(consulta);
                        pst = cn.prepareStatement(consulta);
                        rs = pst.executeQuery();
                        if (rs.next()) {
                                    
                        

                
      out.write("\n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("                <p style=\"text-align:left\"><a>Nombre:</a> ");
out.print(rs.getString(2).toUpperCase()+", "+rs.getString(1));
      out.write("</p>\n");
      out.write("                <p style=\"text-align:left\"><a>DNI:</a> ");
out.print(rs.getString(4));
      out.write("</p>\n");
      out.write("                <p style=\"text-align:left\"><a>Direccion:</a> ");
out.print(rs.getString(3));
      out.write("</p>\n");
      out.write("               \n");
      out.write("                ");

                    }
                    
      out.write("\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        \n");
      out.write("                            \n");
      out.write("                                    ");
      out.write("\n");
      out.write("                                    <div class=\"table\">\n");
      out.write("                                        <div class=\"rown header\">\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Num\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Producto\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Precio\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Cantidad\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                SubTotal\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                Acciones\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        ");

                    //en esta consulta hacemos un select con los datos necesarios para completar la tabla detalle_venta
                    consulta = "select detalle_venta.iddetalle_venta, producto.nombre, detalle_venta.precioventa, detalle_venta.cantidad from detalle_venta, producto where producto.idproducto=detalle_venta.idproducto and detalle_venta.idventa='"+ s_idventa +"';";
                    //out.print(consulta);
                    pst = cn.prepareStatement(consulta);
                    rs = pst.executeQuery();
                    
                    //aqui creamos variables de apoyo para obtener el subtotal y el monto total
                    int num = 0;
                    String idp;
                    String cantidad;
                    String precio;
                    double subtotal;
                    double A;
                    double B;
                    double monto=0.00;
                    
                    while (rs.next()) {
                        idp = rs.getString(1);
                        precio = rs.getString(3);
                        cantidad = rs.getString(4);
                        num++;
                
      out.write("\n");
      out.write("                                        <div class=\"rown\">\n");
      out.write("                                            \n");
      out.write("                                            ");
      out.write("\n");
      out.write("                                            <div class=\"cell\" data-title=\"Num\">\n");
      out.write("                                                ");
 out.print(num);
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                            ");
      out.write("\n");
      out.write("                                            <div class=\"cell\" data-title=\"Nombre\">\n");
      out.write("                                                ");
 out.print(rs.getString(2)); 
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                            ");
      out.write("\n");
      out.write("                                            <div class=\"cell\" data-title=\"Apellido\">\n");
      out.write("                                                ");
 out.print(precio); 
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                            ");
      out.write("\n");
      out.write("                                            <div class=\"cell\" data-title=\"Apellido\">\n");
      out.write("                                                ");
 out.print(cantidad); 
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                            ");
      out.write("\n");
      out.write("                                            <div class=\"cell\" data-title=\"Apellido\">\n");
      out.write("                                                ");
 
                                                A=Double.parseDouble(cantidad);
                                                B=Double.parseDouble(precio);
                                                subtotal=A*B;
                                                monto= monto + subtotal;

                                                out.print(subtotal); 
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\" data-title=\"Eliminar\">\n");
      out.write("                                                \n");
      out.write("                                                ");
      out.write("\n");
      out.write("                                                <a href=\"Venta.jsp?f_CRUD=E&f_accion=IngresarProducto&f_iddetalleventa=");
out.print(idp);
      out.write("&f_idcliente=");
out.print(s_idcliente);
      out.write("&f_numero=");
out.print(s_numero);
      out.write("\"><i class=\"icon-trash icon-large\"></i></a>\n");
      out.write("                                            ⠀⠀  \n");
      out.write("                                                ");
      out.write("\n");
      out.write("                                                <a href=\"Venta.jsp?f_CRUD=M1&f_accion=IngresarProducto&f_iddetalleventa=");
out.print(idp);
      out.write("&f_idcliente=");
out.print(s_idcliente);
      out.write("&f_numero=");
out.print(s_numero);
      out.write("\" style=\"color:#0091ea\"><i class=\"icon-pencil icon-large \" ></i></a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        ");

                                                }
                                               
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"rown\">\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                                \n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                            ");
      out.write("\n");
      out.write("                                            <a>Monto: </a>");
out.print("S/" +monto+"0");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cell\">\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                            \n");
      out.write("                                            ");
      out.write("\n");
      out.write("                                            <form style=\"margin:auto\" method=\"post\" class=\"login-form\" id=\"form\" name=\"f_formbuscarcliente\" action=\"imprimirboleta.jsp\">\n");
      out.write("                                                ");
      out.write("\n");
      out.write("                                                <input class=\"btn waves-effect waves-light col s12\" style='width:250px' type=\"submit\" value=\"Guardar\" name=\"f_buscarcliente\" />                  \n");
      out.write("                                                <input type=\"hidden\" value=\"IngresarProducto\" name=\"f_accion\" />  \n");
      out.write("                                                <input type=\"hidden\" value=\"");
out.print(s_idventa);
      out.write("\" name=\"f_idventa\" /> \n");
      out.write("                                                <input type=\"hidden\" value=\"");
out.print(s_idcliente);
      out.write("\" name=\"f_idcliente\" /> \n");
      out.write("                                                <input type=\"hidden\" value=\"");
out.print(monto);
      out.write("\" name=\"f_total\" />\n");
      out.write("                                                \n");
      out.write("                                            </form>\n");
      out.write("                    <div class=\"input-field col s12 center\">\n");
      out.write("                        <p class=\"center login-form-text\"></p>\n");
      out.write("                    </div>\n");
      out.write("                        </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("                            </div>\n");
      out.write("                            </div>\n");
      out.write("                               \n");
      out.write("                \n");
      out.write("                        \n");
      out.write("                        ");

              
                            
                            
                            
                            

                        }} 

else{
 
        /* -------------- ETAPA 1 ---------- */
                        
                        
                        
            s_error = request.getParameter("f_error");
            
            //si error tiene un valor nos muestra un mensaje de error donde nos dice que el dni no existe en la base de datos
            if (s_error != null) {

        
      out.write("\n");
      out.write("        <div id=\"login-page\" class=\"row\" style=\"width: 300px;\">\n");
      out.write("            <div class=\"col s12 z-depth-4 card-panel\">\n");
      out.write("                <div class=\"col s12 center\">\n");
      out.write("                    <p class=\"center\" style=\"font-size:10px;\">DNI no Registrado <a href=\"datosclientes.jsp?f_accion=C1\">REGISTRAR NUEVO CLIENTE</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div></div>\n");
      out.write("        ");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<fieldset style=\"margin:auto\" class=\"z-depth-4\" >\n");
      out.write("     <form method=\"post\" class=\"login-form\" id=\"form\" name=\"f_formbuscarcliente\" action=\"valida.jsp\">\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"input-field col s12 center\">\n");
      out.write("                        <p class=\"center login-form-text\">Buscar Cliente</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("       \n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"row margin\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"icon-credit-card icon-2x prefix\"></i>\n");
      out.write("                        <input name=\"f_dni\" id=\"username\" type=\"text\" required value=\"\" maxlength=\"8\">\n");
      out.write("                        <label for=\"username\">DNI</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <input class=\"btn waves-effect waves-light col s12\" style='width:100%' type=\"submit\" value=\"Enviar\" name=\"f_buscarcliente\" />                  \n");
      out.write("                    \n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <input type=\"hidden\" value=\"BuscarCliente\" name=\"f_accion\" />\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <p style=\"font-size:15px;\" ><a href=\"menu.jsp\">Volver</a></p>\n");
      out.write("                 </div>\n");
      out.write("        \n");
      out.write("            </form>\n");
      out.write("            </fieldset>\n");
      out.write("                ");
}
                
                
   
                



                                                
                                                } catch (SQLException e) {
                                                System.out.println("Error: " + e.getMessage());
                                            }
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                        \n");
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
