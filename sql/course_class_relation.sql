-- ----------------------------
-- Table structure for course_class_relation
-- ----------------------------
DROP TABLE IF EXISTS `course_class_relation`;
CREATE TABLE `course_class_relation` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `course_id` int NOT NULL DEFAULT '0' COMMENT '课程的id',
  `class_id` int NOT NULL DEFAULT '0' COMMENT '班级id',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_del` int NOT NULL DEFAULT '0' COMMENT '0-未删除 1-已删除',
  PRIMARY KEY (`id`),
  KEY `ix_course_class_relation_is_del` (`is_del`),
  KEY `ix_course_class_relation_course_id` (`course_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of course_class_relation
-- ----------------------------
BEGIN;
INSERT INTO `course_class_relation` (`id`, `course_id`, `class_id`, `create_time`, `update_time`, `is_del`) VALUES (1, 1, 1, '2023-06-25 11:33:07', '2023-06-25 11:33:07', 0);
INSERT INTO `course_class_relation` (`id`, `course_id`, `class_id`, `create_time`, `update_time`, `is_del`) VALUES (2, 1, 2, '2023-06-25 11:33:19', '2023-06-25 11:33:19', 0);
INSERT INTO `course_class_relation` (`id`, `course_id`, `class_id`, `create_time`, `update_time`, `is_del`) VALUES (3, 1, 3, '2023-06-25 11:33:31', '2023-06-25 11:33:31', 0);
INSERT INTO `course_class_relation` (`id`, `course_id`, `class_id`, `create_time`, `update_time`, `is_del`) VALUES (4, 2, 1, '2023-06-25 11:33:40', '2023-06-25 11:33:40', 0);
INSERT INTO `course_class_relation` (`id`, `course_id`, `class_id`, `create_time`, `update_time`, `is_del`) VALUES (5, 2, 2, '2023-06-25 11:40:25', '2023-06-25 11:40:25', 0);
INSERT INTO `course_class_relation` (`id`, `course_id`, `class_id`, `create_time`, `update_time`, `is_del`) VALUES (6, 2, 3, '2023-06-25 11:40:34', '2023-06-25 11:40:34', 0);
INSERT INTO `course_class_relation` (`id`, `course_id`, `class_id`, `create_time`, `update_time`, `is_del`) VALUES (7, 3, 4, '2023-06-25 11:40:40', '2023-06-25 11:40:40', 0);
INSERT INTO `course_class_relation` (`id`, `course_id`, `class_id`, `create_time`, `update_time`, `is_del`) VALUES (8, 3, 5, '2023-06-25 11:40:47', '2023-06-25 11:40:48', 0);
INSERT INTO `course_class_relation` (`id`, `course_id`, `class_id`, `create_time`, `update_time`, `is_del`) VALUES (9, 3, 6, '2023-06-25 11:40:59', '2023-06-25 11:40:59', 0);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
