package cn.booking.business.bean;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
/**
 * 车辆类型
 * @author Mbenben
 *
 */
public class CarTypePo implements Serializable{
	private Long id;
	private String carTypeId;
	private String code;
	private String name;
	private String description;
	private Date createDate;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCarTypeId() {
		return carTypeId;
	}


	public void setCarTypeId(String carTypeId) {
		this.carTypeId = carTypeId;
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


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
