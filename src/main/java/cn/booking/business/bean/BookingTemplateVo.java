package cn.booking.business.bean;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import cn.sdk.util.DateUtil2;
/**
 * 模板点击之后显示的字段
 * @author Mbenben
 */
@SuppressWarnings(value="all")
public class BookingTemplateVo implements Serializable{
	
	
	public static void main(String[] args) {
		/*BookingTemplateVo handleTemplateVo = new BookingTemplateVo(1, "complementTheMotorVehicleDrivingLicense", "33333333333", DateUtil2.date2str(new Date()));
		try {
			String baseUrl = "/appointSuccess?";
			String url = BookingTemplateVo.getUrl(handleTemplateVo,baseUrl);
			System.out.println(url);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}
	
	/**
     * javaBean 转 Map
     * @param object 需要转换的javabean
     * @return  转换结果map
     * @throws Exception
     */
    public static Map<String, Object> beanToMap(Object object) throws Exception
    {
        Map<String, Object> map = new HashMap<String, Object>();
        Class cls = object.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if(null != field.get(object)){
            	map.put(field.getName(), field.get(object));
            }
        }
        return map;
    }
	public static String getUrlParamsByMap(Map<String, Object> map,boolean isSort) {
	      if (map == null) {
	          return "";
	      }
	      StringBuffer sb = new StringBuffer();
	      List<String> keys = new ArrayList<String>(map.keySet());
	      if (isSort) {
	          Collections.sort(keys);
	      }
	      for (int i = 0; i < keys.size(); i++) {
	          String key = keys.get(i);
	          String value = map.get(key).toString();
	          sb.append(key + "=" + value);
	          sb.append("&");
	      }
	      String s = sb.toString();
	      if (s.endsWith("&")) {
	          s = s.substring(0, s.lastIndexOf("&"));
	      }
	      return s;
	}
	public static String getUrl(BookingTemplateVo handleTemplateVo,String baseUrl) throws Exception{
		StringBuffer sBuffer = new StringBuffer();
		Map<String, Object> map = beanToMap(handleTemplateVo);
		String paramsStr = getUrlParamsByMap(map, true);
		sBuffer.append(baseUrl).append(paramsStr);
		return sBuffer.toString();
	}
	
	private Integer type; //业务类型  0-驾驶证业务，1-机动车业务
	private String title; //具体业务类型,例如 核发校车标牌
	private String plateType; //号牌种类
	private String numberPlate; //号牌号码
	private String mobilephone; //手机号码
	private String effectiveTime; //有效时间
	private String waterNumber; //流水号码
	private String bidDate; //申办日期
	private String appTime; //预约时间
	private String address; //预约地点
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPlateType() {
		return plateType;
	}

	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getEffectiveTime() {
		return effectiveTime;
	}

	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getWaterNumber() {
		return waterNumber;
	}

	public void setWaterNumber(String waterNumber) {
		this.waterNumber = waterNumber;
	}

	public String getBidDate() {
		return bidDate;
	}

	public void setBidDate(String bidDate) {
		this.bidDate = bidDate;
	}

	public String getAppTime() {
		return appTime;
	}

	public void setAppTime(String appTime) {
		this.appTime = appTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 
	 * @param type 业务类型 0-驾驶证业务，1-机动车业务
	 * @param title 具体业务类型,例如 六年免检申请
	 * @param waterNumber 流水号码
	 * @param appTime 预约时间
	 * @param address 预约地点
	 */
	public BookingTemplateVo(Integer type, String title, String waterNumber, String appTime, String address) {
		this.type = type;
		this.title = title;
		this.waterNumber = waterNumber;
		this.appTime = appTime;
		this.address = address;
	}
	/**
	 * 
	 * @param type 业务类型  0-驾驶证业务，1-机动车业务
	 * @param title 具体业务类型,例如 六年免检申请
	 * @param bidDate 申办日期
	 * @param plateType 号牌种类
	 * @param numberPlate 号牌号码
	 * @param mobilephone 手机号
	 * @param effectiveTime 有效时间
	 */
	/*public BookingTemplateVo(Integer type, String title, String bidDate, String plateType, String numberPlate, String mobilephone,
			String effectiveTime) {
		this.type = type;
		this.title = title;
		this.bidDate = bidDate;
		this.plateType = plateType;
		this.numberPlate = numberPlate;
		this.mobilephone = mobilephone;
		this.effectiveTime = effectiveTime;
	}*/
	
	public BookingTemplateVo() {
		
	}
	@Override 
    public String toString() { 
		return ReflectionToStringBuilder.toString(this); 
    }
	
}