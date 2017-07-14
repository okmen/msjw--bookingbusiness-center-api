package cn.booking.business.bean;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class SmsInfoVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7332642213239670975L;
	private String code;
	private String msg;
	private String result;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
