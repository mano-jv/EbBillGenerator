package eB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EbObjects {
	public static void main(String[] args) {

	  List<Connection> connections=new ArrayList<Connection>();
	  String fileName="C:\\Users\\manojv\\Documents\\ebSample.csv";
	  List<String[]> data=utilities.ReadFile.read(fileName);
	  for(String[] s:data) {
		String name=s[0];
		int cno=Integer.parseInt(s[1]);
		double pMonthReading=Double.parseDouble(s[2]);
		double cMonthReading=Double.parseDouble(s[3]);
		String accountType=s[4];
		if(accountType.equals("Domestic"))
		{   
			connections.add(new Domestic(name,cno,pMonthReading,cMonthReading));
		}
		else if(accountType.equals("Commercial")) {
				connections.add(new Commercial(name,cno,pMonthReading,cMonthReading));
			
		}
			
	  }
	  for(Connection ac:connections) {
		ac.showInfo();
		System.out.println("******************************************");
	 }
  }
}
