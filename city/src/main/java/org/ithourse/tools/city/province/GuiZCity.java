package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 贵州 各地市
 *
 */
public class GuiZCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "贵阳", "六盘水", "遵义", "安顺", "毕节", "铜仁", "黔西南州",
				"黔东南州", "黔南州" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "520100", "520200", "520300", "520400", "520500",
				"520600", "522300", "522600", "522700" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("520100"))
			return "贵阳";
		else if (code.equals("520200"))
			return "六盘水";
		else if (code.equals("520300"))
			return "遵义";
		else if (code.equals("520400"))
			return "安顺";
		else if (code.equals("520500"))
			return "毕节";
		else if (code.equals("520600"))
			return "铜仁";
		else if (code.equals("522300"))
			return "黔西南州";
		else if (code.equals("522600"))
			return "黔东南州";
		else if (code.equals("522700"))
			return "黔南州";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("520100"))
			return "贵阳";
		else if (name.equals("520200"))
			return "六盘水";
		else if (name.equals("520300"))
			return "遵义";
		else if (name.equals("520400"))
			return "安顺";
		else if (name.equals("520500"))
			return "毕节";
		else if (name.equals("520600"))
			return "铜仁";
		else if (name.equals("522300"))
			return "黔西南州";
		else if (name.equals("522600"))
			return "黔东南州";
		else if (name.equals("522700"))
			return "黔南州";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("贵A"))
			return "520100";
		else if (vin.equals("贵B"))
			return "520200";
		else if (vin.equals("贵C"))
			return "520300";
		else if (vin.equals("贵G"))
			return "520400";
		else if (vin.equals("贵F"))
			return "520500";
		else if (vin.equals("贵D"))
			return "520600";
		else if (vin.equals("贵E"))
			return "522300";
		else if (vin.equals("贵H"))
			return "522600";
		else if (vin.equals("贵J"))
			return "522700";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("520100"))
			return "贵A";
		else if (code.equals("520200"))
			return "贵B";
		else if (code.equals("520300"))
			return "贵C";
		else if (code.equals("520400"))
			return "贵G";
		else if (code.equals("520500"))
			return "贵F";
		else if (code.equals("520600"))
			return "贵D";
		else if (code.equals("522300"))
			return "贵E";
		else if (code.equals("522600"))
			return "贵H";
		else if (code.equals("522700"))
			return "贵J";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("520100"))
			return "106.713478,26.578343";
		else if (code.equals("520200"))
			return "104.846743,26.584643";
		else if (code.equals("520300"))
			return "106.937265,27.706626";
		else if (code.equals("520400"))
			return "105.932188,26.245544";
		else if (code.equals("520500"))
			return "105.285010,27.301693";
		else if (code.equals("520600"))
			return "109.191555,27.718346";
		else if (code.equals("522300"))
			return "104.897971,25.088120";
		else if (code.equals("522600"))
			return "107.977488,26.583352";
		else if (code.equals("522700"))
			return "107.517156,26.258219";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("520100"))
			return "550000";
		else if (code.equals("520200"))
			return "553000";
		else if (code.equals("520300"))
			return "563000";
		else if (code.equals("520400"))
			return "561000";
		else if (code.equals("520500"))
			return "551700";
		else if (code.equals("520600"))
			return "554300";
		else if (code.equals("522300"))
			return "562400";
		else if (code.equals("522600"))
			return "556000";
		else if (code.equals("522700"))
			return "558000";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("520100"))
			return "0851";
		else if (code.equals("520200"))
			return "0858";
		else if (code.equals("520300"))
			return "0852";
		else if (code.equals("520400"))
			return "0853";
		else if (code.equals("520500"))
			return "0857";
		else if (code.equals("520600"))
			return "0856";
		else if (code.equals("522300"))
			return "0859";
		else if (code.equals("522600"))
			return "0855";
		else if (code.equals("522700"))
			return "0854";
		else
			return null;
	}

}
