create sequence seq
increment by 1
start with 1000
nocycle;

drop table grade;

create table grade(
seq number constraint grade_pk primary key,
grade varchar2(1),
jave number,
sql number,
html number,
javascript number,
id varchar2(20),
constraint grade_emeber_fk foreign key(id)
references member(id) on delete cascade
);

alter table grade add exam_date varchar2(10);


insert into grade(
seq,grade,jave,sql,html,javascript,id,exam_date
)values(
seq.nextval,'A',90,99,99,98,'choi','2016-05'
);

select * from GRADE;
-- find by pk
select * from grade where seq='1001';
-- find by id
select * from grade where id='Hong';

select count(*) from grade; 
--update

update grade set exam_date ='2016-05'
where seq = 1001;

--delete
delete from grade where seq ='1001';