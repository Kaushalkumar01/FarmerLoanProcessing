package farmerLoanProcessing;

public class FarmerLoanProcessing {
	Farmer farmer1;
	Farmer farmer2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmer farmer1 = new Farmer("Vijay","Kumar","123456789101");
		Farmer farmer2 = new Farmer("Aman","Kumar","567891011234");
		farmer1.addingCropLoan(1000, 5);
		farmer1.addingTractorLoan(2000, 10);
		farmer2.addingCropLoan(3000, 15);
		farmer2.addingTractorLoan(4000, 20);
		farmer2.addingWaterPipeLineLoan(5000, 20);
		farmer1.cpl.isEMIPaid();
		farmer1.tl.isEMIPaid();
		farmer1.tl.isEMIPaid();
		farmer2.wpl.isEMIPaid();
		farmer2.wpl.isEMIPaid();
		farmer2.wpl.isEMIPaid();
		farmer2.cpl.isEMIPaid();
		farmer2.cpl.isEMIPaid();
		System.out.println(Loan.loan_no);
		System.out.println(Farmer.total_Loan_Amount);
		System.out.println(Farmer.total_Loan_Repaid_Amount);
	}

}
