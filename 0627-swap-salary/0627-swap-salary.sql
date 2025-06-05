-- SELECT id, name ,
-- (CASE WHEN sex='m' THEN 'f' ELSE 'm' END) AS  sex,salary 
-- FROM Salary;




UPDATE Salary
SET sex = CASE 
        WHEN sex = 'm' THEN 'f'
        ELSE 'm'
    END; 