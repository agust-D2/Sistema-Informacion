<%-- 
    Document   : imprimirboleta
    Created on : 26/02/2020, 01:26:42 PM
    Author     : Usuario
--%>

<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.sql.*" %>
<%@page import="bd.*" %>
<%@page import="java.sql.*,java.util.*"%>


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

        %>
    </head>
    
    <body style="background-color:#c1432e">
        
    <!-- Start Page Loading -->
    <div id="loader-wrapper">
        <div id="loader"></div>        
        <div class="loader-section section-left"></div><!-- panel para la derecha -->
        <div class="loader-section section-right"></div><!-- panel para la izquierda -->
    </div>
    <!-- End Page Loading -->
        
        
    <div>⠀⠀</div>
        
    	
    <script language=javascript>
        function mayus(e) {
    e.value = e.value.toUpperCase();
}
    </script>
        
                            
                            
                        
                        <%
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
                                 
                                 
                                 
                               %>
        <div style="padding: 0px; margin-bottom: 0px;" class="row">
         <div style="background-color:#1d1d1f; width: 700px; padding: 0px; margin-bottom: 0px; margin-top: 0px;" class="center col s12 z-depth-4 card-panel">
                    <div style="padding: 0px; margin-bottom: 0px;"  class="input-field col s12 center">
                        <img style="padding: 0px; margin-bottom: 0px; margin-top: 0px;" src="images/icons/profile.png" alt="iconmenu">
                        <p style="padding: 0px; margin-bottom: 0px; margin-top: 0px; color: #d5d5d5" class="center login-form-text">@<% out.print(s_usuario); %></p>
                    </div>
                    <div class="center" style="padding: 0px; margin-bottom: 15px; margin-top: 0px;">
                        <p class="center" style="font-size:10px;"><a style="color:#d5d5d5"><% out.print(s_nombre+" "+s_apellido_pat+" "+s_apellido_mat);%> <strong style="color:#2195cc">(<% out.print(s_tipo.toUpperCase()); %>)</strong></a></p>
                    </div>
        </div>
        </div>
                               
                            
                               
                               <div style="margin: auto; width: 700px;">

                                   <div id="login-page" class="row">
                                       <div class="col s12 z-depth-4 card-panel" style="padding: 0px">
                                           
                                           
                                           <style>
.navbar {
  overflow: hidden;
  background-color: #1d1d1f;
}

.navbar a {
  float: left;
  font-size: 12px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  cursor: pointer;
  font-size: 0px;  
  border: none;
  outline: none;
  color: white;
  padding: 7px 7px;
  background-color: inherit;
  margin: 0;
}

.navbar a:hover, .navbar a:focus, .dropdown:hover .dropbtn, .dropbtn:focus {
  background-color: red;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 0px 0px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}



#pantalla { display: none; }​
#tabla { display: block; }
#tabla { display: none; }
#agregar { display: none; }
</style>


<script>
/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */

function showGrifo() { 
            div = document.getElementById('grifo'); 
            div.style.display = "block";
            div1 = document.getElementById('pantalla');
            div1.style.display = "none"; 
            div2 = document.getElementById('tabla'); 
            div2.style.display = "none";
}
function showPantalla() { 
            div = document.getElementById('pantalla');
            div.style.display = "block"; 
            div1 = document.getElementById('tabla'); 
            div1.style.display = "none";
            div2 = document.getElementById('grifo'); 
            div2.style.display = "none";
}
function showLista() { 
            div = document.getElementById('tabla');
            div.style.display = "block"; 
            div1 = document.getElementById('pantalla'); 
            div1.style.display = "none";
            div2 = document.getElementById('grifo'); 
            div2.style.display = "none";
}


