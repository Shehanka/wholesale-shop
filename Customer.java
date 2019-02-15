package thogaKade.model;
public class Customer{
	private String id;
	private String name;
	private String address;
	private double salary;
	
	public Customer(){}
	public Customer(String id, String name, String address, double salary){
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
	public void setId(String id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}	
	public void setAddress(String address){
		this.address=address;
	}	
	public void setSalary(double salary){
		this.salary=salary;
	}
	public String getId(){
		return id;
	}
	public String getName(){
		return name;
	}	
	public String getAddress(){
		return address;
	}	
	public double getSalary(){
		return salary;
	}	
	
}
