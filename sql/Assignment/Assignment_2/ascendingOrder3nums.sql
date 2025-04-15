DECLARE
    num1 NUMBER := &num1;
    num2 NUMBER := &num2;
    num3 NUMBER := &num3;
BEGIN
    DBMS_OUTPUT.PUT_LINE('The numbers in ascending order are:');
    if num1<=num2 and num1<= num3 THEN
        DBMS_OUTPUT.PUT(num1 || ' ');
        if num2<=num3 THEN   
            DBMS_OUTPUT.PUT(num2 || ' '|| num3);
        ELSE    
            DBMS_OUTPUT.PUT(num3 || ' '|| num2);
        end if;
    elsif num2<=num1 and num2<=num3 THEN
        DBMS_OUTPUT.PUT(num2 || ' ');
        if num1<=num3 THEN
            DBMS_OUTPUT.PUT(num1 || ' '|| num3);
        else
            DBMS_OUTPUT.PUT(num3 || ' '|| num1);
        end if;
    else
        DBMS_OUTPUT.PUT(num3 || ' ');
        if num1<=num2 THEN  
            DBMS_OUTPUT.PUT(num1 || ' '|| num2);
        else    
            DBMS_OUTPUT.PUT(num2 || ' '|| num1);
        end if;
    end if;
    DBMS_OUTPUT.NEW_LINE;
END;
/