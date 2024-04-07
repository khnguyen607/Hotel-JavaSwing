-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: localhost:3306
-- Thời gian đã tạo: Th4 07, 2024 lúc 12:38 PM
-- Phiên bản máy phục vụ: 8.0.30
-- Phiên bản PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `hms`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `booking`
--

CREATE TABLE `booking` (
  `ID` int NOT NULL,
  `GuestID` int NOT NULL,
  `RoomID` int NOT NULL,
  `CheckIn` date NOT NULL,
  `CheckOut` date NOT NULL,
  `UserID` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `booking`
--

INSERT INTO `booking` (`ID`, `GuestID`, `RoomID`, `CheckIn`, `CheckOut`, `UserID`) VALUES
(1, 6, 3, '2024-01-25', '2024-01-28', 2),
(2, 3, 6, '2024-01-25', '2024-01-30', 1),
(3, 2, 6, '2024-01-20', '2024-01-21', 1),
(4, 5, 7, '2024-02-10', '2024-02-11', 1),
(5, 4, 8, '2024-02-15', '2024-02-16', 1),
(6, 4, 8, '2024-02-25', '2024-02-26', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `guests`
--

CREATE TABLE `guests` (
  `ID` int NOT NULL,
  `FullName` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Phone` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Tier` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `guests`
--

INSERT INTO `guests` (`ID`, `FullName`, `Phone`, `Email`, `Tier`) VALUES
(1, 'Khôi Nguyên', '(+84) 886 881 076', 'khnguyen.job@gmail.com', 'Platinum'),
(2, 'Nguyễn Thị Hằng', '(+84) 123 456 789', 'nguyen.hang@example.com', 'Silver'),
(3, 'Trần Văn Hưng', '(+84) 234 567 890', 'tran.hung@example.com', 'Gold'),
(4, 'Lê Thị Lan', '(+84) 345 678 901', 'le.lan@example.com', 'Platinum'),
(5, 'Phạm Văn Dũng', '(+84) 456 789 012', 'pham.dung@example.com', 'Silver'),
(6, 'Nguyễn Thị Minh Châu', '(+84) 567 890 123', 'nguyen.chau@example.com', 'Gold'),
(7, 'Trần Văn Tuấn', '(+84) 678 901 234', 'tran.tuan@example.com', 'Silver'),
(8, 'Lê Thị Ngọc Trâm', '(+84) 789 012 345', 'le.tram@example.com', 'Platinum'),
(9, 'Nguyễn Văn Bình', '(+84) 890 123 456', 'nguyen.binh@example.com', 'Gold'),
(10, 'Trần Thị Hà', '(+84) 901 234 567', 'tran.ha@example.com', 'Silver'),
(11, 'Lê Văn Minh', '(+84) 012 345 678', 'le.minh@example.com', 'Platinum'),
(12, 'Nguyễn Thị Thanh Hằng', '(+84) 123 456 789', 'nguyen.hang@example.com', 'Gold'),
(13, 'Trần Văn Thành', '(+84) 234 567 890', 'tran.thanh@example.com', 'Silver'),
(14, 'Lê Thị Quỳnh Trang', '(+84) 345 678 901', 'le.trang@example.com', 'Platinum'),
(15, 'Phạm Văn Hòa', '(+84) 456 789 012', 'pham.hoa@example.com', 'Gold'),
(16, 'Nguyễn Thị Kim Anh', '(+84) 567 890 123', 'nguyen.anh@example.com', 'Silver'),
(17, 'Trần Văn Phúc', '(+84) 678 901 234', 'tran.phuc@example.com', 'Platinum'),
(18, 'Lê Thị Lan Anh', '(+84) 789 012 345', 'le.anh@example.com', 'Gold'),
(19, 'Nguyễn Văn Nam', '(+84) 890 123 456', 'nguyen.nam@example.com', 'Silver'),
(20, 'Trần Thị Ngọc Ánh', '(+84) 901 234 567', 'tran.anh@example.com', 'Platinum'),
(21, 'Lê Văn Long', '(+84) 012 345 678', 'le.long@example.com', 'Gold');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hotels`
--

CREATE TABLE `hotels` (
  `ID` int NOT NULL,
  `Name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Star` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `hotels`
--

INSERT INTO `hotels` (`ID`, `Name`, `Address`, `Star`) VALUES
(1, 'VinHolidays Fiesta Phú Quốc', 'Khu Bãi Dài, Huyện Phú Quốc, Kiên Giang', 4),
(2, 'Vinpearl Wonderworld Phú Quốc', 'Bãi Dài, Gành Dầu, Phú Quốc, Kiên Giang', 5),
(3, 'Vinpearl Resort & Spa Phú Quốc', 'Bãi Dài, Gành Dầu, Phú Quốc, Kiên Giang', 5),
(4, 'Vinpearl Luxury Nha Trang', 'Hon Tre Island, Vinh Nguyen Ward Nha Trang City, Khánh Hòa', 5),
(5, 'Vinpearl Resort & Spa Nha Trang Bay', '66FR+3P4 City, Hon Tre, Đường đi Vinpearl, Vĩnh Nguyên, Nha Trang, Khánh Hòa', 5),
(6, 'Vinpearl Resort Nha Trang', 'Đảo Hòn Tre, Phường Vĩnh Nguyên , Hòn Tre, Nha Trang, Việt Nam', 5),
(7, 'Hòn Tằm Resort', 'Hon Tam Island, Vinh Nguyen Ward, Nha Trang, Việt Nam', 5),
(8, 'Vinpearl Beachfront Nha Trang', '78-80 Trần Phú, Lộc Thọ, Nha Trang, Khánh Hòa', 5),
(9, 'Vinpearl Resort & Golf Nam Hội An', 'Bình Minh, Thăng Bình, Quảng Nam', 4),
(10, 'Vinpearl Resort & Spa Hạ Long', 'W2RF+2Q, Đỗ Sĩ Họa, Đảo Rều, Thành phố Hạ Long, Quảng Ninh', 4);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `rooms`
--

CREATE TABLE `rooms` (
  `ID` int NOT NULL,
  `NumberRoom` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `HotelID` int NOT NULL,
  `RoomTypeID` int NOT NULL,
  `Price` int NOT NULL,
  `Status` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'Trống'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `rooms`
--

INSERT INTO `rooms` (`ID`, `NumberRoom`, `HotelID`, `RoomTypeID`, `Price`, `Status`) VALUES
(1, '101', 1, 1, 1500, 'Trống'),
(2, '102', 1, 2, 2000, 'Đã được đặt'),
(3, '103', 1, 3, 2500, 'Trống'),
(4, '104', 1, 4, 3000, 'Trống'),
(5, '105', 1, 5, 1800, 'Trống'),
(6, '106', 2, 1, 1700, 'Trống'),
(7, '107', 2, 2, 2100, 'Trống'),
(8, '108', 2, 3, 2600, 'Trống'),
(9, '109', 2, 4, 3100, 'Trống'),
(10, '110', 2, 5, 1900, 'Trống'),
(11, '111', 3, 1, 1600, 'Trống'),
(12, '112', 3, 2, 2200, 'Trống'),
(13, '113', 3, 3, 2700, 'Trống'),
(14, '114', 3, 4, 3200, 'Trống'),
(15, '115', 3, 5, 2000, 'Trống'),
(16, '116', 4, 1, 1550, 'Trống'),
(17, '117', 4, 2, 2050, 'Trống'),
(18, '118', 4, 3, 2550, 'Trống'),
(19, '119', 4, 4, 3050, 'Trống'),
(20, '120', 4, 5, 1850, 'Trống'),
(21, '121', 5, 1, 1580, 'Trống'),
(22, '122', 5, 2, 2080, 'Trống'),
(23, '123', 5, 3, 2580, 'Trống'),
(24, '124', 5, 4, 3080, 'Trống'),
(25, '125', 5, 5, 1880, 'Trống'),
(26, '126', 6, 1, 1520, 'Trống'),
(27, '127', 6, 2, 2020, 'Trống'),
(28, '128', 6, 3, 2520, 'Trống'),
(29, '129', 6, 4, 3020, 'Trống'),
(30, '130', 6, 5, 1820, 'Trống'),
(31, '131', 7, 1, 1540, 'Trống'),
(32, '132', 7, 2, 2040, 'Trống'),
(33, '133', 7, 3, 2540, 'Trống'),
(34, '134', 7, 4, 3040, 'Trống'),
(35, '135', 7, 5, 1840, 'Trống'),
(36, '136', 8, 1, 1570, 'Trống'),
(37, '137', 8, 2, 2070, 'Trống'),
(38, '138', 8, 3, 2570, 'Trống'),
(39, '139', 8, 4, 3070, 'Trống'),
(40, '140', 8, 5, 1870, 'Trống'),
(41, '141', 9, 1, 1530, 'Trống'),
(42, '142', 9, 2, 2030, 'Trống'),
(43, '143', 9, 3, 2530, 'Trống'),
(44, '144', 9, 4, 3030, 'Trống'),
(45, '145', 9, 5, 1830, 'Trống'),
(46, '146', 10, 1, 1560, 'Trống'),
(47, '147', 10, 2, 2060, 'Trống'),
(48, '148', 10, 3, 2560, 'Trống'),
(49, '149', 10, 4, 3060, 'Trống'),
(50, '150', 10, 5, 1860, 'Trống'),
(51, '201', 1, 1, 1550, 'Trống'),
(52, '202', 1, 2, 2050, 'Trống'),
(53, '203', 1, 3, 2550, 'Trống'),
(54, '204', 1, 4, 3050, 'Trống'),
(55, '205', 1, 5, 1850, 'Trống'),
(56, '206', 2, 1, 1580, 'Trống'),
(57, '207', 2, 2, 2080, 'Trống'),
(58, '208', 2, 3, 2580, 'Trống'),
(59, '209', 2, 4, 3080, 'Trống'),
(60, '210', 2, 5, 1880, 'Trống'),
(61, '211', 3, 1, 1520, 'Trống'),
(62, '212', 3, 2, 2020, 'Trống'),
(63, '213', 3, 3, 2520, 'Trống'),
(64, '214', 3, 4, 3020, 'Trống'),
(65, '215', 3, 5, 1820, 'Trống'),
(66, '216', 4, 1, 1540, 'Trống'),
(67, '217', 4, 2, 2040, 'Trống'),
(68, '218', 4, 3, 2540, 'Trống'),
(69, '219', 4, 4, 3040, 'Trống'),
(70, '220', 4, 5, 1840, 'Trống'),
(71, '221', 5, 1, 1570, 'Trống'),
(72, '222', 5, 2, 2070, 'Trống'),
(73, '223', 5, 3, 2570, 'Trống'),
(74, '224', 5, 4, 3070, 'Trống'),
(75, '225', 5, 5, 1870, 'Trống'),
(76, '226', 6, 1, 1530, 'Trống'),
(77, '227', 6, 2, 2030, 'Trống'),
(78, '228', 6, 3, 2530, 'Trống'),
(79, '229', 6, 4, 3030, 'Trống'),
(80, '230', 6, 5, 1830, 'Trống'),
(81, '231', 7, 1, 1560, 'Trống'),
(82, '232', 7, 2, 2060, 'Trống'),
(83, '233', 7, 3, 2560, 'Trống'),
(84, '234', 7, 4, 3060, 'Trống'),
(85, '235', 7, 5, 1860, 'Trống'),
(86, '236', 8, 1, 1550, 'Trống'),
(87, '237', 8, 2, 2050, 'Trống'),
(88, '238', 8, 3, 2550, 'Trống'),
(89, '239', 8, 4, 3050, 'Trống'),
(90, '240', 8, 5, 1850, 'Trống'),
(91, '241', 9, 1, 1580, 'Trống'),
(92, '242', 9, 2, 2080, 'Trống'),
(93, '243', 9, 3, 2580, 'Trống'),
(94, '244', 9, 4, 3080, 'Trống'),
(95, '245', 9, 5, 1880, 'Trống'),
(96, '246', 10, 1, 1520, 'Trống'),
(97, '247', 10, 2, 2020, 'Trống'),
(98, '248', 10, 3, 2520, 'Trống'),
(99, '249', 10, 4, 3020, 'Trống'),
(100, '250', 10, 5, 1820, 'Trống');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `roomtype`
--

CREATE TABLE `roomtype` (
  `ID` int NOT NULL,
  `Name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Capacity` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `roomtype`
--

INSERT INTO `roomtype` (`ID`, `Name`, `Description`, `Capacity`) VALUES
(1, 'Phòng Đơn', 'Phòng đơn tiện nghi với một giường đơn', 1),
(2, 'Phòng Đôi', 'Phòng đôi rộng rãi với một giường đôi', 2),
(3, 'Phòng Gia Đình', 'Phòng gia đình thích hợp cho cả gia đình với nhiều thành viên', 4),
(4, 'Suite Hướng Biển', 'Suite sang trọng với tầm nhìn ra biển', 2),
(5, 'Phòng Deluxe', 'Phòng cao cấp với tiện nghi hiện đại', 2),
(6, 'Phòng Studio', 'Phòng tiện nghi với không gian làm việc và nghỉ ngơi', 1),
(7, 'Villa', 'Dành cho nhóm nhiều người', 12),
(8, 'Phòng VIP', 'Phòng VIP dành cho các vị khách đặc biệt', 2),
(9, 'Phòng Suite', 'Suite sang trọng và đẳng cấp', 2),
(10, 'Phòng Cao Cấp', 'Phòng cao cấp với dịch vụ tốt nhất', 2);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `services`
--

CREATE TABLE `services` (
  `ID` int NOT NULL,
  `Name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Price` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `services`
--

INSERT INTO `services` (`ID`, `Name`, `Price`) VALUES
(1, 'Phòng gym', 1500),
(2, 'Spa', 1800),
(3, 'Bể bơi ngoài trời', 2000),
(4, 'Dịch vụ phòng', 1000),
(5, 'Buffet sáng', 1200),
(6, 'Đưa đón sân bay', 800),
(7, 'Tour du lịch', 1800),
(8, 'Dịch vụ giặt là', 600),
(9, 'Dịch vụ hướng dẫn du lịch', 1500),
(10, 'Dịch vụ đặt vé', 500);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `staffs`
--

CREATE TABLE `staffs` (
  `ID` int NOT NULL,
  `HotelID` int NOT NULL,
  `FullName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Position` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Salary` int NOT NULL,
  `Phone` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `staffs`
--

INSERT INTO `staffs` (`ID`, `HotelID`, `FullName`, `Position`, `Salary`, `Phone`, `Email`) VALUES
(1, 1, 'Nguyễn Văn A', 'Quản lý', 50000, '(+84) 123 456 789', 'nguyen.a@example.com'),
(2, 2, 'Trần Thị B', 'Quản lý', 48000, '(+84) 234 567 890', 'tran.b@example.com'),
(3, 3, 'Lê Văn C', 'Nhân viên lễ tân', 30000, '(+84) 345 678 901', 'le.c@example.com'),
(5, 5, 'Hoàng Văn E', 'Bảo vệ', 25000, '(+84) 567 890 123', 'hoang.e@example.com'),
(6, 6, 'Trần Thị F', 'Bảo vệ', 24000, '(+84) 678 901 234', 'tran.f@example.com'),
(7, 7, 'Nguyễn Văn G', 'Nhân viên phục vụ', 28000, '(+84) 789 012 345', 'nguyen.g@example.com'),
(8, 8, 'Lê Thị H', 'Nhân viên phục vụ', 27000, '(+84) 890 123 456', 'le.h@example.com'),
(9, 9, 'Phạm Văn I', 'Kế toán', 45000, '(+84) 901 234 567', 'pham.i@example.com'),
(10, 10, 'Hoàng Thị K', 'Kế toán', 43000, '(+84) 012 345 678', 'hoang.k@example.com'),
(11, 1, 'Nguyễn Văn L', 'Nhân viên phòng', 35000, '(+84) 123 456 789', 'nguyen.l@example.com'),
(12, 2, 'Trần Thị M', 'Nhân viên phòng', 34000, '(+84) 234 567 890', 'tran.m@example.com'),
(13, 3, 'Lê Văn N', 'Quản lý', 50000, '(+84) 345 678 901', 'le.n@example.com'),
(14, 4, 'Phạm Thị O', 'Quản lý', 48000, '(+84) 456 789 012', 'pham.o@example.com'),
(15, 5, 'Hoàng Văn P', 'Nhân viên lễ tân', 30000, '(+84) 567 890 123', 'hoang.p@example.com'),
(16, 6, 'Trần Thị Q', 'Nhân viên lễ tân', 32000, '(+84) 678 901 234', 'tran.q@example.com'),
(17, 7, 'Nguyễn Văn R', 'Bảo vệ', 25000, '(+84) 789 012 345', 'nguyen.r@example.com'),
(18, 8, 'Lê Thị S', 'Bảo vệ', 24000, '(+84) 890 123 456', 'le.s@example.com'),
(19, 9, 'Phạm Văn T', 'Nhân viên phục vụ', 28000, '(+84) 901 234 567', 'pham.t@example.com'),
(20, 10, 'Hoàng Thị U', 'Nhân viên phục vụ', 27000, '(+84) 012 345 678', 'hoang.u@example.com'),
(21, 1, 'Nguyễn Văn V', 'Kế toán', 45000, '(+84) 123 456 789', 'nguyen.v@example.com'),
(22, 2, 'Trần Thị X', 'Kế toán', 43000, '(+84) 234 567 890', 'tran.x@example.com'),
(23, 3, 'Lê Văn Y', 'Nhân viên phòng', 35000, '(+84) 345 678 901', 'le.y@example.com'),
(24, 4, 'Phạm Thị Z', 'Nhân viên phòng', 34000, '(+84) 456 789 012', 'pham.z@example.com'),
(25, 5, 'Hoàng Văn A', 'Quản lý', 50000, '(+84) 567 890 123', 'hoang.a@example.com'),
(26, 6, 'Trần Thị B', 'Quản lý', 48000, '(+84) 678 901 234', 'tran.b@example.com'),
(27, 7, 'Nguyễn Văn C', 'Nhân viên lễ tân', 30000, '(+84) 789 012 345', 'nguyen.c@example.com'),
(28, 8, 'Lê Thị D', 'Nhân viên lễ tân', 32000, '(+84) 890 123 456', 'le.d@example.com'),
(29, 9, 'Phạm Văn E', 'Bảo vệ', 25000, '(+84) 901 234 567', 'pham.e@example.com'),
(30, 10, 'Hoàng Thị F', 'Bảo vệ', 24000, '(+84) 012 345 678', 'hoang.f@example.com'),
(31, 1, 'Nguyễn Văn G', 'Nhân viên phục vụ', 28000, '(+84) 123 456 789', 'nguyen.g@example.com'),
(32, 2, 'Trần Thị H', 'Nhân viên phục vụ', 27000, '(+84) 234 567 890', 'tran.h@example.com'),
(33, 3, 'Lê Văn I', 'Kế toán', 45000, '(+84) 345 678 901', 'le.i@example.com'),
(34, 4, 'Phạm Thị K', 'Kế toán', 43000, '(+84) 456 789 012', 'pham.k@example.com'),
(35, 5, 'Hoàng Văn L', 'Nhân viên phòng', 35000, '(+84) 567 890 123', 'hoang.l@example.com'),
(36, 6, 'Trần Thị M', 'Nhân viên phòng', 34000, '(+84) 678 901 234', 'tran.m@example.com'),
(37, 7, 'Nguyễn Văn N', 'Quản lý', 50000, '(+84) 789 012 345', 'nguyen.n@example.com'),
(38, 8, 'Lê Thị O', 'Quản lý', 48000, '(+84) 890 123 456', 'le.o@example.com'),
(39, 9, 'Phạm Văn P', 'Nhân viên lễ tân', 30000, '(+84) 901 234 567', 'pham.p@example.com'),
(40, 10, 'Hoàng Thị Q', 'Nhân viên lễ tân', 32000, '(+84) 012 345 678', 'hoang.q@example.com');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `syn_booking_services`
--

CREATE TABLE `syn_booking_services` (
  `ID` int NOT NULL,
  `BookingID` int NOT NULL,
  `ServiceID` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `syn_booking_services`
--

INSERT INTO `syn_booking_services` (`ID`, `BookingID`, `ServiceID`) VALUES
(1, 1, 4),
(2, 1, 8);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `ID` int NOT NULL,
  `FullName` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `UserName` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Password` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Permission` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`ID`, `FullName`, `UserName`, `Password`, `Permission`) VALUES
(1, 'ADMIN', 'admin', 'admin', 'ADMIN'),
(2, 'EMPLOYEE', 'employee', 'employee', 'EMPLOYEE'),
(4, 'Minh Hoàng', 'minhhoang', '123456', 'EMPLOYEE');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `booking_guests` (`GuestID`),
  ADD KEY `booking_rooms` (`RoomID`),
  ADD KEY `booking_users` (`UserID`);

--
-- Chỉ mục cho bảng `guests`
--
ALTER TABLE `guests`
  ADD PRIMARY KEY (`ID`);

--
-- Chỉ mục cho bảng `hotels`
--
ALTER TABLE `hotels`
  ADD PRIMARY KEY (`ID`);

--
-- Chỉ mục cho bảng `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `rooms_hotels` (`HotelID`),
  ADD KEY `rooms_roomtype` (`RoomTypeID`);

--
-- Chỉ mục cho bảng `roomtype`
--
ALTER TABLE `roomtype`
  ADD PRIMARY KEY (`ID`);

--
-- Chỉ mục cho bảng `services`
--
ALTER TABLE `services`
  ADD PRIMARY KEY (`ID`);

--
-- Chỉ mục cho bảng `staffs`
--
ALTER TABLE `staffs`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `staffs_staff` (`HotelID`);

--
-- Chỉ mục cho bảng `syn_booking_services`
--
ALTER TABLE `syn_booking_services`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `syn_booking_services_booking` (`BookingID`),
  ADD KEY `syn_booking_services_services` (`ServiceID`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `booking`
--
ALTER TABLE `booking`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT cho bảng `guests`
--
ALTER TABLE `guests`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT cho bảng `hotels`
--
ALTER TABLE `hotels`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `rooms`
--
ALTER TABLE `rooms`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT cho bảng `roomtype`
--
ALTER TABLE `roomtype`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `services`
--
ALTER TABLE `services`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `staffs`
--
ALTER TABLE `staffs`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT cho bảng `syn_booking_services`
--
ALTER TABLE `syn_booking_services`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `users`
--
ALTER TABLE `users`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `booking`
--
ALTER TABLE `booking`
  ADD CONSTRAINT `booking_guests` FOREIGN KEY (`GuestID`) REFERENCES `guests` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `booking_rooms` FOREIGN KEY (`RoomID`) REFERENCES `rooms` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `booking_users` FOREIGN KEY (`UserID`) REFERENCES `users` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Các ràng buộc cho bảng `rooms`
--
ALTER TABLE `rooms`
  ADD CONSTRAINT `rooms_hotels` FOREIGN KEY (`HotelID`) REFERENCES `hotels` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `rooms_roomtype` FOREIGN KEY (`RoomTypeID`) REFERENCES `roomtype` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Các ràng buộc cho bảng `staffs`
--
ALTER TABLE `staffs`
  ADD CONSTRAINT `staffs_staff` FOREIGN KEY (`HotelID`) REFERENCES `hotels` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Các ràng buộc cho bảng `syn_booking_services`
--
ALTER TABLE `syn_booking_services`
  ADD CONSTRAINT `syn_booking_services_booking` FOREIGN KEY (`BookingID`) REFERENCES `booking` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `syn_booking_services_services` FOREIGN KEY (`ServiceID`) REFERENCES `services` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
