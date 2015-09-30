import java.util.Scanner;

public class assignment1 {
public static void main(String[] args){
	System.out.println("Welcome to the candy store!");
	Scanner user_input = new Scanner(System.in);
	System.out.println("How many coupons do you have?");
	int coupons = user_input.next();
	int candyBars = coupons/5;
	int freeGames = (coupons%5)/3;
	System.out.println("You have" + candyBars + "candy bars and" + freegames "freeGames");
	System.out.println("Enjoy!");
	}
}