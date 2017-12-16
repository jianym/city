package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 吉林 各地市
 *
 */	
public class JiLCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "长春", "吉林", "四平", "辽源", "通化", "白山", "松原", "白城",
				"延边" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "220100", "220200", "220300", "220400", "220500",
				"220600", "220700", "220800", "	222400" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("220100"))
			return "长春";
		else if (code.equals("220200"))
			return "吉林";
		else if (code.equals("220300"))
			return "四平";
		else if (code.equals("220400"))
			return "辽源";
		else if (code.equals("220500"))
			return "通化";
		else if (code.equals("220600"))
			return "白山";
		else if (code.equals("220700"))
			return "松原";
		else if (code.equals("220800"))
			return "白城";
		else if (code.equals("222400"))
			return "延边";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("长春"))
			return "220100";
		else if (name.equals("吉林"))
			return "220200";
		else if (name.equals("四平"))
			return "220300";
		else if (name.equals("辽源"))
			return "220400";
		else if (name.equals("通化"))
			return "220500";
		else if (name.equals("白山"))
			return "220600";
		else if (name.equals("松原"))
			return "220700";
		else if (name.equals("白城"))
			return "220800";
		else if (name.equals("延边"))
			return "222400";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("吉A"))
			return "220100";
		else if (vin.equals("吉B"))
			return "220200";
		else if (vin.equals("吉C"))
			return "220300";
		else if (vin.equals("吉D"))
			return "220400";
		else if (vin.equals("吉E"))
			return "220500";
		else if (vin.equals("吉F"))
			return "220600";
		else if (vin.equals("吉J"))
			return "220700";
		else if (vin.equals("吉G"))
			return "220800";
		else if (vin.equals("吉H"))
			return "222400";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("220100"))
			return "吉A";
		else if (code.equals("220200"))
			return "吉B";
		else if (code.equals("220300"))
			return "吉C";
		else if (code.equals("220400"))
			return "吉D";
		else if (code.equals("220500"))
			return "吉E";
		else if (code.equals("220600"))
			return "吉F";
		else if (code.equals("220700"))
			return "吉J";
		else if (code.equals("220800"))
			return "吉G";
		else if (code.equals("222400"))
			return "吉H";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("220100"))
			return "125.324500,43.886841";
		else if (code.equals("220200"))
			return "126.553020,43.843577";
		else if (code.equals("220300"))
			return "124.370785,43.170344";
		else if (code.equals("220400"))
			return "125.145349,42.902692";
		else if (code.equals("220500"))
			return "125.936501,41.721177";
		else if (code.equals("220600"))
			return "126.427839,41.942505";
		else if (code.equals("220700"))
			return "124.823608,45.118243";
		else if (code.equals("220800"))
			return "122.841114,45.619026";
		else if (code.equals("222400"))
			return "129.513228,42.904823";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("220100"))
			return "130000";
		else if (code.equals("220200"))
			return "132000";
		else if (code.equals("220300"))
			return "136000";
		else if (code.equals("220400"))
			return "136200";
		else if (code.equals("220500"))
			return "134000";
		else if (code.equals("220600"))
			return "134300";
		else if (code.equals("220700"))
			return "138000";
		else if (code.equals("220800"))
			return "137000";
		else if (code.equals("222400"))
			return "133000";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("220100"))
			return "0431";
		else if (code.equals("220200"))
			return "0432";
		else if (code.equals("220300"))
			return "0434";
		else if (code.equals("220400"))
			return "0437";
		else if (code.equals("220500"))
			return "0435";
		else if (code.equals("220600"))
			return "0439";
		else if (code.equals("220700"))
			return "0438";
		else if (code.equals("220800"))
			return "0436";
		else if (code.equals("222400"))
			return "0433";
		else
			return null;
	}

}
