package cn.booking.business.bean;

import java.io.Serializable;

/**
 * 使用性质
 * @author Mbenben
 *
 */
public class UseCharater implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1897057966893897703L;

	private String id;
	private String name;
	
	public UseCharater() {
		super();
	}
	public UseCharater(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
