package abstractClass;
abstract Class Employee
{
	public abstract setSalary (int salary);
	public abstract int getSalary();
	
}
class student extends Employee
{
	public abstract setSalary();
	int salary:
		System.out.println("Get salary");
	
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}




* abstract void setSalary(int salary) method
* abstract int getSalary() method
* abstract void setGrade(String grade) method (grade of the employee in the organization)  * abstract String getGrade() method
* void label() method which prints "Employee's data:\n" (Concrete method, implementation is hidden from end user)
2. class Engineer extending class Employee:
* private attribute int salary
* private attribute String grade
* implement the setter and getter methods from the parent class to set and get attributes (salary and grade)
3. class Manager extending class Employee:
* private attribute int salary
* private attribute String grade
* implement the setter and getter methods from the parent class to set and get attributes (salary and grade)
