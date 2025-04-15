load DATA
infile 'studies.csv'
into table studies
fields terminated by ','

TRAILING NULLCOLS
(
        PNAME,SPLACE,COURSE,CCOST
)