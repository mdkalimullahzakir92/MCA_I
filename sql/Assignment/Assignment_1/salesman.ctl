load data 
infile 'salesman.csv'
into table salesman
fields terminated by ','
optionally enclosed by '"'
(
        SNUM,SNAME,CITY,COMMISSION
)