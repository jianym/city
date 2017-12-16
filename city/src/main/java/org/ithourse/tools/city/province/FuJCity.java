package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 福建 各地市
 *
 */
public class FuJCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "福州", "厦门", "莆田", "三明", "泉州", "漳州", "南平", "龙岩",
				"宁德" };
	}

	@Override
	public String[] getCodes() {
		// TODO Auto-generated method stub
		return new String[] { "350100", "350200", "350300", "350400", "350500",
				"350600", "350700", "350800", "350900"  };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("350100"))
			return "福州";
		else if (code.equals("350200"))
			return "厦门";
		else if (code.equals("350300"))
			return "莆田";
		else if (code.equals("350400"))
			return "三明";
		else if (code.equals("350500"))
			return "泉州";
		else if (code.equals("350600"))
			return "漳州";
		else if (code.equals("350700"))
			return "南平";
		else if (code.equals("350800"))
			return "龙岩";
		else if (code.equals("350900"))
			return "宁德";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("福州"))
			return "350100";
		else if (name.equals("厦门"))
			return "350200";
		else if (name.equals("莆田"))
			return "350300";
		else if (name.equals("三明"))
			return "350400";
		else if (name.equals("泉州"))
			return "350500";
		else if (name.equals("漳州"))
			return "350600";
		else if (name.equals("南平"))
			return "350700";
		else if (name.equals("龙岩"))
			return "350800";
		else if (name.equals("宁德"))
			return "350900";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("闽A"))
			return "350100";
		else if (vin.equals("闽D"))
			return "350200";
		else if (vin.equals("闽B"))
			return "350300";
		else if (vin.equals("闽G"))
			return "350400";
		else if (vin.equals("闽C"))
			return "350500";
		else if (vin.equals("闽E"))
			return "350600";
		else if (vin.equals("闽H"))
			return "350700";
		else if (vin.equals("闽F"))
			return "350800";
		else if (vin.equals("闽J"))
			return "350900";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("350100"))
			return "闽A";
		else if (code.equals("350200"))
			return "闽D";
		else if (code.equals("350300"))
			return "闽B";
		else if (code.equals("350400"))
			return "闽G";
		else if (code.equals("350500"))
			return "闽C";
		else if (code.equals("350600"))
			return "闽E";
		else if (code.equals("350700"))
			return "闽H";
		else if (code.equals("350800"))
			return "闽F";
		else if (code.equals("350900"))
			return "闽J";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("350100"))
			return "119.306239,26.075302";
		else if (code.equals("350200"))
			return "118.110220,24.490474";
		else if (code.equals("350300"))
			return "119.007558,25.431011";
		else if (code.equals("350400"))
			return "117.635001,26.265444";
		else if (code.equals("350500"))
			return "118.589421,24.908853";
		else if (code.equals("350600"))
			return "117.661801,24.510897";
		else if (code.equals("350700"))
			return "118.178459,26.635627";
		else if (code.equals("350800"))
			return "117.029780,25.091603";
		else if (code.equals("350900"))
			return "119.527082,26.659240";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("350100"))
			return "350000";
		else if (code.equals("350200"))
			return "361000";
		else if (code.equals("350300"))
			return "351100";
		else if (code.equals("350400"))
			return "365000";
		else if (code.equals("350500"))
			return "362000";
		else if (code.equals("350600"))
			return "363000";
		else if (code.equals("350700"))
			return "353000";
		else if (code.equals("350800"))
			return "362300";
		else if (code.equals("350900"))
			return "352100";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("350100"))
			return "0591";
		else if (code.equals("350200"))
			return "0592";
		else if (code.equals("350300"))
			return "0594";
		else if (code.equals("350400"))
			return "0598";
		else if (code.equals("350500"))
			return "0595";
		else if (code.equals("350600"))
			return "0596";
		else if (code.equals("350700"))
			return "0599";
		else if (code.equals("350800"))
			return "0597";
		else if (code.equals("350900"))
			return "0593";
		else
			return null;
	}

}
