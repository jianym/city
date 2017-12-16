package org.ithourse.tools.city;


/**
 * 
 * @author jianym
 * 特别行政区
 *
 */
public interface SpecialCity extends City{
	

	/**
	 * 
	 * @param code
	 *            城市编码
	 * @return 邮编
	 */
	public String codeToPost();

	/**
	 * 
	 * @param code
	 *            城市编码
	 * @return 区号
	 */
	public String codeToPhone();
}
