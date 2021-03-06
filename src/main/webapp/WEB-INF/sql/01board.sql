USE test;
CREATE TABLE Board (
	id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(200) NOT NULL,
    content VARCHAR(2000) NOT NULL,
 tb_usertb_usertb_usertb_userwriter VARCHAR(50) NOT NULL,
    inserted DATETIME DEFAULT NOW(),
    updated DATETIME DEFAULT NOW()
);

DESC Board;

SELECT * FROM Board ORDER BY id DESC;

-- safe update모드 잠금 걸린거 푼 후에, inserted가 널인 항을 지워보자
DELETE FROM Board WHERE 
(id) IN (SELECT id 
		FROM Board 
        WHERE inserted IS NULL);
        
DELETE FROM Board WHERE updated IS NULL;

ALTER TABLE Board MODIFY COLUMN inserted DATETIME NOT NULL DEFAULT NOW();
ALTER TABLE Board MODIFY COLUMN updated DATETIME NOT NULL DEFAULT NOW();