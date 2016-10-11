
public class Run {

	
	public static void main(String[] args) {
		
		Sorter sorter=new Sorter();
		
		
		String[] str={
				"Belgium",
				"Australia",
				"Venesuela",
				"Netherlands",
				"Belarus",
				"Russia",
				"Japan",
				"China"
				};
		
		System.out.println("String array:");
		for(String i:str)
			System.out.println(i);
		
		
		
			sorter.sortByAscending(str);
			System.out.println("\nSorted string array:");
			for(String i:str)
				System.out.println(i);
			

	}	
				
}
