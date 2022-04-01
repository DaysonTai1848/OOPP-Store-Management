import java.util.Scanner;
import java.lang.String;

public class AdminInfo {
	
	private String userID;
	private String[] name;
	private String firstname;
	private String surname;
	private char[] id = new char[30];
	
	Scanner scanner = new Scanner(System.in);
	
	public AdminInfo() {
		
		System.out.println("Enter your firstname and surname: ");
		Scanner sc = new Scanner(System.in);
		String fullname = sc.nextLine();
		
		if(fullname != null) {
			for(int i=0; i< fullname.length(); i++) {
				if(fullname.charAt(i) != ' ' ) {
					userID = "guest";
				}
				else 
				{
					String[] name = fullname.split(" ");
							
					for(int j=0; j< name.length; j++)
					{
					    System.out.println(j);
								
			     		firstname = name[0];
					    surname = name[1];
								    
					    id[0] = firstname.charAt(0);
						userID = id[0] + surname;
									
								
					}
					System.out.println("FirstName: " + firstname);
					System.out.println("Surname: " + surname);
					break;
					
				}
			}
		}
		System.out.println("Your userID is " + userID);
	}
		
	
		
		
//		String[] name = fullname.split(" ");
//		
//		for(int i=0; i< name.length; i++)
//		{
//			System.out.println(i);
//			
//			if (name.length == 0) {
//				id = "guest";
//			}
//			else
//			{
//				firstname = name[0];
//			    surname = name[1];
//			    
//			    id2[0] = firstname.charAt(0);
//				id = id2[0] + surname;
//			}   
//			
//		}
//		System.out.println("FirstName: " + firstname);
//		System.out.println("Surname: " + surname);

		//firstname = scanner.nextLine();
		//String firstname = scanner.next();
		//String surname = scanner.next();

		//System.out.println("Enter your surname: ");
		//surname = scanner.nextLine();
		
//		if(checkSpace()){
//			
//			//String[] name; 
//			firstname = name.split()[0];
//			
//			id = "guest";
//		}
//		else 
//		{
//			
//			id2[0] = firstname.charAt(0);
//			id = id2[0] + surname;
//		}
//		
		
//
//	private boolean checkSpace() {
//		// TODO Auto-generated method stub
//		return false;
//	}
	
	
	
	
//	public static void main(String[] args) {
//		AdminInfo adminInfo = new AdminInfo();
//	}
}
