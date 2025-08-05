-- 1. Create a table
CREATE TABLE Scores (
    ID INT PRIMARY KEY,
    Phy INT,
    Chem INT,
    Maths INT
);

-- 2.column Biology:
ALTER TABLE Scores
ADD Biology INT;

-- 3. Create 4 records:
INSERT INTO Scores (ID, Phy, Chem, Maths, Biology)
VALUES (1, 90, 85, 78, 70),
       (2, 85, 92, 76, 68),
       (3, 78, 88, 92, 85),
       (4, 92, 79, 86, 72);

-- 4. Change data for a record or two
UPDATE Scores
SET Phy = 95
WHERE ID = 1;

-- 5. Find the ID with the highest Physics score:
SELECT ID
FROM Scores
WHERE Phy = (SELECT MAX(Phy) FROM Scores);

-- 6. Find the ID with the highest total score:
SELECT ID
FROM Scores
WHERE (Phy + Chem + Maths + Biology) = (SELECT MAX(Phy + Chem + Maths + Biology) FROM Scores);

-- 7. Ascending order based on the total score:
SELECT ID, Phy, Chem, Maths, Biology, (Phy + Chem + Maths + Biology) AS TotalScore
FROM Scores
ORDER BY TotalScore ASC;

-- 8. Descending order based on the total score:
SELECT ID, Phy, Chem, Maths, Biology, (Phy + Chem + Maths + Biology) AS TotalScore
FROM Scores
ORDER BY TotalScore DESC;

-- 9. 2nd highest Maths scorer:
SELECT ID
FROM Scores
ORDER BY Maths DESC
LIMIT 1 OFFSET 1;
