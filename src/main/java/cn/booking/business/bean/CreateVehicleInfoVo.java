package cn.booking.business.bean;

import java.io.Serializable;

/**
 * @ClassName: CreateVehicleInfoVo
 * @Description: TODO(机动车预约信息写入)
 * @author yangzan
 * @date 2017年7月12日
 */
public class CreateVehicleInfoVo implements Serializable{

	private static final long serialVersionUID = 2228693519982809481L;
	
	private String orgId;  //预约地点Id
	private String businessTypeId;  //业务类型id
	private String name;	//姓名
	private String idTypeId;	//证件种类ID
	private String idNumber;	//证件号码
	private String mobile;		//手机号码
	private String appointmentDate; //预约日期
	private String appointmentTime;  //预约时间
	private String carTypeId; 		 //号牌种类Id
	private String carFrame;		//车架号
	private String platNumber;		//车牌号或车架号
	private String bookerName;		//预约人姓名
	private String bookerIdNumber;	//预约人身份证号码
	private String bookerType;	//预约方式‘0’ 非代办(本人)，’1’ 普通代办‘2’专业代办
	private String rzjs;		//认证角色
	private String optlittleCar;		//车辆产地 ‘0’ 进口  ‘1’ 国产
	private String indexType;		//指标类型  转移登记（市内过户）,机动车注册登记,机动车转移登记（转入），选车辆型号（arg0）K31,K32,K33,K34,K41,K42,K43 小型、微型汽车，需要验证指标
	private String indexNo;		//指标号   转移登记（市内过户）,机动车注册登记,机动车转移登记（转入），选车辆型号（arg0）K31,K32,K33,K34,K41,K42,K43 小型、微型汽车，需要验证指标
	private String useCharater;	//使用性质
	private String modelName;	//车辆型号 
	private String bookerMobile;	//手机号码  获取短信验证码的手机号
	private String msgNumber;	//短信验证码  发送短信获得的6位数验证码
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
	public String getOptlittleCar() {
		return optlittleCar;
	}
	public void setOptlittleCar(String optlittleCar) {
		this.optlittleCar = optlittleCar;
	}
	public String getIndexType() {
		return indexType;
	}
	public void setIndexType(String indexType) {
		this.indexType = indexType;
	}
	public String getIndexNo() {
		return indexNo;
	}
	public void setIndexNo(String indexNo) {
		this.indexNo = indexNo;
	}
	public String getUseCharater() {
		return useCharater;
	}
	public void setUseCharater(String useCharater) {
		this.useCharater = useCharater;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
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

	
}