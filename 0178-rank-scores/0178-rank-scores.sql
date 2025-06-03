SELECT S1.score ,  
    (SELECT COUNT(DISTINCT s2.score)
    FROM Scores s2
    WHERE s2.score > S1.score )+1 AS 'rank'
FROM Scores S1
ORDER BY S1.score DESC



-- SELECT s1.Score,
--        (SELECT COUNT(DISTINCT s2.Score) 
--         FROM Scores s2 
--         WHERE s2.Score > s1.Score) + 1 AS 'Rank'
-- FROM Scores s1
-- ORDER BY s1.Score DESC;
