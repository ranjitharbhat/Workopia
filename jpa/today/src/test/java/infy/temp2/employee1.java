package infy.temp2;

public class employee1 {

	

	private Integer id;
	private String name;
	private Integer Salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return Salary;
	}
	public void setSalary(Integer salary) {
		Salary = salary;
	}
	public employee1(Integer id, String name, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "employee1 [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
	
}
