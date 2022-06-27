
public class Hellostring 
{
	public static void main(String[] args)
	{
		String name="te";
		
		switch(name.toLowerCase())
		{
		case"author":
			System.out.println("vikas");
			break;
		case"team":
		System.out.println("Team java full Stack");
		break;
		case"editor":
			System.out.println("srinu&sunitha");
			break;
			default:
				System.out.println("Invalid entry");
				break;
		}
	}

}
