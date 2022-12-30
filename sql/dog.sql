/*
 Navicat Premium Data Transfer

 Source Server         : pgsql_Local_docker
 Source Server Type    : PostgreSQL
 Source Server Version : 120009
 Source Host           : localhost:5432
 Source Catalog        : dog
 Source Schema         : animal

 Target Server Type    : PostgreSQL
 Target Server Version : 120009
 File Encoding         : 65001

 Date: 19/09/2022 16:28:22
*/


-- ----------------------------
-- Table structure for dog
-- ----------------------------
DROP TABLE IF EXISTS "animal"."dog";
CREATE TABLE "animal"."dog" (
  "id" varchar(255) COLLATE "pg_catalog"."default" NOT NULL,
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "birth" timestamp(6),
  "age" int4,
  "color" varchar(200) COLLATE "pg_catalog"."default",
  "variety" varchar(200) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "animal"."dog"."id" IS '主键';
COMMENT ON COLUMN "animal"."dog"."name" IS '名称';
COMMENT ON COLUMN "animal"."dog"."birth" IS '生日';
COMMENT ON COLUMN "animal"."dog"."age" IS '年龄';
COMMENT ON COLUMN "animal"."dog"."color" IS '毛发颜色';
COMMENT ON COLUMN "animal"."dog"."variety" IS '品种';

-- ----------------------------
-- Records of dog
-- ----------------------------
INSERT INTO "animal"."dog" VALUES ('0001', '小白', '2021-01-02 14:27:52', 2, '白色', '中环田园犬');

-- ----------------------------
-- Primary Key structure for table dog
-- ----------------------------
ALTER TABLE "animal"."dog" ADD CONSTRAINT "dog_pkey" PRIMARY KEY ("id");
