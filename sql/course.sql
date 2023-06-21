-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '课程名称',
  `user_id` int NOT NULL COMMENT '用户表外键',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_del` int NOT NULL DEFAULT '0' COMMENT '0-未删除 1-已删除',
  PRIMARY KEY (`id`),
  KEY `ix_course_is_del` (`is_del`),
  KEY `ix_course_user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of course
-- ----------------------------
BEGIN;
INSERT INTO `course` (`id`, `name`, `user_id`, `create_time`, `update_time`, `is_del`) VALUES (1, '数据结构与算法', 1, '2023-06-21 18:51:23', '2023-06-21 18:51:23', 0);
INSERT INTO `course` (`id`, `name`, `user_id`, `create_time`, `update_time`, `is_del`) VALUES (2, '数据库原理', 1, '2023-06-21 18:51:37', '2023-06-21 18:51:37', 0);
INSERT INTO `course` (`id`, `name`, `user_id`, `create_time`, `update_time`, `is_del`) VALUES (3, 'Web开发技术', 1, '2023-06-21 18:52:00', '2023-06-21 18:52:00', 0);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
