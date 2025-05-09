//Leaf node
public class Teacher implements OrganizationalUnit 
{
  private String name;
  private String subject; 
  private doule salary; 

  //Constructor
  public Teacher (String name,String subject, double salary)
  {
    this.name = name;
    this.subject = subject; 
    this.salary = salary;
  }

  @Override 
  public void displayDetails(String indent)
  {
    System.out.println(indent + "Teacher: " + name + ", Subject: " + subject + ", Salary: " + salary);
  }

  @Override
  public int getStudentCount() 
  {
    return 0;
  }

  @Override
  public double getBudget() 
  {
    return -tuitionfee;
  }
}

