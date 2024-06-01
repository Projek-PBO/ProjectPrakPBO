-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 30, 2024 at 04:12 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(11) NOT NULL,
  `nama` varchar(250) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `level` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `nama`, `username`, `password`, `level`) VALUES
(2, 'Rahmat Syarif Hidayatullah', 'apala', 'apala', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `id_anggota` int(11) NOT NULL,
  `nama` varchar(250) NOT NULL,
  `nim` varchar(10) NOT NULL,
  `fakultas` varchar(30) NOT NULL,
  `jurusan` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `ttl` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`id_anggota`, `nama`, `nim`, `fakultas`, `jurusan`, `jenis_kelamin`, `ttl`) VALUES
(1, 'Ayrisa Trianida Elek', '123220193', 'Teknik Industri', 'Informatika', 'Perempuan', 'Bantul,16 Mei 2004');

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `id_buku` int(11) NOT NULL,
  `judul` varchar(300) NOT NULL,
  `pengarang` varchar(100) NOT NULL,
  `penerbit` varchar(100) NOT NULL,
  `tahun_terbit` varchar(100) NOT NULL,
  `ISBN` varchar(100) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `lokasi` varchar(100) NOT NULL,
  `tanggal` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id_buku`, `judul`, `pengarang`, `penerbit`, `tahun_terbit`, `ISBN`, `jumlah`, `lokasi`, `tanggal`) VALUES
(1, 'apala', 'siapa', 'timur', '2000', '12324', 10, 'Rak 2', '2024-05-30'),
(6, 'ini buku', 'aku', 'aku juga', '2025', '12345', 9, 'Rak 2', '2024-05-30');

-- --------------------------------------------------------

--
-- Table structure for table `buku_dibayar`
--

CREATE TABLE `buku_dibayar` (
  `id` int(11) NOT NULL,
  `judul` varchar(200) NOT NULL,
  `nim` varchar(10) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `tanggal_pinjam` varchar(100) NOT NULL,
  `tanggal_kembali` varchar(100) NOT NULL,
  `terlambat` int(11) NOT NULL,
  `denda` varchar(100) NOT NULL,
  `ganti_rugi` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `buku_dibayar`
--

INSERT INTO `buku_dibayar` (`id`, `judul`, `nim`, `nama`, `tanggal_pinjam`, `tanggal_kembali`, `terlambat`, `denda`, `ganti_rugi`, `total`) VALUES
(1, 'ini buku', '123220193', 'Ayrisa Trianida Elek', '2024-05-30', '2024-06-04', 5, ' - ', 100000, 100000);

-- --------------------------------------------------------

--
-- Table structure for table `buku_hilang`
--

CREATE TABLE `buku_hilang` (
  `id` int(11) NOT NULL,
  `judul` varchar(250) NOT NULL,
  `nim` varchar(250) NOT NULL,
  `nama` varchar(250) NOT NULL,
  `tanggal_pinjam` varchar(250) NOT NULL,
  `tanggal_kembali` varchar(250) NOT NULL,
  `terlambat` int(11) NOT NULL,
  `status` varchar(250) NOT NULL,
  `ganti_rugi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `buku_hilang`
--

INSERT INTO `buku_hilang` (`id`, `judul`, `nim`, `nama`, `tanggal_pinjam`, `tanggal_kembali`, `terlambat`, `status`, `ganti_rugi`) VALUES
(2, 'ini buku', '123220193', 'Ayrisa Trianida Elek', '2024-05-30', '2024-06-03', 4, 'Hilang', 100000);

-- --------------------------------------------------------

--
-- Table structure for table `buku_kembali`
--

CREATE TABLE `buku_kembali` (
  `id_peminjaman` int(11) NOT NULL,
  `judul` varchar(200) NOT NULL,
  `nim` varchar(200) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `tanggal_pinjam` varchar(200) NOT NULL,
  `tanggal_kembali` varchar(200) NOT NULL,
  `terlambat` varchar(200) NOT NULL,
  `status` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `buku_kembali`
--

INSERT INTO `buku_kembali` (`id_peminjaman`, `judul`, `nim`, `nama`, `tanggal_pinjam`, `tanggal_kembali`, `terlambat`, `status`) VALUES
(4, 'apa', '123220193', 'Ayrisa Trianida Elek', '2024-05-30', '2024-06-04', '5', 'Dikembalikan'),
(5, 'apala', '123220193', 'Ayrisa Trianida Elek', '2024-05-26', '2024-05-29', '3', 'Dikembalikan');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `id_peminjaman` int(11) NOT NULL,
  `judul` varchar(200) NOT NULL,
  `nim` varchar(200) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `tanggal_pinjam` varchar(100) NOT NULL,
  `tanggal_kembali` varchar(100) NOT NULL,
  `terlambat` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`id_peminjaman`, `judul`, `nim`, `nama`, `tanggal_pinjam`, `tanggal_kembali`, `terlambat`, `status`) VALUES
(5, 'apala', '123220193', 'Ayrisa Trianida Elek', '2024-05-30', '2024-06-04', '5', 'Dipinjam'),
(8, 'ini buku', '123220193', 'Ayrisa Trianida Elek', '2024-05-30', '2024-06-02', '3', 'Dipinjam');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`id_anggota`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indexes for table `buku_dibayar`
--
ALTER TABLE `buku_dibayar`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `buku_hilang`
--
ALTER TABLE `buku_hilang`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `buku_kembali`
--
ALTER TABLE `buku_kembali`
  ADD PRIMARY KEY (`id_peminjaman`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`id_peminjaman`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `anggota`
--
ALTER TABLE `anggota`
  MODIFY `id_anggota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `buku`
--
ALTER TABLE `buku`
  MODIFY `id_buku` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `buku_dibayar`
--
ALTER TABLE `buku_dibayar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `buku_hilang`
--
ALTER TABLE `buku_hilang`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `buku_kembali`
--
ALTER TABLE `buku_kembali`
  MODIFY `id_peminjaman` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `peminjaman`
--
ALTER TABLE `peminjaman`
  MODIFY `id_peminjaman` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
