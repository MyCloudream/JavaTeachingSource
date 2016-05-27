package cn.ucai.day10.homework1;

public class Admin extends Emp {
	private String car;
	public Admin(){
		
	}
	
	public Admin(String name,int id,double sal,String car){
		super(name,id,sal);
		this.car = car;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	@Override
	public double getTotalSal() {
		return this.getSal()*12;
	}
	
}
