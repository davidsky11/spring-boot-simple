drop table if EXISTS person;
create table person (
  id int(10) NOT NULL AUTO_INCREMENT COMMENT '文章ID',
  name varchar(30),
  age VARCHAR(40),
  sex VARCHAR(10),
  nation VARCHAR(500),
  address VARCHAR(80),
  PRIMARY KEY (id)
);
