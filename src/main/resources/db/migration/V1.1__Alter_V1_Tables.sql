-- V1.1__Alter_V1_Tables.sql

-- 메모테이블 수정
alter table memo
add updater varchar(255) not null default 'deepfree';