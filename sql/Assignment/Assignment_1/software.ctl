load DATA
infile 'software.csv'
into table software
FIELDS terminated by ','
OPTIONALLY ENCLOSED BY '"'
(
        PNAME,TITLE,DEVIN,SCOST,DCOST,SOLD
)