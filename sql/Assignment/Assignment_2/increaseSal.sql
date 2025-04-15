set serveroutput on;
declare
        avgsal NUMBER(10,2);
        sal NUMBER(10,2);
Begin        
        select avg(salary) into avgsal from emp;
        dbms_output.put_line('average salary :  '|| avgsal );
        if avgsal<10000 then
                update emp set salary=salary+10000 ;
        end if;
end;
/