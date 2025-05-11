//Composite class
import java.util.ArrayList;
import java.util.List;
public class College implements OrganizationalUnit
{
  private String name;
  private List<OrganizationalUnit> departments = new ArrayList<>();

  //Constructor
  public College(String name)
  {
    this.name = name;
    this.departments = new ArrayList<>(); // Initialize the list of departments.
  }

  public void addDepartment (OrganizationalUnit department)
  {
    departments.add(department);
  }

  @Override 
  public void displayDetails(String indent)
  {
    System.out.println(indent + "Unit: " + name);
    for(OrganizationalUnit department: departments)
    {
      department.displayDetails(indent + "   ");
    }
  }

  @Override 
  public int getStudentCount()
  {
    int count = 0;
    for (OrganizationalUnit department: departments)
    {
      count += department.getStudentCount();  
    }
    return count;
  }

  @Override 
  public double getBudget() 
  {
    double budget = 0;
    for (OrganizationalUnit department: departments)
    {
      budget += department.getBudget();
    }
    return budget; 
  }
}
