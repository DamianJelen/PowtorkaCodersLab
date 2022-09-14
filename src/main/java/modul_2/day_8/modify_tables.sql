--------------------------------------------------------
zad_1
--------------------------------------------------------
ALTER TABLE tickets ADD priseUSD decimal(6,2);
ALTER TABLE cinemas MODIFY COLUMN name varchar(100) not null;
ALTER TABLE movies ADD director char(80);
ALTER TABLE movies MODIFY COLUMN director varchar(50);
ALTER TABLE tickets DROP COLUMN priseUSD;

--------------------------------------------------------
zad_2
--------------------------------------------------------
ALTER TABLE movies ADD watchCount int unsigned default 0;
ALTER TABLE movies ADD isTop tinyint unsigned default 0;
ALTER TABLE cinemas Add openTime time;
ALTER TABLE cinemas Add closeTime time;