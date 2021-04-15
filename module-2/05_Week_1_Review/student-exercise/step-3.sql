-----------------------------------------------
-- CAMPGROUND TABLE
-----------------------------------------------
-- select name and daily fee of all campgrounds
BEGIN TRANSACTION;
 SELECT name, daily_fee
  FROM campground;
-- select name and daily fee of all campgrounds ordered by campground name
SELECT name, daily_fee
 FROM campground
  ORDER BY name;
-- select name, open from month, open to month, and daily fee of the campgrounds where daily fee is less than $100
SELECT name, open_from_mm, open_to_mm, daily_fee
 FROM campground
  WHERE daily_fee
   NOT IN('$160.00','$250.00');
-- select name and daily fee of the campgrounds where the campground is open all year long
SELECT name, daily_fee
 FROM campground
  WHERE open_from_mm
   NOT IN ('02','03','04','05','06','07','08','09','10','11');
-----------------------------------------------
   -- PARK TABLE
-----------------------------------------------
-- select name and description of all parks order by established date in descending order
SELECT name, description
 FROM park
 ORDER BY establish_date
  DESC;
-- select name and description of all parks in Ohio
SELECT name, description
 FROM park
  WHERE location
   IN ('Ohio');
-- select name and description of all parks NOT in Ohio
SELECT name, description
 FROM park
  WHERE location
   NOT IN ('Ohio');
-- select the total number of visitors for all parks
SELECT sum(visitors)
 FROM park;
 -- select the average number of visitors for all parks
SELECT AVG(visitors)
 FROM park;
-----------------------------------------------
-- SITE TABLE
-----------------------------------------------

-- select all columns from site where utilities is true and order by max RV length with the largest coming first
BEGIN TRANSACTION;
 SELECT site_number, campground_id, max_rv_length, utilities 
  FROM site
   WHERE utilities 
    IS TRUE
     ORDER BY max_rv_length
      DESC;
-- select total number of sites that have utilities hook up
SELECT(site_number, campground_id, max_rv_length, utilities)
 FROM site
  WHERE utilities 
   IS TRUE
    ORDER by(utilities);
-----------------------------------------------
-- RESERVATION TABLE
-----------------------------------------------

-- select reservation id, site id, name, from date, to date of the reservations where the checkin date is between the first and last day of the current month (hard coded month is ok)
BEGIN TRANSACTION;
 SELECT
;
-- select all columns from reservation where name includes 'Reservation'
SELECT
;
-- select the total number of reservations in the reservation table
SELECT
;
-- select reservation id, site id, name of the reservations where site id is in the list 9, 20, 24, 45, 46
SELECT
;
-- select the date and number of reservations for each date orderd by from_date in ascending order
SELECT
;
