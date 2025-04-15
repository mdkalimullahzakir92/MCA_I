DECLARE
        pi constant number(4,2) := 3.14;
        radius number(5);
        area number(14,2);
BEGIN
        radius := 3;
        WHILE radius <= 7
        LOOP
                --area := pi * radius ** 2;
                area := pi * power(radius,2);
                INSERT INTO areas VALUES (radius, area);
                radius := radius + 1;
        END LOOP;
END;
/