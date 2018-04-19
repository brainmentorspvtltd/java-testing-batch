// SRP Principle

class Account{
double balance = 3000;

void withDraw(int accountNumber, double amount){
	if(isExist(accountNumber)){
	if(checkBalance(amount)){
	balance = balance - amount;
	System.out.println("WithDraw Done Remaining Balance "+balance+" Amount"+amount);
	}
	else{
	System.out.println("Insufficent Balance ");
	}
	}
	else{
	System.out.println("Invalid Account Number");
	}
	
}
boolean isExist(int accountNumber){
if(accountNumber==1001){
return true;
}
else{
return false;
}
}
boolean checkBalance(double amount){
if(balance>2000){
return true;
}
else{
return false;
}
}

public static void main(String args[]){
SavingAccount account = new SavingAccount();
account.withDraw(1001,1000); // I am Calling a function called withdraw
account.roi();
}
}

class SavingAccount extends Account{
	void roi(){
	System.out.println("Saving Account ROI is 5% ");
	}
}