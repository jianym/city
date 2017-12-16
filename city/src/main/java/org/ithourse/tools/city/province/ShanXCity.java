package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;
/**
 * 
 * @author jianym
 * 山西 各地市
 *
 */
public class ShanXCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "太原", "大同", "阳泉", "长治", "晋城", "朔州", "晋中", "运城",
				"忻州", "临汾", "吕梁" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "140100", "140200", "140300", "140400", "140500",
				"140600", "140700", "140800", "140900", "141000", "141100" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("140100"))
			return "太原";
		else if (code.equals("140200"))
			return "大同";
		else if (code.equals("140300"))
			return "阳泉";
		else if (code.equals("140400"))
			return "长治";
		else if (code.equals("140500"))
			return "晋城";
		else if (code.equals("140600"))
			return "朔州";
		else if (code.equals("140700"))
			return "晋中";
		else if (code.equals("140800"))
			return "运城";
		else if (code.equals("140900"))
			return "忻州";
		else if (code.equals("141000"))
			return "临汾";
		else if (code.equals("141100"))
			return "吕梁";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("太原"))
			return "140100";
		else if (name.equals("大同"))
			return "140200";
		else if (name.equals("阳泉"))
			return "140300";
		else if (name.equals("长治"))
			return "140400";
		else if (name.equals("晋城"))
			return "140500";
		else if (name.equals("朔州"))
			return "140600";
		else if (name.equals("晋中"))
			return "140700";
		else if (name.equals("运城"))
			return "140800";
		else if (name.equals("忻州"))
			return "140900";
		else if (name.equals("临汾"))
			return "141000";
		else if (name.equals("吕梁"))
			return "141100";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("晋A"))
			return "140100";
		else if (vin.equals("晋B"))
			return "140200";
		else if (vin.equals("晋C"))
			return "140300";
		else if (vin.equals("晋D"))
			return "140400";
		else if (vin.equals("晋E"))
			return "140500";
		else if (vin.equals("晋F"))
			return "140600";
		else if (vin.equals("晋K"))
			return "140700";
		else if (vin.equals("晋M"))
			return "140800";
		else if (vin.equals("晋H"))
			return "140900";
		else if (vin.equals("晋L"))
			return "141000";
		else if (vin.equals("晋J"))
			return "141100";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("140100"))
			return "晋A";
		else if (code.equals("140200"))
			return "晋B";
		else if (code.equals("140300"))
			return "晋C";
		else if (code.equals("140400"))
			return "晋D";
		else if (code.equals("140500"))
			return "晋E";
		else if (code.equals("140600"))
			return "晋F";
		else if (code.equals("140700"))
			return "晋K";
		else if (code.equals("140800"))
			return "晋M";
		else if (code.equals("140900"))
			return "晋H";
		else if (code.equals("141000"))
			return "晋L";
		else if (code.equals("141100"))
			return "晋J";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("140100"))
			return "112.549248,37.857014";
		else if (code.equals("140200"))
			return "113.295259,40.090310";
		else if (code.equals("140300"))
			return "113.583285,37.861188";
		else if (code.equals("140400"))
			return "113.113556,36.191112";
		else if (code.equals("140500"))
			return "112.851274,35.497553";
		else if (code.equals("140600"))
			return "112.433387,39.331261";
		else if (code.equals("140700"))
			return "112.736465,37.696495";
		else if (code.equals("140800"))
			return "111.003957,35.022778";
		else if (code.equals("140900"))
			return "112.733538,38.417690";
		else if (code.equals("141000"))
			return "111.517973,36.084150";
		else if (code.equals("141100"))
			return "111.134335,37.524366";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("140100"))
			return "030000";
		else if (code.equals("140200"))
			return "037000";
		else if (code.equals("140300"))
			return "045000";
		else if (code.equals("140400"))
			return "046000";
		else if (code.equals("140500"))
			return "048000";
		else if (code.equals("140600"))
			return "036000";
		else if (code.equals("140700"))
			return "030600";
		else if (code.equals("140800"))
			return "044000";
		else if (code.equals("140900"))
			return "034000";
		else if (code.equals("141000"))
			return "041000";
		else if (code.equals("141100"))
			return "033000";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("140100"))
			return "0351";
		else if (code.equals("140200"))
			return "0352";
		else if (code.equals("140300"))
			return "0353";
		else if (code.equals("140400"))
			return "0355";
		else if (code.equals("140500"))
			return "0356";
		else if (code.equals("140600"))
			return "0349";
		else if (code.equals("140700"))
			return "0354";
		else if (code.equals("140800"))
			return "0359";
		else if (code.equals("140900"))
			return "0350";
		else if (code.equals("141000"))
			return "0357";
		else if (code.equals("141100"))
			return "0358";
		else
			return null;
	}

}
