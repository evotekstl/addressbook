
public class Person  {
	String Name;
	String Fname ;	
	String Mname ;
	String Lname ;	
	String cellNo;
	Address address;
	
	public String getCellNo() {
		return cellNo;
	}
	public void setCellNo(String cellNo) {
		this.cellNo = cellNo;
	}
	public Person(String cellNo) {
		super();
		this.cellNo = cellNo;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Fname=" + Fname + ", Mname=" + Mname + ", Lname=" + Lname + ", cellNo="
				+ cellNo + ", address=" + address + "]";
	}
	
	
}
