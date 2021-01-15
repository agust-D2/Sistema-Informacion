<%--
    Document   : menu.jsp
    Created on : 15/01/2020, 03:02:26 PM
    Author     : lab02
--%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.sql.*" %>
<%@page import="bd.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <head>
        <link href="css/tabla.css" rel="stylesheet" type="text/css"/>
        
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="msapplication-tap-highlight" content="no">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
        <link rel="icon" href="images/favicon/favicon-32x321.png" sizes="32x32">
        <link href="css/materialize.min.css" type="text/css" rel="stylesheet" media="screen,projection">
        <link href="css/style.min.css" type="text/css" rel="stylesheet" media="screen,projection">
        <link href="css/layouts/page-center.css" type="text/css" rel="stylesheet" media="screen,projection">
        
       
        <%!
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
            
            String url = "jdbc:mysql://localhost:3306/ventas_avance";
            String user = "root";
            String password = "12345678";
            
            String s_usuario;
            String s_clave;
            String s_boton_login;
            String s_boton_regresar;
            String s_idusuario;
            
            String s_idacceso;
            String s_nombre;
            String s_apellido_pat;
            String s_apellido_mat;
            String s_tipo="";
            String s_estado;
            String resultado="";
    

        %>
       
    </head>
    
    <style> 
input[type=button], input[type=submit], input[type=reset] {
  background-color: transparent;
  border: none;
  color: none;
  padding: 0px;
  text-decoration: none;
  margin: 0px;
  cursor: pointer;
}
</style>

    <body style="background-color:#c1432e">
       
    
    
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
            
           try {        
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
                        consulta3 = "select usuario.usuario, usuario.nombre, usuario.apellido_pat,usuario.apellido_mat, tipo_usuario.nombre from usuario, tipo_usuario where tipo_usuario.idtipo_usuario=usuario.id_tipo_usuario and idusuario="+s_idusuario+";";
                        
                        cn3 = DriverManager.getConnection(url,user,password);
                        pst3 = cn3.createStatement();
                        rs3= pst3.executeQuery(consulta3);
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
         <div style="background-color:#1d1d1f; width: 600px; padding: 0px; margin-bottom: 0px; margin-top: 0px;" class="center col s12 z-depth-4 card-panel">
                    <div style="padding: 0px; margin-bottom: 0px;"  class="input-field col s12 center">
                        <img style="padding: 0px; margin-bottom: 0px; margin-top: 0px;" src="images/icons/profile.png" alt="iconmenu">
                        <p style="padding: 0px; margin-bottom: 0px; margin-top: 0px; color: #d5d5d5" class="center login-form-text">@<% out.print(s_usuario); %></p>
                    </div>
                    <div class="center" style="padding: 0px; margin-bottom: 15px; margin-top: 0px;">
                        <p class="center" style="font-size:10px;"><a style="color:#d5d5d5"><% out.print(s_nombre+" "+s_apellido_pat+" "+s_apellido_mat);%> <strong style="color:#2195cc">(<% out.print(s_tipo.toUpperCase()); %>)</strong></a></p>
                    </div>
        </div>
        </div>
                    
    <div style="padding: 0px; margin-bottom: 0px;" id="login-page" class="row">
        <div style="width: 600px; " class="col s12 z-depth-4 card-panel">
                    <div class="input-field col s12 center">
                        <p class="center login-form-text" >ATENCIÓN AL CLIENTE</p>
                    </div>
                    <div class="col s12 center">
                        <p class="center" style="font-size:10px;"><a>presione una OPCIÓN</a></p>
                    </div>
                    
                    
            <div class="table">

                
                        
<%
            
            
                 
    
    
                        
                        consulta = "select subaccesos.idacceso, subaccesos.nombre, subaccesos.url from privilegios, subaccesos where privilegios.idacceso=subaccesos.idacceso and subaccesos.idacceso='"+s_idacceso+"' order by subaccesos.orden asc";
                        
                         

                        
                cn = DriverManager.getConnection(url,user,password);
                pst=cn.createStatement();
                rs=pst.executeQuery(consulta);
                        
                        while (rs.next()) {
                %>
                <div class="rown">
                    <div class="cell" data-title="Name">
                        
                          
                        <form action="<% out.println(rs.getString(3)); %>" method="post">
                        <input type="hidden" value="1" name="f_boton_regresar" />
                        <input type="hidden" value="<% out.println(rs.getString(1)); %>" name="f_idacceso" />
                        <input type="hidden" value="<% out.println(s_idusuario); %>" name="f_idusuario" />
                        <input style="color:#22262e" type="submit" value="<%out.println(rs.getString(2)); %>" />
                        </form>
                           
                            
                    </div>
                </div>
                
                <%
                        }
                        rs.close();
                        pst.close();
                        cn.close();
                    } catch (SQLException ex) {
                Logger.getLogger(ConectaBd.class.getName()).log(Level.SEVERE, null, ex);
            }


                %>
                <div class="rown">
                    <div class="cell" data-title="Name">
                        
                        <form action="menu.jsp" method="post">
                        <input type="hidden" value="1" name="f_boton_regresar" />
                        <input type="hidden" value="<% out.println(s_idusuario); %>" name="f_idusuario" />
                        <input style="color:#c1432e" type="submit" value="Volver" />
                        </form>
                            
                    </div>
                </div>

                

            </div>
        </div>
    </div>
       
       

       
                   
                   
                   
                   
                   
                    <script type="text/javascript" src="js/plugins/jquery-1.11.2.min.js"></script>
                    <script type="text/javascript" src="js/materialize.min.js"></script>
                    <script type="text/javascript" src="js/plugins/perfect-scrollbar/perfect-scrollbar.min.js"></script>
                    <script type="text/javascript" src="js/plugins.min.js"></script>
                    <script type="text/javascript" src="js/custom-script.js"></script>
    </body>
</html>

