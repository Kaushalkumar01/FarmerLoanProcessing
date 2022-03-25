package farmerLoanProcessing;

public class TractorLoan extends Loan {
	String tractor_company;
	String tractor_model;
	float interest_rate;
	long emi_amount;
	
	TractorLoan(){
		super();
		Loan.loan_no++;
		this.interest_rate = 7.0f;
	}
	public String getTractor_company() {
		return tractor_company;
	}
	public void setTractor_company(String tractor_company) {
		this.tractor_company = tractor_company;
	}
	public String getTractor_model() {
		return tractor_model;
	}
	public void setTractor_model(String tractor_model) {
		this.tractor_model = tractor_model;
	}
	public float getInterest_rate() {
		return interest_rate;
	}
	public void setInterest_rate(float interest_rate) {
		this.interest_rate = interest_rate;
	}
	
	public long Emi_amount() {
		return this.emi_amount = (long) (this.loan_amount + (this.loan_amount*this.loan_tenure* this.interest_rate)/100);
	}
	
	public void isEMIPaid() {
		for(int i = 0; i<num_of_emi; i++) {
			if(is_emi_paid[i] == false) {
				Farmer.total_Loan_Repaid_Amount+=emi_amount;
				is_emi_paid[i]=true;
				break;
			}
		}
	}
	
	public void display() {
		System.out.println(this.tractor_company);
		System.out.println(this.tractor_model);
		System.out.println(this.interest_rate);
		System.out.println("");
	}
	public String toString() {
		return (this.tractor_company+this.tractor_model+this.interest_rate);
	}
}
