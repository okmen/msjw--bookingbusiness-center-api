package cn.booking.business.service;

import java.util.List;
import java.util.concurrent.ExecutionException;

import cn.booking.business.bean.AppTimeHelper;
import cn.booking.business.bean.BusinessTypeVO;
import cn.booking.business.bean.CarTypeVO;
import cn.booking.business.bean.IdTypeVO;
import cn.booking.business.bean.OrgVO;

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
	public IdTypeVO getIdTypes(String businessTypeId,String arg0,String arg1)throws Exception;
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
	public OrgVO getOrgsByBusinessTypeId(String btId,String arg0,String arg1) throws Exception;
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
	
	
}
