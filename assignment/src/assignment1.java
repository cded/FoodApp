// -----------------------------------------------------
// Assignment 2
// Written by: Youssef Akallal 260447651
// For CCCS 300
// -----------------------------------------------------


import javax.swing.JOptionPane; 
//This program will determine 2 output with 2 simple operations on an input entered by the user.
public class assignment1 {
public static void main(String[] args){
	double commissionYear=0;
	while (commissionYear < 100000.0){
	System.out.println("Welcome to January");
	double commissionMonth1=0;
	while(commissionMonth1<15000){
	int option = JOptionPane.showConfirmDialog(null,"Do we have a customer?", "Select an option", JOptionPane.YES_NO_OPTION);
	double transaction=Math.random()*50000.0;
	transaction=Math.round(transaction*100)/100;
	if(option==JOptionPane.YES_OPTION){
		System.out.println("Welcome to the ABC store");
		int optionTransaction = JOptionPane.showConfirmDialog(null,"Those items cost " + transaction + "$ Do you buy?", "Select an option", JOptionPane.YES_NO_OPTION);
		if (optionTransaction==JOptionPane.YES_OPTION){
			System.out.println("Thanks for the " + transaction + "$ transaction");
		}
	}
	else if (option == JOptionPane.NO_OPTION){
		System.out.println("OK, see you next time.");
	}
	double commission1=0;
	if (transaction<10000 && transaction>0.01){
		commission1=transaction*0.1;
	}
	else if (transaction<30000 && transaction>10000.01){
		commission1=10000*0.1+(transaction-10000)*0.15;
	}
	else if (transaction>30000.01){
		commission1=10000*0.1+20000*0.15+(transaction-30000)*0.2;
	}
	commissionMonth1+=commission1;
	}
	commissionYear+=commissionMonth1;
	System.out.println("Your commission pay for this month is " + commissionMonth1);

	//February
	System.out.println("Welcome to February");
	double commissionMonth2=0;
	while(commissionMonth2<15000){
	int option = JOptionPane.showConfirmDialog(null,"Do we have a customer?", "Select an option", JOptionPane.YES_NO_OPTION);
	double transaction=Math.random()*50000.0;
	transaction=Math.round(transaction*100)/100;
	if(option==JOptionPane.YES_OPTION){
		System.out.println("Welcome to the ABC store");
		int optionTransaction = JOptionPane.showConfirmDialog(null,"Those items cost " + transaction + "$ Do you buy?", "Select an option", JOptionPane.YES_NO_OPTION);
		if (optionTransaction==JOptionPane.YES_OPTION){
			System.out.println("Thanks for the " + transaction + "$ transaction");
		}
	}
	else if (option == JOptionPane.NO_OPTION){
		System.out.println("OK, see you next time.");
	}
	double commission1=0;
	if (transaction<10000 && transaction>0.01){
		commission1=transaction*0.1;
	}
	else if (transaction<30000 && transaction>10000.01){
		commission1=10000*0.1+(transaction-10000)*0.15;
	}
	else if (transaction>30000.01){
		commission1=10000*0.1+20000*0.15+(transaction-30000)*0.2;
	}
	commissionMonth2+=commission1;
	}
	commissionYear+=commissionMonth2;
	System.out.println("Your commission pay for this month is " + commissionMonth2);

	//March
	System.out.println("Welcome to March");
	double commissionMonth3=0;
	while(commissionMonth3<15000){
	int option = JOptionPane.showConfirmDialog(null,"Do we have a customer?", "Select an option", JOptionPane.YES_NO_OPTION);
	double transaction=Math.random()*50000.0;
	transaction=Math.round(transaction*100)/100;
	if(option==JOptionPane.YES_OPTION){
		System.out.println("Welcome to the ABC store");
		int optionTransaction = JOptionPane.showConfirmDialog(null,"Those items cost " + transaction + "$ Do you buy?", "Select an option", JOptionPane.YES_NO_OPTION);
		if (optionTransaction==JOptionPane.YES_OPTION){
			System.out.println("Thanks for the " + transaction + "$ transaction");
		}
	}
	else if (option == JOptionPane.NO_OPTION){
		System.out.println("OK, see you next time.");
	}
	double commission1=0;
	if (transaction<10000 && transaction>0.01){
		commission1=transaction*0.1;
	}
	else if (transaction<30000 && transaction>10000.01){
		commission1=10000*0.1+(transaction-10000)*0.15;
	}
	else if (transaction>30000.01){
		commission1=10000*0.1+20000*0.15+(transaction-30000)*0.2;
	}
	commissionMonth3+=commission1;
	}
	commissionYear+=commissionMonth3;
	System.out.println("Your commission pay for this month is " + commissionMonth3);

	//April
	System.out.println("Welcome to April");
	double commissionMonth4=0;
	while(commissionMonth4<15000){
	int option = JOptionPane.showConfirmDialog(null,"Do we have a customer?", "Select an option", JOptionPane.YES_NO_OPTION);
	double transaction=Math.random()*50000.0;
	transaction=Math.round(transaction*100)/100;
	if(option==JOptionPane.YES_OPTION){
		System.out.println("Welcome to the ABC store");
		int optionTransaction = JOptionPane.showConfirmDialog(null,"Those items cost " + transaction + "$ Do you buy?", "Select an option", JOptionPane.YES_NO_OPTION);
		if (optionTransaction==JOptionPane.YES_OPTION){
			System.out.println("Thanks for the " + transaction + "$ transaction");
		}
	}
	else if (option == JOptionPane.NO_OPTION){
		System.out.println("OK, see you next time.");
	}
	double commission1=0;
	if (transaction<10000 && transaction>0.01){
		commission1=transaction*0.1;
	}
	else if (transaction<30000 && transaction>10000.01){
		commission1=10000*0.1+(transaction-10000)*0.15;
	}
	else if (transaction>30000.01){
		commission1=10000*0.1+20000*0.15+(transaction-30000)*0.2;
	}
	commissionMonth4+=commission1;
	}
	commissionYear+=commissionMonth4;
	System.out.println("Your commission pay for this month is " + commissionMonth4);

	//May
	System.out.println("Welcome to May");
	double commissionMonth5=0;
	while(commissionMonth5<15000){
	int option = JOptionPane.showConfirmDialog(null,"Do we have a customer?", "Select an option", JOptionPane.YES_NO_OPTION);
	double transaction=Math.random()*50000.0;
	transaction=Math.round(transaction*100)/100;
	if(option==JOptionPane.YES_OPTION){
		System.out.println("Welcome to the ABC store");
		int optionTransaction = JOptionPane.showConfirmDialog(null,"Those items cost " + transaction + "$ Do you buy?", "Select an option", JOptionPane.YES_NO_OPTION);
		if (optionTransaction==JOptionPane.YES_OPTION){
			System.out.println("Thanks for the " + transaction + "$ transaction");
		}
	}
	else if (option == JOptionPane.NO_OPTION){
		System.out.println("OK, see you next time.");
	}
	double commission1=0;
	if (transaction<10000 && transaction>0.01){
		commission1=transaction*0.1;
	}
	else if (transaction<30000 && transaction>10000.01){
		commission1=10000*0.1+(transaction-10000)*0.15;
	}
	else if (transaction>30000.01){
		commission1=10000*0.1+20000*0.15+(transaction-30000)*0.2;
	}
	commissionMonth5+=commission1;
	}
	commissionYear+=commissionMonth5;
	System.out.println("Your commission pay for this month is " + commissionMonth5);

	//June
	System.out.println("Welcome to June");
	double commissionMonth6=0;
	while(commissionMonth6<15000){
	int option = JOptionPane.showConfirmDialog(null,"Do we have a customer?", "Select an option", JOptionPane.YES_NO_OPTION);
	double transaction=Math.random()*50000.0;
	transaction=Math.round(transaction*100)/100;
	if(option==JOptionPane.YES_OPTION){
		System.out.println("Welcome to the ABC store");
		int optionTransaction = JOptionPane.showConfirmDialog(null,"Those items cost " + transaction + "$ Do you buy?", "Select an option", JOptionPane.YES_NO_OPTION);
		if (optionTransaction==JOptionPane.YES_OPTION){
			System.out.println("Thanks for the " + transaction + "$ transaction");
		}
	}
	else if (option == JOptionPane.NO_OPTION){
		System.out.println("OK, see you next time.");
	}
	double commission1=0;
	if (transaction<10000 && transaction>0.01){
		commission1=transaction*0.1;
	}
	else if (transaction<30000 && transaction>10000.01){
		commission1=10000*0.1+(transaction-10000)*0.15;
	}
	else if (transaction>30000.01){
		commission1=10000*0.1+20000*0.15+(transaction-30000)*0.2;
	}
	commissionMonth6+=commission1;
	}
	commissionYear+=commissionMonth6;
	System.out.println("Your commission pay for this month is " + commissionMonth6);

	//july
	System.out.println("Welcome to July");
	double commissionMonth7=0;
	while(commissionMonth7<15000){
	int option = JOptionPane.showConfirmDialog(null,"Do we have a customer?", "Select an option", JOptionPane.YES_NO_OPTION);
	double transaction=Math.random()*50000.0;
	transaction=Math.round(transaction*100)/100;
	if(option==JOptionPane.YES_OPTION){
		System.out.println("Welcome to the ABC store");
		int optionTransaction = JOptionPane.showConfirmDialog(null,"Those items cost " + transaction + "$ Do you buy?", "Select an option", JOptionPane.YES_NO_OPTION);
		if (optionTransaction==JOptionPane.YES_OPTION){
			System.out.println("Thanks for the " + transaction + "$ transaction");
		}
	}
	else if (option == JOptionPane.NO_OPTION){
		System.out.println("OK, see you next time.");
	}
	double commission1=0;
	if (transaction<10000 && transaction>0.01){
		commission1=transaction*0.1;
	}
	else if (transaction<30000 && transaction>10000.01){
		commission1=10000*0.1+(transaction-10000)*0.15;
	}
	else if (transaction>30000.01){
		commission1=10000*0.1+20000*0.15+(transaction-30000)*0.2;
	}
	commissionMonth7+=commission1;
	}
	commissionYear+=commissionMonth7;
	System.out.println("Your commission pay for this month is " + commissionMonth7);

	//August
	System.out.println("Welcome to August");
	double commissionMonth8=0;
	while(commissionMonth8<15000){
	int option = JOptionPane.showConfirmDialog(null,"Do we have a customer?", "Select an option", JOptionPane.YES_NO_OPTION);
	double transaction=Math.random()*50000.0;
	transaction=Math.round(transaction*100)/100;
	if(option==JOptionPane.YES_OPTION){
		System.out.println("Welcome to the ABC store");
		int optionTransaction = JOptionPane.showConfirmDialog(null,"Those items cost " + transaction + "$ Do you buy?", "Select an option", JOptionPane.YES_NO_OPTION);
		if (optionTransaction==JOptionPane.YES_OPTION){
			System.out.println("Thanks for the " + transaction + "$ transaction");
		}
	}
	else if (option == JOptionPane.NO_OPTION){
		System.out.println("OK, see you next time.");
	}
	double commission1=0;
	if (transaction<10000 && transaction>0.01){
		commission1=transaction*0.1;
	}
	else if (transaction<30000 && transaction>10000.01){
		commission1=10000*0.1+(transaction-10000)*0.15;
	}
	else if (transaction>30000.01){
		commission1=10000*0.1+20000*0.15+(transaction-30000)*0.2;
	}
	commissionMonth8+=commission1;
	}
	commissionYear+=commissionMonth8;
	System.out.println("Your commission pay for this month is " + commissionMonth8);

	//September
	System.out.println("Welcome to September");
	double commissionMonth9=0;
	while(commissionMonth9<15000){
	int option = JOptionPane.showConfirmDialog(null,"Do we have a customer?", "Select an option", JOptionPane.YES_NO_OPTION);
	double transaction=Math.random()*50000.0;
	transaction=Math.round(transaction*100)/100;
	if(option==JOptionPane.YES_OPTION){
		System.out.println("Welcome to the ABC store");
		int optionTransaction = JOptionPane.showConfirmDialog(null,"Those items cost " + transaction + "$ Do you buy?", "Select an option", JOptionPane.YES_NO_OPTION);
		if (optionTransaction==JOptionPane.YES_OPTION){
			System.out.println("Thanks for the " + transaction + "$ transaction");
		}
	}
	else if (option == JOptionPane.NO_OPTION){
		System.out.println("OK, see you next time.");
	}
	double commission1=0;
	if (transaction<10000 && transaction>0.01){
		commission1=transaction*0.1;
	}
	else if (transaction<30000 && transaction>10000.01){
		commission1=10000*0.1+(transaction-10000)*0.15;
	}
	else if (transaction>30000.01){
		commission1=10000*0.1+20000*0.15+(transaction-30000)*0.2;
	}
	commissionMonth9+=commission1;
	}
	commissionYear+=commissionMonth9;
	System.out.println("Your commission pay for this month is " + commissionMonth9);

	//October
	System.out.println("Welcome to October");
	double commissionMonth10=0;
	while(commissionMonth10<15000){
	int option = JOptionPane.showConfirmDialog(null,"Do we have a customer?", "Select an option", JOptionPane.YES_NO_OPTION);
	double transaction=Math.random()*50000.0;
	transaction=Math.round(transaction*100)/100;
	if(option==JOptionPane.YES_OPTION){
		System.out.println("Welcome to the ABC store");
		int optionTransaction = JOptionPane.showConfirmDialog(null,"Those items cost " + transaction + "$ Do you buy?", "Select an option", JOptionPane.YES_NO_OPTION);
		if (optionTransaction==JOptionPane.YES_OPTION){
			System.out.println("Thanks for the " + transaction + "$ transaction");
		}
	}
	else if (option == JOptionPane.NO_OPTION){
		System.out.println("OK, see you next time.");
	}
	double commission1=0;
	if (transaction<10000 && transaction>0.01){
		commission1=transaction*0.1;
	}
	else if (transaction<30000 && transaction>10000.01){
		commission1=10000*0.1+(transaction-10000)*0.15;
	}
	else if (transaction>30000.01){
		commission1=10000*0.1+20000*0.15+(transaction-30000)*0.2;
	}
	commissionMonth10+=commission1;
	}
	commissionYear+=commissionMonth10;
	System.out.println("Your commission pay for this month is " + commissionMonth10);

	//November
	System.out.println("Welcome to November");
	double commissionMonth11=0;
	while(commissionMonth11<15000){
	int option = JOptionPane.showConfirmDialog(null,"Do we have a customer?", "Select an option", JOptionPane.YES_NO_OPTION);
	double transaction=Math.random()*50000.0;
	transaction=Math.round(transaction*100)/100;
	if(option==JOptionPane.YES_OPTION){
		System.out.println("Welcome to the ABC store");
		int optionTransaction = JOptionPane.showConfirmDialog(null,"Those items cost " + transaction + "$ Do you buy?", "Select an option", JOptionPane.YES_NO_OPTION);
		if (optionTransaction==JOptionPane.YES_OPTION){
			System.out.println("Thanks for the " + transaction + "$ transaction");
		}
	}
	else if (option == JOptionPane.NO_OPTION){
		System.out.println("OK, see you next time.");
	}
	double commission1=0;
	if (transaction<10000 && transaction>0.01){
		commission1=transaction*0.1;
	}
	else if (transaction<30000 && transaction>10000.01){
		commission1=10000*0.1+(transaction-10000)*0.15;
	}
	else if (transaction>30000.01){
		commission1=10000*0.1+20000*0.15+(transaction-30000)*0.2;
	}
	commissionMonth11+=commission1;
	}
	commissionYear+=commissionMonth11;
	System.out.println("Your commission pay for this month is " + commissionMonth11);

	//December
	System.out.println("Welcome to December");
	double commissionMonth12=0;
	while(commissionMonth12<15000){
	int option = JOptionPane.showConfirmDialog(null,"Do we have a customer?", "Select an option", JOptionPane.YES_NO_OPTION);
	double transaction=Math.random()*50000.0;
	transaction=Math.round(transaction*100)/100;
	if(option==JOptionPane.YES_OPTION){
		System.out.println("Welcome to the ABC store");
		int optionTransaction = JOptionPane.showConfirmDialog(null,"Those items cost " + transaction + "$ Do you buy?", "Select an option", JOptionPane.YES_NO_OPTION);
		if (optionTransaction==JOptionPane.YES_OPTION){
			System.out.println("Thanks for the " + transaction + "$ transaction");
		}
	}
	else if (option == JOptionPane.NO_OPTION){
		System.out.println("OK, see you next time.");
	}
	double commission1=0;
	if (transaction<10000 && transaction>0.01){
		commission1=transaction*0.1;
	}
	else if (transaction<30000 && transaction>10000.01){
		commission1=10000*0.1+(transaction-10000)*0.15;
	}
	else if (transaction>30000.01){
		commission1=10000*0.1+20000*0.15+(transaction-30000)*0.2;
	}
	commissionMonth12+=commission1;
	}
	commissionYear+=commissionMonth12;
	System.out.println("Your commission pay for this month is " + commissionMonth12);

}
	System.out.println("Your earnings for this year = " + commissionYear + "$");
	System.out.println("Welcome to Honolulu! Enjoy the rest of this year!");


	/*Total
	double commissionYear= commissionMonth1+commissionMonth2+commissionMonth3+commissionMonth4+commissionMonth5+commissionMonth6+commissionMonth7+commissionMonth8+commissionMonth9+commissionMonth10+commissionMonth11+commissionMonth12;
	System.out.println("Your earnings for this year = " + commissionYear + "$");
	if (commissionYear > 100000.00){
		System.out.println("Welcome to Honolulu! Enjoy the rest of this year!");
	}
	else{
		System.out.println("Enjoy Montreal!");
	}*/
}
}