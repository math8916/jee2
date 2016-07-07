create table account(
accountNo number constraint account_pk primary key,
money number,
id varchar2(20),
constraint account_emeber_fk foreign key(id)
references member(id) on delete cascade
);



drop table account;
select * from ACCOUNT;
select * from member;

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

--Delete

delete from member
where id='you';

drop table account;
select * from member;

-----------------------------------------
create view account_member
as 
select * from MEMBER m,account a
where a.id=m.id;

select * from GRADE_MEMBER;