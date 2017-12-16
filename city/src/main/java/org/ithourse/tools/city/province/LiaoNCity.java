package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 辽宁 各地市
 *
 */
public class LiaoNCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "沈阳", "大连", "鞍山", "抚顺", "本溪", "丹东", "锦州", "营口",
				"阜新", "辽阳", "盘锦", "铁岭", "朝阳", "葫芦岛" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "210100", "210200", "210300", "210400", "210500", "210600", "210700", 
				"210800","210900", "211000", "211100", "211200", "211300", "211400" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("210100"))
			return "沈阳";
		else if (code.equals("210200"))
			return "大连";
		else if (code.equals("210300"))
			return "鞍山";
		else if (code.equals("210400"))
			return "抚顺";
		else if (code.equals("210500"))
			return "本溪";
		else if (code.equals("210600"))
			return "丹东";
		else if (code.equals("210700"))
			return "锦州";
		else if (code.equals("210800"))
			return "营口";
		else if (code.equals("210900"))
			return "阜新";
		else if (code.equals("211000"))
			return "辽阳";
		else if (code.equals("211100"))
			return "盘锦";
		else if (code.equals("211200"))
			return "铁岭";
		else if (code.equals("211300"))
			return "朝阳";
		else if (code.equals("211400"))
			return "葫芦岛";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("沈阳"))
			return "210100";
		else if (name.equals("大连"))
			return "210200";
		else if (name.equals("鞍山"))
			return "210300";
		else if (name.equals("抚顺"))
			return "210400";
		else if (name.equals("本溪"))
			return "210500";
		else if (name.equals("丹东"))
			return "210600";
		else if (name.equals("锦州"))
			return "210700";
		else if (name.equals("营口"))
			return "210800";
		else if (name.equals("阜新"))
			return "210900";
		else if (name.equals("辽阳"))
			return "211000";
		else if (name.equals("盘锦"))
			return "211100";
		else if (name.equals("铁岭"))
			return "211200";
		else if (name.equals("朝阳"))
			return "211300";
		else if (name.equals("葫芦岛"))
			return "211400";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("辽A"))
			return "210100";
		else if (vin.equals("辽B"))
			return "210200";
		else if (vin.equals("辽C"))
			return "210300";
		else if (vin.equals("辽D"))
			return "210400";
		else if (vin.equals("辽E"))
			return "210500";
		else if (vin.equals("辽F"))
			return "210600";
		else if (vin.equals("辽G"))
			return "210700";
		else if (vin.equals("辽H"))
			return "210800";
		else if (vin.equals("辽J"))
			return "210900";
		else if (vin.equals("辽K"))
			return "211000";
		else if (vin.equals("辽L"))
			return "211100";
		else if (vin.equals("辽M"))
			return "211200";
		else if (vin.equals("辽N"))
			return "211300";
		else if (vin.equals("辽P"))
			return "211400";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("210100"))
			return "辽A";
		else if (code.equals("210200"))
			return "辽B";
		else if (code.equals("210300"))
			return "辽C";
		else if (code.equals("210400"))
			return "辽D";
		else if (code.equals("210500"))
			return "辽E";
		else if (code.equals("210600"))
			return "辽F";
		else if (code.equals("210700"))
			return "辽G";
		else if (code.equals("210800"))
			return "辽H";
		else if (code.equals("210900"))
			return "辽J";
		else if (code.equals("211000"))
			return "辽K";
		else if (code.equals("211100"))
			return "辽L";
		else if (code.equals("211200"))
			return "辽M";
		else if (code.equals("211300"))
			return "辽N";
		else if (code.equals("211400"))
			return "辽P";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("210100"))
			return "123.429096,41.796767";
		else if (code.equals("210200"))
			return "121.618622,38.914590";
		else if (code.equals("210300"))
			return "122.995632,41.110626";
		else if (code.equals("210400"))
			return "123.921109,41.875956";
		else if (code.equals("210500"))
			return "123.770519,41.297909";
		else if (code.equals("210600"))
			return "124.383044,40.124296";
		else if (code.equals("210700"))
			return "121.135742,41.119269";
		else if (code.equals("210800"))
			return "122.235151,40.667432";
		else if (code.equals("210900"))
			return "121.648962,42.011796";
		else if (code.equals("211000"))
			return "123.181520,41.269402";
		else if (code.equals("211100"))
			return "122.069570,41.124484";
		else if (code.equals("211200"))
			return "123.844279,42.290585";
		else if (code.equals("211300"))
			return "120.451176,41.576758";
		else if (code.equals("211400"))
			return "120.856394,40.755572";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("210100"))
			return "110000";
		else if (code.equals("210200"))
			return "116000";
		else if (code.equals("210300"))
			return "114000";
		else if (code.equals("210400"))
			return "113000";
		else if (code.equals("210500"))
			return "117000";
		else if (code.equals("210600"))
			return "118000";
		else if (code.equals("210700"))
			return "121000";
		else if (code.equals("210800"))
			return "115000";
		else if (code.equals("210900"))
			return "123000";
		else if (code.equals("211000"))
			return "111000";
		else if (code.equals("211100"))
			return "124000";
		else if (code.equals("211200"))
			return "112000";
		else if (code.equals("211300"))
			return "122000";
		else if (code.equals("211400"))
			return "125000";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("210100"))
			return "024";
		else if (code.equals("210200"))
			return "0411";
		else if (code.equals("210300"))
			return "0412";
		else if (code.equals("210400"))
			return "024";
		else if (code.equals("210500"))
			return "024";
		else if (code.equals("210600"))
			return "0415";
		else if (code.equals("210700"))
			return "0416";
		else if (code.equals("210800"))
			return "0417";
		else if (code.equals("210900"))
			return "0418";
		else if (code.equals("211000"))
			return "0419";
		else if (code.equals("211100"))
			return "0427";
		else if (code.equals("211200"))
			return "024";
		else if (code.equals("211300"))
			return "0421";
		else if (code.equals("211400"))
			return "0429";
		else
			return null;
	}

}
