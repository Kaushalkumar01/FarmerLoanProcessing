package farmerLoanProcessing;

public class Farmer {
	String loan_Type;
	int tenure;
	int amount;
	String first_name;
	String last_name;
	Address permanent_Address;
	Address field_Address;
	boolean loan_Taken[] = {false, false, false};
	static int total_Loan_Amount;
	static int total_Loan_Repaid_Amount;
	String aadhaar_Number;
	CropLoan cpl;
	WaterPipe wpl;
	TractorLoan tl;
	
	Farmer(String first_name, String last_name, String aadhaar_Number){
		this.first_name = first_name;
		this.last_name = last_name;
		this.aadhaar_Number = aadhaar_Number;
		
	}
	
	public void setPermanentAddress(int house_no, String locality, String taluka, String district, String state) {
		
		permanent_Address=new Address(house_no, locality, taluka, district, state);
	}
	
	public void setFieldAddress(int survey_no, String locality, String taluka, String district, String state) {
		
		field_Address=new Address(survey_no, locality, taluka, district, state);
	}
	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public void displayPermanent_Address() {
		System.out.println(this.permanent_Address.house_no);
		System.out.println(this.permanent_Address.locality);
		System.out.println(this.permanent_Address.taluka);
		System.out.println(this.permanent_Address.district);
		System.out.println(this.permanent_Address.state);
		System.out.println("");
	}
	
	public void displayField_Address() {
		System.out.println(this.field_Address.house_no);
		System.out.println(this.field_Address.locality);
		System.out.println(this.field_Address.taluka);
		System.out.println(this.field_Address.district);
		System.out.println(this.field_Address.state);
		System.out.println("");
	}

	public String getAadhaar_Number() {
		return aadhaar_Number;
	}

	public void setAadhaar_Number(String aadhaar_Number) {
		this.aadhaar_Number = aadhaar_Number;
	}
	
	public void addingCropLoan(int amount, int tenure) {
			if(loan_Taken[0] == true) {
				System.out.println("Crop loan already taken.");
				return;
				
			}
				loan_Taken[0] = true;
				cpl = new CropLoan();
				cpl.loan_amount = amount;
				total_Loan_Amount+=amount;
		}
		
	public void addingWaterPipeLineLoan(int amount, int tenure) {
			if(loan_Taken[1] == true) {
				System.out.println("WaterPipeLine Loan already taken.");
				return;
			}
				loan_Taken[1] = true;
				wpl = new WaterPipe();
				wpl.loan_tenure=tenure;
				wpl.loan_amount = amount;
				total_Loan_Amount+=amount;
		}
		
	public void addingTractorLoan(int amount, int tenure) {
			if(loan_Taken[2] == true) {
				System.out.println("Tractor Loan already taken.");
				return;
			}
				loan_Taken[2] = true;
				tl = new TractorLoan();
				tl.loan_amount = amount;
				total_Loan_Amount+=amount;
		}
	
	public void displayFarmer() {
		System.out.println(this.getFirst_name()+" "+this.getLast_name());
		System.out.println(this.getAadhaar_Number());
		System.out.println("");
		
	}
	
	public String toString() {
		return (this.getFirst_name()+this.getLast_name()+this.getAadhaar_Number());
	}

	public static void main(String[] args) {
		Farmer f1 = new Farmer("Kaushal", "Kumar", "ahdgdg2h11");
		f1.addingCropLoan(1000, 5);
		f1.addingTractorLoan(2000, 6);
		f1.addingWaterPipeLineLoan(3000, 7);
		System.out.println(f1.cpl.loan_amount);
		System.out.println(f1.wpl.loan_amount);
		System.out.println(f1.tl.loan_amount);
		System.out.println(f1.loan_Taken[0]);
		System.out.println(f1.loan_Taken[1]);
		System.out.println(f1.loan_Taken[2]);
		System.out.println(total_Loan_Repaid_Amount);
	}

}
