/*
 Navicat Premium Data Transfer

 Source Server         : Local_Mysql_安装
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : bootdemo

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 19/09/2022 16:28:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '姓名',
  `birth` datetime NULL DEFAULT NULL COMMENT '生日',
  `age` int NULL DEFAULT NULL COMMENT '年龄',
  `hobby` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '爱好',
  `description` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '张三', '2000-01-01 15:18:42', 22, '吃', '123456');
INSERT INTO `student` VALUES (2, '李四', '2002-01-01 15:46:27', 20, '打球', '777777777777');
INSERT INTO `student` VALUES (3, '王五', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (4, '赵六', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (5, '钱七', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (6, '张三01', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (7, '张三02', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (8, '张三03', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (9, '张三04', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (10, '张三05', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (11, '张三06', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (12, '张三07', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (13, '张三08', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (14, '张三09', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (15, '张三10', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (16, '张三11', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (17, '张三12', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (18, '张三13', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (19, '张三14', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (20, '张三15', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (21, '张三16', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (22, '张三17', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (23, '张三18', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (24, '张三19', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (25, '张三20', NULL, 18, '打球', '777777777777');
INSERT INTO `student` VALUES (26, '张三21', NULL, 18, '打球', '777777777777');

SET FOREIGN_KEY_CHECKS = 1;
