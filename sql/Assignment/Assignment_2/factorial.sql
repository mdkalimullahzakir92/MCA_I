declare
        num int;
        fact int:= 1;
Begin
        num := &number;
        for i in 2..num loop -- iterate from 2 to num both including
                fact := fact * i;
        end loop;
        dbms_output.put_line('fact:  ' ||fact);
end;
/

