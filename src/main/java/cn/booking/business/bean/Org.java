package cn.booking.business.bean;

import java.io.Serializable;
import java.util.List;

public class Org  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3145775844969355793L;

	private List<OrgVO> orgVOs;

	public List<OrgVO> getOrgVOs() {
		return orgVOs;
	}

	public void setOrgVOs(List<OrgVO> orgVOs) {
		this.orgVOs = orgVOs;
	}

	
}
