package javapractice;

public class Marker {

	private String color;
	private String brand;
	private double price;
	
 Marker(String color,String brand,double price){
	 this.color=color;
	 this.brand=brand;
	 this.price=price;
 }
 
 public String getcolor() {
	 return color;
 }
 
 public String getbrand() {
	 return brand;
 }
 public double price() {
	 return price;
 }
 
 public void write() {
	 System.out.println("pen writing successfully");
 }

}
