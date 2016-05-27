package cn.ucai.jsonparse.apistore.bean;

public class Root {
	private int errNum;

	private String retMsg;

	private RetData retData;

	public void setErrNum(int errNum) {
		this.errNum = errNum;
	}

	public int getErrNum() {
		return this.errNum;
	}

	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}

	public String getRetMsg() {
		return this.retMsg;
	}

	public void setRetData(RetData retData) {
		this.retData = retData;
	}

	public RetData getRetData() {
		return this.retData;
	}

}