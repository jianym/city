package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 黑龙江 各地市
 *
 */
public class HeiLongJCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "哈尔滨", "齐齐哈尔", "鸡西", "鹤岗", "双鸭山", "大庆", "伊春",
				"佳木斯", "七台河", "牡丹江", "黑河", "绥化", "大兴安岭" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "230100", "230200", "", "230300", "230400",
				"230500", "230600", "230700", "230800", "230900", "231000",
				"231100", "231200", "232700" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("230100"))
			return "哈尔滨";
		else if (code.equals("230200"))
			return "齐齐哈尔";
		else if (code.equals("230300"))
			return "鸡西";
		else if (code.equals("230400"))
			return "鹤岗";
		else if (code.equals("230500"))
			return "双鸭山";
		else if (code.equals("230600"))
			return "大庆";
		else if (code.equals("230700"))
			return "伊春";
		else if (code.equals("230800"))
			return "佳木斯";
		else if (code.equals("230900"))
			return "七台河";
		else if (code.equals("231000"))
			return "牡丹江";
		else if (code.equals("231100"))
			return "黑河";
		else if (code.equals("231200"))
			return "绥化";
		else if (code.equals("232700"))
			return "大兴安岭";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("哈尔滨"))
			return "230100";
		else if (name.equals("齐齐哈尔"))
			return "230200";
		else if (name.equals("鸡西"))
			return "230300";
		else if (name.equals("鹤岗"))
			return "230400";
		else if (name.equals("双鸭山"))
			return "230500";
		else if (name.equals("大庆"))
			return "230600";
		else if (name.equals("伊春"))
			return "230700";
		else if (name.equals("佳木斯"))
			return "230800";
		else if (name.equals("七台河"))
			return "230900";
		else if (name.equals("牡丹江"))
			return "231000";
		else if (name.equals("黑河"))
			return "231100";
		else if (name.equals("绥化"))
			return "231200";
		else if (name.equals("大兴安岭"))
			return "232700";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("黑A") || vin.equals("黑L"))
			return "230100";
		else if (vin.equals("黑B"))
			return "230200";
		else if (vin.equals("黑G"))
			return "230300";
		else if (vin.equals("黑H"))
			return "230400";
		else if (vin.equals("黑J"))
			return "230500";
		else if (vin.equals("黑E"))
			return "230600";
		else if (vin.equals("黑F"))
			return "230700";
		else if (vin.equals("黑D"))
			return "230800";
		else if (vin.equals("黑K"))
			return "230900";
		else if (vin.equals("黑C"))
			return "231000";
		else if (vin.equals("黑N"))
			return "231100";
		else if (vin.equals("黑M"))
			return "231200";
		else if (vin.equals("黑P"))
			return "232700";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("230100"))
			return "黑A,黑L";
		else if (code.equals("230200"))
			return "黑B";
		else if (code.equals("230300"))
			return "黑G";
		else if (code.equals("230400"))
			return "黑H";
		else if (code.equals("230500"))
			return "黑J";
		else if (code.equals("230600"))
			return "黑E";
		else if (code.equals("230700"))
			return "黑F";
		else if (code.equals("230800"))
			return "黑D";
		else if (code.equals("230900"))
			return "黑K";
		else if (code.equals("231000"))
			return "黑C";
		else if (code.equals("231100"))
			return "黑N";
		else if (code.equals("231200"))
			return "黑M";
		else if (code.equals("232700"))
			return "黑P";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("230100"))
			return "126.642464,45.756967";
		else if (code.equals("230200"))
			return "123.957920,47.342081";
		else if (code.equals("230300"))
			return "130.975966,45.300046";
		else if (code.equals("230400"))
			return "130.277487,47.332085";
		else if (code.equals("230500"))
			return "131.157304,46.643442";
		else if (code.equals("230600"))
			return "125.112720,46.590734";
		else if (code.equals("230700"))
			return "128.899396,47.724775";
		else if (code.equals("230800"))
			return "130.361634,46.809606";
		else if (code.equals("230900"))
			return "131.015584,45.771266";
		else if (code.equals("231000"))
			return "129.618602,44.582962";
		else if (code.equals("231100"))
			return "127.499023,50.249585";
		else if (code.equals("231200"))
			return "126.992930,46.637393";
		else if (code.equals("232700"))
			return "124.711526,52.335262";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("230100"))
			return "150000";
		else if (code.equals("230200"))
			return "161000";
		else if (code.equals("230300"))
			return "158100";
		else if (code.equals("230400"))
			return "154100";
		else if (code.equals("230500"))
			return "155100";
		else if (code.equals("230600"))
			return "163000";
		else if (code.equals("230700"))
			return "152500";
		else if (code.equals("230800"))
			return "154000";
		else if (code.equals("230900"))
			return "154500";
		else if (code.equals("231000"))
			return "157000";
		else if (code.equals("231100"))
			return "161400";
		else if (code.equals("231200"))
			return "151100";
		else if (code.equals("232700"))
			return "165000";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("230100"))
			return "0451";
		else if (code.equals("230200"))
			return "0452";
		else if (code.equals("230300"))
			return "0467";
		else if (code.equals("230400"))
			return "0468";
		else if (code.equals("230500"))
			return "0469";
		else if (code.equals("230600"))
			return "0459";
		else if (code.equals("230700"))
			return "0458";
		else if (code.equals("230800"))
			return "0454";
		else if (code.equals("230900"))
			return "0464";
		else if (code.equals("231000"))
			return "0453";
		else if (code.equals("231100"))
			return "0456";
		else if (code.equals("231200"))
			return "0455";
		else if (code.equals("232700"))
			return "0457";
		else
			return null;
	}

}
