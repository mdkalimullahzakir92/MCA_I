load data
infile 'customers.csv'
into table customers
fields terminated by ','
optionally enclosed by '"'
(
        CNUM,CNAME,CITY,RATING,SNUM
)