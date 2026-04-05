# Write your MySQL query statement below
select distinct num as ConsecutiveNums
from 
    (
        select num,
            lead(num, 1) over(order by id) as next_1,
            lead(num, 2) over(order by id) as next_2
        from logs
    ) as subquery
where num = next_1 and num = next_2;
