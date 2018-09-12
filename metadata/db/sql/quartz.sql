CREATE TABLE `cron_table` (
 `id` varchar(11) collate utf8_bin NOT NULL,
 `user_id` varchar(11) collate utf8_bin default NULL,
 `cron` varchar(255) collate utf8_bin default NULL,
 `quarz_name` varchar(255) collate utf8_bin default NULL,
 `scheduler_class` varchar(255) collate utf8_bin default NULL,
 `time` datetime default NULL,
 PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ----------------------------
-- Records of cron_table
-- ----------------------------
INSERT INTO `cron_table` VALUES ('1', 'AAA', '0/5 * * * * ?', '用户AAA', 'com.example.dynamicquartz.job.SmsTask', '2018-09-06 20:26:55');
INSERT INTO `cron_table` VALUES ('2', 'BBB', '0/2 * * * * ?', '用户BBB', 'com.example.dynamicquartz.job.EmailTask', '2018-09-09 21:02:08');