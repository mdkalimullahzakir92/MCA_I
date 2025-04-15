set SERVEROUTPUT ON;

DECLARE
        N NUMBER(10);

        FLAG INT:= 0;
        I INT:= 2;
BEGIN
        n := &num;
        while (i<= sqrt(n)) Loop 
                if mod(n,i) = 0 then
                        flag:=1; 
                        dbms_output.put_line(n || ' is not prime.');
                        exit;
                end if;
                i:= I+1;
        end loop; 
        if flag =0     then
                dbms_output.put_line(n || ' is prime.');

        end if;

END;
/