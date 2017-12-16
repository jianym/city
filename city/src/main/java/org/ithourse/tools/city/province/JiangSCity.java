package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 江苏 各地市
 *
 */
public class JiangSCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "南京", "无锡", "徐州", "常州", "苏州", "南通", "连云港", "淮安",
				"盐城", "扬州", "镇江", "泰州", "宿迁" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "320100", "320200", "320300", "320400", "320500",
				"320600", "320700", "320800", "320900", "321000", "321100",
				"321200", "321300"};
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("320100"))
			return "南京";
		else if (code.equals("320200"))
			return "无锡";
		else if (code.equals("320300"))
			return "徐州";
		else if (code.equals("320400"))
			return "常州";
		else if (code.equals("320500"))
			return "苏州";
		else if (code.equals("320600"))
			return "南通";
		else if (code.equals("320700"))
			return "连云港";
		else if (code.equals("320800"))
			return "淮安";
		else if (code.equals("320900"))
			return "盐城";
		else if (code.equals("321000"))
			return "扬州";
		else if (code.equals("321100"))
			return "镇江";
		else if (code.equals("321200"))
			return "泰州";
		else if (code.equals("321300"))
			return "宿迁";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("南京"))
			return "320100";
		else if (name.equals("无锡"))
			return "320200";
		else if (name.equals("徐州"))
			return "320300";
		else if (name.equals("常州"))
			return "320400";
		else if (name.equals("苏州"))
			return "320500";
		else if (name.equals("南通"))
			return "320600";
		else if (name.equals("连云港"))
			return "320700";
		else if (name.equals("淮安"))
			return "320800";
		else if (name.equals("盐城"))
			return "320900";
		else if (name.equals("扬州"))
			return "321000";
		else if (name.equals("镇江"))
			return "321100";
		else if (name.equals("泰州"))
			return "321200";
		else if (name.equals("宿迁"))
			return "321300";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("苏A"))
			return "320100";
		else if (vin.equals("苏B"))
			return "320200";
		else if (vin.equals("苏C"))
			return "320300";
		else if (vin.equals("苏D"))
			return "320400";
		else if (vin.equals("苏E"))
			return "320500";
		else if (vin.equals("苏F"))
			return "320600";
		else if (vin.equals("苏G"))
			return "320700";
		else if (vin.equals("苏H"))
			return "320800";
		else if (vin.equals("苏J"))
			return "320900";
		else if (vin.equals("苏K"))
			return "321000";
		else if (vin.equals("苏L"))
			return "321100";
		else if (vin.equals("苏M"))
			return "321200";
		else if (vin.equals("苏N"))
			return "321300";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("320100"))
			return "苏A";
		else if (code.equals("320200"))
			return "苏B";
		else if (code.equals("320300"))
			return "苏C";
		else if (code.equals("320400"))
			return "苏D";
		else if (code.equals("320500"))
			return "苏E";
		else if (code.equals("320600"))
			return "苏F";
		else if (code.equals("320700"))
			return "苏G";
		else if (code.equals("320800"))
			return "苏H";
		else if (code.equals("320900"))
			return "苏J";
		else if (code.equals("321000"))
			return "苏K";
		else if (code.equals("321100"))
			return "苏L";
		else if (code.equals("321200"))
			return "苏M";
		else if (code.equals("321300"))
			return "苏N";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("320100"))
			return "118.767413,32.041544";
		else if (code.equals("320200"))
			return "120.301663,31.574729";
		else if (code.equals("320300"))
			return "117.184811,34.261792";
		else if (code.equals("320400"))
			return "119.946973,31.772752";
		else if (code.equals("320500"))
			return "120.619585,31.299379";
		else if (code.equals("320600"))
			return "120.864608,32.016212";
		else if (code.equals("320700"))
			return "119.178821,34.600018";
		else if (code.equals("320800"))
			return "119.021265,33.597506";
		else if (code.equals("320900"))
			return "120.139998,33.377631";
		else if (code.equals("321000"))
			return "119.421003,32.393159";
		else if (code.equals("321100"))
			return "119.452753,32.204402";
		else if (code.equals("321200"))
			return "119.915176,32.484882";
		else if (code.equals("321300"))
			return "118.275162,33.963008";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("320100"))
			return "210000";
		else if (code.equals("320200"))
			return "214000";
		else if (code.equals("320300"))
			return "221000";
		else if (code.equals("320400"))
			return "213000";
		else if (code.equals("320500"))
			return "215000";
		else if (code.equals("320600"))
			return "226000";
		else if (code.equals("320700"))
			return "222000";
		else if (code.equals("320800"))
			return "223000";
		else if (code.equals("320900"))
			return "224000";
		else if (code.equals("321000"))
			return "225000";
		else if (code.equals("321100"))
			return "212000";
		else if (code.equals("321200"))
			return "225300";
		else if (code.equals("321300"))
			return "223600";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("320100"))
			return "025";
		else if (code.equals("320200"))
			return "0510";
		else if (code.equals("320300"))
			return "0516";
		else if (code.equals("320400"))
			return "0519";
		else if (code.equals("320500"))
			return "0512";
		else if (code.equals("320600"))
			return "0513";
		else if (code.equals("320700"))
			return "0518";
		else if (code.equals("320800"))
			return "0517";
		else if (code.equals("320900"))
			return "0515";
		else if (code.equals("321000"))
			return "0514";
		else if (code.equals("321100"))
			return "0511";
		else if (code.equals("321200"))
			return "0523";
		else if (code.equals("321300"))
			return "0527";
		else
			return null;
	}

}
