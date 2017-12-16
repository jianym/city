package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 广西 各地市
 *
 */
public class GuangXCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "南宁", "柳州", "桂林", "梧州","北海", "防城港", "钦州", "贵港", "玉林",
				"百色", "贺州", "河池", "来宾", "崇左" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "450100", "450200", "450300", "450400", "450500",
				"450600", "450700", "450800", "450900", "451000", "451100",
				"451200", "451300", "451400" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("450100"))
			return "南宁";
		else if (code.equals("450200"))
			return "柳州";
		else if (code.equals("450300"))
			return "桂林";
		else if (code.equals("450400"))
			return "梧州";
		else if (code.equals("450500"))
			return "北海";
		else if (code.equals("450600"))
			return "防城港";
		else if (code.equals("450700"))
			return "钦州";
		else if (code.equals("450800"))
			return "贵港";
		else if (code.equals("450900"))
			return "玉林";
		else if (code.equals("451000"))
			return "百色";
		else if (code.equals("451100"))
			return "贺州";
		else if (code.equals("451200"))
			return "河池";
		else if (code.equals("451300"))
			return "来宾";
		else if (code.equals("451400"))
			return "崇左";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("南宁"))
			return "450100";
		else if (name.equals("柳州"))
			return "450200";
		else if (name.equals("桂林"))
			return "450300";
		else if (name.equals("梧州"))
			return "450400";
		else if (name.equals("北海"))
			return "450500";
		else if (name.equals("防城港"))
			return "450600";
		else if (name.equals("钦州"))
			return "450700";
		else if (name.equals("贵港"))
			return "450800";
		else if (name.equals("玉林"))
			return "450900";
		else if (name.equals("百色"))
			return "451000";
		else if (name.equals("贺州"))
			return "451100";
		else if (name.equals("河池"))
			return "451200";
		else if (name.equals("来宾"))
			return "451300";
		else if (name.equals("崇左"))
			return "451400";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("桂A"))
			return "450100";
		else if (vin.equals("桂B"))
			return "450200";
		else if (vin.equals("桂C"))
			return "450300";
		else if (vin.equals("桂D"))
			return "450400";
		else if (vin.equals("桂E"))
			return "450500";
		else if (vin.equals("桂P"))
			return "450600";
		else if (vin.equals("桂N"))
			return "450700";
		else if (vin.equals("桂R"))
			return "450800";
		else if (vin.equals("桂K"))
			return "450900";
		else if (vin.equals("桂L"))
			return "451000";
		else if (vin.equals("桂J"))
			return "451100";
		else if (vin.equals("桂M"))
			return "451200";
		else if (vin.equals("桂G"))
			return "451300";
		else if (vin.equals("桂F"))
			return "451400";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("450100"))
			return "桂A";
		else if (code.equals("450200"))
			return "桂B";
		else if (code.equals("450300"))
			return "桂C";
		else if (code.equals("450400"))
			return "桂D";
		else if (code.equals("450500"))
			return "桂E";
		else if (code.equals("450600"))
			return "桂P";
		else if (code.equals("450700"))
			return "桂N";
		else if (code.equals("450800"))
			return "桂R";
		else if (code.equals("450900"))
			return "桂K";
		else if (code.equals("451000"))
			return "桂L";
		else if (code.equals("451100"))
			return "桂J";
		else if (code.equals("451200"))
			return "桂M";
		else if (code.equals("451300"))
			return "桂G";
		else if (code.equals("451400"))
			return "桂F";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("450100"))
			return "108.320004,22.824020";
		else if (code.equals("450200"))
			return "109.411703,24.314617";
		else if (code.equals("450300"))
			return "110.299121,25.274215";
		else if (code.equals("450400"))
			return "111.297604,23.474803";
		else if (code.equals("450500"))
			return "109.119254,21.473343";
		else if (code.equals("450600"))
			return "108.345478,21.614631";
		else if (code.equals("450700"))
			return "108.624175,21.967127";
		else if (code.equals("450800"))
			return "109.602146,23.093600";
		else if (code.equals("450900"))
			return "110.154393,22.631360";
		else if (code.equals("451000"))
			return "106.616285,23.897742";
		else if (code.equals("451100"))
			return "111.552056,24.414141";
		else if (code.equals("451200"))
			return "108.062105,24.695899";
		else if (code.equals("451300"))
			return "109.229772,23.733766";
		else if (code.equals("451400"))
			return "107.353926,22.404108";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("450100"))
			return "530000";
		else if (code.equals("450200"))
			return "545000";
		else if (code.equals("450300"))
			return "541000";
		else if (code.equals("450400"))
			return "543000";
		else if (code.equals("450500"))
			return "536000";
		else if (code.equals("450600"))
			return "538000";
		else if (code.equals("450700"))
			return "535000";
		else if (code.equals("450800"))
			return "537000";
		else if (code.equals("450900"))
			return "537000";
		else if (code.equals("451000"))
			return "533000";
		else if (code.equals("451100"))
			return "542800";
		else if (code.equals("451200"))
			return "547000";
		else if (code.equals("451300"))
			return "546100";
		else if (code.equals("451400"))
			return "532200";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("450100"))
			return "0771";
		else if (code.equals("450200"))
			return "0772";
		else if (code.equals("450300"))
			return "0773";
		else if (code.equals("450400"))
			return "0774";
		else if (code.equals("450500"))
			return "0779";
		else if (code.equals("450600"))
			return "0770";
		else if (code.equals("450700"))
			return "0777";
		else if (code.equals("450800"))
			return "0775";
		else if (code.equals("450900"))
			return "0775";
		else if (code.equals("451000"))
			return "0776";
		else if (code.equals("451100"))
			return "0774";
		else if (code.equals("451200"))
			return "0778";
		else if (code.equals("451300"))
			return "0772";
		else if (code.equals("451400"))
			return "0771";
		else
			return null;
	}

}
