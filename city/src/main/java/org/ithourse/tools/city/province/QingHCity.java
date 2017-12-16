package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 青海 各地市
 *
 */
public class QingHCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "西宁", "海东", "海北", "黄南", "海南", "果洛", "玉树", "海西" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "630100", "632100", "632200", "632300", "632500",
				"632600", "632700", "632800" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("630100"))
			return "西宁";
		else if (code.equals("632100"))
			return "海东";
		else if (code.equals("632200"))
			return "海北";
		else if (code.equals("632300"))
			return "黄南";
		else if (code.equals("632500"))
			return "海南";
		else if (code.equals("632600"))
			return "果洛";
		else if (code.equals("632700"))
			return "玉树";
		else if (code.equals("632800"))
			return "海西";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("西宁"))
			return "630100";
		else if (name.equals("海东"))
			return "632100";
		else if (name.equals("海北"))
			return "632200";
		else if (name.equals("黄南"))
			return "632300";
		else if (name.equals("海南"))
			return "632500";
		else if (name.equals("果洛"))
			return "632600";
		else if (name.equals("玉树"))
			return "632700";
		else if (name.equals("海西"))
			return "632800";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("青A"))
			return "630100";
		else if (vin.equals("青B"))
			return "632100";
		else if (vin.equals("青C"))
			return "632200";
		else if (vin.equals("青D"))
			return "632300";
		else if (vin.equals("青E"))
			return "632500";
		else if (vin.equals("青F"))
			return "632600";
		else if (vin.equals("青G"))
			return "632700";
		else if (vin.equals("青H"))
			return "632800";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("630100"))
			return "青A";
		else if (code.equals("632100"))
			return "青B";
		else if (code.equals("632200"))
			return "青C";
		else if (code.equals("632300"))
			return "青D";
		else if (code.equals("632500"))
			return "青E";
		else if (code.equals("632600"))
			return "青F";
		else if (code.equals("632700"))
			return "青G";
		else if (code.equals("632800"))
			return "青H";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("630100"))
			return "101.778916,36.623178";
		else if (code.equals("632100"))
			return "102.103270,36.502916";
		else if (code.equals("632200"))
			return "100.901059,36.959435";
		else if (code.equals("632300"))
			return "102.019988,35.517744";
		else if (code.equals("632500"))
			return "100.619542,36.280353";
		else if (code.equals("632600"))
			return "100.242143,34.473600";
		else if (code.equals("632700"))
			return "97.008522,33.004049";
		else if (code.equals("632800"))
			return "97.370785,37.374663";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("630100"))
			return "810000";
		else if (code.equals("632100"))
			return "810500";
		else if (code.equals("632200"))
			return "810200";
		else if (code.equals("632300"))
			return "811200";
		else if (code.equals("632500"))
			return "811700";
		else if (code.equals("632600"))
			return "813500";
		else if (code.equals("632700"))
			return "815000";
		else if (code.equals("632800"))
			return "816000";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("630100"))
			return "0971";
		else if (code.equals("632100"))
			return "0972";
		else if (code.equals("632200"))
			return "0978";
		else if (code.equals("632300"))
			return "0973";
		else if (code.equals("632500"))
			return "0974";
		else if (code.equals("632600"))
			return "0975";
		else if (code.equals("632700"))
			return "0976";
		else if (code.equals("632800"))
			return "0977";
		else
			return null;
	}

}
