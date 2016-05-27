package cn.ucai.bean;

public class User {
	private int id;
	private String userName;
	private String nick;
	private String password;
	private String avatar;
	private String groups;
	private double latitude;
	private String result;
	private String header;
	private double longitude;
	private int unreadMsgCount;
	
	public User(int id, String userName, String nick, String password, String avatar, String groups, double latitude,
			String result, String header, double longitude, int unreadMsgCount) {
		super();
		this.id = id;
		this.userName = userName;
		this.nick = nick;
		this.password = password;
		this.avatar = avatar;
		this.groups = groups;
		this.latitude = latitude;
		this.result = result;
		this.header = header;
		this.longitude = longitude;
		this.unreadMsgCount = unreadMsgCount;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getGroups() {
		return groups;
	}
	public void setGroups(String groups) {
		this.groups = groups;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public int getUnreadMsgCount() {
		return unreadMsgCount;
	}
	public void setUnreadMsgCount(int unreadMsgCount) {
		this.unreadMsgCount = unreadMsgCount;
	}
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", nick=" + nick + ", password=" + password + ", avatar="
				+ avatar + ", groups=" + groups + ", latitude=" + latitude + ", result=" + result + ", header=" + header
				+ ", longitude=" + longitude + ", unreadMsgCount=" + unreadMsgCount + "]";
	}
	
}
