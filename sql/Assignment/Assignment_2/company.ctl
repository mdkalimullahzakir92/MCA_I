load data
infile 'company.csv'
into table company
fields terminated by ','
optionally enclosed by '"'
(
        CNAME,CCITY,EMPNUMBER
)