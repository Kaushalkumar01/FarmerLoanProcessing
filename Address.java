package farmerLoanProcessing;

public class Address {
	public int house_no;
	String locality;
	String taluka;
	String district;
	String state;
	
	Address(int house_no, String locality, String taluka, String district, String state){
		this.house_no = house_no;
		this.locality = locality;
		this.taluka = taluka;
		this.district = district;
		this.state = state;
	}
	public static void main(String[] args) {
		
	}

	public int getHouse_no() {
		return house_no;
	}

	public void setHouse_no(int house_no) {
		this.house_no = house_no;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getTaluka() {
		return taluka;
	}

	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void displayAddress() {
		System.out.println(this.getHouse_no());
		System.out.println(this.getLocality());
		System.out.println(this.getTaluka());
		System.out.println(this.getDistrict());
		System.out.println(this.getState());
	}
	public String toString() {
		return (this.getHouse_no()+this.getLocality()+this.getTaluka()+this.getDistrict()+this.getState());
	}
	
}
