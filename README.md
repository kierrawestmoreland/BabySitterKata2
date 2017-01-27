# BabySitterKata2

By solving this kata, I tried to focus on one piece at a time. 
First, I want to focus on creating functionality for the time limits and the babysitter start and stop times.
I want to make sure the times are tested (under TDD) before moving on to the next part. 

The next part I want to focus on are the possible hours the babysitter an work. 
I was thinking about starting the first hour as being equal to 1 or using military time. 
If I go ahead and use military time, after 12am, I would keep counting past 24 so that 4am would equal 28.
Whatever time is entered needs to be converted to the format I mentioned above, incase the time isn't entered in the military time format.

Getting my fourth and fifth tests to pass (again) after adding in the convert and verification was tricky. 
This was due to not updating my @Before values when setting the babysitting start and end times. 
