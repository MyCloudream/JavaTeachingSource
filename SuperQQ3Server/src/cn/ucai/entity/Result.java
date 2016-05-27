package cn.ucai.entity;

public class Result {
	private String msg;
	private boolean success;
	public Result() {
		super();
	}
	public Result(String msg, boolean success) {
		super();
		this.msg = msg;
		this.success = success;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	@Override
	public String toString() {
		return "Result [msg=" + msg + ", success=" + success + "]";
	}
}
