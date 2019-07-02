/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50643
 Source Host           : localhost:3306
 Source Schema         : my_api

 Target Server Type    : MySQL
 Target Server Version : 50643
 File Encoding         : 65001

 Date: 02/07/2019 17:26:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for api_group
-- ----------------------------
DROP TABLE IF EXISTS `api_group`;
CREATE TABLE `api_group`  (
  `id` char(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `host` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_time` datetime(0) NOT NULL,
  `create_user_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of api_group
-- ----------------------------
INSERT INTO `api_group` VALUES ('123', '223', 'http', '2019-05-31 10:12:43', 'fff');
INSERT INTO `api_group` VALUES ('321', '223s', 'http', '2019-05-28 10:13:05', 'eq');

-- ----------------------------
-- Table structure for api_info
-- ----------------------------
DROP TABLE IF EXISTS `api_info`;
CREATE TABLE `api_info`  (
  `id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `describe` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `param` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `param_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `create_user` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `api_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `is_effective` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of api_info
-- ----------------------------
INSERT INTO `api_info` VALUES ('assssdff', 'asdsadq21', 'adss', 'dsada', 'form', '2019-06-03 09:28:02', 'aaaa', '321', 0);
INSERT INTO `api_info` VALUES ('qweqe', 'w发生的说法', 'asd', 'asda', 'json', '2019-06-03 09:27:37', 'ssss', '123', 1);
INSERT INTO `api_info` VALUES ('wwee', 'sdfasfa', 'egdghgf', 'vzxc', 'json', '2019-05-28 09:28:23', 'dff', '123', 1);

-- ----------------------------
-- Table structure for api_result
-- ----------------------------
DROP TABLE IF EXISTS `api_result`;
CREATE TABLE `api_result`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `code` int(10) NULL DEFAULT NULL,
  `result` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `api_info_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of api_result
-- ----------------------------
INSERT INTO `api_result` VALUES ('a2324', 200, 'qqweqweqeqewrwerwqefsafasfweqa', 'wwee');

-- ----------------------------
-- Table structure for api_user
-- ----------------------------
DROP TABLE IF EXISTS `api_user`;
CREATE TABLE `api_user`  (
  `id` char(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of api_user
-- ----------------------------
INSERT INTO `api_user` VALUES ('123', 'admin', '123', '123@qq.com');
INSERT INTO `api_user` VALUES ('321', 'user', '321', 'asd@qq.com');
INSERT INTO `api_user` VALUES ('3345', '12312', 'ssss', '233@qq.com');

SET FOREIGN_KEY_CHECKS = 1;
