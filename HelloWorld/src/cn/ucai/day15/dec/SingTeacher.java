package cn.ucai.day15.dec;

public class SingTeacher implements ITeacher{
	private ITeacher iTeacher;
	public SingTeacher(ITeacher iTeacher) {
		this.iTeacher = iTeacher;
	}
	@Override
	public void teach() {
		this.iTeacher.teach();
		sing();
	}
	
	public void sing(){
		System.out.println("³ª¸è");
	}
}
