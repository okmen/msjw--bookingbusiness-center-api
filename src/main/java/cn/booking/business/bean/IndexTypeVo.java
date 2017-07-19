package cn.booking.business.bean;

import java.io.Serializable;

/**
 * 指标类型
 * @author Mbenben
 *
 */
public class IndexTypeVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7737323530899627565L;

	private String id;
	private String name;
	
	public IndexTypeVo() {
		super();
	}
	public IndexTypeVo(String id, String name) {
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
