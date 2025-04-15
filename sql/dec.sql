declare
      supplierid number;
      name varchar2(10);
      address varchar2(10);
      --phone varchar2(10);
BEGIN
      DBMS_OUTPUT.PUT_LINE('Enter value for c supplier_id: ');
      ACCEPT supplierid INTO :supplierid;
      DBMS_OUTPUT.PUT_LINE('Enter value for c supplier_NAME: ');
      ACCEPT name INTO :name;
      DBMS_OUTPUT.PUT_LINE('Enter value for c supplier_add: ');
      ACCEPT address INTO :address ;
      --DBMS_OUTPUT.PUT_LINE('Enter value for c supplier_phone: ');
     -- ACCEPT phone INTO :phone ;
 
      insert into supplier (supplierid, name, ADDRESS) values (:supplierid, :name, :address);
      commit;
      DBMS_OUTPUT.PUT_LINE('Data inserted successfully!');
   end;
   /