package cn.ucai.day10.homework1;

/**
 * team项目组、comm项目奖金
 */
public class Tech extends Emp {
	private String team;
	private double comm;
	public Tech() {
		super();
	}
	public Tech(String name, int id, double sal,String team,double comm) {
		super(name, id, sal);
		this.team = team;
		this.comm = comm;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	@Override
	public double getTotalSal() {
		return this.getSal()*12+this.getComm();
	}
	
}
