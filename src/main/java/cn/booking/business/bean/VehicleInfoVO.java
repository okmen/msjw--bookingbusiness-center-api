package cn.booking.business.bean;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import cn.sdk.bean.BaseBean;
/**
 * 机动车预约信息
 * @author Mbenben
 *
 */
public class VehicleInfoVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 329879863316540978L;
	/**
	 * 预约号
	 */
	private String bookNumber;
	/**
	 * 预约单位ID
	 */
	private String organizationId;
	/**
	 * 预约单位名称
	 */
	private String organizationName;
	/**
	 * 业务类型ID
	 */
	private String businessTypeId;
	/**
	 * 业务类型名称
	 */
	private String businessTypeName;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 证件种类ID
	 */
	private String idTypeId;
	/**
	 * 证件种类名称
	 */
	private String idTypeName;
	/**
	 * 证件号码
	 */
	private String idNumber;
	/**
	 * 手机号码
	 */
	private String mobile;
	/**
	 * 预约日期
	 */
	private String appointmentDate;
	/**
	 * 预约时间段
	 */
	private String appointmentTime;
	/**
	 * 车辆类型ID
	 */
	private String carTypeId;
	/**
	 * 车辆类型名称
	 */
	private String carTypeName;
	/**
	 * 车架号
	 */
	private String carFrame;
	/**
	 * 车牌号
	 */
	private String platNumber;
	/**
	 * 预约状态  1:预约中  2：预约完成 3：失约 4：预约取消
	 */
	private String bookState;
	public String getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(String bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getBusinessTypeId() {
		return businessTypeId;
	}
	public void setBusinessTypeId(String businessTypeId) {
		this.businessTypeId = businessTypeId;
	}
	public String getBusinessTypeName() {
		return businessTypeName;
	}
	public void setBusinessTypeName(String businessTypeName) {
		this.businessTypeName = businessTypeName;
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
	public String getIdTypeName() {
		return idTypeName;
	}
	public void setIdTypeName(String idTypeName) {
		this.idTypeName = idTypeName;
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
	public String getCarTypeId() {
		return carTypeId;
	}
	public void setCarTypeId(String carTypeId) {
		this.carTypeId = carTypeId;
	}
	public String getCarTypeName() {
		return carTypeName;
	}
	public void setCarTypeName(String carTypeName) {
		this.carTypeName = carTypeName;
	}
	public String getCarFrame() {
		return carFrame;
	}
	public void setCarFrame(String carFrame) {
		this.carFrame = carFrame;
	}
	public String getPlatNumber() {
		return platNumber;
	}
	public void setPlatNumber(String platNumber) {
		this.platNumber = platNumber;
	}
	public String getBookState() {
		return bookState;
	}
	public void setBookState(String bookState) {
		this.bookState = bookState;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
