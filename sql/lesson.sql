-- ----------------------------
-- Table structure for lesson
-- ----------------------------
DROP TABLE IF EXISTS `lesson`;
CREATE TABLE `lesson` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `course_id` int NOT NULL DEFAULT '0' COMMENT '课程id',
  `classroom_id` int NOT NULL DEFAULT '0' COMMENT '教室id',
  `time` varchar(10) NOT NULL DEFAULT '' COMMENT '上课时间 x-y 星期x第y节课',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_del` int NOT NULL DEFAULT '0' COMMENT '0-未删除 1-已删除',
  PRIMARY KEY (`id`),
  KEY `ix_lesson_course_id` (`course_id`),
  KEY `ix_lesson_classroom_id` (`classroom_id`),
  KEY `ix_lesson_is_del` (`is_del`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of lesson
-- ----------------------------
BEGIN;
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
