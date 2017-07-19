package cn.booking.business.bean;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
/**
 * 使用性质(前端写死，没有接口)
 * @author Mbenben
 *
 */
public class UseNaturePo implements Serializable{
	/**
	 * 
	 */
	private Long id;
	/**
	 * 编码
	 */
	private String code;
	/**
	 * 性质名称
	 */
	private String name;
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
