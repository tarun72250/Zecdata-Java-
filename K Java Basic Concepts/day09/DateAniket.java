package day09;

public class DateAniket {
	
	//state , instance dm
	private int dd,mm,yy;
	
	//default cons 
	//it is defaulty present in class
	public DateAniket() {
		this.dd=00;
		this.mm=00;
		this.yy=00;
	}
	
	//this is used for showing the current instance dm
	//this is here differentiate between local dm and instance dm 
			
	//fully parametrized cons
	public DateAniket(int dd,int mm,int yy) {
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	//partially paramterized cons
	public DateAniket(int dd, int mm) {
		this.dd=dd;
		this.mm=mm;
	}
	
	//instance member method
	public void display() {
		System.out.println(dd+" "+mm+" "+yy);
	}

}
