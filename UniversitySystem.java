public class UniversitySystem
{
  public static void main(String[] args)
  {
    //Create teachers and students 
    Teacher t1 = new Teacher("Mary", "Data Structures & Algorithm", 40000);
    Teacher t2 = new Teacher("Juan", "Fundamentals of Programming", 40000);
    Teacher t3 = new Teacher("Shan", "IT Elective 1", 35000);
    Teacher t4 = new Teacher("Kaye", "Business Analytics", 30000);
    Student s1 = new Student("Liberty", "S001", 30000);
    Student s2 = new Student("Kristel", "S002", 30000);
    Student s3 = new Student("Mike", "S003", 28500);
    Student s4 = new Student("Lester", "S004", 28500);

    //Create departments
    College csDepartment = new College("Department of Computer Science");
    csDepartment.addDepartment(t1);
    csDepartment.addDepartment(t3);
    csDepartment.addDepartment(s1);

    College itDepartment = new College("Department of Information Technology");
    itDepartment.addDepartment(t2);
    itDepartment.addDepartment(s4);
    
    College isDepartment = new College("Department of Information Systems");
    isDepartment.addDepartment(t4); 
    isDepartment.addDepartment(s2);
    isDepartment.addDepartment(s3);
    
    //Create College
    College CollegeofComputerStudies = new College("College of Computer Studies"); 
    CollegeofComputerStudies.addDepartment(csDepartment);
    CollegeofComputerStudies.addDepartment(itDepartment);
    CollegeofComputerStudies.addDepartment(isDepartment);
    CollegeofComputerStudies.addDepartment(s1);
    CollegeofComputerStudies.addDepartment(s2);
    CollegeofComputerStudies.addDepartment(s3);
    CollegeofComputerStudies.addDepartment(s4);

    // Display details
    CollegeofComputerStudies.displayDetails("");

    //Total students
    System.out.println("\nTotal Students: " + CollegeofComputerStudies.getStudentCount());

    //Total budget
    System.out.println("Total Budget: " + CollegeofComputerStudies.getBudget());
  }
}