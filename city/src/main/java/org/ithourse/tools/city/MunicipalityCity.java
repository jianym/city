package org.ithourse.tools.city;


/**
 * 
 * @author jianym
 * 直辖市
 *
 */
public interface MunicipalityCity extends City {
	
	/**
	 * 
	 * @return 车牌号集合
	 */
	public String[] getVheicleNo();
    

	/**
	 * 
	 * @param code
	 *            城市编码
	 * @return 邮编
	 */
	public String codeToPost(String code);

	/**
	 * 
	 * @param code
	 *            城市编码
	 * @return 区号
	 */
	public String codeToPhone(String code);
}
