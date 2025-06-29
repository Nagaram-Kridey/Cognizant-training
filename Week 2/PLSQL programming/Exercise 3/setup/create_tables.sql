CREATE TABLE Accounts (
  AccountID NUMBER PRIMARY KEY,
  Balance NUMBER,
  AccountType VARCHAR2(20)
);

CREATE TABLE Employees (
  EmployeeID NUMBER PRIMARY KEY,
  DepartmentID NUMBER,
  Salary NUMBER
);