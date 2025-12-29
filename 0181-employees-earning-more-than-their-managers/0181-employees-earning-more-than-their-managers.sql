Select e.name as Employee
From Employee e
Join Employee m On e.managerId = m.id
Where e.salary > m.salary
