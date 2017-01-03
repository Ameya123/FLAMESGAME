package hackerrank;
import java.util.*;

public class Flamesgame {

	static StringBuilder flame=new StringBuilder("FLAMES");
		
	public static String tellrelation(StringBuilder flame,int count,int currentindex)
	{
		if(flame.length()==1)
		{
			switch(flame.toString())
			{
			case "F":return "Friendship";
			case "L":return "Love";
			case "A":return "Afection";
			case "M":return "Marriage";
			case "E":return "Enemy";
			case "S":return "Sibbling";
			}
			return null;
		}
		
		else
		{
			currentindex=(currentindex+count-1)%flame.length();
			flame.deleteCharAt(currentindex);
			return tellrelation(flame,count,currentindex);
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int testcases;
		System.out.println("ENTER THE TOTAL TEST CASES:::");
		testcases=in.nextInt();
	
		for(int i=1;i<=testcases;i++){
		System.out.println("ENTER YOUR NAME::");	
		String string1=(in.next()).toLowerCase();
		System.out.println("ENTER YOUR PARTNERS NAME::");
		String string2=(in.next()).toLowerCase();
		
		String common = string1.replaceAll("[" + string2 + "]", "");
		common += string2.replaceAll("[" + string1 + "]", "");
		
		System.out.println("YOUR RELATION WITH HIM/HER IS OF::::"+tellrelation(flame,common.length(),0));
	}
	}
}
