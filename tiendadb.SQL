--
-- Base de datos: `tiendadb`
--

-- --------------------------------------------------------

CREATE DATABASE `tiendadb`;

--
-- Estructura de tabla para la tabla `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(11) NOT NULL auto_increment,
  `nombres` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcar la base de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `nombres`, `apellidos`) VALUES
(1, 'Angel', 'Perez'),
(2, 'Vladimir', 'Cruz'),
(3, 'Gabriel', 'Contreras'),
(4, 'Saul', 'Ponce');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orden`
--

DROP TABLE IF EXISTS `orden`;
CREATE TABLE IF NOT EXISTS `orden` (
  `id` int(11) NOT NULL auto_increment,
  `id_cliente` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `fecha` datetime NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcar la base de datos para la tabla `orden`
--

INSERT INTO `orden` (`id`, `id_cliente`, `id_producto`, `cantidad`, `fecha`) VALUES
(1, 1, 2, 8, '2021-01-21 18:29:08'),
(2, 3, 3, 5, '2021-01-22 18:29:12'),
(3, 4, 1, 2, '2021-01-21 18:30:20'),
(4, 2, 4, 6, '2021-01-21 18:30:17');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

DROP TABLE IF EXISTS `producto`;
CREATE TABLE IF NOT EXISTS `producto` (
  `id` int(11) NOT NULL auto_increment,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(50) NOT NULL,
  `precio` double NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Volcar la base de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `nombre`, `descripcion`, `precio`) VALUES
(1, 'Arroz', 'Granos basicos', 70),
(2, 'Maiz', 'Granos basicos', 60),
(3, 'Papas', 'Legumbres', 50),
(4, 'Pollo', 'Carnico', 120),
(5, 'Tomate', 'Legumbres', 10),
(6, 'Platano', 'Frutas', 25);
