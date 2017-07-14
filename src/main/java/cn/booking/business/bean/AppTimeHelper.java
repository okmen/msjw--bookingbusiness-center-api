package cn.booking.business.bean;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import cn.sdk.bean.BaseBean;
/**
 * 时间段
 * @author Mbenben
 *
 */
public class AppTimeHelper implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5714034755398158276L;
	/**
	 * 预约时间段
	 */
	private String apptime;
	/**
	 * 最大预约数
	 */
	private String maxnumber;
	/**
	 * 已预约数
	 */
	private String yetnumber;
	
	public String getApptime() {
		return apptime;
	}
	public void setApptime(String apptime) {
		this.apptime = apptime;
	}
	public String getMaxnumber() {
		return maxnumber;
	}
	public void setMaxnumber(String maxnumber) {
		this.maxnumber = maxnumber;
	}
	public String getYetnumber() {
		return yetnumber;
	}
	public void setYetnumber(String yetnumber) {
		this.yetnumber = yetnumber;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
