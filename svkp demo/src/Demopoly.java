
public class Demopoly 
{
	void add(int x,int y) 
	{
		System.out.println("The sum is:"+(x+y));
		
	}
	void add(int x,int y,int z)
	{
		System.out.println("The sum is:"+(x+y+z));
		
	}
	void add(int x,int y,int z,int i)
	{
		System.out.println("The sum is:"+(x+y+z+i));
	}
    public static void main(String[] args) 
    {  
	Demopoly obj=new Demopoly();
	obj.add(2,  5);
	obj.add(3, 5,9);
	obj.add(12,2,3,7);
    }
}
