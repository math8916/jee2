create table member(
id varchar2(20) primary key,
pw varchar2(20),
name varchar2(20),
reg varchar2(20),
ssn varchar2(10),
email varchar2(20),
profile_img varchar2(100)

);
alter table member add profile_img varchar2(100);
-- Create
insert into member(id,pw,name,reg,ssn)
values('lee','1','이순신','7월1일','700814-1','lee@email');
insert into member(id,pw,name,reg,ssn)
values('Hong12','3','홍길동','7월12일','780814-1');
insert into member(id,pw,name,reg,ssn)
values('you','2','유관순','7월33일','720814-2');

-- READ 
select * from member;  -- list
select * from member where id='lee'; -- findbyPK
select * from member where name='이순신'; -- findbyNotPK
select count(*) as account from member; -- count
;

-- UPDATE
update member set pw='9999'
where id='you';
update member set profile_img=id||'.jpg';
update MEMBER set reg='2015-07-21' where id ='Hong12'; 
--Delete

delete from member where set id='Hong';
where id='you';

drop table account;
select * from member;