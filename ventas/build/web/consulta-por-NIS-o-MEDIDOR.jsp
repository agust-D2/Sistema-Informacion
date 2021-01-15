<%-- 
    Document   : imprimirboleta
    Created on : 26/02/2020, 01:26:42 PM
    Author     : Usuario
--%>

<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.sql.*" %>
<%@page import="bd.*" %>

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


                
                
                                                
                                 
                                 
                                 
                                 
                               %>
        <form action="consulta-por-NIS-o-MEDIDOR.jsp" method="post" class="center">
                                   
        <div style="padding: 0px; margin-bottom: 0px;" class="row">
         <div style="background-color:#1d1d1f; width: 700px; padding: 0px; margin-bottom: 0px; margin-top: 0px;" class="center col s12 z-depth-4 card-panel">
                    <div style="padding: 0px; margin-bottom: 0px;"  class="input-field col s12 center">
                        <p style="padding: 0px; margin-bottom: 0px; margin-top: 0px; color: #d5d5d5" class="center login-form-text">CONSULTA POR N.I.S. / MEDIDOR</p>
                    </div>
             <div></div>
                    <div class="center" style="padding: 0px; padding-left:15px; margin-bottom: 15px; margin-top: 10px;" >
                        <p class="center" style="font-size:10px; color:#c1432e; font-size: 12px;"><strong style="color:#c1432e">N.I.S.: </strong><a style="color:#d5d5d5; margin-right: 50px;">
                                <input style="padding: 0px; width: 80px; margin-bottom: 0px; margin-top: 0px; font-size: 12px;"  type="text" id="NIS" name="f_num_nis" onkeyup="mayus(this);">
                            </a><a style="color:#d5d5d5"><strong style="color:#c1432e">MEDIDOR: </strong> <input style="padding: 0px; width: 150px; margin-bottom: 0px; margin-top: 0px; font-size: 12px;"  type="text" id="NIS" name="f_num_nis" onkeyup="mayus(this);"></a></p>
                    </div>
                    <div style="padding: 0px; padding-left:15px; margin-bottom: 15px; margin-top: 10px;">
                        <p style="font-size:10px; color:#2195cc; font-size: 12px;"><strong style="color:#2195cc">Dir. Suministro: </strong><a style="color:#d5d5d5;"> </a></p>
                        <p style="font-size:10px; color:#2195cc; font-size: 12px;"><strong style="color:#2195cc">Titular de la Conexión: </strong><a style="color:#d5d5d5;"> </a></p>
                    </div>
             <div style="padding: 0px; padding-left:15px; margin-bottom: 15px; margin-top: 10px;" class="center">
                    <input class="center btn waves-effect waves-light"  type="submit" value="BUSCAR" name="f_buscar" />
                    </div>
        </div>
        </div>
        
        </form>
                               
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


#computadora { display: none; }​
#pantalla1 { display: none; }​
#grifo { display: block; }​
</style>

<script>
/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */

function showGrifo() { 
            div = document.getElementById('grifo'); 
            div.style.display = "block";
            div1 = document.getElementById('pantalla');
            div1.style.display = "none"; 
            div2 = document.getElementById('computadora'); 
            div2.style.display = "none";
}
function showPantalla() { 
            div = document.getElementById('pantalla');
            div.style.display = "block"; 
            div1 = document.getElementById('computadora'); 
            div1.style.display = "none";
            div2 = document.getElementById('grifo'); 
            div2.style.display = "none";
}

function showComputadora() { 
            div = document.getElementById('pantalla');
            div.style.display = "none"; 
            div1 = document.getElementById('computadora'); 
            div1.style.display = "block";
            div2 = document.getElementById('grifo'); 
            div2.style.display = "none";
}

