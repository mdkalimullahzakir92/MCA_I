load data
infile 'orders.csv'
into table orders
fields terminated by ','
optionally enclosed by '"'
(
        ONUM,AMOUNT,ODATE,CNUM,SNUM
)