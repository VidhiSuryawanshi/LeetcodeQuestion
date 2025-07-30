SELECT DISTINCT L1.num AS ConsecutiveNums 
FROM Logs AS L1
JOIN Logs AS L2 ON L1.id = L2.id-1
JOIN  LOGS AS L3 ON L1.id = L3.id-2
WHERE L1.num = L2.num AND L1.num = L3.num;