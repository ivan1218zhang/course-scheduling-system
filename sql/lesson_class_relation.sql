-- ----------------------------
-- Table structure for lesson_class_relation
-- ----------------------------
DROP TABLE IF EXISTS `lesson_class_relation`;
CREATE TABLE `lesson_class_relation` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `lesson_id` int NOT NULL DEFAULT '0' COMMENT '具体的课的id',
  `class_id` int NOT NULL DEFAULT '0' COMMENT '班级id',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_del` int NOT NULL DEFAULT '0' COMMENT '0-未删除 1-已删除',
  PRIMARY KEY (`id`),
  KEY `ix_lesson_class_relation_is_del` (`is_del`),
  KEY `ix_lesson_class_relation_class_id` (`class_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of lesson_class_relation
-- ----------------------------
BEGIN;
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
