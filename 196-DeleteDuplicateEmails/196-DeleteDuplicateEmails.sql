-- Last updated: 8/11/2026, 4:02:16 PM
# Write your MySQL query statement below
DELETE p1
FROM Person p1, Person p2
WHERE p1.email = p2.email
AND p1.id > p2.id;