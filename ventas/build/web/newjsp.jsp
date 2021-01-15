<%-- 
    Document   : newjsp
    Created on : 11 dic. 2020, 17:17:49
    Author     : AMD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    
    
    <form action="select.php" method="post"> 
      <input type="text" name="user" placeholder="enter a text" /> 
      <input type="submit" value="submit" onclick="test()" /> 
    </form>
  <input type="file" id="file-input" />
<h3>Contenido del archivo:</h3>
<pre id="contenido-archivo"></pre>



<script language=javascript>
  
    
    var contador = 0;        
  function leerArchivo(e) {
  var archivo = e.target.files[0];
  if (!archivo) {
    return;
  }
  var lector = new FileReader();
  lector.onload = function(e) {
    var contenido = e.target.result;
    var lineas = contenido.split('\n');
    
    for (var i=0; i < lineas.length; i++) {
        if( contador === 0){
            var num_medidor=lineas[i];
            document.write(num_medidor);
            contador++; 
        }
        else if( contador === 1){
            var marca=lineas[i];;
            document.write(marca);
            contador++;
        }
        else if( contador === 2){
            var tipo_medidor=lineas[i];;
            document.write(tipo_medidor);
            contador++;
        }
        else if( contador === 3){
            var estado_medidor=lineas[i];;
            document.write(estado_medidor);
            contador++;
        }
        else if( contador === 4){
            var diametro=lineas[i];;
            document.write(diametro);
            contador++;
        }
        else if( contador === 5){
            var clase_metro=lineas[i];;
            document.write(clase_metro);
            contador++;
        }
        else if( contador === 6){
            var material_medidor=lineas[i];;
            document.write(material_medidor + "<br>");
            contador=0;
        }
    }
   
    
    mostrarContenido(lineas);
    
  };
  lector.readAsText(archivo);
}



function mostrarContenido(contenido) {
  var elemento = document.getElementById('contenido-archivo');
  elemento.innerHTML = contenido;
}

document.getElementById('file-input')
  .addEventListener('change', leerArchivo, false);
  </script>
    

</body>
</html>
