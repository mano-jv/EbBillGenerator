package eB;

public class Commercial extends Connection{
	
	
	public Commercial(String name,int cno,double prevMonthReading, double currentMonthReading) {
		
		super(name,cno,prevMonthReading,currentMonthReading);
		calcBill();
		
	}
	
	public void calcBill() {
		if(CurrReading>=0 && CurrReading<=100)
			Bill=CurrReading*2;
		else if(CurrReading>100 && CurrReading <= 200)
			Bill=(100*1)+((CurrReading-100)*4.50);
		else if(CurrReading>200 && CurrReading <= 500)
			Bill=(100*1)+(100*2.50)+((CurrReading-200)*6);
		else
			Bill=(100*1)+(100*2.50)+(300*4)+((CurrReading-500)*7);
		//System.out.println("This month bill for "+CurrReading+" units is "+Bill+"Rs");

	}

}
