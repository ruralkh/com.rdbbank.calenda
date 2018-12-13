
SELECT ddde.month_reference,
  d.des_en,dn.num_en,m.des_en,y.num_en
  FROM td_year y
INNER JOIN td_month_year_detail myde ON y.id = myde.year_id
INNER JOIN td_month m ON myde.month_id = m.id
INNER JOIN td_day_month_detail dmde ON m.id = dmde.month_id
INNER JOIN td_day d ON dmde.day_id = d.id
INNER JOIN td_date_day_detail ddde ON d.id = ddde.date_id
INNER JOIN td_date_number dn ON ddde.date_number_id = dn.id
  WHERE m.id =1 AND y.id=13
ORDER BY dn.num_en ASC
;
/*month and year*/
INSERT INTO td_month_year_detail(month_id, year_id) VALUES
  (1,	1	),(	2	,	1	),(	3	,	1	),(	4	,	1	),(	5	,	1	),(	6	,	1	),(	7	,	1	),(	8	,	1	),(	9	,	1	),(	10	,	1	),(	11,	1	),(	12,	1	),
  (1,	2	),(	2	,	2	),(	3	,	2	),(	4	,	2	),(	5	,	2	),(	6	,	2	),(	7	,	2	),(	8	,	2	),(	9	,	2	),(	10	,	2	),(	11,	2	),(	12,	2	),
  (1,	3	),(	2	,	3	),(	3	,	3	),(	4	,	3	),(	5	,	3	),(	6	,	3	),(	7	,	3	),(	8	,	3	),(	9	,	3	),(	10	,	3	),(	11,	3	),(	12,	3	),
  (1,	4	),(	2	,	4	),(	3	,	4	),(	4	,	4	),(	5	,	4	),(	6	,	4	),(	7	,	4	),(	8	,	4	),(	9	,	4	),(	10	,	4	),(	11,	4	),(	12,	4	),
  (1,	5	),(	2	,	5	),(	3	,	5	),(	4	,	5	),(	5	,	5	),(	6	,	5	),(	7	,	5	),(	8	,	5	),(	9	,	5	),(	10	,	5	),(	11,	5	),(	12,	5	),
  (1,	6	),(	2	,	6	),(	3	,	6	),(	4	,	6	),(	5	,	6	),(	6	,	6	),(	7	,	6	),(	8	,	6	),(	9	,	6	),(	10	,	6	),(	11,	6	),(	12,	6	),
  (1,	7	),(	2	,	7	),(	3	,	7	),(	4	,	7	),(	5	,	7	),(	6	,	7	),(	7	,	7	),(	8	,	7	),(	9	,	7	),(	10	,	7	),(	11,	7	),(	12,	7	),
  (1,	8	),(	2	,	8	),(	3	,	8	),(	4	,	8	),(	5	,	8	),(	6	,	8	),(	7	,	8	),(	8	,	8	),(	9	,	8	),(	10	,	8	),(	11,	8	),(	12,	8	),
  (1,	9	),(	2	,	9	),(	3	,	9	),(	4	,	9	),(	5	,	9	),(	6	,	9	),(	7	,	9	),(	8	,	9	),(	9	,	9	),(	10	,	9	),(	11,	9	),(	12,	9	),
  (1,	10	),(	2	,	10	),(	3	,	10	),(	4	,	10	),(	5	,	10	),(	6	,	10	),(	7	,	10	),(	8	,	10	),(	9	,	10	),(	10	,	10	),(	11,	10	),(	12,	10	),
  (1,	11	),(	2	,	11	),(	3	,	11	),(	4	,	11	),(	5	,	11	),(	6	,	11	),(	7	,	11	),(	8	,	11	),(	9	,	11	),(	10	,	11	),(	11,	11	),(	12,	11	),
  (1,	12	),(	2	,	12	),(	3	,	12	),(	4	,	12	),(	5	,	12	),(	6	,	12	),(	7	,	12	),(	8	,	12	),(	9	,	12	),(	10	,	12	),(	11,	12	),(	12,	12	),
  (1,	13	),(	2	,	13	),(	3	,	13	),(	4	,	13	),(	5	,	13	),(	6	,	13	),(	7	,	13	),(	8	,	13	),(	9	,	13	),(	10	,	13	),(	11,	13	),(	12,	13	)
