# Write your MySQL query statement below
select t.request_at as Day,
    round(
        sum(case when t.status != 'completed' then 1 else 0 end) / count(*),
        2
    ) as 'Cancellation Rate'
from Trips t
join Users c on t.client_id = c.users_id and c.banned = 'No'
join Users d on t.driver_id = d.users_id and d.banned = 'No'
where t.request_at between '2013-10-01' and '2013-10-03'
group by request_at;