
public class inovice implements payable {
	private String partNumber;
	private String partDescription;
	private double quantity;
	private double pricePerItem;
	public inovice(String partNum, String partDes, double qua, double price) {
		partNumber = partNum;
		partDescription = partDes;
		setQuantity(qua);
		setPricePerItem(price);
	}
	public void setPartNumber(String partNum){
		partNumber = partNum;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartDescription(String partDes){
		partDescription = partDes;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setQuantity(double qua) {
		if(qua<0) {
		 	throw new IllegalArgumentException("quantity has to be >=0");
		}
		quantity = qua;
	 }
	public double getQuantity() {
		return quantity;
	}
	public void setPricePerItem(double price) {
		if(price<0 && price==0) {
		 	throw new IllegalArgumentException("price has to be >=0");
		}
		pricePerItem = price;
	 }
	public double getPricePerItem() {
		return pricePerItem;
	}
	public double getPaymentAmount() {
		return quantity * pricePerItem;
	}
	public String toString() {
		return 	"inovice: " +"\n"+
				"part number: " +getPartNumber()+" "+"("+getPartDescription()+")"+"\n"+
				"quantity: "+getQuantity()+"\n"+
				"price per item"+getPricePerItem();
	
	}
}
