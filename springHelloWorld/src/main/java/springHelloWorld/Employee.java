package springHelloWorld;

public class Employee {

	private int id;
	private String Name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String toString()
	{
		return "Employee [id="+id+", Name ="+Name+"]";
	}

}
