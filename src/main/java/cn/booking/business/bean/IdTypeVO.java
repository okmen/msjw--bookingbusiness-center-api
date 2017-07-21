package cn.booking.business.bean;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
/**
 * 身份证明
 * @author Mbenben
 *
 */
public class IdTypeVO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 证件类型ID
	 */
	private String id;
	/**
	 * 证件类型CODE
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
	 * 证件类型id
	 */
	private String idcardTypeId;

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

	public String getIdcardTypeId() {
		return idcardTypeId;
	}

	public void setIdcardTypeId(String idcardTypeId) {
		this.idcardTypeId = idcardTypeId;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
