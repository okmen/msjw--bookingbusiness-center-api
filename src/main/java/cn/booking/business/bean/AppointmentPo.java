package cn.booking.business.bean;

import java.io.Serializable;
/**
 * 预约时间
 * @author Mbenben
 *
 */
import java.util.Date;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
public class AppointmentPo implements Serializable{
	
	private Long id;
	private String appointment;
	private Date createDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAppointment() {
		return appointment;
	}
	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
