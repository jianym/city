package org.ithourse.tools.city.special;

import org.ithourse.tools.city.SpecialCity;

/**
 * 
 * @author jianym
 * 澳门特别行政区
 *
 */
public class MacaoCity implements SpecialCity {

	@Override
	public String[] getNames() {
		return new String[] { "花地玛堂区", "花王堂区", "大堂区", "望德堂区", "风顺堂区", "嘉模堂区",
				"路氹填海区", "圣方济各堂区" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "820001", "820002", "820004", "820003", "820005",
				"820006", "820007", "820008" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("820001"))
			return "花地玛堂区";
		else if (code.equals("820002"))
			return "花王堂区";
		else if (code.equals("820004"))
			return "大堂区";
		else if (code.equals("820003"))
			return "望德堂区";
		else if (code.equals("820005"))
			return "风顺堂区";
		else if (code.equals("820006"))
			return "嘉模堂区";
		else if (code.equals("820007"))
			return "路氹填海区";
		else if (code.equals("820008"))
			return "圣方济各堂区";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("花地玛堂区"))
			return "820001";
		else if (name.equals("花王堂区"))
			return "820002";
		else if (name.equals("大堂区"))
			return "820004";
		else if (name.equals("望德堂区"))
			return "820003";
		else if (name.equals("风顺堂区"))
			return "820005";
		else if (name.equals("嘉模堂区"))
			return "820006";
		else if (name.equals("路氹填海区"))
			return "820007";
		else if (name.equals("圣方济各堂区"))
			return "820008";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("820001"))
			return "113.5528956,22.20787";
		else if (code.equals("820002"))
			return "113.5489608,22.1992075";
		else if (code.equals("820004"))
			return "113.5536475,22.18853944";
		else if (code.equals("820003"))
			return "113.5501828,22.19372083";
		else if (code.equals("820005"))
			return "113.5419278,22.18736806";
		else if (code.equals("820006"))
			return "113.5587044,22.15375944";
		else if (code.equals("820007"))
			return "113.5695992,22.13663";
		else if (code.equals("820008"))
			return "113.5599542,22.12348639";
		else
			return null;
	}

	@Override
	public String codeToPost() {
		return "999078";
	}

	@Override
	public String codeToPhone() {
		return "00853";
	}

}
