-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '班级名称',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_del` int NOT NULL DEFAULT '0' COMMENT '0-未删除 1-已删除',
  PRIMARY KEY (`id`),
  KEY `ix_class_is_del` (`is_del`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of class
-- ----------------------------
BEGIN;
INSERT INTO `class` (`id`, `name`, `create_time`, `update_time`, `is_del`) VALUES (1, '软件2001', '2023-06-21 16:07:43', '2023-06-21 16:07:43', 0);
INSERT INTO `class` (`id`, `name`, `create_time`, `update_time`, `is_del`) VALUES (2, '软件2002', '2023-06-21 16:07:49', '2023-06-21 16:07:49', 0);
INSERT INTO `class` (`id`, `name`, `create_time`, `update_time`, `is_del`) VALUES (3, '软件2003', '2023-06-21 16:07:56', '2023-06-21 16:07:56', 0);
INSERT INTO `class` (`id`, `name`, `create_time`, `update_time`, `is_del`) VALUES (4, '信安2001', '2023-06-21 16:08:07', '2023-06-21 16:08:07', 0);
INSERT INTO `class` (`id`, `name`, `create_time`, `update_time`, `is_del`) VALUES (5, '信安2002', '2023-06-21 16:08:21', '2023-06-21 16:08:21', 0);
INSERT INTO `class` (`id`, `name`, `create_time`, `update_time`, `is_del`) VALUES (6, '信安2003', '2023-06-21 16:08:28', '2023-06-21 16:08:28', 0);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
