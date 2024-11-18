# Write your MySQL query statement below
select distinct employee_id, department_id
from Employee 
where primary_flag = 'Y'
    or (primary_flag = 'N' and employee_id in (
        select employee_id
        from Employee
        group by employee_id
        having count(department_id) = 1
    ) and employee_id not in (
        select employee_id
        from Employee
        where primary_flag = 'Y'
    ));
