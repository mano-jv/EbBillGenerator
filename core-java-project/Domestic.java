package eB;

public class Domestic extends Connection {
	
	public Domestic(String name,int cno,double prevMonthReading, double currentMonthReading) {
		super(name,cno,prevMonthReading,currentMonthReading);
		calcBill();
	}
	
	public void calcBill() {
		if(CurrReading>=0 && CurrReading<=100)
			Bill=CurrReading*1;
		else if(CurrReading>100 && CurrReading <= 200)
			Bill=(100*1)+((CurrReading-100)*2.50);
		else if(CurrReading>200 && CurrReading <= 500)
			Bill=(100*1)+(100*2.50)+((CurrReading-200)*4);
		else
			Bill=(100*1)+(100*2.50)+(300*4)+((CurrReading-500)*6);
		//System.out.println("This month bill for "+CurrReading+" units is "+Bill+"Rs");
	}

}
