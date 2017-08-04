package session9;

public class HDTV {
	
	private	String brandName;
	private	int size;
	
	public HDTV(String brandName,int size){
		
		this.brandName=brandName;
		this.size=size;
	}
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public String toString(){
		
		return "Brand Name= "+brandName+" Size = "+size;
		
	}


}
