import java.util.Scanner;
import java.lang.Math;

public class MoneyDoubler
{
	public static void main(String[] args)
	{
		double percentage;
		double money;
		double baseMoney;
		int month = 0;
		int year;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in the percentage per annum: ");
		percentage = input.nextDouble();
		System.out.print("Enter in your starting amount: ");
		money = input.nextDouble();
		baseMoney = money;
		percentage = ((percentage/100)/12)+1;
		while(money <= (baseMoney *2))
		{
			money = money * percentage;
			month += 1;
		}
		for(int i = 0; i < month%12; i++)
		{
			money = money * percentage;
		}
		year = (int)Math.ceil(month/12);

		System.out.printf("To double your base amount it will take %d years%n", year);
		System.out.printf("You final balance will be $%f", money);
	}
}
