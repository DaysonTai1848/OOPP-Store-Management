
public class Laptop extends Product {
	
	private String color; 
	private double screenSize;
	private String processor;
	private int memory;
	private int storage;
	
	public Laptop() {
		
		super();
		color = "";  
		screenSize = 0.0; 
		processor = "";
		memory = 0; 
		storage = 0; 
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}
	
	//Method to calculate inventory value
	public void calculateInventoryValue() {
		//inventoryValue = price + (price * 0.01);
	}
	
	@Override
	public String toString() {

		return "Laptop Info" + "\nColor: " + color + "\nScreen Size: " + screenSize + "\nProcessor: " 
		+ processor + "\nMemory: " + memory + "\n" + "\nStorage: " + storage +  "\n\n";

	}

}
