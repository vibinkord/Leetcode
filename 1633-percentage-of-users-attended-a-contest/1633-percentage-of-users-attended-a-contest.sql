# Write your MySQL query statement below
select r.contest_id,ROUND(COUNT(DISTINCT r.user_id)*100/total.total_users,2) AS percentage
from Register r
cross join (
    select count(*) as total_users from Users
)total
group by r.contest_id
ORDER BY percentage DESC,r.contest_id asc