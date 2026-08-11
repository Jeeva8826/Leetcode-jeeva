-- Last updated: 8/11/2026, 4:02:24 PM
# Write your MySQL query statement below
SELECT name AS Customers
from Customers
WHERE id NOT IN(
    SELECT customerId
    FROM Orders
);