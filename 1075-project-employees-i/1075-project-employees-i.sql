# Write your MySQL query statement below
select p.project_id,ROUND(avg(e.experience_years),2) AS average_years
From Project P
left join Employee e
ON p.employee_id = e.employee_id
Group by p.project_id