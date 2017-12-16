package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 河北 各地市
 *
 */
public class HeBCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "石家庄", "唐山", "秦皇岛", "邯郸", "邢台", "保定", "张家口",
				"承德", "沧州", "廊坊", "衡水" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "130100", "130200", "130300", "130400", "130500",
				"130600", "130700", "130800", "130900", "131000", "131100"};
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("130100"))
			return "石家庄";
		else if (code.equals("130200"))
			return "唐山";
		else if (code.equals("130300"))
			return "秦皇岛";
		else if (code.equals("130400"))
			return "邯郸";
		else if (code.equals("130500"))
			return "邢台";
		else if (code.equals("130600"))
			return "保定";
		else if (code.equals("130700"))
			return "张家口";
		else if (code.equals("130800"))
			return "承德";
		else if (code.equals("130900"))
			return "沧州";
		else if (code.equals("131000"))
			return "廊坊";
		else if (code.equals("131100"))
			return "衡水";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("石家庄"))
			return "130100";
		else if (name.equals("唐山"))
			return "130200";
		else if (name.equals("秦皇岛"))
			return "130300";
		else if (name.equals("邯郸"))
			return "130400";
		else if (name.equals("邢台"))
			return "130500";
		else if (name.equals("保定"))
			return "130600";
		else if (name.equals("张家口"))
			return "130700";
		else if (name.equals("承德"))
			return "130800";
		else if (name.equals("沧州"))
			return "130900";
		else if (name.equals("廊坊"))
			return "131000";
		else if (name.equals("衡水"))
			return "131100";
		else
			return null;
	}

	@Override
	public String vinToCode(String VehicleNo) {
		if (VehicleNo.equals("冀A"))
			return "130100";
		else if (VehicleNo.equals("冀B"))
			return "130200";
		else if (VehicleNo.equals("冀C"))
			return "130300";
		else if (VehicleNo.equals("冀D"))
			return "130400";
		else if (VehicleNo.equals("冀E"))
			return "130500";
		else if (VehicleNo.equals("冀F"))
			return "130600";
		else if (VehicleNo.equals("冀G"))
			return "130700";
		else if (VehicleNo.equals("冀H"))
			return "130800";
		else if (VehicleNo.equals("冀J"))
			return "130900";
		else if (VehicleNo.equals("冀R"))
			return "131000";
		else if (VehicleNo.equals("冀T"))
			return "131100";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("130100"))
			return "冀A";
		else if (code.equals("130200"))
			return "冀B";
		else if (code.equals("130300"))
			return "冀C";
		else if (code.equals("130400"))
			return "冀D";
		else if (code.equals("130500"))
			return "冀E";
		else if (code.equals("130600"))
			return "冀F";
		else if (code.equals("130700"))
			return "冀G";
		else if (code.equals("130800"))
			return "冀H";
		else if (code.equals("130900"))
			return "冀J";
		else if (code.equals("131000"))
			return "冀R";
		else if (code.equals("131100"))
			return "冀T";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("130100"))
			return "114.502461,38.045474";
		else if (code.equals("130200"))
			return "118.175393,39.635113";
		else if (code.equals("130300"))
			return "119.586579,39.942531";
		else if (code.equals("130400"))
			return "114.490686,36.612273";
		else if (code.equals("130500"))
			return "114.508851,37.068200";
		else if (code.equals("130600"))
			return "115.482331,38.867657";
		else if (code.equals("130700"))
			return "114.884091,40.811901";
		else if (code.equals("130800"))
			return "117.939152,40.976204";
		else if (code.equals("130900"))
			return "116.857461,38.310582";
		else if (code.equals("131000"))
			return "116.704441,39.523927";
		else if (code.equals("131100"))
			return "115.665993,37.735097";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("130100"))
			return "050000";
		else if (code.equals("130200"))
			return "063000";
		else if (code.equals("130300"))
			return "066000";
		else if (code.equals("130400"))
			return "056000";
		else if (code.equals("130500"))
			return "054000";
		else if (code.equals("130600"))
			return "071000";
		else if (code.equals("130700"))
			return "075000";
		else if (code.equals("130800"))
			return "067000";
		else if (code.equals("130900"))
			return "061000";
		else if (code.equals("131000"))
			return "065000";
		else if (code.equals("131100"))
			return "053000";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("130100"))
			return "0311";
		else if (code.equals("130200"))
			return "0315";
		else if (code.equals("130300"))
			return "0335";
		else if (code.equals("130400"))
			return "0310";
		else if (code.equals("130500"))
			return "0319";
		else if (code.equals("130600"))
			return "0312";
		else if (code.equals("130700"))
			return "0313";
		else if (code.equals("130800"))
			return "0314";
		else if (code.equals("130900"))
			return "0317";
		else if (code.equals("131000"))
			return "0316";
		else if (code.equals("131100"))
			return "0318";
		else
			return null;
	}
}
