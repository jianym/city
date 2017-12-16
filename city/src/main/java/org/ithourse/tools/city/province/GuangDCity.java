package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 广东 各地市
 *
 */
public class GuangDCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "广州", "深圳", "珠海", "汕头", "佛山", "韶关", "湛江", "肇庆",
				"江门", "茂名", "惠州", "梅州", "汕尾", "河源", "阳江", "清远", "东莞", "中山",
				"潮州", "揭阳", "云浮" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "440100", "440300", "440400", "440500", "440600",
				"440200", "440800", "441200", "440700", "440900", "441300",
				"441400", "441500", "441600", "441700", "441800", "441900",
				"442000", "445100", "445200", "445300" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("440100"))
			return "广州";
		else if (code.equals("440300"))
			return "深圳";
		else if (code.equals("440400"))
			return "珠海";
		else if (code.equals("440500"))
			return "汕头";
		else if (code.equals("440600"))
			return "佛山";
		else if (code.equals("440200"))
			return "韶关";
		else if (code.equals("440800"))
			return "湛江";
		else if (code.equals("441200"))
			return "肇庆";
		else if (code.equals("440700"))
			return "江门";
		else if (code.equals("440900"))
			return "茂名";
		else if (code.equals("441300"))
			return "惠州";
		else if (code.equals("441400"))
			return "梅州";
		else if (code.equals("441500"))
			return "汕尾";
		else if (code.equals("441600"))
			return "河源";
		else if (code.equals("441700"))
			return "阳江";
		else if (code.equals("441800"))
			return "清远";
		else if (code.equals("441900"))
			return "东莞";
		else if (code.equals("442000"))
			return "中山";
		else if (code.equals("445100"))
			return "潮州";
		else if (code.equals("445200"))
			return "揭阳";
		else if (code.equals("445300"))
			return "云浮";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("广州"))
			return "440100";
		else if (name.equals("深圳"))
			return "440300";
		else if (name.equals("珠海"))
			return "440400";
		else if (name.equals("汕头"))
			return "440500";
		else if (name.equals("佛山"))
			return "440600";
		else if (name.equals("韶关"))
			return "440200";
		else if (name.equals("湛江"))
			return "440800";
		else if (name.equals("肇庆"))
			return "441200";
		else if (name.equals("江门"))
			return "440700";
		else if (name.equals("茂名"))
			return "440900";
		else if (name.equals("惠州"))
			return "441300";
		else if (name.equals("梅州"))
			return "441400";
		else if (name.equals("汕尾"))
			return "441500";
		else if (name.equals("河源"))
			return "441600";
		else if (name.equals("阳江"))
			return "441700";
		else if (name.equals("清远"))
			return "441800";
		else if (name.equals("东莞"))
			return "441900";
		else if (name.equals("中山"))
			return "442000";
		else if (name.equals("潮州"))
			return "445100";
		else if (name.equals("揭阳"))
			return "445200";
		else if (name.equals("云浮"))
			return "445300";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("粤A"))
			return "440100";
		else if (vin.equals("粤B"))
			return "440300";
		else if (vin.equals("粤C"))
			return "440400";
		else if (vin.equals("粤D"))
			return "440500";
		else if (vin.equals("粤E") || vin.equals("粤Y") || vin.equals("粤X"))
			return "440600";
		else if (vin.equals("粤F"))
			return "440200";
		else if (vin.equals("粤G"))
			return "440800";
		else if (vin.equals("粤H"))
			return "441200";
		else if (vin.equals("粤J"))
			return "440700";
		else if (vin.equals("粤K"))
			return "440900";
		else if (vin.equals("粤L"))
			return "441300";
		else if (vin.equals("粤M"))
			return "441400";
		else if (vin.equals("粤N"))
			return "441500";
		else if (vin.equals("粤P"))
			return "441600";
		else if (vin.equals("粤Q"))
			return "441700";
		else if (vin.equals("粤R"))
			return "441800";
		else if (vin.equals("粤S"))
			return "441900";
		else if (vin.equals("粤T"))
			return "442000";
		else if (vin.equals("粤U"))
			return "445100";
		else if (vin.equals("粤V"))
			return "445200";
		else if (vin.equals("粤W"))
			return "445300";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("440100"))
			return "粤A";
		else if (code.equals("440300"))
			return "粤B";
		else if (code.equals("440400"))
			return "粤C";
		else if (code.equals("440500"))
			return "粤D";
		else if (code.equals("440600"))
			return "粤E,粤Y,粤X";
		else if (code.equals("440200"))
			return "粤F";
		else if (code.equals("440800"))
			return "粤G";
		else if (code.equals("441200"))
			return "粤H";
		else if (code.equals("440700"))
			return "粤J";
		else if (code.equals("440900"))
			return "粤K";
		else if (code.equals("441300"))
			return "粤L";
		else if (code.equals("441400"))
			return "粤M";
		else if (code.equals("441500"))
			return "粤N";
		else if (code.equals("441600"))
			return "粤P";
		else if (code.equals("441700"))
			return "粤Q";
		else if (code.equals("441800"))
			return "粤R";
		else if (code.equals("441900"))
			return "粤S";
		else if (code.equals("442000"))
			return "粤T";
		else if (code.equals("445100"))
			return "粤U";
		else if (code.equals("445200"))
			return "粤V";
		else if (code.equals("445300"))
			return "粤W";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("440100"))
			return "113.280637,23.125178";
		else if (code.equals("440300"))
			return "114.085947,22.547000";
		else if (code.equals("440400"))
			return "113.553986,22.224979";
		else if (code.equals("440500"))
			return "116.708463,23.371020";
		else if (code.equals("440600"))
			return "113.122717,23.028762";
		else if (code.equals("440200"))
			return "113.591544,24.801322";
		else if (code.equals("440800"))
			return "110.364977,21.274898";
		else if (code.equals("441200"))
			return "112.472529,23.051546";
		else if (code.equals("440700"))
			return "113.094942,22.590431";
		else if (code.equals("440900"))
			return "110.919229,21.659751";
		else if (code.equals("441300"))
			return "114.412599,23.079404";
		else if (code.equals("441400"))
			return "116.117582,24.299112";
		else if (code.equals("441500"))
			return "115.364238,22.774485";
		else if (code.equals("441600"))
			return "114.697802,23.746266";
		else if (code.equals("441700"))
			return "111.975107,21.859222";
		else if (code.equals("441800"))
			return "113.051227,23.685022";
		else if (code.equals("441900"))
			return "113.746262,23.046237";
		else if (code.equals("442000"))
			return "113.382391,22.521113";
		else if (code.equals("445100"))
			return "116.632301,23.661701";
		else if (code.equals("445200"))
			return "116.355733,23.543778";
		else if (code.equals("445300"))
			return "112.044439,22.929801";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("440100"))
			return "510000";
		else if (code.equals("440300"))
			return "518000";
		else if (code.equals("440400"))
			return "519000";
		else if (code.equals("440500"))
			return "515000";
		else if (code.equals("440600"))
			return "528000";
		else if (code.equals("440200"))
			return "512000";
		else if (code.equals("440800"))
			return "524000";
		else if (code.equals("441200"))
			return "526000";
		else if (code.equals("440700"))
			return "529000";
		else if (code.equals("440900"))
			return "525000";
		else if (code.equals("441300"))
			return "516000";
		else if (code.equals("441400"))
			return "514000";
		else if (code.equals("441500"))
			return "516600";
		else if (code.equals("441600"))
			return "517000";
		else if (code.equals("441700"))
			return "529500";
		else if (code.equals("441800"))
			return "511500";
		else if (code.equals("441900"))
			return "523000";
		else if (code.equals("442000"))
			return "528400";
		else if (code.equals("445100"))
			return "521000";
		else if (code.equals("445200"))
			return "522000";
		else if (code.equals("445300"))
			return "527300";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("440100"))
			return "020";
		else if (code.equals("440300"))
			return "0755";
		else if (code.equals("440400"))
			return "0756";
		else if (code.equals("440500"))
			return "0754";
		else if (code.equals("440600"))
			return "0757";
		else if (code.equals("440200"))
			return "0751";
		else if (code.equals("440800"))
			return "0759";
		else if (code.equals("441200"))
			return "0758";
		else if (code.equals("440700"))
			return "0750";
		else if (code.equals("440900"))
			return "0668";
		else if (code.equals("441300"))
			return "0752";
		else if (code.equals("441400"))
			return "0753";
		else if (code.equals("441500"))
			return "0660";
		else if (code.equals("441600"))
			return "0762";
		else if (code.equals("441700"))
			return "0662";
		else if (code.equals("441800"))
			return "0763";
		else if (code.equals("441900"))
			return "0769";
		else if (code.equals("442000"))
			return "0760";
		else if (code.equals("445100"))
			return "0768";
		else if (code.equals("445200"))
			return "0663";
		else if (code.equals("445300"))
			return "0766";
		else
			return null;
	}

}
