package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 甘肃 各地市
 *
 */
public class GanSCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "兰州", "嘉峪关", "金昌", "白银", "天水", "武威", "张掖", "平凉",
				"酒泉", "庆阳", "定西", "陇南", "临夏州", "甘南州" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "620100", "620200", "620300", "620400", "620500",
				"620600", "620700", "620800", "620900", "621000", "	621100",
				"621200", "621300", "621400" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("620100"))
			return "兰州";
		else if (code.equals("620200"))
			return "嘉峪关";
		else if (code.equals("620300"))
			return "金昌";
		else if (code.equals("620400"))
			return "白银";
		else if (code.equals("620500"))
			return "天水";
		else if (code.equals("620600"))
			return "武威";
		else if (code.equals("620700"))
			return "张掖";
		else if (code.equals("620800"))
			return "平凉";
		else if (code.equals("620900"))
			return "酒泉";
		else if (code.equals("621000"))
			return "庆阳";
		else if (code.equals("621100"))
			return "定西";
		else if (code.equals("621200"))
			return "陇南";
		else if (code.equals("621300"))
			return "临夏州";
		else if (code.equals("621400"))
			return "甘南州";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("兰州"))
			return "620100";
		else if (name.equals("嘉峪关"))
			return "620200";
		else if (name.equals("金昌"))
			return "620300";
		else if (name.equals("白银"))
			return "620400";
		else if (name.equals("天水"))
			return "620500";
		else if (name.equals("武威"))
			return "620600";
		else if (name.equals("张掖"))
			return "620700";
		else if (name.equals("平凉"))
			return "620800";
		else if (name.equals("酒泉"))
			return "620900";
		else if (name.equals("庆阳"))
			return "621000";
		else if (name.equals("定西"))
			return "621100";
		else if (name.equals("陇南"))
			return "621200";
		else if (name.equals("临夏州"))
			return "621300";
		else if (name.equals("甘南州"))
			return "621400";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("甘A"))
			return "620100";
		else if (vin.equals("甘B"))
			return "620200";
		else if (vin.equals("甘C"))
			return "620300";
		else if (vin.equals("甘D"))
			return "620400";
		else if (vin.equals("甘E"))
			return "620500";
		else if (vin.equals("甘H"))
			return "620600";
		else if (vin.equals("甘G"))
			return "620700";
		else if (vin.equals("甘L"))
			return "620800";
		else if (vin.equals("甘F"))
			return "620900";
		else if (vin.equals("甘M"))
			return "621000";
		else if (vin.equals("甘J"))
			return "621100";
		else if (vin.equals("甘K"))
			return "621200";
		else if (vin.equals("甘N"))
			return "621300";
		else if (vin.equals("甘P"))
			return "621400";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("620100"))
			return "甘A";
		else if (code.equals("620200"))
			return "甘B";
		else if (code.equals("620300"))
			return "甘C";
		else if (code.equals("620400"))
			return "甘D";
		else if (code.equals("620500"))
			return "甘E";
		else if (code.equals("620600"))
			return "甘H";
		else if (code.equals("620700"))
			return "甘G";
		else if (code.equals("620800"))
			return "甘L";
		else if (code.equals("620900"))
			return "甘F";
		else if (code.equals("621000"))
			return "甘M";
		else if (code.equals("621100"))
			return "甘J";
		else if (code.equals("621200"))
			return "甘K";
		else if (code.equals("621300"))
			return "甘N";
		else if (code.equals("621400"))
			return "甘P";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("620100"))
			return "103.823557,36.058039";
		else if (code.equals("620200"))
			return "98.277304,39.786529";
		else if (code.equals("620300"))
			return "102.187888,38.514238";
		else if (code.equals("620400"))
			return "104.173606,36.545680";
		else if (code.equals("620500"))
			return "105.724998,34.578529";
		else if (code.equals("620600"))
			return "102.634697,37.929996";
		else if (code.equals("620700"))
			return "100.455472,38.932897";
		else if (code.equals("620800"))
			return "106.684691,35.542790";
		else if (code.equals("620900"))
			return "98.510795,39.744023";
		else if (code.equals("621000"))
			return "107.638372,35.734218";
		else if (code.equals("621100"))
			return "104.626294,35.579578";
		else if (code.equals("621200"))
			return "104.929379,33.388598";
		else if (code.equals("621300"))
			return "103.212006,35.599446";
		else if (code.equals("621400"))
			return "102.911008,34.986354";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("620100"))
			return "730000";
		else if (code.equals("620200"))
			return "735100";
		else if (code.equals("620300"))
			return "737100";
		else if (code.equals("620400"))
			return "730900";
		else if (code.equals("620500"))
			return "741000";
		else if (code.equals("620600"))
			return "733000";
		else if (code.equals("620700"))
			return "734000";
		else if (code.equals("620800"))
			return "744000";
		else if (code.equals("620900"))
			return "735000";
		else if (code.equals("621000"))
			return "745000";
		else if (code.equals("621100"))
			return "743000";
		else if (code.equals("621200"))
			return "746000";
		else if (code.equals("621300"))
			return "731100";
		else if (code.equals("621400"))
			return "747000";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("620100"))
			return "0931";
		else if (code.equals("620200"))
			return "0937";
		else if (code.equals("620300"))
			return "0935";
		else if (code.equals("620400"))
			return "0943";
		else if (code.equals("620500"))
			return "0938";
		else if (code.equals("620600"))
			return "0935";
		else if (code.equals("620700"))
			return "0936";
		else if (code.equals("620800"))
			return "0933";
		else if (code.equals("620900"))
			return "0937";
		else if (code.equals("621000"))
			return "0934";
		else if (code.equals("621100"))
			return "0932";
		else if (code.equals("621200"))
			return "0939";
		else if (code.equals("621300"))
			return "0930";
		else if (code.equals("621400"))
			return "0941";
		else
			return null;
	}

}
