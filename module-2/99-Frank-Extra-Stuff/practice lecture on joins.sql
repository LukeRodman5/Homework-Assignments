--
-- Show the country name, city name, district
--
-- We need data from more than one table - country table & city table
--
-- Whenever you need data from more than one table - code a join
--
-- A join matched rows btween tables & is based on a join condition
--
-- the join condition defines how rows between tables should be matched
--
-- If the names are duplicated you must make uniques using tablename.column-name
--
-- Two formats for coding a join:
--                              1. classic syntax - code all the tables on the from & a join condition on the WHERE
--                              2. modern syntax  - code the type of join between the table names & the join condition on an ON clause
--------------------------------------------------------------------------------------------------------------------
-- Classic Syntax Join
--------------------------------------------------------------------------------------------------------------------   
--
SELECT country.name, city.name, district       -- columns you want in the result
 from country, city                            -- table(s) with the columns you want
  WHERE country.code = city.countrycode;       -- we want the rows that match between the city & the country tables by the countrycode
--
--
--------------------------------------------------------------------------------------------------------------------
-- Modern Syntax Join
--------------------------------------------------------------------------------------------------------------------
SELECT country.name, city.name, district       -- columns you want in the result
 from country                                 -- code one of the tables in the join
      INNER JOIN                              -- type join - inner join shows matches between tables based on join conditions
        city                                   -- code the other tables in the join
         ON country.code = city.countrycode    -- join condition - we want the rows that match between city and country table by country code
          WHERE country.code = 'USA';           -- filtering conditons the WHERE as usual
--
-- Subquery Example ------------------------------------------------------------------------------------------
-- List the names of the countries that speak English
--
-- The country language table has the country codes that speak each language
--
-- 1. Get a list of country codes tha speak English from the countrylanguage table
-- 2. Get the name of the country from the country table if the code in the country table is in the list from #1
-- 
-- A subquery is where the result of one select is used in another select
-- Used when data from one table is needed to search another table or data from one table is needed in another
--
-- Usually link the queries with an IN due to a list being returned from the subquery
--
-- The subquery is run first and the list returned from it is pluggeed into the IN clause of the outer SELECT
-- 
--You nest up to generally 32,766 subqueries (more than you ever need)
--
-- a subquery may only return one column which is (a list)
--
-- we needed the countrycodes from countrylanguage that spoke English to search country table for the names of those counrtries
--
--
--
SELECT NAME
 FROM country
  WHERE code
   IN (
       SELECT countrycode                      -- list of countrycodes
        FROM countrylanguage                   -- from countrylanguage
         WHERE LANGUAGE = 'English');           -- where the language is English
  
 