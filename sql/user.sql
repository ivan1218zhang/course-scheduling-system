-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `teacher_id` varchar(20) NOT NULL DEFAULT '' COMMENT '教师号',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '教师名字',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '教师账号密码',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_del` int NOT NULL DEFAULT '0' COMMENT '0-未删除 1-已删除',
  PRIMARY KEY (`id`),
  KEY `ix_user_teacher_id_password` (`teacher_id`,`password`) USING BTREE,
  KEY `ix_user_is_del` (`is_del`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` (`id`, `teacher_id`, `name`, `password`, `create_time`, `update_time`, `is_del`) VALUES (1, '3200608016', '张依凡', 'OUU4ODkwQzgwMjNFQzY1REVFNjNGRjQwNUYzMUExQjg=', '2023-06-21 16:35:39', '2023-06-21 16:35:39', 0);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
