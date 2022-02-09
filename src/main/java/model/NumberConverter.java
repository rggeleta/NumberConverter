package model;

/**
 * @author Roman - rggeleta@dmacc.edu
 * CIS175 - Spring 2022
 * Feb 7, 2022
 */
public class NumberConverter {
	public int userNum1;
	public int userNum2;
	public int userNum3;
	public int numbers;
	
	public NumberConverter() {
		super();
		
		
	}

	public NumberConverter(int numbers) {
		
			super();
			this.numbers = numbers;
			setNums(numbers); // NOTICE THIS METHOD CALL
		
		
		
	}

	
	public NumberConverter(int userNum1, int userNum2, int userNum3, int numbers) {
		super();
		this.userNum1 = userNum1;
		this.userNum2 = userNum2;
		this.userNum3 = userNum3;
		this.numbers = numbers;
	}

	private void setNums(int numbers) {
		// TODO Auto-generated method stub
		final int USERNUM1 = userNum1;
		final int USERNUM2 = userNum2;
		final int USERNUM3 = userNum3;
		
	}

	public int getUserNum1() {
		return userNum1;
	}

	public void setUserNum1(int userNum1) {
		this.userNum1 = userNum1;
	}

	public int getUserNum2() {
		return userNum2;
	}

	public void setUserNum2(int userNum2) {
		this.userNum2 = userNum2;
	}

	public int getUserNum3() {
		return userNum3;
	}

	public void setUserNum3(int userNum3) {
		this.userNum3 = userNum3;
	}

	@Override
	public String toString() {
		return "NumberConverter [userNum1=" + userNum1 + ", userNum2=" + userNum2 + ", userNum3=" + userNum3 + "]";
	}
	
	public int numsToAverage(String string) {
		return userNum1 + userNum2 +userNum3/3;
	}

	/**
	 * @param num1
	 * @param num2
	 * @param num3
	 * @param j 
	 * @param i 
	 * @return
	 */
	public int numsToAverage(int num1, int num2, int num3, int i, int j) {
		// TODO Auto-generated method stub
		return userNum1 + userNum2 +userNum3/3;
	}
	

}
