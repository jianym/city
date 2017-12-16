package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 浙江 各地市
 *
 */
public class ZheJCity implements ProvinceCity {
	@Override
	public String[] getNames() {
		return new String[] { "杭州", "宁波", "温州", "嘉兴", "湖州", "绍兴", "金华", "衢州",
				"舟山", "台州", "丽水" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "330100", "330200", "330300", "330400", "330500",
				"330600", "330700", "330800", "330900", "331000", "331100" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("330100"))
			return "杭州";
		else if (code.equals("330200"))
			return "宁波";
		else if (code.equals("330300"))
			return "温州";
		else if (code.equals("330400"))
			return "嘉兴";
		else if (code.equals("330500"))
			return "湖州";
		else if (code.equals("330600"))
			return "绍兴";
		else if (code.equals("330700"))
			return "金华";
		else if (code.equals("330800"))
			return "衢州";
		else if (code.equals("330900"))
			return "舟山";
		else if (code.equals("331000"))
			return "台州";
		else if (code.equals("331100"))
			return "丽水";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("杭州"))
			return "330100";
		else if (name.equals("宁波"))
			return "330200";
		else if (name.equals("温州"))
			return "330300";
		else if (name.equals("嘉兴"))
			return "330400";
		else if (name.equals("湖州"))
			return "330500";
		else if (name.equals("绍兴"))
			return "330600";
		else if (name.equals("金华"))
			return "330700";
		else if (name.equals("衢州"))
			return "330800";
		else if (name.equals("舟山"))
			return "330900";
		else if (name.equals("台州"))
			return "331000";
		else if (name.equals("丽水"))
			return "331100";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("浙A"))
			return "330100";
		else if (vin.equals("浙B"))
			return "330200";
		else if (vin.equals("浙C"))
			return "330300";
		else if (vin.equals("浙F"))
			return "330400";
		else if (vin.equals("浙E"))
			return "330500";
		else if (vin.equals("浙D"))
			return "330600";
		else if (vin.equals("浙G"))
			return "330700";
		else if (vin.equals("浙H"))
			return "330800";
		else if (vin.equals("浙J"))
			return "331000";
		else if (vin.equals("浙K"))
			return "331100";
		else if (vin.equals("浙L"))
			return "330900";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("330100"))
			return "浙A";
		else if (code.equals("330200"))
			return "浙B";
		else if (code.equals("330300"))
			return "浙C";
		else if (code.equals("330400"))
			return "浙F";
		else if (code.equals("330500"))
			return "浙E";
		else if (code.equals("330600"))
			return "浙D";
		else if (code.equals("330700"))
			return "浙G";
		else if (code.equals("330800"))
			return "浙H";
		else if (code.equals("330900"))
			return "浙L";
		else if (code.equals("331000"))
			return "浙J";
		else if (code.equals("331100"))
			return "浙K";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("330100"))
			return "120.153576,30.287459";
		else if (code.equals("330200"))
			return "121.549792,29.868388";
		else if (code.equals("330300"))
			return "120.672111,28.000575";
		else if (code.equals("330400"))
			return "120.750865,30.762653";
		else if (code.equals("330500"))
			return "120.102398,30.867198";
		else if (code.equals("330600"))
			return "120.582112,29.997117";
		else if (code.equals("330700"))
			return "119.649506,29.089524";
		else if (code.equals("330800"))
			return "118.872630,28.941708";
		else if (code.equals("330900"))
			return "122.106863,30.016028";
		else if (code.equals("331000"))
			return "121.428599,28.661378";
		else if (code.equals("331100"))
			return "119.921786,28.451993";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("330100"))
			return "310000";
		else if (code.equals("330200"))
			return "315000";
		else if (code.equals("330300"))
			return "325000";
		else if (code.equals("330400"))
			return "312000";
		else if (code.equals("330500"))
			return "313000";
		else if (code.equals("330600"))
			return "314000";
		else if (code.equals("330700"))
			return "321000";
		else if (code.equals("330800"))
			return "324000";
		else if (code.equals("330900"))
			return "316000";
		else if (code.equals("331000"))
			return "318000";
		else if (code.equals("331100"))
			return "323000";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("330100"))
			return "0571";
		else if (code.equals("330200"))
			return "0574";
		else if (code.equals("330300"))
			return "0577";
		else if (code.equals("330400"))
			return "0573";
		else if (code.equals("330500"))
			return "0572";
		else if (code.equals("330600"))
			return "0575";
		else if (code.equals("330700"))
			return "0579";
		else if (code.equals("330800"))
			return "0570";
		else if (code.equals("330900"))
			return "0580";
		else if (code.equals("331000"))
			return "0576";
		else if (code.equals("331100"))
			return "0578";
		else
			return null;
	}
}
