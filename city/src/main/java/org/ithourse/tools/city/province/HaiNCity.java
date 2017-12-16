package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 海南 各地市
 *
 */
public class HaiNCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "海口", "三亚", "五指山", "琼海", "儋州", "文昌", "万宁", "东方",
				"定安", "屯昌", "澄迈", "临高", "白沙", "昌江", "乐东", "陵水", "保亭", "琼中",
				"三沙" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "460100", "460200", "469001", "469002", "460400",
				"469005", "469006", "469007", "469021", "469022", "469023",
				"469024", "469025", "469026", "469027", "469028", "469029",
				"469030", "460300" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("460100"))
			return "海口";
		else if (code.equals("460200"))
			return "三亚";
		else if (code.equals("469001"))
			return "五指山";
		else if (code.equals("469002"))
			return "琼海";
		else if (code.equals("460400"))
			return "儋州";
		else if (code.equals("469005"))
			return "文昌";
		else if (code.equals("469006"))
			return "万宁";
		else if (code.equals("469007"))
			return "东方";
		else if (code.equals("469021"))
			return "定安";
		else if (code.equals("469022"))
			return "屯昌";
		else if (code.equals("469023"))
			return "澄迈";
		else if (code.equals("469024"))
			return "临高";
		else if (code.equals("469025"))
			return "白沙";
		else if (code.equals("469026"))
			return "昌江";
		else if (code.equals("469027"))
			return "乐东";
		else if (code.equals("469028"))
			return "陵水";
		else if (code.equals("469029"))
			return "保亭";
		else if (code.equals("469030"))
			return "琼中";
		else if (code.equals("460300"))
			return "三沙";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("海口"))
			return "460100";
		else if (name.equals("三亚"))
			return "460200";
		else if (name.equals("五指山"))
			return "469001";
		else if (name.equals("琼海"))
			return "469002";
		else if (name.equals("儋州"))
			return "460400";
		else if (name.equals("文昌"))
			return "469005";
		else if (name.equals("万宁"))
			return "469006";
		else if (name.equals("东方"))
			return "469007";
		else if (name.equals("定安"))
			return "469021";
		else if (name.equals("屯昌"))
			return "469022";
		else if (name.equals("澄迈"))
			return "469023";
		else if (name.equals("临高"))
			return "469024";
		else if (name.equals("白沙"))
			return "469025";
		else if (name.equals("昌江"))
			return "469026";
		else if (name.equals("乐东"))
			return "469027";
		else if (name.equals("陵水"))
			return "469028";
		else if (name.equals("保亭"))
			return "469029";
		else if (name.equals("琼中"))
			return "469030";
		else if (name.equals("三沙"))
			return "460300";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("琼A"))
			return "460100";
		else if (vin.equals("琼B"))
			return "460200";
		else if (vin.equals("琼D"))
			return "469001";
		else if (vin.equals("琼C"))
			return "469002";
		else if (vin.equals("琼C"))
			return "469003";
		else if (vin.equals("琼C"))
			return "469005";
		else if (vin.equals("琼C"))
			return "469006";
		else if (vin.equals("琼D"))
			return "469007";
		else if (vin.equals("琼C"))
			return "469021";
		else if (vin.equals("琼C"))
			return "469022";
		else if (vin.equals("琼C"))
			return "469023";
		else if (vin.equals("琼C"))
			return "469024";
		else if (vin.equals("琼D"))
			return "469025";
		else if (vin.equals("琼D"))
			return "469026";
		else if (vin.equals("琼D"))
			return "469027";
		else if (vin.equals("琼D"))
			return "469028";
		else if (vin.equals("琼D"))
			return "469029";
		else if (vin.equals("琼D"))
			return "469030";
		else if (vin.equals("琼F"))
			return "460300";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("460100"))
			return "琼A";
		else if (code.equals("460200"))
			return "琼B";
		else if (code.equals("469001"))
			return "琼D";
		else if (code.equals("469002"))
			return "琼C";
		else if (code.equals("469003"))
			return "琼C";
		else if (code.equals("469005"))
			return "琼C";
		else if (code.equals("469006"))
			return "琼C";
		else if (code.equals("469007"))
			return "琼D";
		else if (code.equals("469021"))
			return "琼C";
		else if (code.equals("469022"))
			return "琼C";
		else if (code.equals("469023"))
			return "琼C";
		else if (code.equals("469024"))
			return "琼C";
		else if (code.equals("469025"))
			return "琼D";
		else if (code.equals("469026"))
			return "琼D";
		else if (code.equals("469027"))
			return "琼D";
		else if (code.equals("469028"))
			return "琼D";
		else if (code.equals("469029"))
			return "琼D";
		else if (code.equals("469030"))
			return "琼D";
		else if (code.equals("460300"))
			return "琼F";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("460100"))
			return "110.331190,20.031971";
		else if (code.equals("460200"))
			return "109.508268,18.247872";
		else if (code.equals("469001"))
			return "109.516662,18.776921";
		else if (code.equals("469002"))
			return "110.466785,19.246011";
		else if (code.equals("460400"))
			return "109.576782,19.517486";
		else if (code.equals("469005"))
			return "110.753975,19.612986";
		else if (code.equals("469006"))
			return "110.388793,18.796216";
		else if (code.equals("469007"))
			return "108.653789,19.101980";
		else if (code.equals("469021"))
			return "110.349235,19.684966";
		else if (code.equals("469022"))
			return "110.102773,19.362916";
		else if (code.equals("469023"))
			return "110.007147,19.737095";
		else if (code.equals("469024"))
			return "109.687697,19.908293";
		else if (code.equals("469025"))
			return "109.452606,19.224584";
		else if (code.equals("469026"))
			return "109.053351,19.260968";
		else if (code.equals("469027"))
			return "109.175444,18.747580";
		else if (code.equals("469028"))
			return "110.037218,18.505006";
		else if (code.equals("469029"))
			return "109.702450,18.636371";
		else if (code.equals("469030"))
			return "109.839996,19.035570";
		else if (code.equals("460300"))
			return "112.34882,16.8310390";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("460100"))
			return "570100";
		else if (code.equals("460200"))
			return "572000";
		else if (code.equals("469001"))
			return "572200";
		else if (code.equals("469002"))
			return "571400";
		else if (code.equals("460400"))
			return "571700";
		else if (code.equals("469005"))
			return "571300";
		else if (code.equals("469006"))
			return "571500";
		else if (code.equals("469007"))
			return "572600";
		else if (code.equals("469021"))
			return "571200";
		else if (code.equals("469022"))
			return "571600";
		else if (code.equals("469023"))
			return "571900";
		else if (code.equals("469024"))
			return "571800";
		else if (code.equals("469025"))
			return "572800";
		else if (code.equals("469026"))
			return "572700";
		else if (code.equals("469027"))
			return "572500";
		else if (code.equals("469028"))
			return "572400";
		else if (code.equals("469029"))
			return "572300";
		else if (code.equals("469030"))
			return "572900";
		else if (code.equals("460300"))
			return "573199";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("460100"))
			return "0898";
		else if (code.equals("460200"))
			return "0898";
		else if (code.equals("469001"))
			return "0898";
		else if (code.equals("469002"))
			return "0898";
		else if (code.equals("460400"))
			return "0898";
		else if (code.equals("469005"))
			return "0898";
		else if (code.equals("469006"))
			return "0898";
		else if (code.equals("469007"))
			return "0898";
		else if (code.equals("469021"))
			return "0898";
		else if (code.equals("469022"))
			return "0898";
		else if (code.equals("469023"))
			return "0898";
		else if (code.equals("469024"))
			return "0898";
		else if (code.equals("469025"))
			return "0898";
		else if (code.equals("469026"))
			return "0898";
		else if (code.equals("469027"))
			return "0898";
		else if (code.equals("469028"))
			return "0898";
		else if (code.equals("469029"))
			return "0898";
		else if (code.equals("469030"))
			return "0898";
		else if (code.equals("460300"))
			return "0898";
		else
			return null;
	}

}
