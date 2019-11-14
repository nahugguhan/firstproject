package ClassMethodObject;

public class Phone {
	public void phoneName() 
	{
	System.out.println("iphone 7 plus");
}
	public void phoneImeNumer()
	{
		System.out.println("851242 42212");
	}
	public void phoneCamera()
	{
		System.out.println("12"+"7");
	}
	public void phoneStorage()
	{
		System.out.println("128 gigabyte");
	}
	public void phoneOS()
	{
		System.out.println("IOS");
	}
	
	public static void main(String[] args) 
	{
	Phone p=new Phone();
	p.phoneName();
	p.phoneImeNumer();
	p.phoneCamera();
	p.phoneStorage();
	p.phoneOS();
	}
}
