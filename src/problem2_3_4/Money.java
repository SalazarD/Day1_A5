package problem2_3_4;

public class Money {

	private int numberOfPennies;
	private int numberOfNickles;
	private int numberOfDimes;
	private int numberOfQuarters;
	
	public Money(int numberOfPennies, int numberOfNickles, int numberOfDimes, int numberOfQuarters) {
		
		this.numberOfPennies = numberOfPennies;
		this.numberOfNickles = numberOfNickles;
		this.numberOfDimes = numberOfDimes;
		this.numberOfQuarters = numberOfQuarters;
		
	}
	
	public int getnumberOfPennies() {
		return numberOfPennies;
	}
	
	public void addPennies(int num) {
		numberOfPennies += num;
	}
	
	public int getnumberOfNickels() {
		return numberOfNickles;
	}
	public void addNickles(int num) {
		numberOfNickles += num;
	}
	
	public int getnumberOfDimes() {
		return numberOfDimes;
	}
	public void addDimes(int num) {
		numberOfDimes += num;
	}
	
	public int getnumberOfQuarters() {
		return numberOfQuarters;
	}
	public void addQuarters(int num) {
		numberOfQuarters += num;
	}
	
	public double getTotal() {
		return numberOfPennies * 0.01 + numberOfNickles * 0.05 + numberOfDimes * 0.1 + numberOfQuarters * 0.25;
	}

}