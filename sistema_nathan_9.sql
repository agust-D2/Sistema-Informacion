-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 15-12-2020 a las 03:41:40
-- Versión del servidor: 8.0.19
-- Versión de PHP: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistema_nathan`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `catastro`
--

CREATE TABLE `catastro` (
  `idcatastro` int NOT NULL,
  `fecha_conexion` date DEFAULT NULL,
  `tipo_conexion` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `direccion` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `total_superficie` int NOT NULL,
  `n_habitaciones` int NOT NULL,
  `n_pisos` int NOT NULL,
  `id_cliente` int NOT NULL,
  `titulo_propiedad` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `idcliente` int NOT NULL,
  `codigo_cliente` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `idexpediente` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comprobante_pago`
--

CREATE TABLE `comprobante_pago` (
  `idcomprobante_pago` int NOT NULL,
  `num_suministro` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `fecha_pedido` date NOT NULL,
  `precio` decimal(8,2) DEFAULT NULL,
  `cantidad` int DEFAULT NULL,
  `ruc` bigint DEFAULT NULL,
  `idcliente` int NOT NULL,
  `idservicio` int NOT NULL,
  `idvendedor` int NOT NULL,
  `numero_factura` varchar(45) DEFAULT NULL,
  `numero_boleta` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datosprecliente`
--

CREATE TABLE `datosprecliente` (
  `idDatosPreCliente` int NOT NULL,
  `nombres` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `direccion` varchar(150) DEFAULT NULL,
  `nro_documento` varchar(9) DEFAULT NULL,
  `idtipodocumento` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datostecnicos`
--

CREATE TABLE `datostecnicos` (
  `iddatostecnicos` int NOT NULL,
  `tipo_solicitud` varchar(45) DEFAULT NULL,
  `estado_solicitiud` varchar(100) DEFAULT NULL,
  `fecha_solicitud` date DEFAULT NULL,
  `diametro_agua` int DEFAULT NULL,
  `diametro_alcantarillado` int DEFAULT NULL,
  `tipo_conexion` varchar(70) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamentos`
--

CREATE TABLE `departamentos` (
  `idDepartamento` int NOT NULL COMMENT 'id unico',
  `departamento` varchar(50) NOT NULL COMMENT 'nombre del departamento',
  `idpais` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `departamentos`
--

INSERT INTO `departamentos` (`idDepartamento`, `departamento`, `idpais`) VALUES
(1, 'LIMA', 1),
(3, 'CALLAO', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `distrito`
--

CREATE TABLE `distrito` (
  `idDistrito` int NOT NULL COMMENT 'id unico',
  `distrito` varchar(50) NOT NULL COMMENT 'nombre de distrito',
  `idProvincia` int NOT NULL COMMENT 'llave foranea'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `distrito`
--

INSERT INTO `distrito` (`idDistrito`, `distrito`, `idProvincia`) VALUES
(1, 'ANCON', 1),
(2, 'ATE', 1),
(3, 'BARRANCO', 1),
(4, 'BREÑA', 1),
(5, 'CARABAYLLO', 1),
(6, 'CHACLACAYO', 1),
(7, 'CHORRILLOS', 1),
(8, 'CIENEGUILLA', 1),
(9, 'COMAS', 1),
(10, 'EL AGUSTINO', 1),
(11, 'INDEPENDENCIA', 1),
(12, 'JESUS MARIA', 1),
(13, 'LA MOLINA', 1),
(14, 'LA VICTORIA', 1),
(15, 'LIMA', 1),
(16, 'LINCE', 1),
(17, 'LOS OLIVOS', 1),
(18, 'LURIGANCHO', 1),
(19, 'LURIN', 1),
(20, 'MAGDALENA DEL MAR', 1),
(21, 'MIRAFLORES', 1),
(22, 'PACHACAMAC', 1),
(23, 'PUCUSANA', 1),
(24, 'PUEBLO LIBRE', 1),
(25, 'PUENTE PIEDRA', 1),
(26, 'PUNTA HERMOSA', 1),
(27, 'PUNTA NEGRA', 1),
(28, 'RIMAC', 1),
(29, 'SAN BARTOLO', 1),
(30, 'SAN BORJA', 1),
(31, 'SAN ISIDRO', 1),
(32, 'SAN JUAN DE LURIGANCHO', 1),
(33, 'SAN JUAN DE MIRAFLORES', 1),
(34, 'SAN LUIS', 1),
(35, 'SAN MARTIN DE PORRES', 1),
(36, 'SAN MIGUEL', 1),
(37, 'SANTA ANITA', 1),
(38, 'SANTA MARIA DEL MAR', 1),
(39, 'SANTA ROSA', 1),
(40, 'SANTIAGO DE SURCO', 1),
(41, 'SURQUILLO', 1),
(42, 'VILLA EL SALVADOR', 1),
(43, 'VILLA MARIA DEL TRIUNFO', 1),
(44, 'BELLAVISTA', 2),
(45, 'CALLAO', 2),
(46, 'CARMEN DE LA LEGUA  REYNOSO', 2),
(47, 'LA PERLA', 2),
(48, 'LA PUNTA', 2),
(49, 'VENTANILLA', 2),
(50, 'VILLA MARIA DEL TRIUNFO', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `expediente`
--

CREATE TABLE `expediente` (
  `idexpediente` int NOT NULL,
  `tipo_solicitud` varchar(35) DEFAULT NULL,
  `estado_solicitud` varchar(25) DEFAULT NULL,
  `fecha_de_solicitud` date DEFAULT NULL,
  `codigo_expediente` varchar(45) NOT NULL,
  `id_datosprecliente` int NOT NULL,
  `id_datostecnicos` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturacion_mensual`
--

CREATE TABLE `facturacion_mensual` (
  `idfacturacion` int NOT NULL,
  `idmedidor` int NOT NULL,
  `mes` varchar(45) NOT NULL,
  `monto` double NOT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `id_comprobantepago` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historico_medidores`
--

CREATE TABLE `historico_medidores` (
  `idhistorico_medidores` int NOT NULL,
  `marca_medidor` varchar(30) NOT NULL,
  `tipo_medidor` varchar(45) NOT NULL,
  `estado_medidor` varchar(45) NOT NULL,
  `material_medidor` varchar(45) NOT NULL,
  `fecha_inst` date NOT NULL,
  `fecha_levant` date NOT NULL,
  `motivo_levant` varchar(50) DEFAULT NULL,
  `tipo_conexion` varchar(45) DEFAULT NULL,
  `num_medidor` varchar(10) NOT NULL,
  `idclientehm` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lectura`
--

CREATE TABLE `lectura` (
  `idlectura` int NOT NULL,
  `idmedidor` int NOT NULL,
  `fecha_actual` date NOT NULL,
  `consumo_m3` double NOT NULL,
  `id_comprobantepago` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medidores`
--

CREATE TABLE `medidores` (
  `idmedidores` int NOT NULL,
  `num_medidor` varchar(10) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `tipo_medidor` varchar(45) NOT NULL,
  `estado_medidor` varchar(30) DEFAULT NULL,
  `diametro` varchar(6) DEFAULT NULL,
  `clase_metro` varchar(7) DEFAULT NULL,
  `material_medidor` varchar(45) DEFAULT NULL,
  `fecha_inst_medidor` date DEFAULT NULL,
  `fecha_ult_rev_medidor` date DEFAULT NULL,
  `dispositivo` varchar(20) DEFAULT NULL,
  `fecha_inst_dispositivo` date DEFAULT NULL,
  `tipo_dispositivo` varchar(45) DEFAULT NULL,
  `idcliente` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pais`
--

CREATE TABLE `pais` (
  `idpais` int NOT NULL,
  `pais` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `pais`
--

INSERT INTO `pais` (`idpais`, `pais`) VALUES
(1, 'Peru'),
(2, 'Argentina');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_juridica`
--

CREATE TABLE `persona_juridica` (
  `idpersona_juridica` int NOT NULL,
  `nombre_razonsocial` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ruc` bigint NOT NULL,
  `representante_legal` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `actividad` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `telefono` int NOT NULL,
  `dirección _fiscal` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `observacion` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `estado_cliente` varchar(45) DEFAULT NULL,
  `id_tipocliente` int NOT NULL,
  `idPais` int NOT NULL,
  `idDepartamento` int NOT NULL,
  `idProvincia` int NOT NULL,
  `idDistrito` int NOT NULL,
  `id_cliente` int NOT NULL
) ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_natural`
--

CREATE TABLE `persona_natural` (
  `idpersona_natural` int NOT NULL,
  `nombre` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `apellidos` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `estado_cliente` varchar(45) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `sexo` char(1) NOT NULL,
  `estado_civil` char(1) DEFAULT NULL,
  `ubigeo` int NOT NULL,
  `dirección` varchar(250) NOT NULL,
  `telefono` int DEFAULT NULL,
  `fk_tipodocumento` varchar(40) NOT NULL,
  `nro_documento` char(9) DEFAULT NULL,
  `celular` int DEFAULT NULL,
  `email` varchar(250) DEFAULT NULL,
  `observación` varchar(1000) DEFAULT NULL,
  `calidad_migratoria` varchar(45) DEFAULT NULL,
  `fecha_venc_carne` date DEFAULT NULL,
  `id_tipocliente` int NOT NULL,
  `idPais` int NOT NULL,
  `idDepartamento` int NOT NULL,
  `idProvincia` int NOT NULL,
  `idDistrito` int NOT NULL,
  `id_cliente` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provincia`
--

CREATE TABLE `provincia` (
  `idProvincia` int NOT NULL,
  `provincia` varchar(50) NOT NULL COMMENT 'nombre de provincia',
  `idDepartamento` int NOT NULL COMMENT 'llave foranea'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `provincia`
--

INSERT INTO `provincia` (`idProvincia`, `provincia`, `idDepartamento`) VALUES
(1, 'LIMA', 1),
(2, 'CALLAO', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `idservicio` int NOT NULL,
  `tipo_servicio` varchar(45) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `precio` decimal(8,2) DEFAULT NULL,
  `categoria` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`idservicio`, `tipo_servicio`, `descripcion`, `precio`, `categoria`) VALUES
(1, 'Agua potable', 'Conexion predio multifamiliar', '100.00', 'Residencial');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sucursal`
--

CREATE TABLE `sucursal` (
  `idsucursal` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `telefono` int DEFAULT NULL,
  `idDepartamento` int NOT NULL,
  `idProvincia` int NOT NULL,
  `idDistrito` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `sucursal`
--

INSERT INTO `sucursal` (`idsucursal`, `nombre`, `telefono`, `idDepartamento`, `idProvincia`, `idDistrito`) VALUES
(1, 'Sedapal Villa', 4559050, 1, 1, 42);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipocliente`
--

CREATE TABLE `tipocliente` (
  `idtipocliente` int NOT NULL,
  `tipo_cliente` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipousuario`
--

CREATE TABLE `tipousuario` (
  `idTipoUsuario` int NOT NULL,
  `tipo_usuario` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipousuario`
--

INSERT INTO `tipousuario` (`idTipoUsuario`, `tipo_usuario`) VALUES
(1, 'trabajador'),
(2, 'Administrador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_documento`
--

CREATE TABLE `tipo_documento` (
  `idtipo_documento` int NOT NULL,
  `nombre_tipo` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idusuario` int NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `clave` varchar(20) NOT NULL,
  `nombres` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `dni` char(8) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `telefono` int DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `estado_usuario` varchar(45) DEFAULT NULL,
  `idDepartamento` int NOT NULL,
  `idProvincia` int NOT NULL,
  `idDistrito` int NOT NULL,
  `idTipoUsuario` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idusuario`, `usuario`, `clave`, `nombres`, `apellidos`, `dni`, `email`, `telefono`, `direccion`, `estado_usuario`, `idDepartamento`, `idProvincia`, `idDistrito`, `idTipoUsuario`) VALUES
(1, 'AgustoD2', '123', 'Nathan ', 'Silvera Iñigo', '76543210', 'agusto@gmail.com', 932846789, 'Mz K Lt 30 ', 'habilitado', 1, 1, 42, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedor`
--

CREATE TABLE `vendedor` (
  `idvendedor` int NOT NULL,
  `nombres` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `dni` char(8) NOT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `estado_vendedor` varchar(45) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `idsucursal` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `vendedor`
--

INSERT INTO `vendedor` (`idvendedor`, `nombres`, `apellidos`, `dni`, `direccion`, `email`, `estado_vendedor`, `fecha_nacimiento`, `idsucursal`) VALUES
(1, 'Elias ', 'Gomez Flores', '12345677', 'Mz K Lt 31', 'elias@gmail.com', 'habilitado', '1999-02-19', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `catastro`
--
ALTER TABLE `catastro`
  ADD PRIMARY KEY (`idcatastro`),
  ADD UNIQUE KEY `direccion` (`direccion`),
  ADD UNIQUE KEY `id_cliente` (`id_cliente`) USING BTREE,
  ADD KEY `fkid_cliente` (`id_cliente`) USING BTREE;

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idcliente`),
  ADD UNIQUE KEY `idexpediente_UNIQUE` (`idexpediente`);

--
-- Indices de la tabla `comprobante_pago`
--
ALTER TABLE `comprobante_pago`
  ADD PRIMARY KEY (`idcomprobante_pago`),
  ADD UNIQUE KEY `num_suministro` (`num_suministro`),
  ADD UNIQUE KEY `numero_factura_UNIQUE` (`numero_factura`),
  ADD UNIQUE KEY `numero_boleta_UNIQUE` (`numero_boleta`),
  ADD UNIQUE KEY `ruc_UNIQUE` (`ruc`),
  ADD KEY `id_cliente_2` (`idcliente`),
  ADD KEY `fk_servicio_facturas_idx` (`idservicio`),
  ADD KEY `fk_vendedor_facturas_idx` (`idvendedor`);

--
-- Indices de la tabla `datosprecliente`
--
ALTER TABLE `datosprecliente`
  ADD PRIMARY KEY (`idDatosPreCliente`),
  ADD KEY `fk_tipodocumento_datosprecliente_idx` (`idtipodocumento`);

--
-- Indices de la tabla `datostecnicos`
--
ALTER TABLE `datostecnicos`
  ADD PRIMARY KEY (`iddatostecnicos`);

--
-- Indices de la tabla `departamentos`
--
ALTER TABLE `departamentos`
  ADD PRIMARY KEY (`idDepartamento`),
  ADD UNIQUE KEY `departamento_UNIQUE` (`departamento`),
  ADD KEY `fk_pais_departamento_idx` (`idpais`);

--
-- Indices de la tabla `distrito`
--
ALTER TABLE `distrito`
  ADD PRIMARY KEY (`idDistrito`),
  ADD KEY `Provincia.Distrito` (`idProvincia`);

--
-- Indices de la tabla `expediente`
--
ALTER TABLE `expediente`
  ADD PRIMARY KEY (`idexpediente`),
  ADD UNIQUE KEY `codigo_expediente_UNIQUE` (`codigo_expediente`),
  ADD KEY `fk_datosprecliente_expediente_idx` (`id_datosprecliente`),
  ADD KEY `fk_datostecnicos_expedientes_idx` (`id_datostecnicos`);

--
-- Indices de la tabla `facturacion_mensual`
--
ALTER TABLE `facturacion_mensual`
  ADD PRIMARY KEY (`idfacturacion`),
  ADD KEY `fk_medidor_facturacion_idx` (`idmedidor`),
  ADD KEY `fk_comprobante_facturacion_idx` (`id_comprobantepago`);

--
-- Indices de la tabla `historico_medidores`
--
ALTER TABLE `historico_medidores`
  ADD PRIMARY KEY (`idhistorico_medidores`),
  ADD UNIQUE KEY `num_medidor_UNIQUE` (`num_medidor`),
  ADD UNIQUE KEY `idclientehm_UNIQUE` (`idclientehm`);

--
-- Indices de la tabla `lectura`
--
ALTER TABLE `lectura`
  ADD PRIMARY KEY (`idlectura`),
  ADD KEY `fk_medidor_lectura_idx` (`idmedidor`),
  ADD KEY `fk_comprobante_lectura_idx` (`id_comprobantepago`);

--
-- Indices de la tabla `medidores`
--
ALTER TABLE `medidores`
  ADD PRIMARY KEY (`idmedidores`),
  ADD UNIQUE KEY `num_medidor_UNIQUE` (`num_medidor`),
  ADD UNIQUE KEY `idcliente_UNIQUE` (`idcliente`);

--
-- Indices de la tabla `pais`
--
ALTER TABLE `pais`
  ADD PRIMARY KEY (`idpais`);

--
-- Indices de la tabla `persona_juridica`
--
ALTER TABLE `persona_juridica`
  ADD PRIMARY KEY (`idpersona_juridica`),
  ADD UNIQUE KEY `idpersona_juridica` (`idpersona_juridica`,`ruc`,`id_tipocliente`),
  ADD UNIQUE KEY `ruc_UNIQUE` (`ruc`),
  ADD KEY `idcliente` (`id_tipocliente`),
  ADD KEY `fk_pais_pj_idx` (`idPais`),
  ADD KEY `fk_dpto_pj_idx` (`idDepartamento`),
  ADD KEY `fk_prov_pj_idx` (`idProvincia`),
  ADD KEY `fk_distrito_pj_idx` (`idDistrito`);

--
-- Indices de la tabla `persona_natural`
--
ALTER TABLE `persona_natural`
  ADD PRIMARY KEY (`idpersona_natural`),
  ADD UNIQUE KEY `idpersona_natural` (`idpersona_natural`,`id_tipocliente`),
  ADD KEY `idcliente` (`id_tipocliente`),
  ADD KEY `fk_pais_pn_idx` (`idPais`),
  ADD KEY `fk_prov_pn_idx` (`idProvincia`),
  ADD KEY `fk_distrito_idx` (`idDistrito`),
  ADD KEY `fk_dpto_pn_idx` (`idDepartamento`),
  ADD KEY `fk_nombredocumento_idx` (`fk_tipodocumento`),
  ADD KEY `fk_clientes_pn_idx` (`id_cliente`);

--
-- Indices de la tabla `provincia`
--
ALTER TABLE `provincia`
  ADD PRIMARY KEY (`idProvincia`),
  ADD KEY `Provincia.Departamento` (`idDepartamento`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`idservicio`);

--
-- Indices de la tabla `sucursal`
--
ALTER TABLE `sucursal`
  ADD PRIMARY KEY (`idsucursal`),
  ADD KEY `fk_dpto_sucursal_idx` (`idDepartamento`),
  ADD KEY `fk_prov_sucursal_idx` (`idProvincia`),
  ADD KEY `fk_distrito_sucursal_idx` (`idDistrito`);

--
-- Indices de la tabla `tipocliente`
--
ALTER TABLE `tipocliente`
  ADD PRIMARY KEY (`idtipocliente`),
  ADD UNIQUE KEY `tipo_cliente_UNIQUE` (`tipo_cliente`);

--
-- Indices de la tabla `tipousuario`
--
ALTER TABLE `tipousuario`
  ADD PRIMARY KEY (`idTipoUsuario`),
  ADD UNIQUE KEY `idTipoUsuario_UNIQUE` (`idTipoUsuario`);

--
-- Indices de la tabla `tipo_documento`
--
ALTER TABLE `tipo_documento`
  ADD PRIMARY KEY (`idtipo_documento`),
  ADD UNIQUE KEY `nombre_UNIQUE` (`nombre_tipo`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idusuario`),
  ADD UNIQUE KEY `usuario_UNIQUE` (`usuario`),
  ADD UNIQUE KEY `idusuario_UNIQUE` (`idusuario`),
  ADD UNIQUE KEY `dni_UNIQUE` (`dni`),
  ADD KEY `fk_departamentos_clientes_idx` (`idDepartamento`),
  ADD KEY `fk_provincias_clientes_idx` (`idProvincia`),
  ADD KEY `fk_distritos_clientes_idx` (`idDistrito`),
  ADD KEY `fk_tipousuario_usuario_idx` (`idTipoUsuario`);

--
-- Indices de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`idvendedor`),
  ADD UNIQUE KEY `dni_UNIQUE` (`dni`),
  ADD KEY `fk_sucursal_vendedo_idx` (`idsucursal`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `catastro`
--
ALTER TABLE `catastro`
  MODIFY `idcatastro` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idcliente` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `comprobante_pago`
--
ALTER TABLE `comprobante_pago`
  MODIFY `idcomprobante_pago` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `datosprecliente`
--
ALTER TABLE `datosprecliente`
  MODIFY `idDatosPreCliente` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `datostecnicos`
--
ALTER TABLE `datostecnicos`
  MODIFY `iddatostecnicos` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `departamentos`
--
ALTER TABLE `departamentos`
  MODIFY `idDepartamento` int NOT NULL AUTO_INCREMENT COMMENT 'id unico', AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `distrito`
--
ALTER TABLE `distrito`
  MODIFY `idDistrito` int NOT NULL AUTO_INCREMENT COMMENT 'id unico', AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT de la tabla `expediente`
--
ALTER TABLE `expediente`
  MODIFY `idexpediente` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `facturacion_mensual`
--
ALTER TABLE `facturacion_mensual`
  MODIFY `idfacturacion` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `historico_medidores`
--
ALTER TABLE `historico_medidores`
  MODIFY `idhistorico_medidores` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `lectura`
--
ALTER TABLE `lectura`
  MODIFY `idlectura` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `medidores`
--
ALTER TABLE `medidores`
  MODIFY `idmedidores` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `pais`
--
ALTER TABLE `pais`
  MODIFY `idpais` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `persona_juridica`
--
ALTER TABLE `persona_juridica`
  MODIFY `idpersona_juridica` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `persona_natural`
--
ALTER TABLE `persona_natural`
  MODIFY `idpersona_natural` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `provincia`
--
ALTER TABLE `provincia`
  MODIFY `idProvincia` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `servicio`
--
ALTER TABLE `servicio`
  MODIFY `idservicio` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `sucursal`
--
ALTER TABLE `sucursal`
  MODIFY `idsucursal` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `tipocliente`
--
ALTER TABLE `tipocliente`
  MODIFY `idtipocliente` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipousuario`
--
ALTER TABLE `tipousuario`
  MODIFY `idTipoUsuario` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tipo_documento`
--
ALTER TABLE `tipo_documento`
  MODIFY `idtipo_documento` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idusuario` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  MODIFY `idvendedor` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `catastro`
--
ALTER TABLE `catastro`
  ADD CONSTRAINT `fk_catastro_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`idcliente`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `fk_expediente_cliente` FOREIGN KEY (`idexpediente`) REFERENCES `expediente` (`idexpediente`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Filtros para la tabla `comprobante_pago`
--
ALTER TABLE `comprobante_pago`
  ADD CONSTRAINT `fk_comprobante_cliente` FOREIGN KEY (`idcliente`) REFERENCES `clientes` (`idcliente`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_pj_comprobante` FOREIGN KEY (`ruc`) REFERENCES `persona_juridica` (`ruc`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_servicio_comprobante` FOREIGN KEY (`idservicio`) REFERENCES `servicio` (`idservicio`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_vendedor_comprobante` FOREIGN KEY (`idvendedor`) REFERENCES `vendedor` (`idvendedor`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Filtros para la tabla `datosprecliente`
--
ALTER TABLE `datosprecliente`
  ADD CONSTRAINT `fk_tipodocumento_datosprecliente` FOREIGN KEY (`idtipodocumento`) REFERENCES `tipo_documento` (`idtipo_documento`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Filtros para la tabla `departamentos`
--
ALTER TABLE `departamentos`
  ADD CONSTRAINT `fk_pais_departamento` FOREIGN KEY (`idpais`) REFERENCES `pais` (`idpais`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Filtros para la tabla `distrito`
--
ALTER TABLE `distrito`
  ADD CONSTRAINT `Provincia.Distrito` FOREIGN KEY (`idProvincia`) REFERENCES `provincia` (`idProvincia`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Filtros para la tabla `expediente`
--
ALTER TABLE `expediente`
  ADD CONSTRAINT `fk_datosprecliente_expediente` FOREIGN KEY (`id_datosprecliente`) REFERENCES `datosprecliente` (`idDatosPreCliente`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_datostecnicos_expedientes` FOREIGN KEY (`id_datostecnicos`) REFERENCES `datostecnicos` (`iddatostecnicos`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Filtros para la tabla `facturacion_mensual`
--
ALTER TABLE `facturacion_mensual`
  ADD CONSTRAINT `fk_comprobante_facturacion` FOREIGN KEY (`id_comprobantepago`) REFERENCES `comprobante_pago` (`idcomprobante_pago`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_medidor_facturacion` FOREIGN KEY (`idmedidor`) REFERENCES `medidores` (`idmedidores`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Filtros para la tabla `historico_medidores`
--
ALTER TABLE `historico_medidores`
  ADD CONSTRAINT `fk_clientes_historico_medidores` FOREIGN KEY (`idclientehm`) REFERENCES `clientes` (`idcliente`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Filtros para la tabla `lectura`
--
ALTER TABLE `lectura`
  ADD CONSTRAINT `fk_comprobante_lectura` FOREIGN KEY (`id_comprobantepago`) REFERENCES `comprobante_pago` (`idcomprobante_pago`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_medidor_lectura` FOREIGN KEY (`idmedidor`) REFERENCES `medidores` (`idmedidores`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Filtros para la tabla `medidores`
--
ALTER TABLE `medidores`
  ADD CONSTRAINT `idclientes_medidores` FOREIGN KEY (`idcliente`) REFERENCES `clientes` (`idcliente`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Filtros para la tabla `persona_natural`
--
ALTER TABLE `persona_natural`
  ADD CONSTRAINT `fk_clientes_pn` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`idcliente`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_distrito_pn` FOREIGN KEY (`idDistrito`) REFERENCES `distrito` (`idDistrito`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_dpto_pn` FOREIGN KEY (`idDepartamento`) REFERENCES `departamentos` (`idDepartamento`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_idtpocliente_pn` FOREIGN KEY (`id_tipocliente`) REFERENCES `tipocliente` (`idtipocliente`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_pais_pn` FOREIGN KEY (`idPais`) REFERENCES `pais` (`idpais`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_prov_pn` FOREIGN KEY (`idProvincia`) REFERENCES `provincia` (`idProvincia`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_tipodocumento_pn` FOREIGN KEY (`fk_tipodocumento`) REFERENCES `tipo_documento` (`nombre_tipo`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Filtros para la tabla `provincia`
--
ALTER TABLE `provincia`
  ADD CONSTRAINT `Provincia.Departamento` FOREIGN KEY (`idDepartamento`) REFERENCES `departamentos` (`idDepartamento`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Filtros para la tabla `sucursal`
--
ALTER TABLE `sucursal`
  ADD CONSTRAINT `fk_distrito_sucursal` FOREIGN KEY (`idDistrito`) REFERENCES `distrito` (`idDistrito`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_dpto_sucursal` FOREIGN KEY (`idDepartamento`) REFERENCES `departamentos` (`idDepartamento`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_prov_sucursal` FOREIGN KEY (`idProvincia`) REFERENCES `provincia` (`idProvincia`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `fk_departamentos_clientes` FOREIGN KEY (`idDepartamento`) REFERENCES `departamentos` (`idDepartamento`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_distritos_clientes` FOREIGN KEY (`idDistrito`) REFERENCES `distrito` (`idDistrito`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_provincias_clientes` FOREIGN KEY (`idProvincia`) REFERENCES `provincia` (`idProvincia`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_tipousuario_usuario` FOREIGN KEY (`idTipoUsuario`) REFERENCES `tipousuario` (`idTipoUsuario`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Filtros para la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD CONSTRAINT `fk_sucursal_vendedor` FOREIGN KEY (`idsucursal`) REFERENCES `sucursal` (`idsucursal`) ON DELETE RESTRICT ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
