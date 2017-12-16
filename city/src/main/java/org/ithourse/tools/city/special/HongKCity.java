package org.ithourse.tools.city.special;

import org.ithourse.tools.city.SpecialCity;

/**
 * 
 * @author jianym
 * 香港特别行政区
 *
 */
public class HongKCity implements SpecialCity {

	@Override
	public String[] getNames() {
		return new String[] { "荃湾区", "湾仔区", "东区", "南区", "油尖旺区", "深水埗区", "九龙城区",
				"中西区", "观塘区", "离岛区", "屯门区", "元朗区", "北区", "大埔区", "西贡区", "沙田区",
				"葵青区", "黄大仙区" };
	}

	@Override
	public String[] getCodes() {

		return new String[] { "810010", "810002", "810003", "810004", "810005",
				"810006", "810007", "810001", "810009", "810018", "810011",
				"810012", "810013", "810014","810015","810016","810017","810008" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("810010"))
			return "荃湾区";
		else if (code.equals("810002"))
			return "湾仔区";
		else if (code.equals("810003"))
			return "东区";
		else if (code.equals("810004"))
			return "南区";
		else if (code.equals("810005"))
			return "油尖旺区";
		else if (code.equals("810006"))
			return "深水埗区";
		else if (code.equals("810007"))
			return "九龙城区";
		else if (code.equals("810001"))
			return "中西区";
		else if (code.equals("810009"))
			return "观塘区";
		else if (code.equals("810018"))
			return "离岛区";
		else if (code.equals("810011"))
			return "屯门区";
		else if (code.equals("810012"))
			return "元朗区";
		else if (code.equals("810013"))
			return "北区";
		else if (code.equals("810014"))
			return "大埔区";
		else if (code.equals("810015"))
			return "西贡区";
		else if (code.equals("810016"))
			return "沙田区";
		else if (code.equals("810017"))
			return "葵青区";
		else if (code.equals("810008"))
			return "黄大仙区";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("荃湾区"))
			return "810010";
		else if (name.equals("湾仔区"))
			return "810002";
		else if (name.equals("东区"))
			return "810003";
		else if (name.equals("南区"))
			return "810004";
		else if (name.equals("油尖旺区"))
			return "810005";
		else if (name.equals("深水埗区"))
			return "810006";
		else if (name.equals("九龙城区"))
			return "810007";
		else if (name.equals("中西区"))
			return "810001";
		else if (name.equals("观塘区"))
			return "810009";
		else if (name.equals("离岛区"))
			return "810018";
		else if (name.equals("屯门区"))
			return "810011";
		else if (name.equals("元朗区"))
			return "810012";
		else if (name.equals("北区"))
			return "810013";
		else if (name.equals("大埔区"))
			return "810014";
		else if (name.equals("西贡区"))
			return "810015";
		else if (name.equals("沙田区"))
			return "810016";
		else if (name.equals("葵青区"))
			return "810017";
		else if (name.equals("黄大仙区"))
			return "810008";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("810010"))
			return "114.1210792,22.36830667";
		else if (code.equals("810002"))
			return "114.1829153,22.27638889";
		else if (code.equals("810003"))
			return "114.2260031,22.27969306";
		else if (code.equals("810004"))
			return "114.1600117,22.24589667";
		else if (code.equals("810005"))
			return "114.1733317,22.31170389";
		else if (code.equals("810006"))
			return "114.1632417,22.33385417";
		else if (code.equals("810007"))
			return "114.1928467,22.312510";
		else if (code.equals("810001"))
			return "114.1543731,22.28198083";
		else if (code.equals("810009"))
			return "114.2140542,22.32083778";
		else if (code.equals("810018"))
			return "113.946120,22.28640778";
		else if (code.equals("810011"))
			return "113.9765742,22.39384417";
		else if (code.equals("810012"))
			return "114.0324381,22.44142833";
		else if (code.equals("810013"))
			return "114.1473639,22.49610389";
		else if (code.equals("810014"))
			return "114.1717431,22.44565306";
		else if (code.equals("810015"))
			return "114.264645,22.31421306";
		else if (code.equals("810016"))
			return "114.1953653,22.37953167";
		else if (code.equals("810017"))
			return "114.1393194,22.36387667";
		else if (code.equals("810008"))
			return "114.2038856,22.33632056";
		else
			return null;
	}

	@Override
	public String codeToPost() {
		return "999077";
	}

	@Override
	public String codeToPhone() {
		return "0852";
	}

	

}