</script>


                                           <div class="navbar" style="margin-left: 0px; margin-right: 0px; padding-left: 0px; padding-right: 0px; padding: 0px">
                                                   <a style="margin-left: 0px; margin-right: 0px; padding-left: 0px; padding-right: 0px; padding: 0px" class="dropdown"><button class="dropbtn" onclick="javascript:showGrifo()"><img style="margin: 5px 5px;" width="25px" height="25px" src="images/icons/medidor.svg" alt="icongrifo1"></button></a>
                                                   <a style="margin-left: 0px; margin-right: 0px; padding-left: 0px; padding-right: 0px; padding: 0px" class="dropdown"><button class="dropbtn" onclick="javascript:showPantalla()"><img style="margin: 5px 5px;" width="25px" height="25px" src="images/icons/file.svg" alt="iconpantalla"></button></a>
                                                   <a style="margin-left: 0px; margin-right: 0px; padding-left: 0px; padding-right: 0px; padding: 0px" class="dropdown"><button class="dropbtn" onclick="javascript:showLista()"><img style="margin: 5px 5px;" width="25px" height="25px" src="images/icons/table.svg" alt="iconlista"></button></a>
                                           
                                           </div>

<style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;}
.tg td{border-color:black;border-style:transparent;border-width:1px;font-family:Arial, sans-serif;font-size:12px;
  overflow:hidden;padding:5px 5px;word-break:normal;}
.tg th{border-color:black;border-style:transparent;border-width:1px;font-family:Arial, sans-serif;font-size:12px;
  font-weight:normal;overflow:hidden;padding:5px 5px;word-break:normal;}
