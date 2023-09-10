package eB;

import java.util.Scanner;

public class Connection {
	private String cname;
	private int cNO;
	private double prevMonthReading;
	private double currentMonthReading;

	double CurrReading;
	double Bill;
	
	public Connection(String name,int cno,double prevMonthReading, double currentMonthReading ) {
		this.cname=name;
		this.cNO=cno;
		this.prevMonthReading=prevMonthReading;
		this.currentMonthReading=currentMonthReading;
		CurrReading=currentMonthReading-prevMonthReading;
	}
	
	public void showInfo() {
		System.out.println("Name:"+cname+"\n"+
	                        "Consumer number:"+cNO+"\n"+
				             "Previous Month Reading:"+prevMonthReading+"\n"+
	                         "Current Month Reading:"+currentMonthReading+"\n"+
	                         "This month bill for "+CurrReading+" units is "+Bill+"Rs");

		System.out.println("Do u want to pay Bill:y-yes  n-no");
		Scanner sc=new Scanner(System.in);
		char s=sc.next().charAt(0);
		if(s=='y')
		{ 
			payBill();	
		}
		else {
			System.out.println("You Bill amount is "+Bill);
		}

		
	}
    
	public void payBill() {
		System.out.println("You Bill amount is "+Bill);
		this.Bill=0;
	    System.out.println("Amount Paid successfully");
	
	}
}
