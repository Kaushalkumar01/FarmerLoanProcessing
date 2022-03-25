package farmerLoanProcessing;

public class CropLoan extends Loan {
	String crop_name;
	int estimated_yield;
	float interest_rate;
	long emi_amount;
	CropLoan(){
		super();
		Loan.loan_no++;
		this.interest_rate = 6.5f;
	}

	public String getCrop_name() {
		return crop_name;
	}

	public void setCrop_name(String crop_name) {
		this.crop_name = crop_name;
	}

	public int getEstimated_yield() {
		return estimated_yield;
	}

	public void setEstimated_yield(int estimated_yield) {
		this.estimated_yield = estimated_yield;
	}

	public float getInterest_rate() {
		return interest_rate;
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
	
	public void displayWaterPipe() {
		System.out.println(this.crop_name);
		System.out.println(this.estimated_yield);
		System.out.println(this.interest_rate);
		System.out.println("");
	}
	
	public String toString() {
		return (this.crop_name+this.estimated_yield+this.interest_rate);
	}
	
	public static void main(String[] args) {
		
	}

}
