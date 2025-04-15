/*
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ACCOUNT_ID                                NOT NULL VARCHAR2(6)
 NAME                                               VARCHAR2(10)
 BAL                                                NUMBER(11,2)
*/
DECLARE
	--acct_bal account.bal%type;
	acct_bal number(11,2);
	acct_no varchar2(6);
	debit_amt number(5) := 2000;
	min_bal constant number(5,2):=500.00;
BEGIN
	acct_no := '&acct_no';
	select bal into acct_bal from account where ACCOUNT_ID= acct_no;
	acct_bal := acct_bal - debit_amt;
	IF acct_bal >= min_bal THEN
		update account set bal=bal-debit_amt WHERE account_id = acct_no;
	END IF;
END;
/




