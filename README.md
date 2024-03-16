# DB_Interaction_A3

Connor McDougall
101179300

A3 Assignment Submission. 
Note there are TWO VIDEO LINKS, one for functions working and another for database creation. 

Video link (DB creation): https://youtu.be/Nq6ZXwZkZ_Y
Video link (functions): https://www.youtube.com/watch?v=Dzd-Ij3Q18U

To use:
  Create a database with the query Scripts. Then make sure connection code in java has correct port, username and password to connect.
  Then use the functions in the main method however you want (within the try statment). 


Functions: 

  Using posgreSQL and java sql library, created a program to display, add, update and remove from the database.
  All functions require the passing of a statment variable as the initial argument. 

  static void getAllStudents(state):
    prints out all the students (with assosiated values) into the console.

  static boolean addStudent(state,first_name,last_name,email,date):
    Tries to add a student to the database based input. Will return true if added sucessfully, and false if not. 

  static boolean updateStudentEmail(state,student_id,email):
    Tries to change student with the input student_id to have a new email. Returns true if worked, false if not.

  staic boolean deleteStudent(state,student_id):
    Tries to delete the student with matching student_id. Returns ture is worked, false if not. 



Files:

  Source file for java is in A3_3005/src/main/java/org/example/ Main.java

  Source file for Queries are in A3_Query
    Query to create the database in A3_CreateTable.txt
    Query to add data (initial data) in A3_InitialData_Insert.txt
  
