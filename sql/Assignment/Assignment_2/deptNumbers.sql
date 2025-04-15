declare
        dept_name emp.depttname%type;
        cursor dept_names is select depttname from emp;
        
Begin        
                                -- dbms_output.put_line(dept_name||'       d       eptno is 1');
        open dept_names;
        loop
        fetch dept_names into dept_name;
                case dept_name
                        when 'IT' then
                                dbms_output.put_line(dept_name||'  deptno is 1');
                        when 'HR' then        
                                dbms_output.put_line(dept_name||'  deptno is 2');
                        else
                                dbms_output.put_line(dept_name||'   deptno is 3');
                end case;
                -- case 
                --         when dept_name='IT' then
                --                 dbms_output.put_line(dept_name||'       deptno is 1');
                --         when dept_name='HR' then        
                --                 dbms_output.put_line(dept_name||'       deptno is 2');
                --         else
                --                 dbms_output.put_line(dept_name||'       deptno is 3');
                -- end case;

                exit when dept_names%notfound;
        end loop;
        close dept_names; 
        
end;
/

