
public class Person {
	
	private String fName;
	private String lName;
	private String address;
	private int zip;
	private int aCode;
	private int phone;
	
	
	public Person(String fName, String lName, String address, int zip, int aCode, int phone) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.zip = zip;
		this.aCode = aCode;
		this.phone = phone;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return fName + " " + lName +
				" \n" + address + " " + zip + " \n" + 
				"(" + aCode + ")" + phone;
	}
	
	
}
