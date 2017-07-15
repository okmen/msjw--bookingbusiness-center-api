package cn.booking.business.bean;

import java.io.Serializable;

/**
 * 核发临牌Vo
 * @author Mbenben
 * @param orgId 预约地点ID
 * @param businessTypeId 业务类型ID
 * @param name 车主姓名
 * @param idTypeId 证件种类ID
 * @param idNumber 证件号码
 * @param mobile 手机号码
 * @param adress 居住地址
 * @param appointmentDate 预约日期
 * @param appointmentTime 预约时间
 * @param carTypeId 车辆类型ID
 * @param carFrame 车架号
 * @param platNumber 车牌号或车架号
 * @param chineseBrand  中文品牌
 * @param vehicleType 车辆型号
 * @param passengerNumber 载客人数
 * @param engineNumber 发动机号
 * @param bookerName 预约人*
 * @param bookerIdNumber 预约人身份证号码*
 * @param bookerType 预约方式 ‘0’本人*
 * @param rzjs 认证角色
 * @param arg0 手机号
 * @param arg1 短信验证码
 * @param arg2 保留字段2*
 * @param arg3 保留字段3*
 * @param arg4 保留字段4*
 * @param arg5 保留字段5*
 */
public class CreateTemporaryLicenseVehicleInfoVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5002286921847295042L;
	
	private String orgId;			//预约地点ID
	private String businessTypeId;	//业务类型ID
	private String name;			//车主姓名
	private String idTypeId;		//证件种类ID
	private String idNumber;		//证件号码
	private String mobile;			//手机号码
	private String adress;			//居住地址
	private String appointmentDate;	//预约日期
	private String appointmentTime;	//预约时间
	private String carTypeId;		//车辆类型ID
	private String carFrame;		//车架号
	private String platNumber;		//车牌号或车架号(机动车注册，核发临牌，机动车转移登记（市内过户），机动车变更登记（夫妻变更）这些业务由于没有车牌号码，就传车架号)
	private String chineseBrand;	//中文品牌
	private String vehicleType;		//车辆型号
	private String passengerNumber;	//载客人数
	private String engineNumber;	//发动机号
	private String bookerName;		//预约人*
	private String bookerIdNumber;	//预约人身份证号码*
	private String bookerType;		//预约方式* ‘0’本人
	private String rzjs;			//认证角色* ‘2’企业星级用户，其他，非企业星级用户
	private String arg0;			//手机号
	private String arg1;			//短信验证码
	private String arg2;			//保留字段2*
	private String arg3;			//保留字段3*
	private String arg4;			//保留字段4*
	private String arg5;			//保留字段5*
	
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
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
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
	public String getChineseBrand() {
		return chineseBrand;
	}
	public void setChineseBrand(String chineseBrand) {
		this.chineseBrand = chineseBrand;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getPassengerNumber() {
		return passengerNumber;
	}
	public void setPassengerNumber(String passengerNumber) {
		this.passengerNumber = passengerNumber;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
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
	public String getRzjs() {
		return rzjs;
	}
	public void setRzjs(String rzjs) {
		this.rzjs = rzjs;
	}
	public String getArg0() {
		return arg0;
	}
	public void setArg0(String arg0) {
		this.arg0 = arg0;
	}
	public String getArg1() {
		return arg1;
	}
	public void setArg1(String arg1) {
		this.arg1 = arg1;
	}
	public String getArg2() {
		return arg2;
	}
	public void setArg2(String arg2) {
		this.arg2 = arg2;
	}
	public String getArg3() {
		return arg3;
	}
	public void setArg3(String arg3) {
		this.arg3 = arg3;
	}
	public String getArg4() {
		return arg4;
	}
	public void setArg4(String arg4) {
		this.arg4 = arg4;
	}
	public String getArg5() {
		return arg5;
	}
	public void setArg5(String arg5) {
		this.arg5 = arg5;
	}
}
