package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 云南 各地市
 *
 */
public class YunNCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "昆明", "曲靖", "玉溪", "保山", "昭通", "丽江", "普洱", "临沧",
				"楚雄州", "红河州", "文山州", "西双版纳州", "大理州", "德宏州", "怒江州", "迪庆州" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "530100", "530300", "530400", "530500", "530600",
				"530700", "530800", "530900", "532300", "532500", "532600",
				"532800", "532900", "533100", "533300", "533400" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("530100"))
			return "昆明";
		else if (code.equals("530300"))
			return "曲靖";
		else if (code.equals("530400"))
			return "玉溪";
		else if (code.equals("530500"))
			return "保山";
		else if (code.equals("530600"))
			return "昭通";
		else if (code.equals("530700"))
			return "丽江";
		else if (code.equals("530800"))
			return "普洱";
		else if (code.equals("530900"))
			return "临沧";
		else if (code.equals("532300"))
			return "楚雄州";
		else if (code.equals("532500"))
			return "红河州";
		else if (code.equals("532600"))
			return "文山州";
		else if (code.equals("532800"))
			return "西双版纳州";
		else if (code.equals("532900"))
			return "大理州";
		else if (code.equals("533100"))
			return "德宏州";
		else if (code.equals("533300"))
			return "怒江州";
		else if (code.equals("533400"))
			return "迪庆州";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("昆明"))
			return "530100";
		else if (name.equals("曲靖"))
			return "530300";
		else if (name.equals("玉溪"))
			return "530400";
		else if (name.equals("保山"))
			return "530500";
		else if (name.equals("昭通"))
			return "530600";
		else if (name.equals("丽江"))
			return "530700";
		else if (name.equals("普洱"))
			return "530800";
		else if (name.equals("临沧"))
			return "530900";
		else if (name.equals("楚雄州"))
			return "532300";
		else if (name.equals("红河州"))
			return "532500";
		else if (name.equals("文山州"))
			return "532600";
		else if (name.equals("西双版纳州"))
			return "532800";
		else if (name.equals("大理州"))
			return "532900";
		else if (name.equals("德宏州"))
			return "533100";
		else if (name.equals("怒江州"))
			return "533300";
		else if (name.equals("迪庆州"))
			return "533400";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("云A"))
			return "530100";
		else if (vin.equals("云D"))
			return "530300";
		else if (vin.equals("云F"))
			return "530400";
		else if (vin.equals("云M"))
			return "530500";
		else if (vin.equals("云C"))
			return "530600";
		else if (vin.equals("云P"))
			return "530700";
		else if (vin.equals("云J"))
			return "530800";
		else if (vin.equals("云S"))
			return "530900";
		else if (vin.equals("云E"))
			return "532300";
		else if (vin.equals("云G"))
			return "532500";
		else if (vin.equals("云H"))
			return "532600";
		else if (vin.equals("云K"))
			return "532800";
		else if (vin.equals("云L"))
			return "532900";
		else if (vin.equals("云N"))
			return "533100";
		else if (vin.equals("云Q"))
			return "533300";
		else if (vin.equals("云R"))
			return "533400";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("530100"))
			return "云A";
		else if (code.equals("530300"))
			return "云D";
		else if (code.equals("530400"))
			return "云F";
		else if (code.equals("530500"))
			return "云M";
		else if (code.equals("530600"))
			return "云C";
		else if (code.equals("530700"))
			return "云P";
		else if (code.equals("530800"))
			return "云J";
		else if (code.equals("530900"))
			return "云S";
		else if (code.equals("532300"))
			return "云E";
		else if (code.equals("532500"))
			return "云G";
		else if (code.equals("532600"))
			return "云H";
		else if (code.equals("532800"))
			return "云K";
		else if (code.equals("532900"))
			return "云L";
		else if (code.equals("533100"))
			return "云N";
		else if (code.equals("533300"))
			return "云Q";
		else if (code.equals("533400"))
			return "云R";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("530100"))
			return "102.712251,25.040609";
		else if (code.equals("530300"))
			return "103.797851,25.501557";
		else if (code.equals("530400"))
			return "102.543907,24.350461";
		else if (code.equals("530500"))
			return "99.1671330,25.111802";
		else if (code.equals("530600"))
			return "103.717216,27.336999";
		else if (code.equals("530700"))
			return "100.233026,26.872108";
		else if (code.equals("530800"))
			return "100.972344,22.777321";
		else if (code.equals("530900"))
			return "100.086970,23.886567";
		else if (code.equals("532300"))
			return "101.546046,25.041988";
		else if (code.equals("532500"))
			return "103.384182,23.366775";
		else if (code.equals("532600"))
			return "104.24401,23.3695100";
		else if (code.equals("532800"))
			return "100.797941,22.001724";
		else if (code.equals("532900"))
			return "100.225668,25.589449";
		else if (code.equals("533100"))
			return "98.5783630,24.436694";
		else if (code.equals("533300"))
			return "98.8543040,25.850949";
		else if (code.equals("533400"))
			return "99.7064630,27.826853";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("530100"))
			return "650000";
		else if (code.equals("530300"))
			return "654200";
		else if (code.equals("530400"))
			return "651100";
		else if (code.equals("530500"))
			return "678000";
		else if (code.equals("530600"))
			return "654600";
		else if (code.equals("530700"))
			return "674100";
		else if (code.equals("530800"))
			return "665000";
		else if (code.equals("530900"))
			return "675800";
		else if (code.equals("532300"))
			return "675000";
		else if (code.equals("532500"))
			return "661000";
		else if (code.equals("532600"))
			return "663000";
		else if (code.equals("532800"))
			return "666100";
		else if (code.equals("532900"))
			return "671000";
		else if (code.equals("533100"))
			return "678400";
		else if (code.equals("533300"))
			return "671400";
		else if (code.equals("533400"))
			return "674400";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("530100"))
			return "0871";
		else if (code.equals("530300"))
			return "0874";
		else if (code.equals("530400"))
			return "0877";
		else if (code.equals("530500"))
			return "0875";
		else if (code.equals("530600"))
			return "0870";
		else if (code.equals("530700"))
			return "0888";
		else if (code.equals("530800"))
			return "0879";
		else if (code.equals("530900"))
			return "0883";
		else if (code.equals("532300"))
			return "0878";
		else if (code.equals("532500"))
			return "0873";
		else if (code.equals("532600"))
			return "0876";
		else if (code.equals("532800"))
			return "0691";
		else if (code.equals("532900"))
			return "0872";
		else if (code.equals("533100"))
			return "0692";
		else if (code.equals("533300"))
			return "0886";
		else if (code.equals("533400"))
			return "0887";
		else
			return null;
	}

}
