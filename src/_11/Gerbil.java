package _11;

public class Gerbil {
	private int gerbilNumber = 0;
	private String name = "";
	
	public Gerbil(int num){
		this.gerbilNumber = num;
	}
	
	public Gerbil(int num, String name){
	    this.gerbilNumber = num;
	    this.name = name;
	}
	
	public void hop(){
		System.out.println(name+gerbilNumber +"now is jumping");
	}
}
