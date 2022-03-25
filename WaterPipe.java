package farmerLoanProcessing;

public class WaterPipe extends Loan {
	int pipeline_length;
	String source_water;
	long emi_amount;
	float interest_rate;
	WaterPipe(){
		super();
		Loan.loan_no++;
		this.interest_rate = 5f;
	}
	public int getPipeline_length() {
		return pipeline_length;
	}
	public void setPipeline_length(int pipeline_length) {
		this.pipeline_length = pipeline_length;
	}
	public String getSource_water() {
		return source_water;
	}
	public void setSource_water(String source_water) {
		this.source_water = source_water;
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
		System.out.println(this.pipeline_length);
		System.out.println(this.source_water);
		System.out.println(this.interest_rate);
		System.out.println("");
	}
	public String toString() {
		return (this.pipeline_length+this.source_water+this.interest_rate);
	}
}
