package Constructor;

public class Program_2 {
	
	private int id;
	private String name;
	private String address;
	
	public Program_2() {
		
		
	}

	public Program_2(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Program_2 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
