package friday;

public class BankAccount {

	private enum InterestType {
		simple("simple"), complex("complex");

		public String mText;

		InterestType(String text) {
			mText = text;
		}

	};

	private enum Operations {
		add("add"), withdraw("withdraw"), transfer("transfer");
		private String mText;

		Operations(String text){
			mText = text;
		}
	};

	private int mCode = 1;
	private static int mID;
	private String mFirstName;
	private String mLastName;
	private int mAge;
	private double mBalance;
	private double mInterest;
	private InterestType mInterestType;
	private Operations[] mHistory = new Operations[5];
	private int mLastOperation = 0;
	
	public BankAccount(){}
	public BankAccount(String firstName, String lastName, int age, double balance, double interest,
			String interestType) throws Exception {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setBalance(balance);
		setInterest(interest);
		setInterestType(interestType);
		mID = (int) firstName.charAt(0) + 100 * (int) lastName.charAt(0) + 10000 * age + 1000000 * mCode;
		mCode++;
	}

	public String getFirstName() {
		return mFirstName;
	}

	public void setFirstName(String firstName) {
		mFirstName = firstName;
	}

	public String getLastName() {
		return mLastName;
	}

	public void setLastName(String lastName) {
		mLastName = lastName;
	}

	public int getAge() {
		return mAge;
	}

	public void setAge(int age) throws InputException {
		if (age <= 18) {
			throw new InputException();
		} else {
			mAge = age;
		}
	}

	public double getBalance() {
		return mBalance;
	}

	public void setBalance(double balance) throws InputException {
		if (balance <= 0) {
			throw new InputException();
		} else {
			mBalance = balance;
		}
	}

	public double getInterest() {
		return mInterest;
	}

	public void setInterest(double interest) throws InputException {
		if (interest > 1 || interest < 0) {
			throw new InputException();
		} else {
			mInterest = interest;
		}
	}

	public String getInterestType() {
		return mInterestType.mText;
	}

	public void setInterestType(String interestType) throws InputException {
		if(interestType.equals("simple")){
			mInterestType = InterestType.simple;
		}
		else if(interestType.equals("complex")){
			mInterestType = InterestType.complex;
		}
		else{
			throw new InputException();
		}
	}
	
	public Operations[] getHistory(){
		return mHistory;
	}
	
	public int getID(){
		return mID;
	}
	
	public void showHistory(){
		int i = 0;
		for(i = 0 ; i < mHistory.length; i++){
			System.out.println((mHistory.length - i) + " " +mHistory[i]);
		}
	}
	
	public void add(double sum) throws Exception {
		if (sum < 0) {
			throw new InputException();
		} else {
			this.mBalance = this.mBalance + sum;
			updateHistory(mLastOperation, Operations.add);
		}
	}

	public void withdraw(double sum) throws InputException, AccountBlockedException, InsufficientFundsException {
		if (sum < 0) {
			throw new InputException();
		} else if (this.mBalance < sum) {
			throw new InsufficientFundsException();
		} else if (this.mInterest > 0.01) {
			throw new AccountBlockedException();
		} else {
			this.mBalance = this.mBalance - sum;
			updateHistory(mLastOperation, Operations.withdraw);
		}
	}

	public void transfer(BankAccount donorAccount, BankAccount recipientAccount, double transferSum)
			throws InsufficientFundsException {
		if (donorAccount.mBalance < transferSum) {
			throw new InsufficientFundsException();
		} else {
			donorAccount.mBalance = donorAccount.mBalance - transferSum;
			recipientAccount.mBalance = recipientAccount.mBalance + transferSum;
			updateHistory(mLastOperation, Operations.transfer);
		}
	}

	private void updateHistory(int lastOperation, Operations type) {
		if (lastOperation == 4) {
			for (int i = 0; i < 4; i++) {
				mHistory[i] = mHistory[i + 1];
			}
			mHistory[lastOperation] = type;
		} else {
			mHistory[lastOperation] = type;
			mLastOperation++;
		}
	}

}
