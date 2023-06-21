-- ----------------------------
-- Table structure for classroom
-- ----------------------------
DROP TABLE IF EXISTS `classroom`;
CREATE TABLE `classroom` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '教室名称',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_del` int NOT NULL DEFAULT '0' COMMENT '0-未删除 1-已删除',
  PRIMARY KEY (`id`),
  KEY ` ix_classroom_is_del` (`is_del`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of classroom
-- ----------------------------
BEGIN;
INSERT INTO `classroom` (`id`, `name`, `create_time`, `update_time`, `is_del`) VALUES (1, '三山楼101', '2023-06-21 15:45:21', '2023-06-21 15:45:26', 0);
INSERT INTO `classroom` (`id`, `name`, `create_time`, `update_time`, `is_del`) VALUES (2, '三山楼102', '2023-06-21 15:45:34', '2023-06-21 15:45:34', 0);
INSERT INTO `classroom` (`id`, `name`, `create_time`, `update_time`, `is_del`) VALUES (3, '三山楼103', '2023-06-21 15:45:40', '2023-06-21 15:45:40', 0);
INSERT INTO `classroom` (`id`, `name`, `create_time`, `update_time`, `is_del`) VALUES (4, '三山楼201', '2023-06-21 15:45:50', '2023-06-21 15:45:50', 0);
INSERT INTO `classroom` (`id`, `name`, `create_time`, `update_time`, `is_del`) VALUES (5, '三山楼202', '2023-06-21 15:45:58', '2023-06-21 15:45:58', 0);
INSERT INTO `classroom` (`id`, `name`, `create_time`, `update_time`, `is_del`) VALUES (6, '三江楼101', '2023-06-21 15:46:42', '2023-06-21 15:46:42', 0);
INSERT INTO `classroom` (`id`, `name`, `create_time`, `update_time`, `is_del`) VALUES (7, '三江楼102', '2023-06-21 15:46:51', '2023-06-21 15:46:51', 0);
INSERT INTO `classroom` (`id`, `name`, `create_time`, `update_time`, `is_del`) VALUES (8, '三江楼201', '2023-06-21 15:46:59', '2023-06-21 15:46:59', 0);
INSERT INTO `classroom` (`id`, `name`, `create_time`, `update_time`, `is_del`) VALUES (9, '三江楼202', '2023-06-21 15:47:06', '2023-06-21 15:47:06', 0);
INSERT INTO `classroom` (`id`, `name`, `create_time`, `update_time`, `is_del`) VALUES (10, '三江楼203', '2023-06-21 15:47:14', '2023-06-21 15:47:14', 0);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
