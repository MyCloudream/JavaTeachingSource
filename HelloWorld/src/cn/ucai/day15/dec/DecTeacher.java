package cn.ucai.day15.dec;

public class DecTeacher implements ITeacher{
	private ITeacher iTeacher;
	public DecTeacher(ITeacher iTeacher) {
		this.iTeacher = iTeacher;
	}
	@Override
	public void teach() {
		joke();
		iTeacher.teach();
	}
	
	public void joke(){
		System.out.println("½²Ð¦»°");
	}
}
