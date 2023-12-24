public class Item {

		private String itemName;
    		private double price;
    		private int quantity;
		private double totalAmount;
    		

    	public Item(String itemName, double price, int quantity, double totalAmount) {
        	this.itemName = itemName;
        	this.price = price;
        	this.quantity = quantity;
		this.totalAmount = totalAmount; 
        	
    	}

    	public String getItemName() {
        	return itemName;
    	}

    	public double getPrice() {
        	return price;
    	}

    	public int getQuantity() {
        	return quantity;
    	}

    	public double getTotalAmount() {
       		return totalAmount;
    	}


}
