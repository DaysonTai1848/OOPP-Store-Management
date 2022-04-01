
public class Desktop extends Product {
	
	private String category;
	private String processor;
	private int memory;
	private int storageSize;
	private String storageType;
	private int screenSize;
	private String factor; // what is this ?
	
	public Desktop() {
		
		category = "";
		processor = "";
		memory = 0;
		storageSize = 0;
		storageType = "";
		screenSize = 0;
		factor = "";
		
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public int getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}

	public String getStorageType() {
		return storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public String getFactor() {
		return factor;
	}

	public void setFactor(String factor) {
		this.factor = factor;
	}
	
	//Method to calculate inventory value


	@Override
	public String toString() {

		return "Desktop Info" + "\nCategory: " + category + "\nProcessor: " + processor + 
		"\nMemory: " + memory + "\n" + "\nStorage Size: " + storageSize + "\nStorage Type: " +
		storageType + "\nScreen Size: " + screenSize + "\nFactor: "  + factor + "\n\n";

	}

}
