insert into article (id, tag, title, author, content, thumbUp, reading, remark)
    values(1, 'doc', 'Spring Boot入门', '凯文', 'JavaEE开发的颠覆者 Spring Boot', 8, 108, '入门');
insert into article (id, tag, title, author, content, thumbUp, reading, remark)
    values(2, 'doc', 'Spring Ad', '凯文', 'Spring广告一波', 118, 2108, '广告');
INSERT INTO article (id, tag, title, author, content, thumbUp, reading, remark)
    values (3, 'doc', 'Spring Cloud入门', '凯文', 'Spring Cloud全家桶', 18, 2108, '实战');

INSERT INTO comment
    values (1, 'article', 1, 1, '测试评论', '2017-12-16 18:18:00');