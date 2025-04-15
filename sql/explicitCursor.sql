/*
 EXPLICIT CURSOR EXAMPLE IN LAB BY TSB Sir
SQL> desc radiusValues;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 RADIUS                                             NUMBER(5,2)
 SNO                                       NOT NULL NUMBER(38)

 SQL> desc area;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 RADIUS                                             NUMBER(5,2)
 AREA                                               NUMBER(7,2)


*/

declare 
        pi constant number(7,3):= 3.14159;
        area number(14,2);
        cursor rad_cur is select * from radiusValues;
        rad_val rad_cur%rowtype;
begin
        open rad_cur;
        
        loop
                fetch rad_cur into rad_val; -- fetching 1 row at a time
                exit when rad_cur%notfound; -- exiting from loop if no record fetched
                area := pi * power(rad_val.radius, 2);
                insert into area values (rad_val.radius, area);
        end loop;
        close rad_cur;
end;
/