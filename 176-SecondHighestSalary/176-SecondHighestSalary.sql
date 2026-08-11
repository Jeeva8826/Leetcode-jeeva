-- Last updated: 8/11/2026, 4:02:32 PM
SELECT MAX(salary) As SecondHighestSalary
FROM Employee
WHERE salary < (
    SELECT MAX(salary)
    FROM Employee
);