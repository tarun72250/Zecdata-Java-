package day08;

public class A_03_ContinueDemo {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++) {
			
			//skip and continue
			if(i==6 ) {
				continue;
			}
			System.out.println(i);
		}
	}
}
