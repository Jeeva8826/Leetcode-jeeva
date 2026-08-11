-- Last updated: 8/11/2026, 4:00:31 PM
# Write your MySQL query statement below
SELECT m.name
FROM Employee e
JOIN Employee m
ON e.managerId = m.id
GROUP BY m.id, m.name
HAVING COUNT(*) >= 5;