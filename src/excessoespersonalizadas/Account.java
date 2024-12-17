package excessoespersonalizadas;

import exceptions.DepositException;
import exceptions.WithdrawException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	//Constructor with overload
	public Account() {}

	//Constructor default
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	//Getters and setters
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) { //optional
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	};
	
	//Metodos
	public void deposit(Double amount) throws DepositException {
		if(amount < 0) {
			throw new DepositException("Deposit error: The deposit amount must be greater than zero");
		}else {
			balance += amount;
		}
	}
	
	public void withdraw(Double amount) throws WithdrawException {
		if(amount > withdrawLimit) {
			throw new WithdrawException("Withdraw error: The amount exceeds withdraw limit");
		}else if (amount > balance) {
			throw new WithdrawException("Withdraw error: Not enough balance");
		}else {
			balance -= amount;
			System.out.println("Novo saldo: " + getBalance());
		}	
	}	
}