</script>


                                           <div class="navbar" style="margin-left: 0px; margin-right: 0px; padding-left: 0px; padding-right: 0px; padding: 0px">
                                                   <a style="margin-left: 0px; margin-right: 0px; padding-left: 0px; padding-right: 0px; padding: 0px" class="dropdown"><button class="dropbtn" onclick="javascript:showGrifo()"><img style="margin: 5px 5px;" width="25px" height="25px" src="images/icons/grifo1.svg" alt="icongrifo1"></button></a>
                                                   <a style="margin-left: 0px; margin-right: 0px; padding-left: 0px; padding-right: 0px; padding: 0px" class="dropdown"><button class="dropbtn" onclick="javascript:showPantalla()"><img style="margin: 5px 5px;" width="25px" height="25px" src="images/icons/pantalla.svg" alt="iconpantalla"></button></a>
                                                   <a style="margin-left: 0px; margin-right: 0px; padding-left: 0px; padding-right: 0px; padding: 0px" class="dropdown"><button class="dropbtn" onclick="javascript:showComputadora()"><img style="margin: 5px 5px;" width="25px" height="25px" src="images/icons/computadora.svg" alt="iconcomputadora"></button></a>
                                                   <a><img width="25px" height="25px" src="images/icons/reporte.svg" alt="iconreporte"></a>
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


<div style="margin-top: 5px; margin-bottom: 5px; margin-left: 5px; margin-right: 5px;" id="grifo"">
<div style="border: 1px solid black; "> 
<table class="tg">

<tbody>
   <tr>
    <td class="tg-0lax" ><a style="color:#d5d5d5;"><strong style="color:#2195cc">Tarifa: </strong> </a></td>
    <td class="tg-0lax"><a style="color:#d5d5d5;"><strong style="color:#2195cc">Estado del Suministro: </strong></a></td>
    <td>ㅤ</td>
  </tr> 
  <tr>
    <td class="tg-0lax" ><a style="color:black;"><strong style="color:#2195cc">F. Conex.: </strong> 00/00/000 
        <strong style="color:#2195cc; margin-left: 20px;">F. Baja: </strong> 00/00/0000 </a></td>
    <td class="tg-0lax"><a style="color:#d5d5d5;"><strong style="color:#2195cc">Periodicidad Facturación: </strong> </a></td>
    <td></td>
  </tr>
  <tr>
    <td class="tg-0lax" ><a style="color:black;"><strong style="color:#2195cc">C.U.A.: </strong> </a></td>
    <td class="tg-0lax"><a style="color:#d5d5d5;"><strong style="color:#2195cc">Periodicidad de lectura: </strong> </a></td>
    <td></td>
  </tr>
  <tr>
    <td class="tg-0lax" ><a style="color:black;"><strong style="color:#2195cc">Of. Com.: </strong> </a></td>
    <td class="tg-0lax"><a style="color:#d5d5d5;"><strong style="color:#2195cc">Diámetro Conexión Agua: </strong> </a></td>
    <td></td>
  </tr>
</tbody>
</table>
        
                   
    
    </div>
    
    </div>

<div style=" display: none; margin-top: 5px; margin-bottom: 5px; margin-left: 5px; margin-right: 5px;" id="pantalla">
                                           
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
                    <a style="color:#d5d5d5;"><strong style="color:#2195cc">Tipo Consumo</strong> </a>
                </th>
            </tr>
        </thead>
<tbody>
   <tr>
    <td class="tg-0lax" >ㅤ</td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
  </tr> 
   <tr>
    <td class="tg-0lax" >ㅤ</td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
  </tr>  
</tbody>
</table>
    </div>

    <div style="margin-top: 5px; margin-bottom: 5px; margin-left: 5px; margin-right: 5px;" id="computadora">
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
                    <a style="color:#d5d5d5;"><strong style="color:#2195cc">Fecha Instalación</strong> </a>
                </th>
                <th tg-73oq>
                    <a style="color:#d5d5d5;"><strong style="color:#2195cc">Fecha Levantamiento</strong> </a>
                </th>
            </tr>
        </thead>
<tbody>
   <tr>
    <td class="tg-0lax" >ㅤ</td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
  </tr> 
   <tr>
    <td class="tg-0lax" >ㅤ</td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
  </tr>  
</tbody>
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
