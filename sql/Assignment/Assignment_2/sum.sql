declare
        summmation NUMBER(8) :=0; -- sum() is a defined function
Begin
        --num := 10;
        for i in 1..10 loop 
                summmation := summmation+i;
        end loop;
        dbms_output.put_line ('sum:  ' ||summmation);
end;
/

