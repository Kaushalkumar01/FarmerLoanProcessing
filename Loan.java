package farmerLoanProcessing;

public class Loan {
	static int loan_no = 0;
	long loan_amount;
	int loan_tenure;
	int num_of_emi;
	int loan_id;
	boolean[] is_emi_paid;
	
	Loan() {
		// TODO Auto-generated constructor stub
	}
	Loan(int loan_amount, int loan_tenure){
		this.loan_id = loan_no;
		this.loan_amount = loan_amount;
		this.loan_tenure = loan_tenure;
		this.num_of_emi = loan_tenure;
		is_emi_paid = new boolean[num_of_emi];
	}
	
	
	public void displayIsEMIPaid() {
		for(int i = 0; i<num_of_emi; i++) {
			System.out.print(is_emi_paid[i]+" ");
		}
		System.out.println("");
	}
	
	public int getLoan_id() {
		return loan_id;
	}

	public long getLoan_amount() {
		return loan_amount;
	}

	public int getLoan_tenure() {
		return loan_tenure;
	}

	
	public void displayloan() {
		System.out.println(this.getLoan_id());
		System.out.println(this.getLoan_amount());
		System.out.println(this.getLoan_tenure());
		System.out.println(this.num_of_emi);
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
	}
	

}