;
/*day and month*/
INSERT INTO td_day_month_detail(day_id, month_id) VALUES
  (7,1)
  ,(7,2)
  ,(7,3)
  ,(7,4)
  ,(7,5)
  ,(7,6)
  ,(7,7)
  ,(7,8)
  ,(7,9)
  ,(7,10)
  ,(7,11)
  ,(7,12)
;
INSERT INTO td_day_month_detail(day_id, month_id) VALUES
  (6,1)
  ,(6,2)
  ,(6,3)
  ,(6,4)
  ,(6,5)
  ,(6,6)
  ,(6,7)
  ,(6,8)
  ,(6,9)
  ,(6,10)
  ,(6,11)
  ,(6,12)
;
INSERT INTO td_day_month_detail(day_id, month_id) VALUES
  (5,1)
  ,(5,2)
  ,(5,3)
  ,(5,4)
  ,(5,5)
  ,(5,6)
  ,(5,7)
  ,(5,8)
  ,(5,9)
  ,(5,10)
  ,(5,11)
  ,(5,12)
;
INSERT INTO td_day_month_detail(day_id, month_id) VALUES
  (4,1)
  ,(4,2)
  ,(4,3)
  ,(4,4)
  ,(4,5)
  ,(4,6)
  ,(4,7)
  ,(4,8)
  ,(4,9)
  ,(4,10)
  ,(4,11)
  ,(4,12)
;
INSERT INTO td_day_month_detail(day_id, month_id) VALUES
  (3,1)
  ,(3,2)
  ,(3,3)
  ,(3,4)
  ,(3,5)
  ,(3,6)
  ,(3,7)
  ,(3,8)
  ,(3,9)
  ,(3,10)
  ,(3,11)
  ,(3,12)
;

INSERT INTO td_day_month_detail(day_id, month_id) VALUES
  (2,1)
  ,(2,2)
  ,(2,3)
  ,(2,4)
  ,(2,5)
  ,(2,6)
  ,(2,7)
  ,(2,8)
  ,(2,9)
  ,(2,10)
  ,(2,11)
  ,(2,12)
;

INSERT INTO td_day_month_detail(day_id, month_id) VALUES
  (1,1)
  ,(1,2)
  ,(1,3)
  ,(1,4)
  ,(1,5)
  ,(1,6)
  ,(1,7)
  ,(1,8)
  ,(1,9)
  ,(1,10)
  ,(1,11)
  ,(1,12)
;
/*date_num and day 2019 Jan*/
INSERT INTO td_date_day_detail(id,month_reference, year_id, month_id, date_id, date_number_id) VALUES
  (1,'Jan2019',13,1,1,6)
  ,(2,'Jan2019',13,1,1,13)
  ,(3,'Jan2019',13,1,1,20)
  ,(4,'Jan2019',13,1,1,27)
;
INSERT INTO td_date_day_detail(id,month_reference, year_id, month_id, date_id, date_number_id) VALUES
  (5,'Jan2019',13,1,7,5)
  ,(6,'Jan2019',13,1,7,12)
  ,(7,'Jan2019',13,1,7,19)
  ,(8,'Jan2019',13,1,7,26)
;
INSERT INTO td_date_day_detail(id,month_reference, year_id, month_id, date_id, date_number_id) VALUES
  (9,'Jan2019',13,1,6,4)
  ,(10,'Jan2019',13,1,6,11)
  ,(11,'Jan2019',13,1,6,18)
  ,(12,'Jan2019',13,1,6,25)
;
INSERT INTO td_date_day_detail(id,month_reference, year_id, month_id, date_id, date_number_id) VALUES
  (13,'Jan2019',13,1,5,3)
  ,(14,'Jan2019',13,1,5,10)
  ,(15,'Jan2019',13,1,5,17)
  ,(16,'Jan2019',13,1,5,24)
  ,(17,'Jan2019',13,1,5,31)
;
INSERT INTO td_date_day_detail(id,month_reference, year_id, month_id, date_id, date_number_id) VALUES
  (18,'Jan2019',13,1,4,2)
  ,(19,'Jan2019',13,1,4,9)
  ,(20,'Jan2019',13,1,4,16)
  ,(21,'Jan2019',13,1,4,23)
  ,(22,'Jan2019',13,1,4,30)
