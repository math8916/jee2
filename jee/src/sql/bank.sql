create table member(
id varchar2(20) primary key,
pw varchar2(20),
name varchar2(20),
reg varchar2(20),
ssn varchar2(10)

);

-- Create
insert into member(id,pw,name,reg,ssn)
values('lee','1','이순신','7월1일','700814-1');
insert into member(id,pw,name,reg,ssn)
values('Hong','1','홍길동','7월2일','720814-1');
insert into member(id,pw,name,reg,ssn)
values('you','2','유관순','7월33일','720814-2');

-- READ
select * from member
where id='lee';
;

-- UPDATE
update member set pw='9999'
where id='you';

--Delete

delete from member
where id='you';

drop table account;
select * from member;