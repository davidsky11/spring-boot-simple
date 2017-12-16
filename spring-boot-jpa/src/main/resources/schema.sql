drop table if EXISTS article;
create table article (
  id int(10) NOT NULL AUTO_INCREMENT COMMENT '文章ID',
  tag varchar(30),
  title VARCHAR(40),
  author VARCHAR(10),
  content VARCHAR(500),
  thumbUp INT,
  reading INT,
  remark VARCHAR(100),
  PRIMARY KEY (id)
);


DROP TABLE IF EXISTS comment;
CREATE TABLE comment (
  id int(10) NOT NULL AUTO_INCREMENT,
  objectType varchar(32) NOT NULL,
  objectId int(10) NOT NULL,
  userId int(10) NOT NULL DEFAULT '0',
  content text NOT NULL,
  createdTime VARCHAR(20) NOT NULL,
  PRIMARY KEY (id)
);