# Write your MySQL query statement below
with GroupedData as
    (select id, visit_date, people,
        id - row_number() over(order by id) as id_group
    from Stadium
    where people >= 100),
ConsecutiveCounts as
    (select *,
    count(*) over(partition by id_group) as group_len
    from GroupedData)

select id, visit_date, people
from ConsecutiveCounts
where group_len >= 3
order by visit_date;