package huyuwen;

//用户类
public class User {

	private int keyId;//编号
	private String name;//用户名
	private String password;//密码
	private String update_Time;//时间
	private boolean status;//登录状态
	public int getKeyId() {
		return keyId;
	}
	public void setKeyId(int keyId) {
		this.keyId = keyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUpdate_Time() {
		return update_Time;
	}
	public void setUpdate_Time(String update_Time) {
		this.update_Time = update_Time;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
}
