use tlias;
select * from emp order by update_time limit 2, 3;
select * from emp order by update_time;

insert into dept_log(create_time, description) values('2020-01-01 07:04:02', '删除记录')