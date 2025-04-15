declare
        a int:= 0;
        b int:= 1;
        c int;
        n int:= &how_many_times;
Begin
        DBMS_OUTPUT.PUT('Fibonacci sequence: ');
        dbms_output.put(' ' ||a || ' ' || b);
        for i in 1..n-2 loop
                c:=a+b;
                a:=b;
                b:=c;
                dbms_output.put(' ' ||c);
        end loop;
        DBMS_OUTPUT.NEW_LINE; -- To end the line after the loop
end;
/

