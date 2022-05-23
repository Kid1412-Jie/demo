insert into `user`(user_name,age) values('unknown',33);
insert into `user`(user_name,age) values('unknown',34);
insert into `user`(user_name,age) values('hzj',33);
insert into `user`(user_name,age) values('kid',33);
insert into `user`(user_name,age) values('kid',33);

CREATE TABLE IF NOT EXISTS `USER2`
(
    `USER_ID`      INT(11)      NOT NULL AUTO_INCREMENT,
    `USER_NAME`    VARCHAR(100) NOT NULL COMMENT '用户姓名',
    `AGE`          INT(3)       NOT NULL COMMENT '年龄',
    `CREATED_TIME` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `CREATED_BY`   varchar(100) NOT NULL DEFAULT 'UNKNOWN',
    `UPDATED_TIME` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `UPDATED_BY`   varchar(100) NOT NULL DEFAULT 'UNKNOWN',
    PRIMARY KEY (`USER_ID`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

