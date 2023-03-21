/* 
1- test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50),
birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım. 
*/

CREATE DATABASE test
CREATE TABLE employee
	(
		id SERIAL PRIMARY KEY,
		name VARCHAR(50) NOT NULL,
		birthday DATE,
		email VARCHAR(50)
	)


/* 
2- Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
*/

insert into employee (name, birthday, email) values ('Kalli', '2/4/2023', 'kgreenwell0@goodreads.com');
insert into employee (name, birthday, email) values ('Cherey', '11/1/2022', 'cspilling1@etsy.com');
insert into employee (name, birthday, email) values ('Korry', '12/15/2022', 'kkunze2@nsw.gov.au');
insert into employee (name, birthday, email) values ('Nancy', '7/28/2022', 'nfountain3@eventbrite.com');
insert into employee (name, birthday, email) values ('Tatum', '3/13/2023', 'tcastree4@noaa.gov');
insert into employee (name, birthday, email) values ('Denna', '8/28/2022', 'dhollow5@exblog.jp');
insert into employee (name, birthday, email) values ('Marcelo', '1/24/2023', 'mpitfield6@cdbaby.com');
insert into employee (name, birthday, email) values ('Marwin', '2/13/2023', 'mrandell7@telegraph.co.uk');
insert into employee (name, birthday, email) values ('Currie', '3/14/2023', 'cstodhart8@hatena.ne.jp');
insert into employee (name, birthday, email) values ('Mirella', '3/28/2022', 'morteaux9@wikimedia.org');
insert into employee (name, birthday, email) values ('Gilbertina', '10/4/2022', 'gattrilla@indiegogo.com');
insert into employee (name, birthday, email) values ('Olav', '5/8/2022', 'ogarretb@squarespace.com');
insert into employee (name, birthday, email) values ('Clarissa', '9/13/2022', 'chummc@senate.gov');
insert into employee (name, birthday, email) values ('Loraine', '1/31/2023', 'lferneleyd@devhub.com');
insert into employee (name, birthday, email) values ('Renado', '8/5/2022', 'redgellere@is.gd');
insert into employee (name, birthday, email) values ('Peggi', '7/13/2022', 'pbanischf@ameblo.jp');
insert into employee (name, birthday, email) values ('Kessiah', '5/4/2022', 'kmastermang@sciencedaily.com');
insert into employee (name, birthday, email) values ('Marilyn', '6/23/2022', 'mblenkironh@sciencedirect.com');
insert into employee (name, birthday, email) values ('Kamila', '5/26/2022', 'klongmorei@acquirethisname.com');
insert into employee (name, birthday, email) values ('Aubry', '6/26/2022', 'azimmermanj@illinois.edu');
insert into employee (name, birthday, email) values ('Romain', '9/12/2022', 'rjennerk@list-manage.com');
insert into employee (name, birthday, email) values ('Nolie', '3/11/2023', 'ncrowl@loc.gov');
insert into employee (name, birthday, email) values ('Deeann', '3/19/2023', 'dsaddingtonm@arizona.edu');
insert into employee (name, birthday, email) values ('Gareth', '1/4/2023', 'ggersamn@springer.com');
insert into employee (name, birthday, email) values ('Emmet', '1/17/2023', 'etenniswoodo@biblegateway.com');
insert into employee (name, birthday, email) values ('Kessiah', '9/5/2022', 'kmacguffogp@bizjournals.com');
insert into employee (name, birthday, email) values ('Maxy', '7/27/2022', 'mhamlyq@opensource.org');
insert into employee (name, birthday, email) values ('Crissy', '12/20/2022', 'crainviller@cdbaby.com');
insert into employee (name, birthday, email) values ('Isadora', '12/16/2022', 'ilengthorns@imageshack.us');
insert into employee (name, birthday, email) values ('Anthia', '8/9/2022', 'aesslemontt@cargocollective.com');
insert into employee (name, birthday, email) values ('Jacques', '1/2/2023', 'jkleinsteinu@amazon.com');
insert into employee (name, birthday, email) values ('Charmaine', '1/30/2023', 'clennardev@theatlantic.com');
insert into employee (name, birthday, email) values ('Godfrey', '2/3/2023', 'gbenjefieldw@freewebs.com');
insert into employee (name, birthday, email) values ('Pippa', '2/13/2023', 'pmacartex@samsung.com');
insert into employee (name, birthday, email) values ('Edita', '6/25/2022', 'echandlery@sohu.com');
insert into employee (name, birthday, email) values ('Mattheus', '7/14/2022', 'mbarhamsz@uiuc.edu');
insert into employee (name, birthday, email) values ('Vlad', '3/28/2022', 'vsheasby10@smh.com.au');
insert into employee (name, birthday, email) values ('Ryan', '1/31/2023', 'rsyce11@sciencedirect.com');
insert into employee (name, birthday, email) values ('Neile', '10/5/2022', 'nyakubowicz12@unblog.fr');
insert into employee (name, birthday, email) values ('Alain', '1/24/2023', 'adenham13@chron.com');
insert into employee (name, birthday, email) values ('Alfy', '10/29/2022', 'aeddowes14@craigslist.org');
insert into employee (name, birthday, email) values ('Doralynne', '7/17/2022', 'dpiletic15@thetimes.co.uk');
insert into employee (name, birthday, email) values ('Rayner', '9/26/2022', 'rraden16@dailymotion.com');
insert into employee (name, birthday, email) values ('Aili', '10/27/2022', 'ahalsted17@admin.ch');
insert into employee (name, birthday, email) values ('Papageno', '7/18/2022', 'pwillden18@usa.gov');
insert into employee (name, birthday, email) values ('Barbabra', '11/2/2022', 'bwinspire19@icq.com');
insert into employee (name, birthday, email) values ('Nadya', '3/16/2023', 'ntern1a@mtv.com');
insert into employee (name, birthday, email) values ('Otis', '1/25/2023', 'oodam1b@theatlantic.com');
insert into employee (name, birthday, email) values ('Candi', '10/18/2022', 'creadings1c@nymag.com');
insert into employee (name, birthday, email) values ('Giffie', '12/11/2022', 'ghutten1d@sogou.com');

/* 
3- Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
*/

UPDATE employee 
	SET
	email = 'blabla@blabla.com' 
	WHERE id = 1;
	
UPDATE employee 
	SET 
	name = 'blabla' 
	WHERE id = 2;

UPDATE employee 
	SET 
	email = 'asdas@bbla.com' 
	WHERE id = 9;
	
UPDATE employee 
	SET 
	birthday = '1899-01-01' 
	WHERE id = 5;
	
UPDATE employee 
	SET 
	email = 'a@a.com' 
	WHERE id = 19;

/* 
4- Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
*/

DELETE FROM employee 
WHERE id=1;

DELETE FROM employee
WHERE email='a@a.com';

DELETE FROM employee
WHERE birthday='1899-01-01';

DELETE FROM employee 
WHERE id=19;

DELETE FROM employee 
WHERE name='bal';





