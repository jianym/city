package org.ithourse.tools.city;

/**
 * 
 * @author jianym
 * 城市接口
 *
 */
public interface City {
	/**
	 * 
	 * @return 城市名称集合
	 */
	public String[] getNames();

	/**
	 * 
	 * @return 城市编码集合
	 */
	public String[] getCodes();

	/**
	 * 
	 * @param code
	 *            城市编码
	 * @return 城市名称
	 */
	public String codeToName(String code);

	/**
	 * 
	 * @param name
	 *            城市名称
	 * @return 城市编码
	 */
	public String nameToCode(String name);
	
	/**
	 * 
	 * @param code
	 *            城市编码
	 * @return 城市经纬度
	 */
	public String codeToPostion(String code);
}
