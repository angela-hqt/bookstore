SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `book`
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `bid` char(32) NOT NULL,
  `bname` varchar(100) DEFAULT NULL,
  `price` decimal(5,1) DEFAULT NULL,
  `author` varchar(20) DEFAULT NULL,
  `image` varchar(200) DEFAULT NULL,
  `cid` char(32) DEFAULT NULL,
  PRIMARY KEY (`bid`),
  KEY `cid` (`cid`),
  CONSTRAINT `book_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `category` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', 'Java编程思想（第3版）', '76.5', '布鲁斯·艾克儿', 'book_img/9317290-1_l.jpg', '1');
INSERT INTO `book` VALUES ('2', 'Java核心技术卷1', '68.5', 'qdmmy6', 'book_img/20285763-1_l.jpg', '1');
INSERT INTO `book` VALUES ('3', 'Java就业培训教程', '39.9', '张孝祥', 'book_img/8758723-1_l.jpg', '1');
INSERT INTO `book` VALUES ('4', 'Head First java', '47.5', '（美）塞若', 'book_img/9265169-1_l.jpg', '1');
INSERT INTO `book` VALUES ('5', 'JavaWeb开发详解', '83.3', '孙鑫', 'book_img/22788412-1_l.jpg', '2');
INSERT INTO `book` VALUES ('6', 'Struts2深入详解', '63.2', '孙鑫', 'book_img/20385925-1_l.jpg', '2');
INSERT INTO `book` VALUES ('7', '精通Hibernate', '30.0', '孙卫琴', 'book_img/8991366-1_l.jpg', '2');
INSERT INTO `book` VALUES ('8', '精通Spring2.x', '63.2', '陈华雄', 'book_img/20029394-1_l.jpg', '3');
INSERT INTO `book` VALUES ('9', 'Javascript权威指南', '93.6', '（美）弗兰纳根', 'book_img/22722790-1_l.jpg', '3');

-- ----------------------------
-- Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `cid` char(32) NOT NULL,
  `cname` varchar(100) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', 'JavaSE');
INSERT INTO `category` VALUES ('2', 'JavaEE');
INSERT INTO `category` VALUES ('3', 'Javascript');

-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `uid` char(32) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

