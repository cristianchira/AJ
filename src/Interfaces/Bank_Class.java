package Interfaces;

class Bank_Class {
	public static void main(String[] args) {
		RBI sbiUser = new SBI();
		sbiUser.deposit();
		sbiUser.withdraw();
		sbiUser.adhartLink();
		sbiUser.minBal();

		RBI axisUser = new Axis();
		axisUser.deposit();
		axisUser.withdraw();
	}
}
