<?php
$mysqli = new mysqli("jdbc:mysql://localhost:3306/", "root", "12345678", "ventas_si");
// verificar la conexión 

if ($mysqli->connect_errno) {
    $arrRespuesta=array("error"=>"Conexión fallida: ".$mysqli->connect_error);

}else{
     /*Establecemos el charset a la conexión para evitar datos erróneos*/
     $mysqli->set_charset("utf8");
     $consulta = "SELECT * FROM productos";

     if ($resultado = $mysqli->query($consulta)) {
        // obtener un array asociativo 
        $arrRespuesta=array();
        while ($fila = $resultado->fetch_assoc()) {
            $arrRespuesta[]=$fila;
        }
        

        // liberar el conjunto de resultados 
        $resultado->free();

     }else{

        $arrRespuesta=array("error"=>"Hubo un problema con la consulta");

     }

    // cerrar la conexión 
    $mysqli->close();
}



//Al final de todo imprimimos el JSON que será recogido en la petición Ajax/jQuery
$json = json_encode($arrRespuesta);
header('Content-Type: application/json; charset=utf8');
echo $json;?>