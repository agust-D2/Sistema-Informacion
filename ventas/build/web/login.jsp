<!DOCTYPE html>
<html lang="en">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="msapplication-tap-highlight" content="no">
  <title>Login</title>

  <!-- Favicons-->
  <link rel="icon" href="images/favicon/favicon-32x321.png" sizes="32x32">
  <!-- Favicons-->
  <link rel="apple-touch-icon-precomposed" href="images/favicon/apple-touch-icon-152x152.png">
  <!-- For iPhone -->
  <meta name="msapplication-TileColor" content="#00bcd4">
  <meta name="msapplication-TileImage" content="images/favicon/mstile-144x144.png">
  <!-- For Windows Phone -->


  <!-- CORE CSS-->
  
  <link href="css/materialize.min.css" type="text/css" rel="stylesheet" media="screen,projection">
  <link href="css/style.min.css" type="text/css" rel="stylesheet" media="screen,projection">
    <!-- Custome CSS-->    
    <link href="css/custom/custom.min.css" type="text/css" rel="stylesheet" media="screen,projection">
  <link href="css/layouts/page-center.css" type="text/css" rel="stylesheet" media="screen,projection">

  <!-- INCLUDED PLUGIN CSS ON THIS PAGE -->
  <link href="js/plugins/perfect-scrollbar/perfect-scrollbar.css" type="text/css" rel="stylesheet" media="screen,projection">
            <%!
            String s_error;
            %>  
</head>

<!-- cambiar el color del fondo -->
<body style="background-color:#c1432e">
    
    
        <% 
        s_error=request.getParameter("f_error");
        %>


    <div id="login-page" class="row">
        <!-- class= "card-panel" le da el panel blanco y z-depth-4 le da la sombra a las cosas-->
        <div class="col s12 z-depth-4 card-panel">
            <form method="post" action="menu.jsp" class="login-form" id="form">
                <!-- class= "row" aumenta el margen entre los parrafos -->
                <!-- class= "center"centra el texto y "login-form-text" cambia el texto -->
                <div>
                    <div class="input-field col s12 center">
                        <p class="center login-form-text">Iniciar Sesion</p>
        <%
        if(s_error!=null){
            
        if(s_error.equals("1")){
        %>
        
                        <p class="center" style="font-size:15px;" ><a>clave o usuario invalido</a></p>
                    
        <%
            }

            if(s_error.equals("2")){
%>
        
                        <p class="center" style="font-size:15px;" ><a>el usuario se encuentra desactivado</a></p>
                    
        <%
            }
        }
        
        %>
                    </div>
                </div>
                
        
                
                <!-- class= "margin" reduce el margen entre los parrafos -->
                <div class="row margin">
                    <div class="input-field col s12">
                        <i class="mdi-social-person-outline prefix"></i>
                        <input name="f_usuario" id="username" type="text" required>
                        <label for="username">Username</label>
                    </div>
                </div>
                
                
                <div class="row margin">
                    
                    <!-- darle estilo al input: class="input-field col s12" -->
                    <!-- invoca y da estilo a la imagen candado: class="mdi-action-lock-outline prefix" -->
                    <!-- <i> cursiva </i>
                    <!-- darle click a "nombre" y que te envie al input id="nombre:
                    <label for="password">Password</label>
                    
                    <input name="f_clave" id="password" type="password">
                    -->
                    <div class="input-field col s12">
                        <i class="mdi-action-lock-outline prefix"></i>
                        <input name="f_clave" id="password" type="password" required>
                        <label for="password">Password</label>
                    </div>
                </div>
                <div class="row">
                    <!-- para el boton: class="btn waves-effect waves-light col s12" -->
                    <input type="hidden" value="1" name="f_boton_login" />
                    <input class="btn waves-effect waves-light col s12" style='width:100%' type="submit" value="login" name="enviar" />
                    
                    
                </div>
                <!-- <a href="javascript:void(0);" onclick="document.getElementById('form').submit();" class="btn waves-effect waves-light col s12">Login</a>
                
                    
                    <div class="row">
                    <div class="input-field col s6 m6 l6">
                        <p class="margin medium-small"><a href="register.jsp">Registrate Ahora</a></p>
                    </div>         
                </div>
                    
                    -->
                </form>
        </div>


    
</div>
</div>



  <!-- ================================================
    Scripts
    ================================================ -->

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
