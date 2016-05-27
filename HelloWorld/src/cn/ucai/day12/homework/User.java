package cn.ucai.day12.homework;

public class User {
	private String id;
	private String password;
	private String email;
	public User() {
		super();
	}
	public User(String id, String password/*, String email*/) {
		super();
		this.id = id;
		this.password = password;
		this.email = this.id+"@ucai.cn";
	}
	
}
