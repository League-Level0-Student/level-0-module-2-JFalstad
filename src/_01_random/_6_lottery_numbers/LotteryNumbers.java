package _01_random._6_lottery_numbers;

import java.util.Random;

public class LotteryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for (int i = 0; i < 6; i++) {
		
	
	Random lotteryNum = new Random();
	int randomNumber = lotteryNum.nextInt(6 - 0 + 1) + 0;
	System.out.println(randomNumber);
	}
	}

}
