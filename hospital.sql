-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-01-2023 a las 00:25:02
-- Versión del servidor: 10.1.9-MariaDB
-- Versión de PHP: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hospital`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `diagnosis`
--

CREATE TABLE `diagnosis` (
  `id_diag` int(11) NOT NULL,
  `id_pati` varchar(20) COLLATE utf32_unicode_ci NOT NULL,
  `name` varchar(20) COLLATE utf32_unicode_ci NOT NULL,
  `symptoms` varchar(20) COLLATE utf32_unicode_ci NOT NULL,
  `diagnosis` varchar(20) COLLATE utf32_unicode_ci NOT NULL,
  `medicines` varchar(20) COLLATE utf32_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_unicode_ci;

--
-- Volcado de datos para la tabla `diagnosis`
--

INSERT INTO `diagnosis` (`id_diag`, `id_pati`, `name`, `symptoms`, `diagnosis`, `medicines`) VALUES
(1, '2', 'karina', 'hgfh', 'hgfh', 'hgfhgf'),
(2, '3', 'enka', 'fff', 'ee', 'yy'),
(3, '2', 'karina', 'fff', 'aaa', '666');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `doctor`
--

CREATE TABLE `doctor` (
  `id` int(11) NOT NULL,
  `name` varchar(20) COLLATE utf32_unicode_ci NOT NULL,
  `password` varchar(20) COLLATE utf32_unicode_ci NOT NULL,
  `experience` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_unicode_ci;

--
-- Volcado de datos para la tabla `doctor`
--

INSERT INTO `doctor` (`id`, `name`, `password`, `experience`) VALUES
(1, 'jeska', '10', 1),
(2, 'enkar', '1234', 50);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `user` varchar(20) COLLATE utf32_unicode_ci NOT NULL,
  `password` varchar(20) COLLATE utf32_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_unicode_ci;

--
-- Volcado de datos para la tabla `login`
--

INSERT INTO `login` (`user`, `password`) VALUES
('jeskarin', '1234');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `patient`
--

CREATE TABLE `patient` (
  `id` int(11) NOT NULL,
  `name` varchar(20) COLLATE utf32_unicode_ci NOT NULL,
  `ad` varchar(20) COLLATE utf32_unicode_ci NOT NULL,
  `phone` varchar(20) COLLATE utf32_unicode_ci NOT NULL,
  `age` int(3) NOT NULL,
  `gen` varchar(20) COLLATE utf32_unicode_ci NOT NULL,
  `roup` varchar(20) COLLATE utf32_unicode_ci NOT NULL,
  `pathologies` varchar(30) COLLATE utf32_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_unicode_ci;

--
-- Volcado de datos para la tabla `patient`
--

INSERT INTO `patient` (`id`, `name`, `ad`, `phone`, `age`, `gen`, `roup`, `pathologies`) VALUES
(2, 'karina', 'fsdfds', '655', 4, 'Female', 'B', '444'),
(3, 'enka', 'dfgd', '45', 4, 'Female', 'A', 'fdsfs');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
