package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 湖北 各地市
 *
 */
public class HuBCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "武汉", "黄石", "十堰", "宜昌", "襄阳", "鄂州", "荆门", "孝感",
				"荆州", "黄冈", "咸宁", "随州", "恩施土家族苗族", "仙桃", "潜江", "天门", "神农架" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "420100", "420200", "420300", "420500", "420600",
				"420700", "420800", "420900", "421000", "421100", "421200",
				"421300", "422800", "429004", "429005", "429006", "429021" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("420100"))
			return "武汉";
		else if (code.equals("420200"))
			return "黄石";
		else if (code.equals("420300"))
			return "十堰";
		else if (code.equals("420500"))
			return "宜昌";
		else if (code.equals("420600"))
			return "襄阳";
		else if (code.equals("420700"))
			return "鄂州";
		else if (code.equals("420800"))
			return "荆门";
		else if (code.equals("420900"))
			return "孝感";
		else if (code.equals("421000"))
			return "荆州";
		else if (code.equals("421100"))
			return "黄冈";
		else if (code.equals("421200"))
			return "咸宁";
		else if (code.equals("421300"))
			return "随州";
		else if (code.equals("422800"))
			return "恩施土家族苗族";
		else if (code.equals("429004"))
			return "仙桃";
		else if (code.equals("429005"))
			return "潜江";
		else if (code.equals("429006"))
			return "天门";
		else if (code.equals("429021"))
			return "神农架林区";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("武汉"))
			return "420100";
		else if (name.equals("黄石"))
			return "420200";
		else if (name.equals("十堰"))
			return "420300";
		else if (name.equals("宜昌"))
			return "420500";
		else if (name.equals("襄阳"))
			return "420600";
		else if (name.equals("鄂州"))
			return "420700";
		else if (name.equals("荆门"))
			return "420800";
		else if (name.equals("孝感"))
			return "420900";
		else if (name.equals("荆州"))
			return "421000";
		else if (name.equals("黄冈"))
			return "421100";
		else if (name.equals("咸宁"))
			return "421200";
		else if (name.equals("随州"))
			return "421300";
		else if (name.equals("恩施土家族苗族"))
			return "422800";
		else if (name.equals("仙桃"))
			return "429004";
		else if (name.equals("潜江"))
			return "429005";
		else if (name.equals("天门"))
			return "429006";
		else if (name.equals("神农架林区"))
			return "429021";
		else
			return null;
	}

	@Override
	public String vinToCode(String VehicleNo) {
		if ("鄂A".equals(VehicleNo))
			return "420100";
		else if ("鄂B".equals(VehicleNo))
			return "420200";
		else if ("鄂C".equals(VehicleNo))
			return "420300";
		else if ("鄂D".equals(VehicleNo))
			return "421000";
		else if ("鄂E".equals(VehicleNo))
			return "420500";
		else if ("鄂F".equals(VehicleNo))
			return "420600";
		else if ("鄂G".equals(VehicleNo))
			return "420700";
		else if ("鄂H".equals(VehicleNo))
			return "420800";
		else if ("鄂J".equals(VehicleNo))
			return "421100";
		else if ("鄂K".equals(VehicleNo))
			return "420900";
		else if ("鄂L".equals(VehicleNo))
			return "421200";
		else if ("鄂M".equals(VehicleNo))
			return "429004";
		else if ("鄂N".equals(VehicleNo))
			return "429005";
		else if ("鄂P".equals(VehicleNo))
			return "429021";
		else if ("鄂Q".equals(VehicleNo))
			return "422800";
		else if ("鄂R".equals(VehicleNo))
			return "429006";
		else if ("鄂S".equals(VehicleNo))
			return "421300";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if ("420100".equals(code))
			return "鄂A";
		else if ("420200".equals(code))
			return "鄂B";
		else if ("420300".equals(code))
			return "鄂C";
		else if ("421000".equals(code))
			return "鄂D";
		else if ("420500".equals(code))
			return "鄂E";
		else if ("420600".equals(code))
			return "鄂F";
		else if ("420700".equals(code))
			return "鄂G";
		else if ("420800".equals(code))
			return "鄂H";
		else if ("421100".equals(code))
			return "鄂J";
		else if ("420900".equals(code))
			return "鄂K";
		else if ("421200".equals(code))
			return "鄂L";
		else if ("429004".equals(code))
			return "鄂M";
		else if ("429005".equals(code))
			return "鄂N";
		else if ("429021".equals(code))
			return "鄂P";
		else if ("422800".equals(code))
			return "鄂Q";
		else if ("429006".equals(code))
			return "鄂R";
		else if ("421300".equals(code))
			return "鄂S";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("420100"))
			return "114.298572,30.584355";
		else if (code.equals("420200"))
			return "115.077048,30.220074";
		else if (code.equals("420300"))
			return "110.787916,32.646907";
		else if (code.equals("420500"))
			return "111.290843,30.702636";
		else if (code.equals("420600"))
			return "112.144146,32.042426";
		else if (code.equals("420700"))
			return "114.890593,30.396536";
		else if (code.equals("420800"))
			return "112.204251,31.03542";
		else if (code.equals("420900"))
			return "113.926655,30.926423";
		else if (code.equals("421000"))
			return "112.238130,30.326857";
		else if (code.equals("421100"))
			return "114.879365,30.447711";
		else if (code.equals("421200"))
			return "114.328963,29.832798";
		else if (code.equals("421300"))
			return "113.373770,31.717497";
		else if (code.equals("422800"))
			return "109.486990,30.283114";
		else if (code.equals("429004"))
			return "113.453974,30.364953";
		else if (code.equals("429005"))
			return "112.896866,30.421215";
		else if (code.equals("429006"))
			return "113.165862,30.653061";
		else if (code.equals("429021"))
			return "110.671525,31.744449";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("420100"))
			return "430000";
		else if (code.equals("420200"))
			return "435000";
		else if (code.equals("420300"))
			return "442000";
		else if (code.equals("420500"))
			return "443000";
		else if (code.equals("420600"))
			return "441000";
		else if (code.equals("420700"))
			return "436000";
		else if (code.equals("420800"))
			return "448000";
		else if (code.equals("420900"))
			return "432000";
		else if (code.equals("421000"))
			return "434000";
		else if (code.equals("421100"))
			return "438000";
		else if (code.equals("421200"))
			return "437000";
		else if (code.equals("421300"))
			return "441300";
		else if (code.equals("422800"))
			return "445000";
		else if (code.equals("429004"))
			return "433000";
		else if (code.equals("429005"))
			return "433100";
		else if (code.equals("429006"))
			return "431700";
		else if (code.equals("429021"))
			return "442400";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("420100"))
			return "027";
		else if (code.equals("420200"))
			return "0714";
		else if (code.equals("420300"))
			return "0719";
		else if (code.equals("420500"))
			return "0717";
		else if (code.equals("420600"))
			return "0710";
		else if (code.equals("420700"))
			return "0711";
		else if (code.equals("420800"))
			return "0724";
		else if (code.equals("420900"))
			return "0712";
		else if (code.equals("421000"))
			return "0716";
		else if (code.equals("421100"))
			return "0713";
		else if (code.equals("421200"))
			return "0715";
		else if (code.equals("421300"))
			return "0722";
		else if (code.equals("422800"))
			return "0718";
		else if (code.equals("429004"))
			return "0728";
		else if (code.equals("429005"))
			return "0728";
		else if (code.equals("429006"))
			return "0728";
		else if (code.equals("429021"))
			return "0719";
		else
			return null;
	}
}
