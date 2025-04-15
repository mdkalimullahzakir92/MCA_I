declare
        pi constant number(4,2) :=3.14;
        radius NUMBER(8,2) := &r;
        perimeter NUMBER(8,2);
        area NUMBER(8,2);
Begin
        area := pi * power(radius, 2);
        perimeter := 2*pi*radius;
        dbms_output.put_line ('area:  ' ||area);
        dbms_output.put_line ('perimeter:  ' ||perimeter);
end;
/

