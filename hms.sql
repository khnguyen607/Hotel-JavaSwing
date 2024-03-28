-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: localhost:3306
-- Thời gian đã tạo: Th3 28, 2024 lúc 05:27 AM
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
  `TotalPrice` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `booking`
--

INSERT INTO `booking` (`ID`, `GuestID`, `RoomID`, `CheckIn`, `CheckOut`, `TotalPrice`) VALUES
(1, 6, 2, '2024-03-12', '2024-03-15', 10);

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
(6, 'Thủy Giang', '(+84) 949 848 645', 'khnguyen.job@gmail.com', 'VVip');

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
(1, 'Khách sạn 1', '53 Hải chiều', 2),
(2, 'Khách sạn 2', '101 Hải Hàn', 5),
(3, 'V6', '12 Hàng Bài', 5);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `rooms`
--

CREATE TABLE `rooms` (
  `ID` int NOT NULL,
  `NumberRoom` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `HotelID` int NOT NULL,
  `RoomTypeID` int NOT NULL,
  `Status` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `rooms`
--

INSERT INTO `rooms` (`ID`, `NumberRoom`, `HotelID`, `RoomTypeID`, `Status`) VALUES
(1, '603', 3, 1, 'Còn phòng'),
(2, '502', 1, 1, 'Còn phòng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `roomtype`
--

CREATE TABLE `roomtype` (
  `ID` int NOT NULL,
  `Name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Price` int NOT NULL,
  `Capicity` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `roomtype`
--

INSERT INTO `roomtype` (`ID`, `Name`, `Description`, `Price`, `Capicity`) VALUES
(1, 'Phòng master', 'Dành cho 4 người', 10000, 10);

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
(1, 3, 'Hoàng Tôn', 'Bảo vệ', 10000000, '(+84) 561 651 515', 'hoangton@gmail.com'),
(2, 1, 'Hải An', 'Nhân VIên', 1000000, '(+84) 651 615 616', 'haian@gmail.com');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`ID`);

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
-- Chỉ mục cho bảng `staffs`
--
ALTER TABLE `staffs`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `staffs_staff` (`HotelID`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `booking`
--
ALTER TABLE `booking`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `guests`
--
ALTER TABLE `guests`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT cho bảng `hotels`
--
ALTER TABLE `hotels`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `rooms`
--
ALTER TABLE `rooms`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `roomtype`
--
ALTER TABLE `roomtype`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `staffs`
--
ALTER TABLE `staffs`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Các ràng buộc cho các bảng đã đổ
--

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
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
