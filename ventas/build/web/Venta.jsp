<%-- 
    Document   : emitirfactura
    Created on : 25/02/2020, 10:18:33 AM
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
  <title>Emitir Boleta</title>
  <link rel="icon" href="images/favicon/favicon-32x321.png" sizes="32x32">
  <link rel="apple-touch-icon-precomposed" href="images/favicon/apple-touch-icon-152x152.png">
  
  
  <link href="css/legend_1.css" rel="stylesheet" type="text/css"/>
  <link href="css/separador/datosproveedores.css" rel="stylesheet" type="text/css"/>
  <link href="css/tabla1.css" rel="stylesheet" type="text/css"/>
  <link href="css/materialize.min.css" type="text/css" rel="stylesheet" media="screen,projection">
  <link href="css/style.min.css" type="text/css" rel="stylesheet" media="screen,projection">
  <link href="css/custom/custom.min.css" type="text/css" rel="stylesheet" media="screen,projection">
  <link href="css/layouts/page-center.css" type="text/css" rel="stylesheet" media="screen,projection">
  <link href="js/plugins/perfect-scrollbar/perfect-scrollbar.css" type="text/css" rel="stylesheet" media="screen,projection">


        <%!
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


        %>
    </head>
    <body class="blue">
        
    
        
        
   <div>⠀⠀</div>
        
  
  
   
   
    <%
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
                        s_accion="BuscarCliente"; %>
                        
                        
                        <%-- mostramos un mensaje de error --%>
                        <div id="login-page" class="row" style="width: 300px;">
                            <div class="col s12 z-depth-4 card-panel">
                                <div class="col s12 center">
                                    <p class="center" style="font-size:10px;"><a>El numero de boleta ya existe, pruebe nuevamente</a></p>
                                </div>
                            </div>
                        </div>
                        
                                    <div></div>
                        
                        <%
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
                        %>
                    
                <%-- Si el estado del cliente esta desactivado hacemos lo siguiente: --%>        
                <% if(ida.equals("D")){%>
                
                <%-- Mostramos un mensaje de error --%>    
                <div id="login-page" class="row" style="width: 300px;">
                    <div class="col s12 z-depth-4 card-panel">
                        <div class="col s12 center">
                            <p class="center" style="font-size:10px;"><a>EL cliente no esta disponible, se encuentra inhabilitado</a></p>
                        </div>
                    </div>
                </div>
                                    <div></div>
                <%}%>
                
               
                
            <fieldset style="margin:auto" class="z-depth-4" >
            <form method="post" class="login-form" id="form" name="f_formbuscarcliente" action="Venta.jsp">
                <div>
                    <div class="input-field col s12 center">
                        <p class="center login-form-text">Resultado</p>
                    </div>
                </div>
                
                <%-- Si el estado del cliente esta Activado mostramos la opcion de ingresar el numero de boleta: --%>    
                <% if(ida.equals("A")){%> 
                <p style="text-align:left"><a>Nro de Boleta:</a> <input  style="width : 150px" name="f_numero" id="username" type="text" required value=""></p>
                <% } %>
                
                
                <p style="text-align:left"><a>Nombre:</a> <%out.print(rs.getString(2).toUpperCase()+", "+rs.getString(1));%></p>
                <p style="text-align:left"><a>Direccion:</a> <%out.print(rs.getString(3));%></p>
                
                
                <%-- Si el estado del cliente esta activado cambiamos la letra A por la palabra Activado, y mostramos el boton iniciar --%>    
                <% if(ida.equals("A")){%>   
                <p style="text-align:left"><a>Estado:</a> Activado</p>
                <input class="btn waves-effect waves-light col s12" style='width:100%' type="submit" value="Iniciar" name="f_buscarcliente" />                  
                
                <%-- cuando le damos iniciar pasamos a la accion Crear BOleta --%>    
                <input type="hidden" value="CrearBoleta" name="f_accion" />
                <input type="hidden" value="<%=idc%>" name="f_idcliente" />
                <input type="hidden" value="<%=s_dni%>" name="f_dni" />
                
                
                <%-- Si el estado del cliente esta desactivado cambiamos la letra D por la palabra desactivado y mostramos el boton volver --%>    
                <%} if(ida.equals("D")){%>   
                <p style="text-align:left"><a>Estado:</a> Desactivado</p>
                <input class="btn waves-effect waves-light col s12" style='width:100%' type="submit" value="Volver" name="f_buscarcliente" />
                
                <%}%>
                
                
            </form>
            </fieldset>
                        
                        <%
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
                        
                            %>
            <fieldset style="margin:auto" class="z-depth-4" >
            <form method="post" class="login-form" id="form" name="f_formbuscarcliente" action="Venta.jsp">
                
                <div>
                    <div class="input-field col s12 center">
                        <p class="center login-form-text">Editar Producto</p>
                    </div>
                </div>
                
                <%-- mostramos el input de codigo con el valor que este tenìa --%>
                <div class="row margin">
                    <div class="input-field col s12">
                        <i class="icon-barcode icon-2x prefix"></i>
                        <input name="f_codigo" id="username" type="text" required value="<%
                            
                            //en esta consulta pedimos el codigo gracias al idproducto, queremos el codigo porque es lo que nos piden ingresar
                            consulta1 = "select codigo from producto where idproducto='" + s_idproducto + "';";
                            //out.print(consulta);
                            pst1 = cn1.prepareStatement(consulta1);
                            rs1 = pst1.executeQuery();
                            if (rs1.next()) {
                                
                                //aqui mostramos el codigo en pantalla
                                out.print(rs1.getString(1));
                                
                            }
                        
                        %>">
                        <label for="username">Codigo</label>
                    </div>     
                </div>
                        
                <%-- mostramos el input de cantidad con el valor que este tenìa --%>        
                <div class="row margin">
                    <div class="input-field col s12">
                        <i class="icon-shopping-cart icon-2x prefix"></i>
                        <input name="f_cantidad" id="username1" type="text" required value="<%=rs.getString(1)%>">
                        <label for="username1">Cantidad</label>
                    </div>
                </div>
                        
                <%-- mostramos el boton Editar --%>        
                <div class="row">
                    <input class="btn waves-effect waves-light col s12" style='width:100%' type="submit" value="Editar" name="f_buscarcliente" />                  
                    
                    <%-- al darle al boton la siguiente accion sera ingresar producto --%>
                    <input type="hidden" value="IngresarProducto" name="f_accion" />
                    
                    <%-- al darle al boton pasamos a Editar paso 2 --%>
                    <input type="hidden" value="M2" name="f_CRUD" /> 
                    <input type="hidden" value="<%out.print(s_iddetalleventa);%>" name="f_iddetalleventa" /> 
                    <input type="hidden" value="<%out.print(s_idcliente);%>" name="f_idcliente" /> 
                    <input type="hidden" value="<%out.print(s_numero);%>" name="f_numero" /> 
                </div>
            </form>
            </fieldset>
                            
                            <%
                        }}else{
                %>
            
                
                
            <%-- Aqui mostramos el formulario de ingresar producto --%>
            <fieldset style="margin:auto" class="z-depth-4" >
            <form method="post" class="login-form" id="form" name="f_formbuscarcliente" action="Venta.jsp">
                
                
                <div>
                    <div class="input-field col s12 center">
                        <p class="center login-form-text">Agregar Producto</p>
                    </div>
                </div>
                
                <%-- mostramos el input de codigo --%>
                <div class="row margin">
                    <div class="input-field col s12">
                        <i class="icon-barcode icon-2x prefix"></i>
                        <input name="f_codigo" id="username" type="text" required >
                        <label for="username">Codigo</label>
                    </div>
                </div>
                
                <%-- mostramos el input de cantidad --%>
                <div class="row margin">
                    <div class="input-field col s12">
                        <i class="icon-shopping-cart icon-2x prefix"></i>
                        <input name="f_cantidad" id="username1" type="text" required >
                        <label for="username1">Cantidad</label>
                    </div>
                </div>
                
                <%-- mostramos el boton agregar --%>
                <div class="row">
                    <input class="btn waves-effect waves-light col s12" style='width:100%' type="submit" value="Agregar" name="f_buscarcliente" />                  
                    
                    <%-- al darle al boton la siguiente accion sera ingresar producto --%>
                    <input type="hidden" value="IngresarProducto" name="f_accion" /> 
                    
                    <%-- al darle al boton agregarproducto sera SI --%>
                    <input type="hidden" value="SI" name="f_agregarproducto" /> 
                    <input type="hidden" value="<%out.print(s_idcliente);%>" name="f_idcliente" /> 
                    <input type="hidden" value="<%out.print(s_numero);%>" name="f_numero" /> 
                </div>
            </form>
            </fieldset>
                <% }
                    
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

                
                %>
                <div>⠀⠀</div>
                
                <%-- Aqui mostramos la tabla detalle_venta con todos los productos que ingresamos --%>
                <div style="width: 600px;">
                        
                            <div id="login-page" class="row">
                                <div class="col s12 z-depth-4 card-panel">
                                    
                    <div class="input-field col s12 center">
                        <p class="center login-form-text">PRODUCTOS Y ABARROTES S.A.C.</p>
                    </div>
                <%
                    
                //en esta consulta pedimos el numero y la fecha actual de la tabla venta
                consulta = "select numero, CURDATE() from venta where idventa= " + s_idventa + ";";
                    //out.print(consulta);
                        pst = cn.prepareStatement(consulta);
                        rs = pst.executeQuery();
                        if (rs.next()) {
                %>
                
                <%-- aqui recien mostramos el numero de boleta y la fecha  --%>
                <p style="text-align:center"><a>Nro de Boleta: </a><%out.print(rs.getString(1));%> ⠀⠀ <a>Fecha:</a> <%out.print(rs.getString(2));%></p>
                
                
                <%}
                
                        //en esta consulta pedimos los datos del cliente
                        consulta = "select nombre, apellido, direccion, dni from cliente where idcliente= " + s_idcliente + ";";
                        //out.print(consulta);
                        pst = cn.prepareStatement(consulta);
                        rs = pst.executeQuery();
                        if (rs.next()) {
                                    
                        

                %>
                
                <%-- y aqui mostramos los datos de ese cliente --%>
                <p style="text-align:left"><a>Nombre:</a> <%out.print(rs.getString(2).toUpperCase()+", "+rs.getString(1));%></p>
                <p style="text-align:left"><a>DNI:</a> <%out.print(rs.getString(4));%></p>
                <p style="text-align:left"><a>Direccion:</a> <%out.print(rs.getString(3));%></p>
               
                <%
                    }
                    %>
                
                    
                    <div>
                        
                            
                                    <%-- los titulos de la cabecera de la tabla --%>
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
                                            <div class="cell">
                                                Acciones
                                            </div>
                                            
                                            
                                        </div>

                                        <%
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
                %>
                                        <div class="rown">
                                            
                                            <%-- aqui mostramos el numero de la tabla --%>
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
                                            
                                            <%-- aqui hacemos la operacion de como obtenemos el subtotal y el monto --%>
                                            <div class="cell" data-title="Apellido">
                                                <% 
                                                A=Double.parseDouble(cantidad);
                                                B=Double.parseDouble(precio);
                                                subtotal=A*B;
                                                monto= monto + subtotal;

                                                out.print(subtotal); %>
                                            </div>
                                            <div class="cell" data-title="Eliminar">
                                                
                                                <%-- boton eliminar --%>
                                                <a href="Venta.jsp?f_CRUD=E&f_accion=IngresarProducto&f_iddetalleventa=<%out.print(idp);%>&f_idcliente=<%out.print(s_idcliente);%>&f_numero=<%out.print(s_numero);%>"><i class="icon-trash icon-large"></i></a>
                                            ⠀⠀  
                                                <%-- boton Editar etapa 1--%>
                                                <a href="Venta.jsp?f_CRUD=M1&f_accion=IngresarProducto&f_iddetalleventa=<%out.print(idp);%>&f_idcliente=<%out.print(s_idcliente);%>&f_numero=<%out.print(s_numero);%>" style="color:#0091ea"><i class="icon-pencil icon-large " ></i></a>
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
                                            <div class="cell">
                                            <%-- mostramos el monto --%>
                                            <a>Monto: </a><%out.print("S/" +monto+"0");%>
                                            </div>
                                            <div class="cell">
                                            </div>
                                            
                                            
                                        </div>
                                    </div>
                                            
                                            <%-- creamos otro formulario que nos dirige a imprimirboleta.jsp --%>
                                            <form style="margin:auto" method="post" class="login-form" id="form" name="f_formbuscarcliente" action="imprimirboleta.jsp">
                                                <%-- mostramos el boton guardar --%>
                                                <input class="btn waves-effect waves-light col s12" style='width:250px' type="submit" value="Guardar" name="f_buscarcliente" />                  
                                                <input type="hidden" value="IngresarProducto" name="f_accion" />  
                                                <input type="hidden" value="<%out.print(s_idventa);%>" name="f_idventa" /> 
                                                <input type="hidden" value="<%out.print(s_idcliente);%>" name="f_idcliente" /> 
                                                <input type="hidden" value="<%out.print(monto);%>" name="f_total" />
                                                
                                            </form>
                    <div class="input-field col s12 center">
                        <p class="center login-form-text"></p>
                    </div>
                        </div>
                
            </div>
                            </div>
                            </div>
                               
                
                        
                        <%
              
                            
                            
                            
                            

                        }} 

