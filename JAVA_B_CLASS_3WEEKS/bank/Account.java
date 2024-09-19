package week_3_Bank;
//Account = 계좌

//

public class Account {

	private String AccountNumber;
	private String AccountHolder; // 계좌주
	private int StartMoney; // 초기금액

	public Account(String accountNumber, String accountHolder, int startMoney) {

		AccountNumber = accountNumber;
		AccountHolder = accountHolder;
		StartMoney = startMoney;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return AccountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}

	public int getStartMoney() {
		return StartMoney;
	}

	public void setStartMoney(int startMoney) {
		StartMoney = startMoney;
	}

	@Override
	public String toString() {
		return String.format("계좌번호: %s, 계좌주: %s, 잔액: %d원", getAccountNumber(), getAccountHolder(), getStartMoney());
	}

}
