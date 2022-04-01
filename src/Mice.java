
public class Mice {
	
	private String connectivity;
	private String size;
	private String scrollType;
	
	
	public Mice() {
		
		connectivity = "";
		size = "";
		scrollType = "";
	}


	public String getConnectivity() {
		return connectivity;
	}


	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getScrollType() {
		return scrollType;
	}


	public void setScrollType(String scrollType) {
		this.scrollType = scrollType;
	}
	
	//Method to calculate inventory value
	

	@Override
	public String toString() {

		return "Mice Info" + "\nConnectivity: " + connectivity + "\nSize: " + size + "\nScroll Type: " 
		+ scrollType + "\n\n";

	}
}
