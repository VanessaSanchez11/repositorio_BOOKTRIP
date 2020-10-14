-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-06-2020 a las 20:01:13
-- Versión del servidor: 10.1.33-MariaDB
-- Versión de PHP: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `booktripf`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actividades`
--

CREATE TABLE `actividades` (
  `idActividades` int(255) NOT NULL,
  `municipio_id` int(255) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `lugar` varchar(45) NOT NULL,
  `descripcion` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `adicionales`
--

CREATE TABLE `adicionales` (
  `inmueble_id` int(255) DEFAULT NULL,
  `servicio_id` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamentos`
--

CREATE TABLE `departamentos` (
  `idDepartamentos` int(255) NOT NULL,
  `nombre` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estados`
--

CREATE TABLE `estados` (
  `idEstados` int(255) NOT NULL,
  `nombre` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `galerias`
--

CREATE TABLE `galerias` (
  `idGalerias` int(255) NOT NULL,
  `inmueble_id` int(255) NOT NULL,
  `imagen` blob,
  `url` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inmuebles`
--

CREATE TABLE `inmuebles` (
  `idInmueble` int(255) NOT NULL,
  `tipoInmueble_id` int(255) NOT NULL,
  `departamento_id` int(255) NOT NULL,
  `usuario_id` int(255) NOT NULL,
  `estado_id` int(255) NOT NULL,
  `nombre` varchar(70) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `capacidad` varchar(56) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `precio` varchar(40) NOT NULL,
  `documento` blob
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `municipios`
--

CREATE TABLE `municipios` (
  `idMunicipios` int(255) NOT NULL,
  `departamento_id` int(255) NOT NULL,
  `nombre` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pagos`
--

CREATE TABLE `pagos` (
  `idPagos` int(255) NOT NULL,
  `reserva_usuario` int(255) NOT NULL,
  `reserva_inmueble` int(255) NOT NULL,
  `adjunto` blob NOT NULL,
  `monto` int(255) NOT NULL,
  `fechaPago` varchar(45) NOT NULL,
  `fechaPago2` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `puntuaciones`
--

CREATE TABLE `puntuaciones` (
  `idPuntuacion` int(255) NOT NULL,
  `usuario_id` int(255) NOT NULL,
  `inmueble_id` int(255) NOT NULL,
  `fechaCreada` varchar(45) DEFAULT NULL,
  `decripcion` mediumtext,
  `calificacion` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas`
--

CREATE TABLE `reservas` (
  `idReservas` int(255) NOT NULL,
  `usuario_id` int(255) NOT NULL,
  `inmueble_id` int(255) NOT NULL,
  `estado_id` int(255) NOT NULL,
  `fechaReserva` varchar(45) DEFAULT NULL,
  `checkIN` varchar(45) DEFAULT NULL,
  `checkOut` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

CREATE TABLE `roles` (
  `idRol` int(255) NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

CREATE TABLE `servicios` (
  `idServicios` int(255) NOT NULL,
  `nombreServicio` varchar(100) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `solicitudinmuebles`
--

CREATE TABLE `solicitudinmuebles` (
  `idSolicitud` int(255) NOT NULL,
  `inmueble_id` int(255) NOT NULL,
  `usuario_id` int(255) NOT NULL,
  `estado_id` int(255) NOT NULL,
  `fecha` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipodocumentos`
--

CREATE TABLE `tipodocumentos` (
  `idTipoDocumento` int(255) NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipoinmuebles`
--

CREATE TABLE `tipoinmuebles` (
  `idTipo` int(255) NOT NULL,
  `nombre` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(255) NOT NULL,
  `tipoDocumento_id` int(255) NOT NULL,
  `rol_id` int(225) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `apellidos` varchar(60) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `fechaNacimiento` varchar(45) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actividades`
--
ALTER TABLE `actividades`
  ADD PRIMARY KEY (`idActividades`),
  ADD KEY `fk_actividad_municipio` (`municipio_id`);

--
-- Indices de la tabla `adicionales`
--
ALTER TABLE `adicionales`
  ADD KEY `fk_adicionales_inmueble` (`inmueble_id`),
  ADD KEY `fk_adicionales_servicio` (`servicio_id`);

--
-- Indices de la tabla `departamentos`
--
ALTER TABLE `departamentos`
  ADD PRIMARY KEY (`idDepartamentos`);

--
-- Indices de la tabla `estados`
--
ALTER TABLE `estados`
  ADD PRIMARY KEY (`idEstados`);

--
-- Indices de la tabla `galerias`
--
ALTER TABLE `galerias`
  ADD PRIMARY KEY (`idGalerias`),
  ADD KEY `fk_galeria_inmueble` (`inmueble_id`);

--
-- Indices de la tabla `inmuebles`
--
ALTER TABLE `inmuebles`
  ADD PRIMARY KEY (`idInmueble`),
  ADD KEY `fk_inmueble_tipoInmueble` (`tipoInmueble_id`),
  ADD KEY `fk_inmueble_departamento` (`departamento_id`),
  ADD KEY `fk_inmueble_usuario` (`usuario_id`),
  ADD KEY `fk_inmueble_estado` (`estado_id`);

--
-- Indices de la tabla `municipios`
--
ALTER TABLE `municipios`
  ADD PRIMARY KEY (`idMunicipios`),
  ADD KEY `fk_municipio_departamento` (`departamento_id`);

--
-- Indices de la tabla `pagos`
--
ALTER TABLE `pagos`
  ADD PRIMARY KEY (`idPagos`),
  ADD KEY `fk_pagos_usuarios` (`reserva_usuario`),
  ADD KEY `fk_pagos_inmueble` (`reserva_inmueble`);

--
-- Indices de la tabla `puntuaciones`
--
ALTER TABLE `puntuaciones`
  ADD PRIMARY KEY (`idPuntuacion`),
  ADD KEY `fk_puntuacion_usuario` (`usuario_id`),
  ADD KEY `fk_puntuacion_inmueble` (`inmueble_id`);

--
-- Indices de la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`idReservas`),
  ADD KEY `fk_reservas_usuario` (`usuario_id`),
  ADD KEY `fk_reservas_inmueble` (`inmueble_id`),
  ADD KEY `fk_reservas_estado` (`estado_id`);

--
-- Indices de la tabla `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`idRol`);

--
-- Indices de la tabla `servicios`
--
ALTER TABLE `servicios`
  ADD PRIMARY KEY (`idServicios`);

--
-- Indices de la tabla `solicitudinmuebles`
--
ALTER TABLE `solicitudinmuebles`
  ADD PRIMARY KEY (`idSolicitud`),
  ADD KEY `fk_solicitud_inmueble` (`inmueble_id`),
  ADD KEY `fk_solicitud_usuario` (`usuario_id`),
  ADD KEY `fk_solicitud_estado` (`estado_id`);

--
-- Indices de la tabla `tipodocumentos`
--
ALTER TABLE `tipodocumentos`
  ADD PRIMARY KEY (`idTipoDocumento`);

--
-- Indices de la tabla `tipoinmuebles`
--
ALTER TABLE `tipoinmuebles`
  ADD PRIMARY KEY (`idTipo`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_usuario_rol` (`rol_id`),
  ADD KEY `fk_usuario_tipoD` (`tipoDocumento_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `actividades`
--
ALTER TABLE `actividades`
  MODIFY `idActividades` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `departamentos`
--
ALTER TABLE `departamentos`
  MODIFY `idDepartamentos` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `estados`
--
ALTER TABLE `estados`
  MODIFY `idEstados` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `galerias`
--
ALTER TABLE `galerias`
  MODIFY `idGalerias` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `inmuebles`
--
ALTER TABLE `inmuebles`
  MODIFY `idInmueble` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `municipios`
--
ALTER TABLE `municipios`
  MODIFY `idMunicipios` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pagos`
--
ALTER TABLE `pagos`
  MODIFY `idPagos` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `puntuaciones`
--
ALTER TABLE `puntuaciones`
  MODIFY `idPuntuacion` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `reservas`
--
ALTER TABLE `reservas`
  MODIFY `idReservas` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `roles`
--
ALTER TABLE `roles`
  MODIFY `idRol` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `servicios`
--
ALTER TABLE `servicios`
  MODIFY `idServicios` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `solicitudinmuebles`
--
ALTER TABLE `solicitudinmuebles`
  MODIFY `idSolicitud` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipodocumentos`
--
ALTER TABLE `tipodocumentos`
  MODIFY `idTipoDocumento` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipoinmuebles`
--
ALTER TABLE `tipoinmuebles`
  MODIFY `idTipo` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `actividades`
--
ALTER TABLE `actividades`
  ADD CONSTRAINT `fk_actividad_municipio` FOREIGN KEY (`municipio_id`) REFERENCES `municipios` (`idMunicipios`);

--
-- Filtros para la tabla `adicionales`
--
ALTER TABLE `adicionales`
  ADD CONSTRAINT `fk_adicionales_inmueble` FOREIGN KEY (`inmueble_id`) REFERENCES `inmuebles` (`idInmueble`),
  ADD CONSTRAINT `fk_adicionales_servicio` FOREIGN KEY (`servicio_id`) REFERENCES `servicios` (`idServicios`);

--
-- Filtros para la tabla `galerias`
--
ALTER TABLE `galerias`
  ADD CONSTRAINT `fk_galeria_inmueble` FOREIGN KEY (`inmueble_id`) REFERENCES `inmuebles` (`idInmueble`);

--
-- Filtros para la tabla `inmuebles`
--
ALTER TABLE `inmuebles`
  ADD CONSTRAINT `fk_inmueble_departamento` FOREIGN KEY (`departamento_id`) REFERENCES `departamentos` (`idDepartamentos`),
  ADD CONSTRAINT `fk_inmueble_estado` FOREIGN KEY (`estado_id`) REFERENCES `estados` (`idEstados`),
  ADD CONSTRAINT `fk_inmueble_tipoInmueble` FOREIGN KEY (`tipoInmueble_id`) REFERENCES `tipoinmuebles` (`idTipo`),
  ADD CONSTRAINT `fk_inmueble_usuario` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`);

--
-- Filtros para la tabla `municipios`
--
ALTER TABLE `municipios`
  ADD CONSTRAINT `fk_municipio_departamento` FOREIGN KEY (`departamento_id`) REFERENCES `departamentos` (`idDepartamentos`);

--
-- Filtros para la tabla `pagos`
--
ALTER TABLE `pagos`
  ADD CONSTRAINT `fk_pagos_inmueble` FOREIGN KEY (`reserva_inmueble`) REFERENCES `reservas` (`inmueble_id`),
  ADD CONSTRAINT `fk_pagos_usuarios` FOREIGN KEY (`reserva_usuario`) REFERENCES `reservas` (`usuario_id`);

--
-- Filtros para la tabla `puntuaciones`
--
ALTER TABLE `puntuaciones`
  ADD CONSTRAINT `fk_puntuacion_inmueble` FOREIGN KEY (`inmueble_id`) REFERENCES `inmuebles` (`idInmueble`),
  ADD CONSTRAINT `fk_puntuacion_usuario` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`);

--
-- Filtros para la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD CONSTRAINT `fk_reservas_estado` FOREIGN KEY (`estado_id`) REFERENCES `estados` (`idEstados`),
  ADD CONSTRAINT `fk_reservas_inmueble` FOREIGN KEY (`inmueble_id`) REFERENCES `inmuebles` (`idInmueble`),
  ADD CONSTRAINT `fk_reservas_usuario` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`);

--
-- Filtros para la tabla `solicitudinmuebles`
--
ALTER TABLE `solicitudinmuebles`
  ADD CONSTRAINT `fk_solicitud_estado` FOREIGN KEY (`estado_id`) REFERENCES `estados` (`idEstados`),
  ADD CONSTRAINT `fk_solicitud_inmueble` FOREIGN KEY (`inmueble_id`) REFERENCES `inmuebles` (`idInmueble`),
  ADD CONSTRAINT `fk_solicitud_usuario` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`);

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `fk_usuario_rol` FOREIGN KEY (`rol_id`) REFERENCES `roles` (`idRol`),
  ADD CONSTRAINT `fk_usuario_tipoD` FOREIGN KEY (`tipoDocumento_id`) REFERENCES `tipodocumentos` (`idTipoDocumento`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
