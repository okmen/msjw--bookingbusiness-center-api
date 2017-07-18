package cn.booking.business.bean;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
/**
 * 证件类型
 * @author Mbenben
 *
 */
public class IdCardTypePo implements Serializable{
	/**
	 * 创建时间
	 */
	private Long id;
	/**
	 * 证件类型id
	 */
	private String idcardTypeId;
	/**
	 * 证件类型code
	 */
	private String code;
	/**
	 * 证件类型名称
	 */
	private String name;
	/**
	 * 证件类型说明
	 */
	private String description;
	/**
	 * 创建时间
	 */
	private Date createDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdcardTypeId() {
		return idcardTypeId;
	}
	public void setIdcardTypeId(String idcardTypeId) {
		this.idcardTypeId = idcardTypeId;
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
