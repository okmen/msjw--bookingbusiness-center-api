package cn.booking.business.bean;

import java.io.Serializable;

public class CarModelVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;//车辆型号代号
	private String str;//车辆型号名称
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "CarModelVo [id=" + id + ", str=" + str + "]";
	}

	
	
}
