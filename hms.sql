-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th3 21, 2024 lúc 06:30 AM
-- Phiên bản máy phục vụ: 10.4.28-MariaDB
-- Phiên bản PHP: 8.2.4

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
-- Cấu trúc bảng cho bảng `blog`
--

CREATE TABLE `blog` (
  `id` int(11) NOT NULL,
  `title` varchar(100) NOT NULL,
  `type` varchar(50) NOT NULL,
  `subtitle` varchar(500) NOT NULL,
  `des` varchar(5000) NOT NULL,
  `time` varchar(50) NOT NULL,
  `img` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `blog`
--

INSERT INTO `blog` (`id`, `title`, `type`, `subtitle`, `des`, `time`, `img`) VALUES
(1, 'Chợ đêm ở Pattaya: Trải nghiệm no căng bụng với 1001 món ăn ', 'Ẩm thực', 'Pattaya - một trong những con phố sầm uất, không ngủ của Thái Lan, được ví như Sài Gòn về đêm với vô số những hàng quán, hoạt động. Con phố lên đèn cũng chính là lúc các khu chợ đêm ở đây “sống dậy”. Nếu bạn cũng là một trong những tín đồ ăn uống thì hãy xem ngay 1001 món ăn tại chợ đêm ở Pattaya này.', 'Khám phá chợ đêm ở Pattaya\r\nPattaya nổi tiếng với khung cảnh về đêm cực kỳ nhộn nhịp bởi rất nhiều hoạt động, như mua bán, hát hò, văn nghệ. Có lẽ vì vậy mà các khu chợ ở đây hầu hết đều mở cửa khá nhiều về đêm để phục vụ cho các hoạt động vui chơi và sinh hoạt của người dân nơi đây cũng như các khách du lịch\r\nGiống như các khu chợ đêm ở Việt Nam, chợ đêm ở Pattaya hầu hết là các quán ăn, cửa hàng bán quà lưu niệm để khách du lịch có thể trải nghiệm, khám phá các hoạt động văn hóa ẩm thực của người dân nơi đây.', '2023-10-29 11:32:10', 'https://ik.imagekit.io/tvlk/blog/2023/10/FUi7wZeC-Kham-pha-cho-dem-o-Pattaya.jpg?tr=dpr-2,w-675'),
(2, 'Safari World Bangkok: Trải nghiệm độc đáo cho cả gia đình bạn', 'Du lịch', 'Safari World Bangkok không chỉ là vườn thú lớn nhất Thái Lan, mà còn là điểm đến hấp dẫn của du khách khi đến Thái Lan vì phù hợp cho mọi lứa tuổi từ trẻ em đến người già. Hôm nay hãy cùng Traveloka khám phá Safari World Bangkok có gì đặc biệt, tại sao lại thu hút được nhiều người đến vậy.', 'Đặc điểm của Safari World Bangkok\r\nSafari World Bangkok là gì?\r\nSafari World Bangkok là công viên thú hoang dã lớn nhất ở Đông Nam Á. Đây là nơi sinh sống và bảo tồn của nhiều loài động thực vật đa dạng, đặc biệt là các loài động vật trong sách đỏ.\r\nSafari World Bangkok mở cửa từ năm 1988 và được chia thành hai khu vực khác nhau, đó là Safari Park và Marine Park. Đến đây, bạn sẽ có cơ hội ngắm nhìn các loài động vật hoang dã như hươu linh dương sừng xoắn, cao cổ, bò tót và tê giác. Ngoài ra còn được thưởng thức các chương trình giải trí thú vị như Bird show, Cowboy Show, show cá heo và nhiều chương trình khác.\r\n\r\nCách đi đến Safari World Bangkok\r\nSafari World Bangkok nằm cách trung tâm thành phố Bangkok khoảng 30km và có địa chỉ là 99 đường Samwatawantok, quận Klongsamwa. Để đến đây, bạn có thể đi bằng các phương tiện sau:', '2023-10-29 11:32:56', 'https://ik.imagekit.io/tvlk/blog/2023/10/kD8vFttD-safari-world-bangkok-6-1024x576.jpg?tr=dpr-2,w-675'),
(3, 'The Cap Hotel review: Đánh giá khách sạn mới tại Vũng Tàu', 'Review khách sạn', 'Vũng Tàu được biết đến với nhiều địa điểm vui chơi giải trí hấp dẫn. Nếu như bạn đang lên kế hoạch khám phá thành phố này thì bên cạnh việc sẽ ghé thăm những đâu thì ở việc lưu trú ở đâu cũng hết sức quan trọng. Trong rất nhiều khách sạn ở Vũng Tàu thì The Cap Hotel là nơi được nhiều du khách đánh giá cao, hãy cùng tìm hiểu thêm các thông tin về The Cap Hotel review nhé!', 'Để đến The Cap Hotel từ trung tâm thành phố Bà Rịa các bạn di chuyển trên tuyến đường Nguyễn Tất Thành hướng về Ngã sáu Bà Dụng. Sau đó rẽ phải vào đường Trường Chinh/QL55 rồi đến QL51, tiếp theo rẽ vào đường Nguyễn An Ninh rồi rẽ phải vào đường Thi Sách. Thông tin The Cap Hotel review của nhiều người về hành trình đến khách sạn chỉ khoảng 30 phút đi ô tô và đường khá đẹp.\r\n\r\nCác loại phòng ở tại khách sạn The Cap Hotel review\r\nMột trong những điều mà các du khách quan tâm nhất khi tìm hiểu về khách sạn này đó là thông tin The Cap Hotel review các loại phòng ở.\r\n\r\nSuperior Double City View\r\n', '2023-10-29 11:34:01', 'https://ik.imagekit.io/tvlk/blog/2023/09/the-cap-hotel-1.jpg?tr=dpr-2,w-675');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `blog`
--
ALTER TABLE `blog`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `blog`
--
ALTER TABLE `blog`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
