load data
infile 'emp.csv'
into table emp
fields terminated by ','
optionally enclosed by '"'
(
        ename,ecity,salary,enumber,eaddress,depttname
)