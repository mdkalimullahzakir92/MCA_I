declare
        given_number NUMBER(8);
        num NUMBER(8);
        inverted_number NUMBER(8):=0 ;
Begin
        num := &number;
        given_number:= num ;
        while given_number != 0 loop
                inverted_number := inverted_number * 10 + mod(given_number , 10);
                given_number := floor(given_number/10);
        end loop;
        if num = inverted_number then
                dbms_output.put_line('Palindrome ');
        else
                dbms_output.put_line('Not Palindrome ');
        end if;
        dbms_output.put_line('number:  '|| num);
        dbms_output.put_line('inverted_number:  '|| inverted_number);
end;
/


