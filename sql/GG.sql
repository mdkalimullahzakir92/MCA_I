declare
	--i number;
	supplierid number;
	name varchar2(10);
	address varchar(10);
BEGIN
	--FOR i IN 1..2 LOOP
		DBMS_OUTPUT.PUT_LINE('Enter customer name: ');
		
		insert into supplier values (&supplierid, '&name', '&address');
		
	--END LOOP;
	
	--select * from supplier;
  
      	DBMS_OUTPUT.PUT_LINE('Data inserted successfully!');
   end;
   /