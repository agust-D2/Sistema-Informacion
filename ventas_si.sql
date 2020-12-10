-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 10-12-2020 a las 02:43:26
-- Versión del servidor: 8.0.17
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
-- Base de datos: `ventas_si`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idcliente` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `dni` char(8) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `estado` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idcliente`, `nombre`, `apellido`, `dni`, `direccion`, `estado`) VALUES
(1, 'orlando', 'Ramos Machuca', '22222222', 'villa el salvador', 'A'),
(2, 'elias', 'gomez flores', '11111111', 'villa maria', 'A'),
(3, 'Angela', 'Centeno Macalupu', '33333333', 'Villa Maria', 'D'),
(4, 'Oscar', 'Vilca Rivera', '44444444', 'Villa el Salvador', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_privilegios`
--

CREATE TABLE `detalle_privilegios` (
  `iddetalle_usuario` int(11) NOT NULL,
  `estado` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `idusuario` int(11) NOT NULL,
  `idacceso` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `detalle_privilegios`
--

INSERT INTO `detalle_privilegios` (`iddetalle_usuario`, `estado`, `idusuario`, `idacceso`) VALUES
(1, 'A', 1, 1),
(2, 'A', 1, 2),
(3, 'A', 1, 3),
(4, 'A', 1, 7),
(5, 'A', 4, 1),
(6, 'A', 4, 2),
(7, 'A', 4, 3),
(8, 'A', 4, 7),
(9, 'A', 3, 4),
(10, 'A', 3, 5),
(11, 'A', 3, 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_venta`
--

CREATE TABLE `detalle_venta` (
  `iddetalle_venta` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precioventa` double NOT NULL,
  `idventa` int(11) NOT NULL,
  `idproducto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `detalle_venta`
--

INSERT INTO `detalle_venta` (`iddetalle_venta`, `cantidad`, `precioventa`, `idventa`, `idproducto`) VALUES
(12, 5, 1.5, 24, 1),
(13, 2, 1, 24, 2),
(17, 2, 1.5, 26, 1),
(18, 3, 1, 26, 2),
(19, 10, 1, 27, 2),
(20, 5, 1.5, 27, 1),
(21, 2, 1.5, 27, 5),
(23, 10, 1, 29, 2),
(24, 10, 1.5, 29, 1),
(26, 10, 1.5, 31, 1),
(27, 10, 1, 31, 2),
(28, 4, 1, 32, 2),
(29, 10, 1, 32, 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `privilegios`
--

CREATE TABLE `privilegios` (
  `idacceso` int(11) NOT NULL,
  `orden` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `url` varchar(250) NOT NULL,
  `estado` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `privilegios`
--

INSERT INTO `privilegios` (`idacceso`, `orden`, `nombre`, `url`, `estado`) VALUES
(1, 1, 'Atención al Cliente', 'atencion-al-cliente.jsp', 'A'),
(2, 2, 'Ciclo Comercial', 'datosclientes.jsp', 'A'),
(3, 5, 'Mant. Entidades', 'Venta.jsp', 'A'),
(4, 10, 'Gestionar Privilegios', 'datosaccesos.jsp', 'A'),
(5, 9, 'Gestionar Usuarios', 'datosusuarios.jsp', 'A'),
(6, 4, 'Registro de Ventas', 'datosventa.jsp', 'A'),
(7, 100, 'Salir', 'login.jsp', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idproducto` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `stock` int(11) NOT NULL,
  `precioventa` double NOT NULL,
  `estado` char(1) NOT NULL,
  `codigo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idproducto`, `nombre`, `stock`, `precioventa`, `estado`, `codigo`) VALUES
(1, 'tampico', 500, 1.5, 'A', 11111),
(2, 'Doritos', 200, 1, 'A', 22222),
(5, 'Coca Cola', 200, 1.5, 'A', 44444),
(7, 'Galletas Oreo', 200, 1, 'A', 33333);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `subaccesos`
--

CREATE TABLE `subaccesos` (
  `idsubacceso` int(11) NOT NULL,
  `orden` int(11) NOT NULL,
  `nombre` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `url` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `estado` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `idacceso` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `subaccesos`
--

INSERT INTO `subaccesos` (`idsubacceso`, `orden`, `nombre`, `url`, `estado`, `idacceso`) VALUES
(1, 1, 'Consulta por NIS/Medidor', 'atencion-al-cliente.jsp', 'A', 1),
(2, 2, 'Consulta por Cliente', 'atencion-al-cliente.jsp', 'A', 1),
(3, 3, 'Consulta por Dirección', 'atencion-al-cliente.jsp', 'A', 1),
(4, 4, 'Consulta por Reg. Usuario No Dom. (RUND)', 'atencion-al-cliente.jsp', 'A', 1),
(5, 5, 'Consulta por CUP', 'atencion-al-cliente.jsp', 'A', 1),
(6, 6, 'Consulta por Clave antigua', 'atencion-al-cliente.jsp', 'A', 1),
(7, 7, 'Consulta de Saldos', 'atencion-al-cliente.jsp', 'A', 1),
(8, 8, 'Consulta de Reclamaciones', 'atencion-al-cliente.jsp', 'A', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuario`
--

CREATE TABLE `tipo_usuario` (
  `idtipo_usuario` int(11) NOT NULL,
  `nombre` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipo_usuario`
--

INSERT INTO `tipo_usuario` (`idtipo_usuario`, `nombre`) VALUES
(1, 'Administrador'),
(2, 'Vendedor');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `clave` varchar(50) NOT NULL,
  `id_tipo_usuario` int(11) NOT NULL,
  `estado` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido_pat` varchar(100) NOT NULL,
  `apellido_mat` varchar(100) NOT NULL,
  `dni` int(8) NOT NULL,
  `celular` int(9) NOT NULL,
  `direccion` varchar(250) NOT NULL,
  `gmail` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idusuario`, `usuario`, `clave`, `id_tipo_usuario`, `estado`, `nombre`, `apellido_pat`, `apellido_mat`, `dni`, `celular`, `direccion`, `gmail`) VALUES
(1, 'untels', '123', 1, 'A', 'Orlando', 'Ramos', 'Machuca', 73425126, 999090495, 'V.E.S. Gr.3 Sect.9 Mz. E Lt.7', 'ramos.m@gmail.com'),
(3, 'Agusto', '123', 2, 'A', 'Nathan', 'Silvera', 'Iñigo', 73980032, 983421191, 'V.E.S. Gr.3 Sect.9 Mz. E Lt.7', 'nathan.s.untels@gmail.com'),
(4, 'dennis', '123', 2, 'D', 'Elias', 'Gomez', 'flores', 73840022, 983154695, 'V.E.S. Gr.3 Sect.9 Mz. E Lt.7', 'elias.g.f@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `idventa` int(11) NOT NULL,
  `numero` int(11) NOT NULL,
  `fecha` varchar(12) NOT NULL,
  `total` double NOT NULL,
  `estado` char(1) NOT NULL,
  `idcliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`idventa`, `numero`, `fecha`, `total`, `estado`, `idcliente`) VALUES
(24, 1001, '2020-02-25', 9.5, 'A', 1),
(26, 1002, '2020-02-25', 6, 'A', 2),
(27, 1003, '2020-02-26', 20.5, 'A', 4),
(29, 1004, '2020-02-26', 25, 'A', 4),
(31, 1008, '2020-02-26', 25, 'A', 2),
(32, 1009, '2020-02-26', 14, 'A', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idcliente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `detalle_privilegios`
--
ALTER TABLE `detalle_privilegios`
  ADD PRIMARY KEY (`iddetalle_usuario`),
  ADD KEY `idusuario` (`idusuario`),
  ADD KEY `idacceso` (`idacceso`);

--
-- Indices de la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  ADD PRIMARY KEY (`iddetalle_venta`),
  ADD KEY `idventa` (`idventa`),
  ADD KEY `idproducto` (`idproducto`);

--
-- Indices de la tabla `privilegios`
--
ALTER TABLE `privilegios`
  ADD PRIMARY KEY (`idacceso`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idproducto`),
  ADD UNIQUE KEY `codigo` (`codigo`);

--
-- Indices de la tabla `subaccesos`
--
ALTER TABLE `subaccesos`
  ADD PRIMARY KEY (`idsubacceso`),
  ADD KEY `idacceso` (`idacceso`);

--
-- Indices de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  ADD PRIMARY KEY (`idtipo_usuario`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idusuario`),
  ADD KEY `id_tipo_usuario` (`id_tipo_usuario`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`idventa`),
  ADD UNIQUE KEY `numero` (`numero`),
  ADD KEY `idcliente` (`idcliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idcliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `detalle_privilegios`
--
ALTER TABLE `detalle_privilegios`
  MODIFY `iddetalle_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  MODIFY `iddetalle_venta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT de la tabla `privilegios`
--
ALTER TABLE `privilegios`
  MODIFY `idacceso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idproducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `subaccesos`
--
ALTER TABLE `subaccesos`
  MODIFY `idsubacceso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  MODIFY `idtipo_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idusuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `idventa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_privilegios`
--
ALTER TABLE `detalle_privilegios`
  ADD CONSTRAINT `detalle_privilegios_ibfk_1` FOREIGN KEY (`idusuario`) REFERENCES `usuario` (`idusuario`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `detalle_privilegios_ibfk_2` FOREIGN KEY (`idacceso`) REFERENCES `privilegios` (`idacceso`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Filtros para la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  ADD CONSTRAINT `detalle_venta_ibfk_1` FOREIGN KEY (`idventa`) REFERENCES `venta` (`idventa`),
  ADD CONSTRAINT `detalle_venta_ibfk_2` FOREIGN KEY (`idproducto`) REFERENCES `producto` (`idproducto`);

--
-- Filtros para la tabla `subaccesos`
--
ALTER TABLE `subaccesos`
  ADD CONSTRAINT `subaccesos_ibfk_1` FOREIGN KEY (`idacceso`) REFERENCES `privilegios` (`idacceso`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_tipo_usuario`) REFERENCES `tipo_usuario` (`idtipo_usuario`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idcliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