;
INSERT INTO td_date_day_detail(id,month_reference, year_id, month_id, date_id, date_number_id) VALUES
  (23,'Jan2019',13,1,3,1)
  ,(24,'Jan2019',13,1,3,8)
  ,(25,'Jan2019',13,1,3,15)
  ,(26,'Jan2019',13,1,3,22)
  ,(27,'Jan2019',13,1,3,29)
;
INSERT INTO td_date_day_detail(id,month_reference, year_id, month_id, date_id, date_number_id) VALUES
  (28,'Jan2019',13,1,2,7)
  ,(29,'Jan2019',13,1,2,14)
  ,(30,'Jan2019',13,1,2,21)
  ,(31,'Jan2019',13,1,2,28)
;

/**/
INSERT INTO td_year(id,num,num_en,des,des_en) VALUES
  (1,'២០០៧',2007,'','')
  ,(2,'២០០៨',2008,'','')
  ,(3,'២០០៩',2009,'','')
  ,(4,'២០១០',2010,'','')
  ,(5,'២០១១',2011,'','')
  ,(6,'២០១២',2012,'','')
  ,(7,'២០១៣',2013,'','')
  ,(8,'២០១៤',2014,'','')
  ,(9,'២០១៥',2015,'','')
  ,(10,'២០១៦',2016,'','')
  ,(11,'២០១៧',2017,'','')
  ,(12,'២០១៨',2018,'','')
  ,(13,'២០១៩',2019,'','')
;

INSERT INTO td_date_number(id,num,num_en,des,des_en) VALUES
  (1,'១',1,'','')
  ,(2,'២',2,'','')
  ,(3,'៣',3,'','')
  ,(4,'៤',4,'','')
  ,(5,'៥',5,'','')
  ,(6,'៦',6,'','')
  ,(7,'៧',7,'','')
  ,(8,'៨',8,'','')
  ,(9,'៩',9,'','')
  ,(10,'១០',10,'','')
  ,(11,'១១',11,'','')
  ,(12,'១២',12,'','')
  ,(13,'១៣',13,'','')
  ,(14,'១៤',14,'','')
  ,(15,'១៥',15,'','')
  ,(16,'១៦',16,'','')
  ,(17,'១៧',17,'','')
  ,(18,'១៨',18,'','')
  ,(19,'១៩',19,'','')
  ,(20,'២០',20,'','')
  ,(21,'២១',21,'','')
  ,(22,'២២',22,'','')
  ,(23,'២៣',23,'','')
  ,(24,'២៤',24,'','')
  ,(25,'២៥',25,'','')
  ,(26,'២៦',26,'','')
  ,(27,'២៧',27,'','')
  ,(28,'២៨',28,'','')
  ,(29,'២៩',29,'','')
  ,(30,'៣០',30,'','')
  ,(31,'៣១',31,'','')
;


INSERT INTO td_month(id,num,num_en,des,des_en) VALUES
(1,'១',1,'មករា','January')
,(2,'២',2,'កុម្ភៈ','February')
,(3,'៣',3,'មីនា','March')
,(4,'៤',4,'មេសា','April')
,(5,'៥',5,'ឧសភា','May')
,(6,'៦',6,'មិថុនា','June')
,(7,'៧',7,'កក្កដា','July')
,(8,'៨',8,'សីហា','August')
,(9,'៩',9,'កញ្ញា','September')
,(10,'១០',10,'តុលា','October')
,(11,'១១',11,'វិច្ឆិកា','November')
,(12,'១២',12,'ធ្នូ','December')
;



INSERT INTO td_day(id,num,num_en,des,des_en) VALUES
  (1,'១',1,'អាទិត្យ','Sunday')
  ,(2,'២',2,'ច័ន្ទ','Monday')
  ,(3,'៣',3,'អង្គារ','Tuesday')
  ,(4,'៤',4,'ពុធ','Wednesday')
  ,(5,'៥',5,'ថ្ងៃព្រហស្បតិ៍','Thursday')
  ,(6,'៦',6,'សុក្រ','Friday')
  ,(7,'៧',7,'សៅរ៍','Saturday')
;

