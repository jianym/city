package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 宁夏 各地市
 *
 */
public class NingXCity implements ProvinceCity{

	@Override
	public String[] getNames() {
		return new String[]{"银川","石嘴山","吴忠","固原","中卫"};
	}

	@Override
	public String[] getCodes() {
	    return new String[]{"640100","640200","640300","640400","640500"};
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("640100"))
			return "银川";
		else if (code.equals("640200"))
			return "石嘴山";
		else if (code.equals("640300"))
			return "吴忠";
		else if (code.equals("640400"))
			return "固原";
		else if (code.equals("640500"))
			return "中卫";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("银川"))
			return "640100";
		else if (name.equals("石嘴山"))
			return "640200";
		else if (name.equals("吴忠"))
			return "640300";
		else if (name.equals("固原"))
			return "640400";
		else if (name.equals("中卫"))
			return "640500";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("宁A"))
			return "640100";
		else if (vin.equals("宁B"))
			return "640200";
		else if (vin.equals("宁C"))
			return "640300";
		else if (vin.equals("宁D"))
			return "640400";
		else if (vin.equals("宁E"))
			return "640500";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("640100"))
			return "宁A";
		else if (code.equals("640200"))
			return "宁B";
		else if (code.equals("640300"))
			return "宁C";
		else if (code.equals("640400"))
			return "宁D";
		else if (code.equals("640500"))
			return "宁E";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("640100"))
			return "106.278179,38.466370";
		else if (code.equals("640200"))
			return "106.376173,39.013330";
		else if (code.equals("640300"))
			return "106.199409,37.986165";
		else if (code.equals("640400"))
			return "106.285241,36.004561";
		else if (code.equals("640500"))
			return "105.189568,37.514951";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("640100"))
			return "750000";
		else if (code.equals("640200"))
			return "753000";
		else if (code.equals("640300"))
			return "751100";
		else if (code.equals("640400"))
			return "756000";
		else if (code.equals("640500"))
			return "755000";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("640100"))
			return "0951";
		else if (code.equals("640200"))
			return "0952";
		else if (code.equals("640300"))
			return "0953";
		else if (code.equals("640400"))
			return "0954";
		else if (code.equals("640500"))
			return "0955";
		else
			return null;
	}

}
