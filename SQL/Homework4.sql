

-- (1) Film tablosunda bulunan replacement_cost sütununda bulunan birbirinden farklı değerleri sıralayınız.
Select Distinct replacement_cost from film

-- (2) Film tablosunda bulunan replacement_cost sütununda birbirinden farklı kaç tane veri vardır?
Select Count(Distinct replacement_cost) from film

-- (3) Film tablosunda bulunan film isimlerinde (title) kaç tanesini T karakteri ile başlar ve aynı zamanda rating 'G' ye eşittir?
Select Count (title) from film where title like ('T%') and rating = 'G'

-- (4) Country tablosunda bulunan ülke isimlerinden (country) kaç tanesi 5 karakterden oluşmaktadır?
Select Count(country) from country where country like ('_____')

-- (5) City tablosundaki şehir isimlerinin kaç tanesi 'R' veya r karakteri ile biter?
Select Count(city) from city where city ILIKE ('%r') 

