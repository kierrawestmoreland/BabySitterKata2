# BabySitterKata2

### Directions (from JamesKBride Github):

This kata simulates a babysitter working and getting paid for one night. The rules are pretty straight forward:

- [x] The babysitter starts no earlier than 5:00PM
- [x] leaves no later than 4:00AM
- [x] gets paid $12/hour from start-time to bedtime
- [x] gets paid $8/hour from bedtime to midnight
- [x] gets paid $16/hour from midnight to end of job
- [x] gets paid for full hours (no fractional hours)
- [x] Feature: As a babysitter In order to get paid for 1 night of work I want to calculate my nightly charge

### Instructions to Run:
1. Clone repository https://github.com/kierrawestmoreland/BabySitterKata2
2. Open git bash or command prompt
3. Run ./gradle build
4. Run gradle test
5. Have fun

### My Thought Process:

By solving this kata, I tried to focus on one piece at a time. 
First, I want to focus on creating functionality for the time limits and the babysitter start and stop times.
I want to make sure the times are tested (under TDD) before moving on to the next part. 
I wanted to make sure the babySitter couldn't start before the start time limit or end after the ending time limit.
I also wanted to make sure the babysitter couldn't stop working before starting to work.

The next part I want to focus on are the possible hours within the limits and time the babysitter is working. 
I was thinking about starting the first hour as being equal to 1 or using military time. 
If I go ahead and use military time, after 12am, I would keep counting past 24 so that 4am would equal 28.
Whatever time is entered needs to be converted to the format I mentioned above, incase the time isn't entered in the military time format.

Getting my fourth and fifth tests to pass (again) after adding in the convert and verification was tricky. 
This was due to not updating my @Before babysitter object values when setting the babysitting start and end times. 

Next I will set up the pay rates based on the current hour. From the directions I will have 3 pay rates.
I will have a pay rate from start time to bedtime, bedtime to midnight, and midnight to end time.
First I want to set up the functionality of charging for an hour for the start to bedtime rate.
My sixth test tested for this. 

Since there isn't a specific time for the bedtime, I decided to need to create a setter and a getter for it. 
Since I'll have multiple setters, I will make a constructor method for the babysitter's start and end times along with bedtime as the parameters. I'll also combine the convert time methods into one since the calculation is the same for start, end, and bedtime.
I'll then add that method to the constructor so that the times are converted as they are being initialized.

After setting up the ability to enter a time in for bedtime along with start time, I am going to add a condition if the bedtime was after midnight and therefore the midngiht to endtime range would be changed to the bedtime rate of $8.

Once all the conditions and tests are created and ran, I want to print out how much the babysitter made for the night. 

###Output

The babysitter will share how much they made at the end of their shift. 
To help validate the correct hours, I printed out the number of hours for each rate based on the times entered in the construtor. 
The hours are (startTimeToBedTime, bedTimeToMidnight, midnightToEndTime, bedTimeToEndTime).
