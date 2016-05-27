package cn.ucai.json;

public class Result {
	private boolean isSuccess;
	private String msg;
	public boolean getIsSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Result [isSuccess=" + isSuccess + ", msg=" + msg + "]";
	}
}
