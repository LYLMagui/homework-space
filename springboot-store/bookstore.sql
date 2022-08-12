/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : bookstore

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 11/08/2022 11:05:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for author
-- ----------------------------
DROP TABLE IF EXISTS `author`;
CREATE TABLE `author`  (
  `author_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '作者id',
  `author_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '作者姓名',
  `author_info` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '作者信息',
  `country` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '作者国籍',
  PRIMARY KEY (`author_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of author
-- ----------------------------
INSERT INTO `author` VALUES (1000, '米歇尔·维勒贝克', '米歇尔•维勒贝克，法国小说家、诗人、电影导演。凭借《基本粒子》崭露头角，销量在法国超过40万册，而《地图与疆域》使他斩获法国文学最高奖项——龚古尔文学奖。如今他已是世界最重要的作家之一，被誉为继加缪之后最重要的法国作家，也是最诚实质问生存意义的思想家。他的作品“独一无二地反映了时代精神”，被翻译成数十种语言于全球发行。', '法');
INSERT INTO `author` VALUES (1001, '蒂莫西·米切尔', '蒂莫西•米切尔（Timothy Mitchell，1955— ），在英国出生，相继在英、美接受教育， 普林斯顿大学政治学和近东研究博士，现为哥伦比亚大学中东、南亚和非洲研究系威廉• B. 兰斯福德教授，是一位有着广泛影响的政治理论家和历史学家。研究领域包括殖民主义在现代性形成中的地位，中东的物质和技术政治，以及经济学和其他形式的专业知识在集体生活管理中的作用。出版著作数种，被译为阿拉伯语、波斯语、希伯来语和土耳其语等多国语言出版，在中近东研究领域有着开创性贡献。', '英');

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books`  (
  `book_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '图书id',
  `book_title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '图书名',
  `book_info` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '图书简介',
  `book_image` longblob NULL COMMENT '图书封面',
  `author_id` int(0) NOT NULL COMMENT '图书作者id',
  `publication_date` date NOT NULL COMMENT '出版日期',
  `price` double(10, 2) NOT NULL COMMENT '图书价格',
  PRIMARY KEY (`book_id`, `author_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES (20000, '反抗世界，反抗人生', 'H.P·洛夫克拉夫特这位奇幻文学大师创作了《克苏鲁的呼唤》、《疯狂山脉》和《超越时间之影》等作品，他在当代读者群中掀起了一场真正的狂潮。和他笔下的恐怖故事一样，这是个奇怪的家伙。他生于港口城市，却对大海满怀恐惧。他是个骨子里的疏懒冷漠之徒（甚至连自己的正常体温都无法保持 ），敌视现代社会的一切价值，饱受连绵不断的噩梦折磨。他试图过上一种正常的生活，最后却以失败告终。\r\n\r\n本书作者维勒贝克在青年时代就读过洛夫克拉夫特的作品，他以独特的笔触书回顾了作家的写作，将洛夫克拉夫特尊称为“神话的奠基者”。这本书与其说是传记，倒不如说是两个意气相投的作家跨世纪的对话，是一份反抗世界，反抗人生的战斗宣言。', NULL, 1000, '2022-07-01', 58.00);
INSERT INTO `books` VALUES (20001, '再造国家', '中东研究领域的开创性著作\r\n\r\n深受福柯、德里达等人影响的当代经典\r\n\r\n影响遍及人文社会科学多个领域\r\n\r\n经由埃及，以全新视角看现代世界秩序\r\n\r\n关于规训，作者说出了福柯所未言的另一面现实\r\n\r\n--\r\n\r\n这部书并非是对英国殖民埃及的历史，而是对进行殖民的权力的研究。虽然聚焦于19 世纪后期发生在埃及的事件，它主要讨论的却是在对现代性进行评价时殖民主义的位置。殖民并不仅仅指确立欧洲的存在，也指一种政治秩序的扩散，这种秩序在社会世界（social world）中引入了一种新的空间概念、新的人格类型和新的制造现实经验的手段。《再造国家》（原书名Colonising Egypt）一书通过殖民计划的日常细节，在形而上学范畴内对殖民权力进行了剖析。\r\n\r\n——蒂莫西•米切尔\r\n\r\n全书理论阐发和细节描绘并重。作者化用海德格尔、福柯和德里达等人的学说，从军队重组、乡村建设、城市规划和学校教育等殖民工程入手，细致呈现了殖民权力渗透埃及社会的内在过程和逻辑，又通过对阿拉伯语读写特点的分析，揭示出语言、意义、权力和秩序的复杂纠葛。\r\n\r\n因作者创造性的视角，本书自出版以来，已有数个语种的译本问世，在人类学、历史学、法学、哲学、文化研究和艺术史等不同领域都有一定影响。', NULL, 1001, '2022-08-11', 68.00);

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `comment_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `user_id` int(0) NOT NULL COMMENT '评论人id',
  `book_id` int(0) NOT NULL COMMENT '图书id',
  `content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '评论内容',
  `comment_date` datetime(0) NOT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '评论日期',
  PRIMARY KEY (`comment_id`, `user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES (30000, 1000, 20000, '著名的维勒贝克对爱手艺大人的全面评论集，它简要、全面地给所有人安利了爱手艺大人，让超过于奇幻文学的受众了解这位克苏鲁宇宙创世之父的生平、精神、写作内核等。他强调爱手艺身上的“非文学性”，有些人并没读过小说，就十分想要去了解他如何构建世界。从每个大文本中，读者感受到的是“爱手艺”的感官敏锐性，维勒贝克把它类比为诗歌。更奇特的是，所有“爱手艺”的后辈作家们都致力于扩大、发展、充实他的宇宙，因此洛夫克拉夫特便成为了神话般的起源人物。当去了解洛夫克拉夫特这个人时，你还会发现这个人价值观与作品对立，矛盾又分裂，为人绅士却是十足的种族隔离者，也总是不让别人滥用“不可名状”这个词。而他所有的大文本中的人物大多性格怪异，与建筑、电影密切相关，这点更加与众不同，不管喜不喜欢克苏鲁，都是值得一读的小书。', '2022-08-11 11:01:09');
INSERT INTO `comment` VALUES (30001, 40001, 20001, '读过原版几遍，深受启发', '2022-08-11 11:04:46');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户昵称',
  `user_account` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户账号',
  `user_password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户密码',
  `user_image` longblob NULL COMMENT '用户头像',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (40000, '苏野', 'suye', '123456', NULL);
INSERT INTO `user` VALUES (40001, '鱼酱', 'yujiang', '123456', NULL);

SET FOREIGN_KEY_CHECKS = 1;
