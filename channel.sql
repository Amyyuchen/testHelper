/*
Navicat SQLite Data Transfer

Source Server         : news
Source Server Version : 30706
Source Host           : :0

Target Server Type    : SQLite
Target Server Version : 30706
File Encoding         : 65001

Date: 2016-07-13 16:58:47
*/

PRAGMA foreign_keys = OFF;

-- ----------------------------
-- Table structure for "main"."channel"
-- ----------------------------
DROP TABLE "main"."channel";
CREATE TABLE channel ( _id char(10), title char(10),url char(200));

-- ----------------------------
-- Records of channel
-- ----------------------------
INSERT INTO "main"."channel" VALUES ('c1', '娱乐', 111);
INSERT INTO "main"."channel" VALUES ('c2', '体育', null);
