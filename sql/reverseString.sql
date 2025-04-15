DECLARE
        given_number  varchar(5) := '5639';
        inverted_number varchar(5) ;
        str_len number(2);
BEGIN
        str_len := length(given_number);
        FOR i IN REVERSE 1..str_len
        LOOP
                inverted_number := inverted_number || 
                SUBSTR(given_number, i, 1);
        END LOOP;
        dbms_output.put_line('Given Number is ' || given_number);
        dbms_output.put_line('Inverted Number is ' || inverted_number);
END;
/


