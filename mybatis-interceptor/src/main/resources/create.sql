---用户表
CREATE TABLE   USER (
 pkid VARCHAR(32) NOT NULL,
 name VARCHAR(100),
 password VARCHAR(100),
 phone VARCHAR(100)
 );
---预警表
CREATE TABLE  tablealarmevent(
   alarmeventid  VARCHAR(32),
   alarmeventname VARCHAR(100),
   alarmlevel INT4,
   alarmoccurtime VARCHAR(100)
 );
 