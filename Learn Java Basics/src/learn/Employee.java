package learn;

public class Employee {
	
	private int ID;
	private String name;
	private String address;
	private String phno;
	public int getID() {
		return ID;
	}
	
	public Employee(){
		
	}
	public Employee(int id, String name, String add, String phno){
		this.ID = id;
		this.name = name; 
		this.address = add;
		this.phno = phno;
	}
	
	public Employee(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}


	@Override
	public int hashCode() {
		return this.name.hashCode() + this.address.hashCode();  
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if(obj == null && obj.getClass() != getClass()){
			return false;
		}else {
			Employee emp = (Employee)obj;
			if(this.name == emp.name && this.address == emp.address){
				return true;
			}
		}
		return false;
	}
}

