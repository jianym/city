package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 内蒙古 各地市
 *
 */
public class NeiMengGCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "呼和浩特", "包头", "乌海", "赤峰", "通辽", "鄂尔多斯", "呼伦贝尔",
				"巴彦淖尔", "乌兰察布", "兴安盟", "锡林郭勒盟", "阿拉善盟" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "150100", "150200", "150300", "150400", "150500",
				"150600", "150700", "150800", "150900", "152200", "152500",
				"152900"};
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("150100"))
			return "呼和浩特";
		else if (code.equals("150200"))
			return "包头";
		else if (code.equals("150300"))
			return "乌海";
		else if (code.equals("150400"))
			return "赤峰";
		else if (code.equals("150500"))
			return "通辽";
		else if (code.equals("150600"))
			return "鄂尔多斯";
		else if (code.equals("150700"))
			return "呼伦贝尔";
		else if (code.equals("150800"))
			return "巴彦淖尔";
		else if (code.equals("150900"))
			return "乌兰察布";
		else if (code.equals("152200"))
			return "兴安盟";
		else if (code.equals("152500"))
			return "锡林郭勒盟";
		else if (code.equals("152900"))
			return "阿拉善盟";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("呼和浩特"))
			return "150100";
		else if (name.equals("包头"))
			return "150200";
		else if (name.equals("乌海"))
			return "150300";
		else if (name.equals("赤峰"))
			return "150400";
		else if (name.equals("通辽"))
			return "150500";
		else if (name.equals("鄂尔多斯"))
			return "150600";
		else if (name.equals("呼伦贝尔"))
			return "150700";
		else if (name.equals("巴彦淖尔"))
			return "150800";
		else if (name.equals("乌兰察布"))
			return "150900";
		else if (name.equals("兴安盟"))
			return "152200";
		else if (name.equals("锡林郭勒盟"))
			return "152500";
		else if (name.equals("阿拉善盟"))
			return "152900";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("蒙A"))
			return "150100";
		else if (vin.equals("蒙B"))
			return "150200";
		else if (vin.equals("蒙C"))
			return "150300";
		else if (vin.equals("蒙D"))
			return "150400";
		else if (vin.equals("蒙G"))
			return "150500";
		else if (vin.equals("蒙K"))
			return "150600";
		else if (vin.equals("蒙E"))
			return "150700";
		else if (vin.equals("蒙L"))
			return "150800";
		else if (vin.equals("蒙J"))
			return "150900";
		else if (vin.equals("蒙F"))
			return "152200";
		else if (vin.equals("蒙H"))
			return "152500";
		else if (vin.equals("蒙M"))
			return "152900";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("150100"))
			return "蒙A";
		else if (code.equals("150200"))
			return "蒙B";
		else if (code.equals("150300"))
			return "蒙C";
		else if (code.equals("150400"))
			return "蒙D";
		else if (code.equals("150500"))
			return "蒙G";
		else if (code.equals("150600"))
			return "蒙K";
		else if (code.equals("150700"))
			return "蒙E";
		else if (code.equals("150800"))
			return "蒙L";
		else if (code.equals("150900"))
			return "蒙J";
		else if (code.equals("152200"))
			return "蒙F";
		else if (code.equals("152500"))
			return "蒙H";
		else if (code.equals("152900"))
			return "蒙M";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("150100"))
			return "111.670801,40.818311";
		else if (code.equals("150200"))
			return "109.840405,40.658168";
		else if (code.equals("150300"))
			return "106.825563,39.673734";
		else if (code.equals("150400"))
			return "118.956806,42.275317";
		else if (code.equals("150500"))
			return "122.263119,43.617429";
		else if (code.equals("150600"))
			return "109.990290,39.817179";
		else if (code.equals("150700"))
			return "119.758168,49.215333";
		else if (code.equals("150800"))
			return "107.416959,40.757402";
		else if (code.equals("150900"))
			return "113.114543,41.034126";
		else if (code.equals("152200"))
			return "122.070317,46.076268";
		else if (code.equals("152500"))
			return "116.090996,43.944018";
		else if (code.equals("152900"))
			return "105.706422,38.844814";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("150100"))
			return "010000";
		else if (code.equals("150200"))
			return "014000";
		else if (code.equals("150300"))
			return "016000";
		else if (code.equals("150400"))
			return "024000";
		else if (code.equals("150500"))
			return "028000";
		else if (code.equals("150600"))
			return "017000";
		else if (code.equals("150700"))
			return "021000";
		else if (code.equals("150800"))
			return "015000";
		else if (code.equals("150900"))
			return "012000";
		else if (code.equals("152200"))
			return "137400";
		else if (code.equals("152500"))
			return "026000";
		else if (code.equals("152900"))
			return "750306";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("150100"))
			return "0471";
		else if (code.equals("150200"))
			return "0472";
		else if (code.equals("150300"))
			return "0473";
		else if (code.equals("150400"))
			return "0476";
		else if (code.equals("150500"))
			return "0475";
		else if (code.equals("150600"))
			return "0477";
		else if (code.equals("150700"))
			return "0470";
		else if (code.equals("150800"))
			return "0478";
		else if (code.equals("150900"))
			return "0474";
		else if (code.equals("152200"))
			return "0482";
		else if (code.equals("152500"))
			return "0479";
		else if (code.equals("152900"))
			return "0483";
		else
			return null;
	}

}
