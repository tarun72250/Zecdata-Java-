package day09;

public class Date {

	//state , dataMember 
	private int date;//instance data member
	private int month;
	private int year;
	
	//default cons 
	public Date() {
	}
	
	//parametrize cons
	public Date(int dd , int mm , int yy) {
		this.date = dd;
		this.month=mm;
		this.year=yy;
	}
	
	//instance member method
	public void display()
	{		
		System.out.println(date+" "+month+" "+year);	
	}
}
