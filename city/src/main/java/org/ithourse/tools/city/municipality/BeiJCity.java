package org.ithourse.tools.city.municipality;

import org.ithourse.tools.city.MunicipalityCity;

/**
 * 
 * @author jianym
 * 北京 直辖市
 *
 */
public class BeiJCity implements MunicipalityCity {

	@Override
	public String[] getNames() {
		return new String[] { "东城区", "西城区", "朝阳区", "丰台区", "石景山区", "海淀区",
				"门头沟区", "房山区", "通州区", "顺义区", "昌平区", "大兴区", "怀柔区", "平谷区", "密云县",
				"延庆县" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "110101", "110102", "110105", "110106", "110107",
				"110108", "110109", "110111", "110112", "110113", "110114",
				"110115", "110116", "110117", "110228", "110229" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("110101"))
			return "东城区";
		else if (code.equals("110102"))
			return "西城区";
		else if (code.equals("110105"))
			return "朝阳区";
		else if (code.equals("110106"))
			return "丰台区";
		else if (code.equals("110107"))
			return "石景山区";
		else if (code.equals("110108"))
			return "海淀区";
		else if (code.equals("110109"))
			return "门头沟区";
		else if (code.equals("110111"))
			return "房山区";
		else if (code.equals("110112"))
			return "通州区";
		else if (code.equals("110113"))
			return "顺义区";
		else if (code.equals("110114"))
			return "昌平区";
		else if (code.equals("110115"))
			return "大兴区";
		else if (code.equals("110116"))
			return "怀柔区";
		else if (code.equals("110117"))
			return "平谷区";
		else if (code.equals("110228"))
			return "密云县";
		else if (code.equals("110229"))
			return "延庆县";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("东城区"))
			return "110101";
		else if (name.equals("西城区"))
			return "110102";
		else if (name.equals("朝阳区"))
			return "110105";
		else if (name.equals("丰台区"))
			return "110106";
		else if (name.equals("石景山区"))
			return "110107";
		else if (name.equals("海淀区"))
			return "110108";
		else if (name.equals("门头沟区"))
			return "110109";
		else if (name.equals("房山区"))
			return "110111";
		else if (name.equals("通州区"))
			return "110112";
		else if (name.equals("顺义区"))
			return "110113";
		else if (name.equals("昌平区"))
			return "110114";
		else if (name.equals("大兴区"))
			return "110115";
		else if (name.equals("怀柔区"))
			return "110116";
		else if (name.equals("平谷区"))
			return "110117";
		else if (name.equals("密云县"))
			return "110228";
		else if (name.equals("延庆县"))
			return "110229";
		else
			return null;
	}

	@Override
	public String[] getVheicleNo() {
		return new String[] { "京A", "京B", "京C", "京E", "京F", "京G", "京H", "京J",
				"京K", "京L", "京M", "京Y" };
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("110101"))
			return "116.418757,39.917544";
		else if (code.equals("110102"))
			return "116.366794,39.915309";
		else if (code.equals("110105"))
			return "116.486409,39.921489";
		else if (code.equals("110106"))
			return "116.286968,39.863642";
		else if (code.equals("110107"))
			return "116.195445,39.914601";
		else if (code.equals("110108"))
			return "116.310316,39.956074";
		else if (code.equals("110109"))
			return "116.105381,39.937183";
		else if (code.equals("110111"))
			return "116.139157,39.735535";
		else if (code.equals("110112"))
			return "116.658603,39.902486";
		else if (code.equals("110113"))
			return "116.653525,40.128936";
		else if (code.equals("110114"))
			return "116.235906,40.218085";
		else if (code.equals("110115"))
			return "116.338033,39.728908";
		else if (code.equals("110116"))
			return "116.637122,40.324272";
		else if (code.equals("110117"))
			return "117.112335,40.144783";
		else if (code.equals("110228"))
			return "116.843352,40.377362";
		else if (code.equals("110229"))
			return "115.985006,40.465325";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("110101"))
			return "100010";
		else if (code.equals("110102"))
			return "100032";
		else if (code.equals("110105"))
			return "100020";
		else if (code.equals("110106"))
			return "100071";
		else if (code.equals("110107"))
			return "100043";
		else if (code.equals("110108"))
			return "100089";
		else if (code.equals("110109"))
			return "102300";
		else if (code.equals("110111"))
			return "102488";
		else if (code.equals("110112"))
			return "101149";
		else if (code.equals("110113"))
			return "101300";
		else if (code.equals("110114"))
			return "102200";
		else if (code.equals("110115"))
			return "102600";
		else if (code.equals("110116"))
			return "101400";
		else if (code.equals("110117"))
			return "101200";
		else if (code.equals("110228"))
			return "101500";
		else if (code.equals("110229"))
			return "102100";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("110101"))
			return "010";
		else if (code.equals("110102"))
			return "010";
		else if (code.equals("110105"))
			return "010";
		else if (code.equals("110106"))
			return "010";
		else if (code.equals("110107"))
			return "010";
		else if (code.equals("110108"))
			return "010";
		else if (code.equals("110109"))
			return "010";
		else if (code.equals("110111"))
			return "010";
		else if (code.equals("110112"))
			return "010";
		else if (code.equals("110113"))
			return "010";
		else if (code.equals("110114"))
			return "010";
		else if (code.equals("110115"))
			return "010";
		else if (code.equals("110116"))
			return "010";
		else if (code.equals("110117"))
			return "010";
		else if (code.equals("110228"))
			return "010";
		else if (code.equals("110229"))
			return "010";
		else
			return null;
	}

}
