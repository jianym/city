package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 西藏 各地市
 *
 */
public class XiZCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "拉萨", "日喀则", "昌都", "林芝", "山南地区", "那曲地区", "阿里地区" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "540100", "540200", "540300", "540400", "540500",
				"542400", "542500" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("540100"))
			return "拉萨";
		else if (code.equals("540200"))
			return "日喀则";
		else if (code.equals("540300"))
			return "昌都";
		else if (code.equals("540400"))
			return "林芝";
		else if (code.equals("540500"))
			return "山南地区";
		else if (code.equals("542400"))
			return "那曲地区";
		else if (code.equals("542500"))
			return "阿里地区";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("拉萨"))
			return "540100";
		else if (name.equals("日喀则"))
			return "540200";
		else if (name.equals("昌都"))
			return "540300";
		else if (name.equals("林芝"))
			return "540400";
		else if (name.equals("山南地区"))
			return "540500";
		else if (name.equals("那曲地区"))
			return "542400";
		else if (name.equals("阿里地区"))
			return "542500";
		else
			return null;
	}

	@Override
	public String vinToCode(String VehicleNo) {
		if (VehicleNo.equals("藏A"))
			return "540100";
		else if (VehicleNo.equals("藏D"))
			return "540200";
		else if (VehicleNo.equals("藏B"))
			return "540300";
		else if (VehicleNo.equals("藏G"))
			return "540400";
		else if (VehicleNo.equals("藏C"))
			return "540500";
		else if (VehicleNo.equals("藏E"))
			return "542400";
		else if (VehicleNo.equals("藏F"))
			return "542500";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("540100"))
			return "藏A";
		else if (code.equals("540200"))
			return "藏D";
		else if (code.equals("540300"))
			return "藏B";
		else if (code.equals("540400"))
			return "藏G";
		else if (code.equals("540500"))
			return "藏C";
		else if (code.equals("542400"))
			return "藏E";
		else if (code.equals("542500"))
			return "藏F";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("540100"))
			return "91.132212,29.660361";
		else if (code.equals("540200"))
			return "88.885148,29.267519";
		else if (code.equals("540300"))
			return "97.178452,31.136875";
		else if (code.equals("540400"))
			return "94.362348,29.654693";
		else if (code.equals("540500"))
			return "91.766529,29.236023";
		else if (code.equals("542400"))
			return "92.060214,31.476004";
		else if (code.equals("542500"))
			return "80.105498,32.503187";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("540100"))
			return "850000";
		else if (code.equals("540200"))
			return "857000";
		else if (code.equals("540300"))
			return "854000";
		else if (code.equals("540400"))
			return "860000";
		else if (code.equals("540500"))
			return "850700";
		else if (code.equals("542400"))
			return "852000";
		else if (code.equals("542500"))
			return "859000";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("540100"))
			return "0891";
		else if (code.equals("540200"))
			return "0892";
		else if (code.equals("540300"))
			return "0895";
		else if (code.equals("540400"))
			return "0894";
		else if (code.equals("540500"))
			return "0893";
		else if (code.equals("542400"))
			return "0896";
		else if (code.equals("542500"))
			return "0897";
		else
			return null;
	}
}
