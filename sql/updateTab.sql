declare 
    add varchar2(10) := '&address';
    r int := &roll_no;
begin
    -- update student set address='Goa', roll=111 where name = 'Pinku';
    update student set address=add, roll=r where name = 'Pinku';
    
end;
/