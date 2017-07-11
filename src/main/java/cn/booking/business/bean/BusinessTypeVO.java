package cn.booking.business.bean;

import java.io.Serializable;
/**
 * 业务类型
 * @author Mbenben
 *
 */
import java.util.List;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
public class BusinessTypeVO implements Serializable {
	/**
	 * 业务类型ID
	 */
	private String id;
	/**
	 * 业务类型CODE
	 */
	private String code;
	/**
	 * 业务类型名称
	 */
	private String name;
	/**
	 * 业务类型说明
	 */
	private String description;
	/**
	 * 业务类型驾驶证：JSZ  机动车：JDC
	 */
	private String lx; 
	/**
	 * 业务办理单位
	 */
	private List<OrgVO> org;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLx() {
		return lx;
	}
	public void setLx(String lx) {
		this.lx = lx;
	}
	public List<OrgVO> getOrg() {
		return org;
	}
	public void setOrg(List<OrgVO> org) {
		this.org = org;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
