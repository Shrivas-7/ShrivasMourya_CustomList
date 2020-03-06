import java.io.*;
import java.util.*; 
class list{
	static List<Integer> l1 = new ArrayList<Integer>();
	int a;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	list()
	{
		l1.add(0, 1); 
        	l1.add(1, 2);
	}
	void add()throws IOException
	{
		System.out.println("Enter the element to be added to the list");
		
		a=Integer.parseInt(br.readLine());
		l1.add(a);
	}
	void remove()throws IOException
	{
		System.out.println("Enter the index to be removed from the list");
		a=Integer.parseInt(br.readLine());
		l1.remove(a); 
	}
	void display()
	{
		System.out.println(l1);
	}

}
class main
{
	public static void main(String args[])throws IOException
	{
		int n,i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		list c =new list();
		do{
		System.out.println("Press 1 to add elements");
		System.out.println("Press 2 to remove elements");
		System.out.println("Press 3 to display elements");
		n=Integer.parseInt(br.readLine());
		switch(n)
		{
			case 1:	c.add();
				break;
			case 2:	c.remove();
				break;
			case 3:	c.display();
				break;
		}
		System.out.println("Press 0 to exit");
		i=Integer.parseInt(br.readLine());
		}
		while(i!=0);
	}
}











			