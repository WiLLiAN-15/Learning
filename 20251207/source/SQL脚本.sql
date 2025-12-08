-- ------------------------------> DDL 数据库操作 <-------------------------------
-- 查询所有数据库
show databases ;

-- 创建数据库
create database db01;

-- 切换数据库
use db01;

-- 查询当前正在使用的数据库
select database();

-- 删除数据库
drop database db01;

-- 创建数据库并指定编码方式
CREATE DATABASE `LearningAGV` /*!40100 COLLATE 'utf8mb4_general_ci' */;

CREATE TABLE IF NOT EXISTS `agvinfo` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID，唯一标识',
  `eName` varchar(50) COLLATE utf8mb4_general_ci NOT NULL COMMENT '名称',
  `type` varchar(20) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '类型',
  `navType` tinytext COLLATE utf8mb4_general_ci NOT NULL COMMENT '导航类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='AGV信息表';

-- 插入数据
INSERT INTO `agvinfo` (`id`, `eName`, `type`, `navType`) VALUES
	(1, '1号', '600kg', '1'),
	(2, '2号', '1000kg', '2'),
	(3, '3号', '400kg', '1'),
	(4, '4号', '600kg', '1'),
	(5, '5号', '1000kg', '2');


CREATE TABLE IF NOT EXISTS `agvnavtype` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `navType` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='AGV导航类型数据字典\r\n';

-- 插入数据
INSERT INTO `agvnavtype` (`id`, `navType`) VALUES
	(1, 'QR'),
	(2, 'SLAM');
