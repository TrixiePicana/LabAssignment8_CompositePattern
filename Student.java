
//Leaf Node
public class Student implements OrganizationalUnit 
{
  private String name; 
  private String studentId; 
  private double tuitionFee;

  //Constructor 
  public Student(String name, String studentId, double tuitionFee) 
  {
    this.name = name;
    this.studentId = studentId;
    this.tuitionFee = tuitionFee;
  }

  @Override 
  public void displayDetails(String indent)
  {
    System.out.println(indent + "Student: " + name + ", Student ID: " + studentId + ", Tuition Fee: " + tuitionFee);
  }

  @Override 
  public int getStudentCount()
  {
    return 1;
  }

  @Override 
  public double getBudget() 
  {
    return -tuitionFee;
  }
}
