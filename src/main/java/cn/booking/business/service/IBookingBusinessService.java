package cn.booking.business.service;

import java.util.List;
import java.util.concurrent.ExecutionException;

import cn.booking.business.bean.AppTimeHelper;
import cn.booking.business.bean.BusinessTypeVO;
import cn.booking.business.bean.CarTypeVO;
import cn.booking.business.bean.IdTypeVO;
import cn.booking.business.bean.OrgVO;
import cn.booking.business.bean.SmsInfoVO;

public interface IBookingBusinessService{
	/**
	 * 获取车辆类型列表
	 */
	public List<CarTypeVO> getCarTypes() throws Exception;
	/**
	 * 获取业务类型 
	 * @param type 业务类型 ‘0’驾驶证业务  ‘1’机动车业务
	 * @param part 暂不需要传值  0’获取所有业务类型 ‘1’获取可统一接口
	 * @param arg0
	 * @param arg1
	 * @return
	 * @throws Exception
	 */
	public List<BusinessTypeVO> getBusinessTypes(String type,String part,String arg0,String arg1)throws Exception;
	/**
	 * 获取身份证明类型
	 * @param businessTypeId 业务类型ID 不能为空
	 * @param arg0 保留字段0
	 * @param arg1 保留字段1
	 * @return
	 * @throws Exception
	 */
	public List<IdTypeVO> getIdTypes(String businessTypeId,String arg0,String arg1)throws Exception;
	/**
	 * 根据单位ID获取单位详细信息
	 * @param orgId 单位ID 不能为空
	 * @return
	 * @throws Exception
	 */
	public OrgVO findOrgByOrgId(String orgId)throws Exception;
	/**
	 * 根据业务类型获取可预约单位
	 * @param btId 业务类型ID 不能为空
	 * @param arg0 保留字段0
	 * @param arg1 保留字段1
	 * @return
	 * @throws Exception
	 */
	public List<OrgVO> getOrgsByBusinessTypeId(String btId,String arg0,String arg1) throws Exception;
	/**
	 * 获取可预约时间段
	 * @param date 预约日期    不能为空
	 * @param orgId 预约单位ID  不能为空
	 * @param businessTypeId 业务类型ID
	 * @param carTypeId 车辆类型ID
	 * @param optlittleCar 车辆产地  ‘0’ 进口  ‘1’ 国产
	 * @return
	 * @throws Exception
	 */
	public List<AppTimeHelper> getAppTimes(String date,String orgId,String businessTypeId,String carTypeId,String optlittleCar)throws Exception;
	/**
	 * 获取可预约日期 
	 * @param orgId 预约单位ID  必填
	 * @param businessTypeId 业务类型ID 必填
	 * @param arg0
	 * @param arg1
	 * @return
	 * @throws Exception
	 */
	public List<String> getAppointmentDate(String orgId,String businessTypeId,String arg0,String arg1)throws Exception;
	/**
	 * 发送短信验证码 
	 * @param mobile 获取短信验证码的手机号
	 * @param idType 本次预约所填写的证件种类ID,由于六年免检没有证件种类，请传”0”
	 * @param lx 1:驾驶证业务  2:机动车业务（六年免检业务传3）  3:其他（包括六年免检业务）
	 * @param ip 用户客户端IP
	 * @param bookerType ‘0’非代办（或本人） ‘1’普通代办 ‘2’专业代办（企业代办）
	 * @param bookerName 代办人姓名： 0’非代办（或本人）情况请传本次预约业务填写的姓名
	 * @param bookerIdNumber 代办人身份证号码： 0’非代办（或本人）情况请传本次预约业务填写的证件号码
	 * @param idNumber 本次预约业务填写的证件号码
	 * @param codes 本次预约的具体业务类型（例如：JD01）
	 * @return
	 * @throws Exception
	 */
	public SmsInfoVO simpleSendMessage(String mobile,String idType,String lx,String ip,String bookerType,String bookerName,String bookerIdNumber,String idNumber,String codes)throws Exception;
}
