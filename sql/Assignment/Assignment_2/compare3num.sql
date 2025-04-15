declare
        num1 NUMBER(8);
        num2 NUMBER(8);
        num3 NUMBER(8);
Begin
        num1 := &number1;
        num2 := &number2;
        num3 := &number3;
        if num1 > num2 then
                if num1 > num3 then
                        dbms_output.put_line('greatest:  ' ||num1);
                else 
                        dbms_output.put_line('greatest:  ' ||num3);
                end if;
        else
                if num2 > num3 then
                        dbms_output.put_line('greatest:  ' ||num2);
                else 
                        dbms_output.put_line('greatest:  ' ||num3);
                end if;
        end if;
end;
/

