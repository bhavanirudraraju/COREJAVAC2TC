
class Inheritance
{
	void show()
	{
		System.out.println("This is super class");
	}
}
public class Demoinh extends Inheritance
{
	void show()
	{
		System.out.println("This is sub class");
		super.show();
	}
	public static void main(String[] args)
	{
		Demoinh obj=new Demoinh();
		obj.show();
	}

}
