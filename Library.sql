DROP TABLE IF EXISTS "Account";
CREATE TABLE "Account" ("Username" CHAR PRIMARY KEY  NOT NULL , "Name" CHAR, "Password" VARCHAR, "Sec_Q" CHAR, "Answer" CHAR);
INSERT INTO "Account" VALUES('asad','Asad Ali','asad007','What was the name of your first pet?','kutta');
INSERT INTO "Account" VALUES('ashar','Ashar Ali','ashar007','What was the name of your first pet?','ghadda');
DROP TABLE IF EXISTS "Book";
CREATE TABLE "Book" ("Book_ID" INTEGER PRIMARY KEY  NOT NULL , "Name" CHAR, "Edition" INTEGER, "Publisher" CHAR, "Price" INTEGER, "Pages" INTEGER);
INSERT INTO "Book" VALUES(251,'Psychology',3,'Chuck Norris',1500,3000);
INSERT INTO "Book" VALUES(900,'Software Engineering',5,'Robert Downy Jr.',1700,5000);
DROP TABLE IF EXISTS "Issue";
CREATE TABLE "Issue" ("Book_ID" INTEGER,"Name" CHAR,"Edition" INTEGER,"Publisher" CHAR,"Price" INTEGER,"Pages" INTEGER,"Student_ID" INTEGER,"S_Name" CHAR,"Father" CHAR,"Course" CHAR,"Year" INTEGER,"Semester" INTEGER,"I_Date" INTEGER DEFAULT (null) );
DROP TABLE IF EXISTS "Return";
CREATE TABLE "Return" ("Name" CHAR,"Father" CHAR,"Course" CHAR,"Year" INTEGER,"Semester" INTEGER,"Book_ID" INTEGER,"B_Name" CHAR,"Edition" INTEGER,"Publsiher" CHAR,"Price" INTEGER,"Pages" INTEGER,"DOI" INTEGER,"DOR" INTEGER, "Student_ID" INTEGER);
INSERT INTO "Return" VALUES('Ashar Ali','Muhammad Ali','BSSE',3,5,251,'Psychology',3,'Chuck Norris',1500,3000,'','',216);
DROP TABLE IF EXISTS "Student";
CREATE TABLE "Student" ("Student_ID" INTEGER PRIMARY KEY  NOT NULL , "Name" CHAR, "Father" CHAR, "Course" CHAR, "Year" INTEGER, "Semester" INTEGER);
INSERT INTO "Student" VALUES(216,'Ashar Ali','Muhammad Ali','BSSE',3,5);
INSERT INTO "Student" VALUES(845,'Haris Ali','Muhammad Ali','BSSE',3,5);
