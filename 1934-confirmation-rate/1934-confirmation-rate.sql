# Write your MySQL query statement below
select u.user_id,ROUND( 
    AVG(case    
        when c.action='confirmed' then 1
        else 0
        END)
        ,2)

        AS confirmation_rate from Signups u
left join Confirmations c
on u.user_id=c.user_id

group by u.user_id 
