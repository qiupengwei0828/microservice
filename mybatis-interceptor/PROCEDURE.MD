存储过程--批量创 年表 tablealarmevent

```
CREATE DEFINER=`root`@`%` PROCEDURE `pro_year_tableCreate`(
)
BEGIN
DECLARE i INT;
DECLARE table_name VARCHAR(20);
SET i = 0;
#创建存储过程2000年-2020年相关的数据
WHILE 2000<i<2080 DO
#为了使表名成为xxx00这样的格式加的条件判断
SET table_name = CONCAT('tablealarmevent',i);
SET @csql = CONCAT(
'CREATE TABLE ',table_name,'(
   alarmeventid  VARCHAR(32),
   alarmeventname VARCHAR(100),
   alarmlevel INT4,
   alarmoccurtime VARCHAR(100)
PRIMARY KEY(alarmeventid)
)ENGINE=Innodb default charset=utf8;'
);
 
PREPARE create_stmt FROM @csql;
EXECUTE create_stmt;
SET i = i+1;
END WHILE;
 
END
```

