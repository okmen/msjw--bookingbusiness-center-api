package cn.booking.business.service;

import java.util.LinkedHashMap;
import java.util.List;

import cn.booking.business.bean.BusinessTypeVO;
import cn.booking.business.bean.IdTypeVO;
import cn.booking.business.bean.OrgVO;

public interface IBookingBusinessService{
	/**
	 * 获取车辆类型列表
	 */
	public List<IdTypeVO> getCarTypes(LinkedHashMap<String, Object> map) throws Exception;
	/**
	 * 获取业务类型
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<BusinessTypeVO> getBusinessTypes(LinkedHashMap<String, Object> map)throws Exception;
	/**
	 *获取身份证明类型
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<IdTypeVO>getIdTypes(LinkedHashMap<String, Object> map)throws Exception;
	/**
	 * 根据单位ID获取单位详细信息
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public OrgVO findOrgByOrgId(LinkedHashMap<String, Object> map)throws Exception;
	/**
	 * 根据业务类型获取可预约单位
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public OrgVO getOrgsByBusinessTypeId(LinkedHashMap<String, Object> map)throws Exception;
}
