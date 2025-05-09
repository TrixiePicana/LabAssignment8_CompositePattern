# LabAssignment 8 Composite Pattern
New Era University is composed of various organizational units. These units can be either individual entities or compositions of other entities. The system should be able to represent the following: <br><br>

&nbsp;&nbsp;<b>+ Colleges:</b> A College is a high-level organizational unit (e.g., "College of Engineering", "College of Business"). A College can contain departments, teachers, and students. It can also contain other Colleges (e.g., a university is composed of several Colleges). <br>
&nbsp;&nbsp;<b>+ Departments:</b> A department is a subdivision within a College, focusing on a specific subject (e.g., "Department of Computer Science", "Department of Information Technology"). A department can contain teachers and students. <br>
&nbsp;&nbsp;<b>+ Teachers:</b> A teacher is an individual entity responsible for instructing students. Each teacher has a name, a subject they teach, and a salary. <br>
&nbsp;&nbsp;<b>+ Students:</b> A student is an individual entity enrolled in a College or department. Each student has a name, a unique student ID, and pays a tuition fee. <br><br>

<b>Requirements:</b><br><br>

&nbsp;&nbsp;<b>1. Model the hierarchical structure:</b> The system must accurately represent the "part-whole" relationship between the different entities (e.g., a College "has-a" department, a department "has-a" teacher).<br>
&nbsp;&nbsp;<b>2. Calculate the number of students:</b> The system should be able to calculate the total number of students within any given College, including students in its departments and any sub-Colleges. <br>
&nbsp;&nbsp;<b>3. Display details:</b> The system should be able to display the details of any educational unit (College, department, teacher, or student) in a clear and organized manner. <br>
&nbsp;&nbsp;<b>4. Calculate the budget:</b> The system should be able to calculate the total budget for a College. The budget for a College is the sum of the budgets of its departments, teachers, and the negative sum of all the tuition fees of the students. The budget of a department is the sum of the budgets of its teachers and the negative sum of the tuition fees of the students in that department. A teacher's budget is their salary. A student's budget is the negative value of their tuition fee. <br><br>
<b>Tasks:</b><br>
               
&nbsp;&nbsp;<b>1. Design a UML class diagram:</b> Create a UML class diagram that illustrates the classes, interfaces, and relationships involved in the system. <br>
&nbsp;&nbsp;<b>2. Implement the system in Java:</b> Write Java code that implements the design, adhering to the Composite Design Pattern. <br>
&nbsp;&nbsp;<b>3. Create a client program:</b> Write a client program that demonstrates the functionality of the system by: <br> 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; - Creating instances of Colleges, departments, teachers, and students. <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; - Organizing these instances into a hierarchical structure. <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; - Displaying the details of a College. <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; - Calculating and displaying the total number of students in a College. <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; - Calculating and displaying the total budget of a College. <br>