.tg .tg-73oq{border-color:#000000;text-align:left;vertical-align:top}
.tg .tg-0lax{text-align:left;vertical-align:top}
</style>

<%
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
    


    %>

   <div style=" display: block; margin-top: 5px; margin-bottom: 5px; margin-left: 5px; margin-right: 5px;" id="tabla">
                                           
    <table class="tg" style="border: 1px solid black; text-align:center; ">
        <thead >
            <tr>
                <th tg-73oq>
                    <a style="color:#d5d5d5;"><strong style="color:#2195cc">N° Medidor</strong> </a>
                </th>
                <th tg-73oq>
                    <a style="color:#d5d5d5;"><strong style="color:#2195cc">Marca</strong> </a>
                </th>
                <th tg-73oq>
                    <a style="color:#d5d5d5;"><strong style="color:#2195cc">Tipo Medidor</strong> </a>
                </th>
                <th tg-73oq>
                    <a style="color:#d5d5d5;"><strong style="color:#2195cc">Estado</strong> </a>
                </th>
                <th tg-73oq>
                    <a style="color:#d5d5d5;"><strong style="color:#2195cc">Diametro</strong> </a>
                </th>
                <th tg-73oq>
                    <a style="color:#d5d5d5;"><strong style="color:#2195cc">Material</strong> </a>
                </th>
                
            </tr>
        </thead>
<tbody>
    <%
    consulta3 = "select num_medidor, marca, tipo_medidor, estado_medidor, diametro, material_medidor from medidores where estado_medidor='LPSI'";
                        
                        cn3 = DriverManager.getConnection(url,user,password);
                        pst3 = cn3.createStatement();
                        rs3 = pst3.executeQuery(consulta3);
                        while(rs3.next()){
                            
                        %>
                        
   <tr>
    <td class="tg-0lax"><% out.print(rs3.getString(1));%></td>
    <td class="tg-0lax"><% out.print(rs3.getString(2));%></td>
    <td class="tg-0lax"><% out.print(rs3.getString(3));%></td>
    <td class="tg-0lax"><% out.print(rs3.getString(4));%></td>
    <td class="tg-0lax"><% out.print(rs3.getString(5));%></td>
    <td class="tg-0lax"><% out.print(rs3.getString(6));%></td>
  </tr> 
                        
                        
                        
                        <%}

                        rs3.close();
                        pst3.close();
                        cn3.close();   
                        %>
   <tr>
       <td class="tg-0lax" colspan="6" style="text-align: center; padding-bottom: 20px;"><form action="menu.jsp" method="post">
                        <input type="hidden" value="1" name="f_boton_regresar" />
                        <input type="hidden" value="<% out.println(s_idusuario); %>" name="f_idusuario" />
                        <input style="color:#c1432e" type="submit" value="Volver" />
                        </form></td>
  </tr>
  
</tbody>
</table>
    </div>  
   
    
<div style="display: none; margin-top: 5px; margin-bottom: 5px; margin-left: 5px; margin-right: 5px;" id="grifo"">
<div style="border: 1px solid black; "> 
    <form action="medidores.jsp" method="post">
    <table class="tg">

<tbody >
   <tr>
       <td class="tg-0lax" style="text-align: right"><a style="color:black;"><strong style="color:#2195cc">Num. Medidor: </strong> <input style="padding: 0px; width: 80px; margin-bottom: 0px; margin-top: 0px; font-size: 12px;"  maxlength="10" type="text" id="NIS" name="f_num_medidor" onkeyup="mayus(this);" required>
                            </a>ㅤㅤ</td>
    <td class="tg-0lax">ㅤㅤ<a style="color:black;"><strong style="color:#2195cc">Marca: </strong> <input style="padding: 0px; width: 80px; margin-bottom: 0px; margin-top: 0px; font-size: 12px;" maxlength="45" type="text" id="NIS" name="f_marca" required onkeyup="mayus(this);">
                            </a></td>
    <td>ㅤㅤ</td>
  </tr> 
  <tr>
    <td class="tg-0lax" style="text-align: right"><a style="color:black;"><strong style="color:#2195cc">Tipo de Medidor: </strong><input style="padding: 0px; width: 80px; margin-bottom: 0px; margin-top: 0px; font-size: 12px;" maxlength="45" type="text" id="NIS" name="f_tipo_medidor" required"></a>ㅤㅤ</td>
    <td class="tg-0lax">ㅤㅤ<a style="color:black;"><strong style="color:#2195cc">Diametro: </strong><input style="padding: 0px; width: 80px; margin-bottom: 0px; margin-top: 0px; font-size: 12px;" maxlength="9" type="text" id="NIS" name="f_diametro" required> </a></td>
    <td>ㅤ</td>
  </tr>
  <tr>
    <td class="tg-0lax" style="text-align: right"><a style="color:black;"><strong style="color:#2195cc">Material: </strong> <input style="padding: 0px; width: 80px; margin-bottom: 0px; margin-top: 0px; font-size: 12px;" maxlength="45" type="text" id="NIS" name="f_material" required "></a>ㅤㅤ</td>
    <td class="tg-0lax" style="padding-top: 15px;">ㅤㅤ<a style="color:black;"><strong style="color:#2195cc">Estado: </strong>LPSI (Listo Para Su Instalación)</a></td>
    <td>ㅤ</td>
  </tr>

  <tr>
    <td colspan="3" style="padding-top: 15px; padding-bottom: 15px; text-align: center"><input style="color:#c1432e" type="submit" value="AGREGAR" name="f_agregar" /></td>
  </tr>
  <tr>
      
  </tr>
</tbody>
</table>
                        <input type="hidden" value="1" name="f_boton_regresar" />
                        <input type="hidden" value="I" name="f_accion" />
                        <input type="hidden" value="<% out.println(s_idacceso); %>" name="f_idacceso" />
                        <input type="hidden" value="<% out.println(s_idusuario); %>" name="f_idusuario" />
     </form>   
                   
    
    </div>
    
    </div>
     
                       

<div style=" display: none; margin-top: 5px; margin-bottom: 5px; margin-left: 5px; margin-right: 5px;" id="pantalla">
                                           
<table class="tg" style="border: 1px solid black; text-align:center; ">
       
  <input type="file" id="file-input" />
<p>Contenido del archivo:</p>
<pre id="contenido-archivo"></pre>



<script language=javascript>
        
  function leerArchivo(e) {
  var archivo = e.target.files[0];
  if (!archivo) {
    return;
  }
  var lector = new FileReader();
  lector.onload = function(e) {
    var contenido = e.target.result;
    var lineas = contenido.split('\n');
    
    mostrarContenido(lineas);
    
  };
  lector.readAsText(archivo);
}



function mostrarContenido(contenido) {
  var elemento = document.getElementById('contenido-archivo');
  elemento.innerHTML = contenido;
  div = document.getElementById('agregar');
  div.style.display = "block";
}

document.getElementById('file-input')
  .addEventListener('change', leerArchivo, false);
  </script>
  <a id="agregar" style="text-align: center; padding-bottom: 20px;" ><input style="color:#c1432e" type="submit" value="AGREGAR" name="f_agregar" /></a>
</table>
    </div>

  




                                           


                                          

                                       </div>
                                   </div>
                               </div>
                                 <%  

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
