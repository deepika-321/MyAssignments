package week1.day1;

public class Calculator {
	

		
		public int add(int num1,int num2,int num3) {
			int c= num1+num2+num3;
			return c;
			
		}
		public int sub(int num1,int num2) {
			int d= num1-num2;
			return d;
			
		}
		public double mul(double num1,double num2) {
			double e= num1*num2;
			return e;
	}
		public float divide(float num1,float num2) {
			float f= num1/num2;
			return f;
		}
		public static class MyCalculator {
			
		
			public static void main(String[] args) {
				Calculator c1=new Calculator();
				int c=c1.add(10, 20, 30);
				System.out.println(c);
				int d=c1.sub(20, 10);
				System.out.println(d);
				double e=c1.mul(10, 5);
				System.out.println(e);
				float f=c1.divide(100, 50);
				System.out.println(f);
			}
		}
}


