# PL/SQL Stored Procedure Exercises

This repository contains stored procedures to simulate banking operations.

## Folder Structure

- `procedures/` - Contains stored procedures for interest processing, bonus updates, and fund transfers.
- `setup/` - Contains table creation and test data scripts.

## Procedures

1. **ProcessMonthlyInterest**: Applies 1% monthly interest to savings accounts.
2. **UpdateEmployeeBonus(dept_id, bonus_pct)**: Adds a bonus percentage to employees in the given department.
3. **TransferFunds(from_acct, to_acct, amount)**: Transfers funds between accounts, validating balance.

## How to Run

1. Execute `create_tables.sql` and `insert_sample_data.sql` from the `setup/` folder.
2. Run each stored procedure in the `procedures/` folder.
3. Optionally, test with `EXEC ProcedureName(...);`

---