else{
 
        /* -------------- ETAPA 1 ---------- */
                        
                        
                        
            s_error = request.getParameter("f_error");
            
            //si error tiene un valor nos muestra un mensaje de error donde nos dice que el dni no existe en la base de datos
            if (s_error != null) {

        %>
        <div id="login-page" class="row" style="width: 300px;">
            <div class="col s12 z-depth-4 card-panel">
                <div class="col s12 center">
                    <p class="center" style="font-size:10px;">DNI no registrado, <a href="datosclientes.jsp?f_accion=C1"> CLICK AQUI PARA REGISTRAR NUEVO CLIENTE</a></p>
                </div>
            </div>
        </div>
        <div></div>
        <%            }
        %>


<%-- creamos un formulario que nos dirige a valida.jsp, donde valida hace la operacion de si existe o no el dni ingresado --%>
<fieldset style="margin:auto" class="z-depth-4" >
     <form method="post" class="login-form" id="form" name="f_formbuscarcliente" action="valida.jsp">
                <div>
                    <div class="input-field col s12 center">
                        <p class="center login-form-text">Buscar Cliente</p>
                    </div>
                </div>
       
                <%-- mostramos el input dni --%>
                <div class="row margin">
                    <div class="input-field col s12">
                        <i class="icon-credit-card icon-2x prefix"></i>
                        <input name="f_dni" id="username" type="text" required value="" maxlength="8">
                        <label for="username">DNI</label>
                    </div>
                </div>
                
                <%-- mostramos el boton enviar --%>
                <div class="row">
                    <input class="btn waves-effect waves-light col s12" style='width:100%' type="submit" value="Enviar" name="f_buscarcliente" />                  
                    
                    <%-- al darle al boton la accion nueva es buscar cliente --%>
                    <input type="hidden" value="BuscarCliente" name="f_accion" />
                    
                </div>
                <div>
                    <p style="font-size:15px;" ><a href="menu.jsp">Volver</a></p>
                 </div>
        
            </form>
            </fieldset>
                <%}
                
                
   
                



                                                
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
