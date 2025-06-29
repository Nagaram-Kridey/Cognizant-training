CREATE OR REPLACE PROCEDURE TransferFunds (
  from_acct IN NUMBER,
  to_acct IN NUMBER,
  amount IN NUMBER
) IS
  insufficient_balance EXCEPTION;
BEGIN
  DECLARE
    from_balance NUMBER;
  BEGIN
    SELECT Balance INTO from_balance FROM Accounts WHERE AccountID = from_acct;

    IF from_balance < amount THEN
      RAISE insufficient_balance;
    END IF;

    -- Deduct from source
    UPDATE Accounts SET Balance = Balance - amount WHERE AccountID = from_acct;

    -- Add to destination
    UPDATE Accounts SET Balance = Balance + amount WHERE AccountID = to_acct;

    COMMIT;
  END;

EXCEPTION
  WHEN insufficient_balance THEN
    DBMS_OUTPUT.PUT_LINE('Insufficient funds in source account.');
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/