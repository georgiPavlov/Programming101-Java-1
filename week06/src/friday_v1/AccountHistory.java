package friday_v1;

public class AccountHistory {

	private Integer mDonorAccountID;
	private Integer mRecipiendAccountID;
	private Double mBalanceBeforeOperation;
	private Double mBalanceAfterOperation;
	private String mOperationType;

	public AccountHistory() {
		this.mDonorAccountID = new Integer(-1);
		this.mRecipiendAccountID = new Integer(-1);
		this.mOperationType = "";
		this.mBalanceBeforeOperation = new Double(-1);
		this.mBalanceAfterOperation = new Double(-1);
	}

	public Integer getDonorAccountID() {
		return this.mDonorAccountID;
	}

	public Integer getRecipientAccountID() {
		return this.mRecipiendAccountID;
	}

	public String getLastOperationType() {
		return this.mOperationType;
	}

	public double getBalanceBeforeOperation() {
		return this.mBalanceBeforeOperation;
	}

	public double getBalanceAfterOperation() {
		return this.mBalanceAfterOperation;
	}

	public void updateHistory(Integer donorAccount, Integer recipientAccount, String lastOperationType,
			double balanceBeforeOperation, double balanceAfterOperation) {
		this.mDonorAccountID = donorAccount;
		this.mRecipiendAccountID = recipientAccount;
		this.mOperationType = lastOperationType;
		this.mBalanceBeforeOperation = balanceBeforeOperation;
		this.mBalanceAfterOperation = balanceAfterOperation;
	}

	public String getAccountHistoryInformation() {
		return "Donor ID:" + this.mDonorAccountID + "\n" + "Recipient ID:" + this.mRecipiendAccountID + "\n"
				+ "Operation Type:" + this.mOperationType + "\n" + "Balance before transaction:"
				+ this.mBalanceBeforeOperation + "\n" + "Balance after transaction:" + this.mBalanceAfterOperation
				+ "\n";

	}

}
