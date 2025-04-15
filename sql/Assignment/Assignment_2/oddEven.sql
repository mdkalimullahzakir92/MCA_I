declare
        num NUMBER(8):= &number;
        
Begin        
        if mod(num,2)=0 then 
                dbms_output.put_line('even number:  ');
        else
                dbms_output.put_line('odd number:  ');
        end if;
end;
/

