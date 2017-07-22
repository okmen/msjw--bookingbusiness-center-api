package cn.booking.business.bean;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
/**
 * 车辆类型
 * @author Mbenben
 *
 */
public class CarTypeVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 * 车辆类型ID
	 */
	private String id;
	/**
	 * 车辆类型CODE
	 */
	private String code;
	/**
	 * 车辆类型名称
	 */
	private String name;
	/**
	 * 车辆类型说明
	 */
	private String description;
	private String carTypeId;

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
	
	public String getCarTypeId() {
		return carTypeId;
	}

	public void setCarTypeId(String carTypeId) {
		this.carTypeId = carTypeId;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
