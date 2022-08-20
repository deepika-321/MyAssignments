package week3.day1;

public class Desktop extends Computer{
	public void desktopSize()
	{
		System.out.println("Desktop size is large");
	}
	public static void main(String[] args) {
		
		Desktop d1=new Desktop();
		d1.computerModel();
		d1.desktopSize();
	}
}
