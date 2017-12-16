package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 山东 各地市
 *
 */
public class ShanDCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "济南", "青岛", "淄博", "枣庄", "东营", "烟台", "潍坊", "济宁",
				"泰安", "威海", "日照", "莱芜", "临沂", "德州", "聊城", "滨州", "菏泽" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "370100", "370200", "370300", "370400", "370500",
				"370600", "370700", "370800", "370900", "371000", "371100",
				"371200", "371300", "371400", "371500", "371600", "371700" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("370100"))
			return "济南";
		else if (code.equals("370200"))
			return "青岛";
		else if (code.equals("370300"))
			return "淄博";
		else if (code.equals("370400"))
			return "枣庄";
		else if (code.equals("370500"))
			return "东营";
		else if (code.equals("370600"))
			return "烟台";
		else if (code.equals("370700"))
			return "潍坊";
		else if (code.equals("370800"))
			return "济宁";
		else if (code.equals("370900"))
			return "泰安";
		else if (code.equals("371000"))
			return "威海";
		else if (code.equals("371100"))
			return "日照";
		else if (code.equals("371200"))
			return "莱芜";
		else if (code.equals("371300"))
			return "临沂";
		else if (code.equals("371400"))
			return "德州";
		else if (code.equals("371500"))
			return "聊城";
		else if (code.equals("371600"))
			return "滨州";
		else if (code.equals("371700"))
			return "菏泽";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("济南"))
			return "370100";
		else if (name.equals("青岛"))
			return "370200";
		else if (name.equals("淄博"))
			return "370300";
		else if (name.equals("枣庄"))
			return "370400";
		else if (name.equals("东营"))
			return "370500";
		else if (name.equals("烟台"))
			return "370600";
		else if (name.equals("潍坊"))
			return "370700";
		else if (name.equals("济宁"))
			return "370800";
		else if (name.equals("泰安"))
			return "370900";
		else if (name.equals("威海"))
			return "371000";
		else if (name.equals("日照"))
			return "371100";
		else if (name.equals("莱芜"))
			return "371200";
		else if (name.equals("临沂"))
			return "371300";
		else if (name.equals("德州"))
			return "371400";
		else if (name.equals("聊城"))
			return "371500";
		else if (name.equals("滨州"))
			return "371600";
		else if (name.equals("菏泽"))
			return "371700";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("鲁A"))
			return "370100";
		else if (vin.equals("鲁B") || vin.equals("鲁U"))
			return "370200";
		else if (vin.equals("鲁C"))
			return "370300";
		else if (vin.equals("鲁D"))
			return "370400";
		else if (vin.equals("鲁E"))
			return "370500";
		else if (vin.equals("鲁F") || vin.equals("鲁Y"))
			return "370600";
		else if (vin.equals("鲁G") || vin.equals("鲁V"))
			return "370700";
		else if (vin.equals("鲁H"))
			return "370800";
		else if (vin.equals("鲁J"))
			return "370900";
		else if (vin.equals("鲁K"))
			return "371000";
		else if (vin.equals("鲁L"))
			return "371100";
		else if (vin.equals("鲁S"))
			return "371200";
		else if (vin.equals("鲁Q"))
			return "371300";
		else if (vin.equals("鲁N"))
			return "371400";
		else if (vin.equals("鲁P"))
			return "371500";
		else if (vin.equals("鲁M"))
			return "371600";
		else if (vin.equals("鲁R"))
			return "371700";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("370100"))
			return "鲁A";
		else if (code.equals("370200"))
			return "鲁B,鲁U";
		else if (code.equals("370300"))
			return "鲁C";
		else if (code.equals("370400"))
			return "鲁D";
		else if (code.equals("370500"))
			return "鲁E";
		else if (code.equals("370600"))
			return "鲁F,鲁Y";
		else if (code.equals("370700"))
			return "鲁G,鲁V";
		else if (code.equals("370800"))
			return "鲁H";
		else if (code.equals("370900"))
			return "鲁J";
		else if (code.equals("371000"))
			return "鲁K";
		else if (code.equals("371100"))
			return "鲁L";
		else if (code.equals("371200"))
			return "鲁S";
		else if (code.equals("371300"))
			return "鲁Q";
		else if (code.equals("371400"))
			return "鲁N";
		else if (code.equals("371500"))
			return "鲁P";
		else if (code.equals("371600"))
			return "鲁M";
		else if (code.equals("371700"))
			return "鲁R";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("370100"))
			return "117.000923,36.675807";
		else if (code.equals("370200"))
			return "120.355173,36.082982";
		else if (code.equals("370300"))
			return "118.047648,36.814939";
		else if (code.equals("370400"))
			return "117.557964,34.856424";
		else if (code.equals("370500"))
			return "118.664710,37.434564";
		else if (code.equals("370600"))
			return "121.391382,37.539297";
		else if (code.equals("370700"))
			return "119.107078,36.709250";
		else if (code.equals("370800"))
			return "116.587245,35.415393";
		else if (code.equals("370900"))
			return "117.129063,36.194968";
		else if (code.equals("371000"))
			return "122.116394,37.509691";
		else if (code.equals("371100"))
			return "119.461208,35.428588";
		else if (code.equals("371200"))
			return "117.677736,36.214397";
		else if (code.equals("371300"))
			return "118.326443,35.065282";
		else if (code.equals("371400"))
			return "116.307428,37.453968";
		else if (code.equals("371500"))
			return "115.980367,36.456013";
		else if (code.equals("371600"))
			return "118.016974,37.383542";
		else if (code.equals("371700"))
			return "115.469381,35.246531";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("370100"))
			return "250000";
		else if (code.equals("370200"))
			return "266000";
		else if (code.equals("370300"))
			return "255000";
		else if (code.equals("370400"))
			return "277000";
		else if (code.equals("370500"))
			return "257000";
		else if (code.equals("370600"))
			return "264000";
		else if (code.equals("370700"))
			return "261000";
		else if (code.equals("370800"))
			return "272000";
		else if (code.equals("370900"))
			return "271000";
		else if (code.equals("371000"))
			return "264200";
		else if (code.equals("371100"))
			return "276800";
		else if (code.equals("371200"))
			return "271100";
		else if (code.equals("371300"))
			return "276000";
		else if (code.equals("371400"))
			return "253000";
		else if (code.equals("371500"))
			return "252000";
		else if (code.equals("371600"))
			return "256600";
		else if (code.equals("371700"))
			return "274000";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("370100"))
			return "0531";
		else if (code.equals("370200"))
			return "0532";
		else if (code.equals("370300"))
			return "0532";
		else if (code.equals("370400"))
			return "0632";
		else if (code.equals("370500"))
			return "0546";
		else if (code.equals("370600"))
			return "0535";
		else if (code.equals("370700"))
			return "0536";
		else if (code.equals("370800"))
			return "0537";
		else if (code.equals("370900"))
			return "0538";
		else if (code.equals("371000"))
			return "0631";
		else if (code.equals("371100"))
			return "0633";
		else if (code.equals("371200"))
			return "0634";
		else if (code.equals("371300"))
			return "0539";
		else if (code.equals("371400"))
			return "0534";
		else if (code.equals("371500"))
			return "0635";
		else if (code.equals("371600"))
			return "0543";
		else if (code.equals("371700"))
			return "0530";
		else
			return null;
	}

}
