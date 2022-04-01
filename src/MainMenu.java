import java.time.LocalDateTime;

public class MainMenu {
	
	public static void main(String[] args) {
		
		LocalDateTime curDateTime = LocalDateTime.now();
		
		System.out.println("Welome to the SMS\n" + curDateTime + "\nBrendon Lee Chuin Yuen" + "\nLoh Yi Heng");
		
		AdminInfo adminInfo = new AdminInfo();
		Desktop desktop = new Desktop();
	}
	
	

}
