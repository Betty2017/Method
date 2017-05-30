import java.util.Random;
import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Choice ="y";
		
		while (Choice.equalsIgnoreCase("y"))
		
		{
			

			System.out.println("You Asked");
			
			String que = sc.nextLine();
			System.out.println("MAGIC 8-BALL SAYS:");
			
			

			String ans[] = {"It is certain"," It is decidedly so"," Without a doubt"," Yes definitely"}; 
 
			Random r = new Random();
			int index = 1 +  r.nextInt(ans.length);
			if (index == 1)
			{
				System.out.println( index + " " +ans[0]);
			}
			else if (index ==2){
				System.out.println(index + " " +ans[1]);
			}
			else if (index ==3){
				System.out.println(index + " " +ans[2]);
			}
			else if (index ==4){
				System.out.println(index + " " +ans[3]);
			}
			
			System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
		  Choice = sc.nextLine();
		
		}  //while
	
	

	}

}
