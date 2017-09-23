# HotelManagementSystem

This is a software engineering project for a Graduate Computer Science Class.
A Team of four students are tasked with replicating a hotel property management system as much as possible within a 3 month time span.
Focus is on team building and improving our current skillset above all. <b> NOTE: There will not be an actual process for processing payments as it is not feasible to create a PCI compliant payment processing system to production software in hotels given our time limit so a pay button will automatically cash out the account.</b>

<br><br>
Although server hosting will be terminated following completion and grading of the project. The code will be edited and remain usable for those wanting to use it as an opportunity to learn multithreading, Javafx, mySQL, and hotel systems in general. Sql dump file can be used to host your own sql database locally for practice purposes.

# Components
There will be 4 main components to this system project.
<br> <br>
<b>- mySQL database </b> <br>
The database will be hosted and maintined in an Amazon Web Services instance.  An SQL dump sheet has been provided for replicating the tables and initial data for personal use and testing for whoever would like to learn from this project as well in the future.
<br><br>
<b>- Customer UI Portal </b> <br>
This GUI will allow customers limited access to the system for the purpose of reservations and account management.
<br><br>
<b>- Employee UI Portal </b> <br>
This UI will allow employees full access to reservations with a few special restrictions such as editing past stays. The main hotel process management happens here as employees are responsible from making reservations all the way to processing checkouts and bill payments as well as room management.
<br><br>
<b>- Process Server </b><br>
This server will be processing queries and runnning automated process for the hotel. It will be the connecting point for both customer and employee portals. This server will also be hosted and maintained in AWS as per project requirements. 
