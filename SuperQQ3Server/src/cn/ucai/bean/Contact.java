package cn.ucai.bean;

public class Contact {
	private int id;
	private int myuid;
	private int cuid;
	private String result;
	private boolean isGetMyLocation;
	private boolean isShowMyLocation;
	
	public Contact(int id, int myuid, int cuid, String result, boolean isGetMyLocation, boolean isShowMyLocation) {
		super();
		this.id = id;
		this.myuid = myuid;
		this.cuid = cuid;
		this.result = result;
		this.isGetMyLocation = isGetMyLocation;
		this.isShowMyLocation = isShowMyLocation;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", myuid=" + myuid + ", cuid=" + cuid + ", isGetMyLocation=" + isGetMyLocation
				+ ", isShowMyLocation=" + isShowMyLocation + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cuid;
		result = prime * result + id;
		result = prime * result + (isGetMyLocation ? 1231 : 1237);
		result = prime * result + (isShowMyLocation ? 1231 : 1237);
		result = prime * result + myuid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (cuid != other.cuid)
			return false;
		if (id != other.id)
			return false;
		if (isGetMyLocation != other.isGetMyLocation)
			return false;
		if (isShowMyLocation != other.isShowMyLocation)
			return false;
		if (myuid != other.myuid)
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMyuid() {
		return myuid;
	}
	public void setMyuid(int myuid) {
		this.myuid = myuid;
	}
	public int getCuid() {
		return cuid;
	}
	public void setCuid(int cuid) {
		this.cuid = cuid;
	}
	public boolean isGetMyLocation() {
		return isGetMyLocation;
	}
	public void setGetMyLocation(boolean isGetMyLocation) {
		this.isGetMyLocation = isGetMyLocation;
	}
	public boolean isShowMyLocation() {
		return isShowMyLocation;
	}
	public void setShowMyLocation(boolean isShowMyLocation) {
		this.isShowMyLocation = isShowMyLocation;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
