package cn.ucai.day10.homework2;

public class ClassRoom {
	private Student[] stuArr;
	private static Teacher teacher;
	private static final Manager MANAGER = new Manager("ÀîË«",20,"101",1000);
	public ClassRoom(){
		stuArr = new Student[20];
		teacher = new Teacher(/*name, age, tno, sal*/);
	}
	
	public ClassRoom(int num,Teacher teacher){
		stuArr = new Student[num];
		ClassRoom.teacher = teacher;
	}
	
	public static void main(String[] args) {
		
		ClassRoom cr1 = new ClassRoom();

		Teacher t = new Teacher();
		ClassRoom cr2 = new ClassRoom(30,t);
		
		
	}
}
