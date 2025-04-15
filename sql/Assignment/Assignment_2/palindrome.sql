declare
        given_number varchar(10) := '1789871';
        inverted_number varchar(10) ;
        str_len int;
Begin
        str_len := length(given_number);
        for i in reverse 1..str_len             -- i need not to be declared 
        loop
                inverted_number := inverted_number || substr(given_number, i, 1);  --(string, start_position, length) string position starts from 1
        end loop;
        if (given_number = inverted_number) then
                dbms_output.put_line('Palindrome ');
        else
                dbms_output.put_line('Not Palindrome ');
        end if;
        
end;
/


