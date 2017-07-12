package cn.booking.business.bean;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import cn.sdk.bean.BaseBean;
/**
 * 业务办理单位
 * @author Mbenben
 *
 */
public class OrgVO extends BaseBean implements Serializable {
	/**
	 * 单位id
	 */
	private String id;
	/**
	 * 单位代码
	 */
	private String code;
	/**
	 * 单位名称
	 */
	private String name;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 地理位置坐标
	 */
	private String pointx;
	/**
	 * 地理位置坐标
	 */
	private String pointy;
	
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
	public String getPointx() {
		return pointx;
	}
	public void setPointx(String pointx) {
		this.pointx = pointx;
	}
	public String getPointy() {
		return pointy;
	}
	public void setPointy(String pointy) {
		this.pointy = pointy;
	}
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
