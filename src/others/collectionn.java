package others;


import java.util.ArrayList;
import java.util.List;

public class collectionn {

	public static void main(String[] args)
	{
		List<String> a = new ArrayList<String>();
		a.add("a");
		a.add("b");
		a.add("b");
		a.add(null);
		a.add("8");
		
	int	count=a.size();
	
		System.out.println("count");
		for(int i=0;i<count;i++)
		{
			String d = a.get(i);
			System.out.println(d);
		}
			

	}

}
