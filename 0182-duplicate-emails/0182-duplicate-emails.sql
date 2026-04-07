# Write your MySQL query statement bel
select email as Email
from Person
group by email
having count(email) > 1
order by id;