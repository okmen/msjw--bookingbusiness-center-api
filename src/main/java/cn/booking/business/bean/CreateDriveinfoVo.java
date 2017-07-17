package cn.booking.business.bean;

import java.io.Serializable;

import cn.sdk.bean.BaseBean;

public class CreateDriveinfoVo extends BaseBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String orgId;//预约地点ID
	private String businessTypeId;//业务类型ID
	private String name;//姓名
	private String idTypeId;//证件种类ID
	private String idNumber;//证件号码
	private String mobile;//手机号码
	private String appointmentDate;//预约日期
	private String appointmentTime;//预约时间
	private String bookerName;//预约人
	private String bookerIdNumber;//预约人身份证号码
	private String bookerType;//预约方式
	private String bookerMobile;//手机号码
	private String msgNumber;//短信验证码
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getBusinessTypeId() {
		return businessTypeId;
	}
	public void setBusinessTypeId(String businessTypeId) {
		this.businessTypeId = businessTypeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdTypeId() {
		return idTypeId;
	}
	public void setIdTypeId(String idTypeId) {
		this.idTypeId = idTypeId;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public String getBookerName() {
		return bookerName;
	}
	public void setBookerName(String bookerName) {
		this.bookerName = bookerName;
	}
	public String getBookerIdNumber() {
		return bookerIdNumber;
	}
	public void setBookerIdNumber(String bookerIdNumber) {
		this.bookerIdNumber = bookerIdNumber;
	}
	public String getBookerType() {
		return bookerType;
	}
	public void setBookerType(String bookerType) {
		this.bookerType = bookerType;
	}
	public String getBookerMobile() {
		return bookerMobile;
	}
	public void setBookerMobile(String bookerMobile) {
		this.bookerMobile = bookerMobile;
	}
	public String getMsgNumber() {
		return msgNumber;
	}
	public void setMsgNumber(String msgNumber) {
		this.msgNumber = msgNumber;
	}
	@Override
	public String toString() {
		return "CreateDriveinfoVo [orgId=" + orgId + ", businessTypeId=" + businessTypeId + ", name=" + name
				+ ", idTypeId=" + idTypeId + ", idNumber=" + idNumber + ", mobile=" + mobile + ", appointmentDate="
				+ appointmentDate + ", appointmentTime=" + appointmentTime + ", bookerName=" + bookerName
				+ ", bookerIdNumber=" + bookerIdNumber + ", bookerType=" + bookerType + ", bookerMobile=" + bookerMobile
				+ ", msgNumber=" + msgNumber + "]";
	}

	
}
