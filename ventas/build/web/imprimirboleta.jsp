<%-- 
    Document   : imprimirboleta
    Created on : 26/02/2020, 01:26:42 PM
    Author     : Usuario
--%>

<%@page import="java.sql.*"%>
<%@page import="bd.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css" rel="stylesheet">
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        
        
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="msapplication-tap-highlight" content="no">
  <title>Datos Venta</title>
  <link rel="icon" href="images/favicon/favicon-32x321.png" sizes="32x32">
  <link rel="apple-touch-icon-precomposed" href="images/favicon/apple-touch-icon-152x152.png">
  
  <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
  <link href="css/search.css" rel="stylesheet" type="text/css"/>
  <link href="css/legend_1.css" rel="stylesheet" type="text/css"/>
  <link href="css/separador/datosproveedores.css" rel="stylesheet" type="text/css"/>
  <link href="css/tabla1.css" rel="stylesheet" type="text/css"/>
  <link href="css/materialize.min.css" type="text/css" rel="stylesheet" media="screen,projection">
  <link href="css/style.min.css" type="text/css" rel="stylesheet" media="screen,projection">
  <link href="css/custom/custom.min.css" type="text/css" rel="stylesheet" media="screen,projection">
  <link href="css/layouts/page-center.css" type="text/css" rel="stylesheet" media="screen,projection">
  <link href="js/plugins/perfect-scrollbar/perfect-scrollbar.css" type="text/css" rel="stylesheet" media="screen,projection">
  <link href="css/NOIMPRIMIR.css" rel="stylesheet" type="text/css"/>

        <%!
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
            


        %>
    </head>
    <body class="blue">
        
    <!-- Start Page Loading -->
    <div id="loader-wrapper">
        <div id="loader"></div>        
        <div class="loader-section section-left"></div><!-- panel para la derecha -->
        <div class="loader-section section-right"></div><!-- panel para la izquierda -->
    </div>
    <!-- End Page Loading -->
        
        
    <div>⠀⠀</div>
        
    	
                        
        
                            
                            
                        
                        <%
            try {

                //conecction de la base datos
                ConectaBd bd = new ConectaBd();
                cn = bd.getConnection();
                cn1 = bd.getConnection();
                                    
                
                                    s_idventa = request.getParameter("f_idventa");
                                    s_accion = request.getParameter("f_accion");
                                    s_total = request.getParameter("f_total");
                                    s_idcliente = request.getParameter("f_idcliente");
                                    
                                    //en esta consulta hacemos el update en venta con los datos reales, ya que se finalizo la boleta
                                    consulta = "update venta "
                                            + "set "
                                            + "fecha=CURDATE(), "
                                            + "total='" + s_total+ "', "
                                            + "estado='A' "
                                            + "where idventa= " + s_idventa+";";
                                    //out.print(consulta);
                                    pst = cn.prepareStatement(consulta);
                                    
                                    pst.executeUpdate();             
                                 
                                 
                                 
                                 
                               %>
                               
                               
                               <%-- aqui mostramos la boleta final --%>
                               <div style="margin: auto; width: 600px">

                                   <div id="login-page" class="row">
                                       <div class="col s12 z-depth-4 card-panel">

                                           <div class="input-field col s12 center">
                                               <p class="center login-form-text" style="text-align: center">PRODUCTOS Y ABORROTES S.A.C.</p>
                                           </div>
                                           <%                    
                                    
                                               //en esta consulta pedimos el numero y la fecha
                                               consulta = "select numero, CURDATE() from venta where idventa= " + s_idventa + ";";
                                               //out.print(consulta);
                                               pst = cn.prepareStatement(consulta);
                                               rs = pst.executeQuery();
                                               if (rs.next()) {

                                           %>
                                           
                                           <%-- aqui mostramos el numero de boleta y la fecha --%>
                                           <p style="text-align:center"><a>Nro de Boleta: </a><%out.print(rs.getString(1));%> ⠀⠀  ⠀⠀ <a>Fecha:</a> <%out.print(rs.getString(2));%></p>


                                           <%}
                                               
                                               //en esta consulta pedimos los datos del cliente
                                               consulta = "select nombre, apellido, direccion, dni from cliente where idcliente= " + s_idcliente + ";";
                                               //out.print(consulta);
                                               pst = cn.prepareStatement(consulta);
                                               rs = pst.executeQuery();
                                               if (rs.next()) {

                                           %>

                                           <%-- aqui mostramos los datos del cliente --%>
                                           <p style="text-align:left"><a>Nombre:</a> <%out.print(rs.getString(2).toUpperCase() + ", " + rs.getString(1));%></p>
                                           <p style="text-align:left"><a>DNI:</a> <%out.print(rs.getString(4));%></p>
                                           <p style="text-align:left"><a>Direccion:</a> <%out.print(rs.getString(3));%></p>

                                           <%
                                               }
                                           %>


                                           <div>



                                               <%-- el encabezado de la tabla --%>
                                               <div class="table">
                                                   <div class="rown header">
                                                       <div class="cell">
                                                           Num
                                                       </div>
                                                       <div class="cell">
                                                           Producto
                                                       </div>
                                                       <div class="cell">
                                                           Precio
                                                       </div>
                                                       <div class="cell">
                                                           Cantidad
                                                       </div>
                                                       <div class="cell">
                                                           SubTotal
                                                       </div>
                                                       


                                                   </div>

                                                   <%
                                               
                                                       //en esta consulta pedimos los datos necesarios de la tabla detalle_venta
                                                       consulta = "select detalle_venta.iddetalle_venta, producto.nombre, detalle_venta.precioventa, detalle_venta.cantidad from detalle_venta, producto where producto.idproducto=detalle_venta.idproducto and detalle_venta.idventa='" + s_idventa + "';";
                                                       //out.print(consulta);
                                                       pst = cn.prepareStatement(consulta);
                                                       rs = pst.executeQuery();
                                                       
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
                                                   %>
                                                   <div class="rown">
                                                       
                                                       <%-- aqui mostramos el numero de registro --%>
                                                       <div class="cell" data-title="Num">
                                                           <% out.print(num);%>
                                                       </div>
                                                       
                                                       <%-- aqui mostramos el nombre del producto --%>
                                                       <div class="cell" data-title="Nombre">
                                                           <% out.print(rs.getString(2)); %>
                                                       </div>
                                                       
                                                       <%-- aqui mostramos el precio --%>
                                                       <div class="cell" data-title="Apellido">
                                                           <% out.print(precio); %>
                                                       </div>
                                                       
                                                       <%-- aqui mostramos la cantidad --%>
                                                       <div class="cell" data-title="Apellido">
                                                           <% out.print(cantidad); %>
                                                       </div>
                                                       
                                                       <%-- aqui hallamos el subtotal y el monto --%>
                                                       <div class="cell" data-title="Apellido">
                                                           <%
                                                               A = Double.parseDouble(cantidad);
                                                               B = Double.parseDouble(precio);
                                                    subtotal = A * B;
                                                    monto = monto + subtotal;

                                                    out.print(subtotal); %>
                                                       </div>
                                                       
                                                   </div>
                                                   <%
                                                       }

                                                   %>

                                                   <div class="rown">
                                                       <div class="cell">
                                                       </div>
                                                       <div class="cell">
                                                       </div>
                                                       <div class="cell">
                                                       </div>
                                                       <div class="cell">

                                                       </div>
                                                       
                                                       <%-- aqui mostramos el monto --%>
                                                       <div class="cell">
                                                           <a>Monto: </a><%out.print("S/" + monto + "0");%>
                                                       </div>


                                                   </div>
                                               </div>
                                                       
                                                       
                                                           <table style="margin:auto"  id="parte1">
                                                               <tr>
                                                                   <td>⠀</td>
                                                                   <td>
                                                                       
                                            <%-- creo un formulario con el boton emitir nueva boleta que me dirige a venta.jsp --%>
                                            <form style="margin:auto" method="post" id="form" name="f_formbuscarcliente" action="Venta.jsp">
                                                <input class="btn waves-effect waves-light" style='width:250px' type="submit" value="Emitir Nueva Boleta" name="f_buscarcliente" />                  
                                            </form>
                                            
                                                                   </td>
                                                                   <td>
                                                                       
                                            <%-- creo un formulario con el boton volver al menu que me dirige a menu.jsp --%>
                                            <form style="margin:auto" method="post" id="form" name="f_formbuscarcliente" action="menu.jsp">
                                                <input class="btn waves-effect waves-light" style='width:250px' type="submit" value="Volver al Menu" name="f_buscarcliente" />                  
                                            </form>
                                                                   </td>
                                                           </tr>
                                                          </table> 
                                                
                                               <div class="input-field col s12 center">
                                                   <p class="center login-form-text"></p>
                                               </div>
                                           </div>

                                       </div>
                                   </div>
                               </div>
                                 <%  

                                                rs.close();
                                                pst.close();
                                                cn.close();
                                            } catch (SQLException e) {
                                                System.out.println("Error: " + e.getMessage());
                                            }
                                        %>
    
                
                
                
    <!-- jQuery Library -->
  <script type="text/javascript" src="js/plugins/jquery-1.11.2.min.js"></script>
  <!--materialize js-->
  <script type="text/javascript" src="js/materialize.min.js"></script>
  <!--scrollbar-->
  <script type="text/javascript" src="js/plugins/perfect-scrollbar/perfect-scrollbar.min.js"></script>

      <!--plugins.js - Some Specific JS codes for Plugin Settings-->
    <script type="text/javascript" src="js/plugins.min.js"></script>
    <!--custom-script.js - Add your own theme custom JS-->
    <script type="text/javascript" src="js/custom-script.js"></script>
    </body>
</html>
