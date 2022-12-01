package javapractice;

public class Antivirus {

	static Antivirus a;
	static int count=1;
	
	private Antivirus()
	{
		System.out.println("year time antivirus key is:");
		System.out.println("123ABCD");
		count++;
	}
	public static Antivirus getAntivirusInstance()
	{
		if(count==1)
		{
			a=new Antivirus();
		}
		return a;
	}
}
class AntivirusInstallation
{
	public static void main(String[] args) {
		System.out.println("antivirus installation process");
		Antivirus a=Antivirus.getAntivirusInstance();
	}
	}
