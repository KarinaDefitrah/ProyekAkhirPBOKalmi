-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 27, 2023 at 03:13 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projectkalmi`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_history`
--

CREATE TABLE `data_history` (
  `username` varchar(100) NOT NULL,
  `id` int(11) NOT NULL,
  `tanggal_cek` datetime NOT NULL,
  `hasilbmi` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `data_registrasi`
--

CREATE TABLE `data_registrasi` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(50) NOT NULL,
  `jeniskelamin` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_registrasi`
--

INSERT INTO `data_registrasi` (`id`, `username`, `password`, `jeniskelamin`) VALUES
(1, 'karinaDefitrah', '12345678', 'Wanita'),
(2, 'aisyahSelviana', '12345677', 'Wanita'),
(3, 'ruffinoNoor', '12345667', 'Pria'),
(4, 'Arunia Salsa', 'arklot10', 'Wanita'),
(5, 'Muthiah Fatih', 'mingyu49', 'Wanita'),
(6, 'Jung Eunji', 'apinksaranghae', 'Wanita'),
(7, 'Marsya Faradilah', 'ammarganteng', 'Wanita'),
(8, 'Park Jiyeon', 't-arajiyeon', 'Wanita'),
(9, 'Nadiem Makarim', 'gojekjaya', 'Pria'),
(10, 'Oh Sehun', 'memberexo', 'Pria');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_history`
--
ALTER TABLE `data_history`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `data_registrasi`
--
ALTER TABLE `data_registrasi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_history`
--
ALTER TABLE `data_history`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=160;

--
-- AUTO_INCREMENT for table `data_registrasi`
--
ALTER TABLE `data_registrasi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
