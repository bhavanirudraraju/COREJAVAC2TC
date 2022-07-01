package com.tnsif.thiskeyword;

public class Student 
{
    int sid;
    String sname;
     static String collegename="SVKP";
    
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
  void display()
  {
	  System.out.println(sid+""+ sname +""+collegename);
  }
	public static void main(String[] args) 
	{
     Student obj= new Student(101,"sunitha");	  
     Student obj1= new Student(102,"srinu");
     
     obj.display();
     obj1.display();
}
}