-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 30, 2024 at 06:09 PM
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
-- Database: `qlthuvien`
--

-- --------------------------------------------------------

--
-- Table structure for table `dangnhap`
--

CREATE TABLE `dangnhap` (
  `id` int(10) NOT NULL,
  `user` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dangnhap`
--

INSERT INTO `dangnhap` (`id`, `user`, `password`) VALUES
(1, 'admin', '123456'),
(2, 'nv01', '123');

-- --------------------------------------------------------

--
-- Table structure for table `docgia`
--

CREATE TABLE `docgia` (
  `maDG` varchar(10) NOT NULL,
  `tenDG` varchar(20) NOT NULL,
  `lop` varchar(20) NOT NULL,
  `tuoiDG` int(10) NOT NULL,
  `diaChiDG` varchar(20) NOT NULL,
  `sdtDG` int(11) NOT NULL,
  `emailDG` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `docgia`
--

INSERT INTO `docgia` (`maDG`, `tenDG`, `lop`, `tuoiDG`, `diaChiDG`, `sdtDG`, `emailDG`) VALUES
('dg01', 'Lê Thị Hoa', 'ti1a10', 22, 'hà nội', 2921343, 'hoa@gmail.com'),
('dg02', 'Lê Hoàng Việt', 'ti15a11', 19, 'hà nội', 392832, 'viet@gmail.com'),
('dg03', 'Lê Thị Lan', 'ti15a12', 17, 'đà nẵng', 39854432, 'lan@gmail.com'),
('dg04', 'Võ Thế Anh', 'ti15a10', 22, 'đà nẵng', 292819, 'anh@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `muonsach`
--

CREATE TABLE `muonsach` (
  `maMuon` varchar(10) NOT NULL,
  `maSach` varchar(10) NOT NULL,
  `maDG` varchar(10) NOT NULL,
  `maNV` varchar(10) NOT NULL,
  `ngayMuon` varchar(20) NOT NULL,
  `ngayHenTra` varchar(20) NOT NULL,
  `tinhTrangMuon` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `muonsach`
--

INSERT INTO `muonsach` (`maMuon`, `maSach`, `maDG`, `maNV`, `ngayMuon`, `ngayHenTra`, `tinhTrangMuon`) VALUES
('muon01', 'sach01', 'dg01', 'nv01', '2023-04-19', '2024-06-20', '100'),
('muon03', 'sach02', 'dg04', 'nv02', '2023-06-1', '2024-06-30', '100'),
('muon04', 'sach01', 'dg04', 'nv03', '2023-09-08', '2023-10-19', '100'),
('muon05', 'sach01', 'dg02', 'nv02', '2024-05-21', '2024-06-01', '100'),
('muon5', 'sach03', 'dg04', 'nv03', '2023-9-19', '2023-9-30', '100');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `maNV` varchar(10) NOT NULL,
  `tenNV` varchar(20) NOT NULL,
  `tuoiNV` int(10) NOT NULL,
  `diaChiNV` varchar(50) NOT NULL,
  `sdtNV` int(11) NOT NULL,
  `emailNV` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`maNV`, `tenNV`, `tuoiNV`, `diaChiNV`, `sdtNV`, `emailNV`) VALUES
('nv01', 'nguyễn huy hoàng', 22, 'hà nội', 289291, 'hoang@gmail.com'),
('nv02', 'nguyễn tuấn tiến', 19, 'quảng ninh', 238292, 'tien@gmail.com'),
('nv03', 'nguyễn huy bình', 24, 'phú thọ', 29292, 'binh@gmail.com'),
('nv04', 'nguyễn anh sơn', 19, 'hà giang', 299244, 'son@gmail.com'),
('nv05', 'nguyễn tuấn tiến', 21, 'quảng ninh', 29292, 'm@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `sach`
--

CREATE TABLE `sach` (
  `maSach` varchar(10) NOT NULL,
  `tieuDeSach` varchar(20) NOT NULL,
  `tenTacGia` varchar(20) NOT NULL,
  `nhaXuatBan` varchar(50) NOT NULL,
  `namXuatBan` int(20) NOT NULL,
  `theLoai` varchar(50) NOT NULL,
  `soLuong` int(10) NOT NULL,
  `giaTien` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sach`
--

INSERT INTO `sach` (`maSach`, `tieuDeSach`, `tenTacGia`, `nhaXuatBan`, `namXuatBan`, `theLoai`, `soLuong`, `giaTien`) VALUES
('sach01', 'toán', 'nguyễn văn a', 'kim đồng', 2020, 'truyện thiếu nhi', 10, 100000),
('sach02', 'văn', 'lê thị b', 'hà nội', 2019, 'sách giáo khoa', 20, 120000),
('sach03', 'vịt con', 'nguyễn văn c', 'kim đồng', 2020, 'truyện thiếu nhi', 15, 90000),
('sach04', 'phía sau sao biển', 'võ văn a', 'hcm', 2018, 'truyện thiếu nhi', 5, 80000),
('sach05', 'tiếng anh', 'lê hoa', 'nhà xuất bản việt nam', 2024, 'truyện thiếu nhi', 15, 150000),
('sach06', 'thế giới động vật', 'nguyễn huy hoàng', 'nhà xuất bản việt nam', 2019, 'khám phá', 8, 110000),
('sach07', 'cấu trúc dữ liệu', 'mai mạnh trừng', 'việt nam', 2019, 'sách giáo khoa', 10, 180000),
('sach10', 'lợn lợn', 'hoa hoa', 'kim đồng', 2024, 'truyện thiếu nhi', 10, 100000),
('sach12', 'khoa học', 'hoa hoa', 'nam đàn', 2024, 'khám phá', 12, 130000);

-- --------------------------------------------------------

--
-- Table structure for table `trasach`
--

CREATE TABLE `trasach` (
  `maTra` varchar(10) NOT NULL,
  `maMuon` varchar(10) NOT NULL,
  `ngayTraThuc` varchar(20) NOT NULL,
  `tinhTrangTra` int(10) NOT NULL,
  `khoanThu` int(20) NOT NULL,
  `ghiChu` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `trasach`
--

INSERT INTO `trasach` (`maTra`, `maMuon`, `ngayTraThuc`, `tinhTrangTra`, `khoanThu`, `ghiChu`) VALUES
('123', 'muon05', '2024-06-14', 70, 10000, 'Đúng hạn \nnhưng sách hỏng 10% của sách có giá 100000'),
('tra1', 'muon01', '2024-06-26', 90, 22000, 'Quá hạn 6 ngày \n và sách hỏng 10% của sách có giá 100000'),
('tra12', 'muon5', '2023-09-30', 80, 18000, 'Đúng hạn \n nhưng sách hỏng 20% của sách có giá 90000'),
('tra2', 'muon04', '2023-10-20', 80, 22000, 'Quá hạn 1 ngày và sách hỏng 20% của sách có giá 100000'),
('tra7', 'muon03', '2024-06-30', 100, 0, 'Đúng hạn và sách không hỏng gì');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dangnhap`
--
ALTER TABLE `dangnhap`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `docgia`
--
ALTER TABLE `docgia`
  ADD PRIMARY KEY (`maDG`);

--
-- Indexes for table `muonsach`
--
ALTER TABLE `muonsach`
  ADD PRIMARY KEY (`maMuon`),
  ADD KEY `fk_nhanvien` (`maNV`),
  ADD KEY `fk_sach` (`maSach`),
  ADD KEY `fk_docgia2` (`maDG`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`maNV`);

--
-- Indexes for table `sach`
--
ALTER TABLE `sach`
  ADD PRIMARY KEY (`maSach`);

--
-- Indexes for table `trasach`
--
ALTER TABLE `trasach`
  ADD PRIMARY KEY (`maTra`),
  ADD UNIQUE KEY `uc_maMuon` (`maMuon`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dangnhap`
--
ALTER TABLE `dangnhap`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `muonsach`
--
ALTER TABLE `muonsach`
  ADD CONSTRAINT `fk_docgia` FOREIGN KEY (`maDG`) REFERENCES `docgia` (`maDG`),
  ADD CONSTRAINT `fk_docgia2` FOREIGN KEY (`maDG`) REFERENCES `docgia` (`maDG`),
  ADD CONSTRAINT `fk_nhanvien` FOREIGN KEY (`maNV`) REFERENCES `nhanvien` (`maNV`),
  ADD CONSTRAINT `fk_sach` FOREIGN KEY (`maSach`) REFERENCES `sach` (`maSach`);

--
-- Constraints for table `trasach`
--
ALTER TABLE `trasach`
  ADD CONSTRAINT `fk_muonsach3` FOREIGN KEY (`maMuon`) REFERENCES `muonsach` (`maMuon`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
