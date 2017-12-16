package org.ithourse.tools.city;


/**
 * 
 * @author jianym
 * 省市
 *
 */
public interface ProvinceCity extends City{


	/**
	 * 
	 * @param vin
	 *            车牌号
	 * @return 城市编码
	 */
	public String vinToCode(String vin);

	/**
	 * 
	 * @param code
	 *            城市编码
	 * @return 车牌号
	 */
	public String codeToVin(String code);



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
