package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 陕西 各地市
 *
 */
public class ShaanXCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "西安", "铜川", "宝鸡", "咸阳", "渭南", "延安", "汉中", "榆林",
				"安康", "商洛" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "610100", "610200", "610300", "610400", "610500",
				"610600", "610700", "610800", "610900", "611000" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("610100"))
			return "西安";
		else if (code.equals("610200"))
			return "铜川";
		else if (code.equals("610300"))
			return "宝鸡";
		else if (code.equals("610400"))
			return "咸阳";
		else if (code.equals("610500"))
			return "渭南";
		else if (code.equals("610600"))
			return "延安";
		else if (code.equals("610700"))
			return "汉中";
		else if (code.equals("610800"))
			return "榆林";
		else if (code.equals("610900"))
			return "安康";
		else if (code.equals("611000"))
			return "商洛";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("西安"))
			return "610100";
		else if (name.equals("铜川"))
			return "610200";
		else if (name.equals("宝鸡"))
			return "610300";
		else if (name.equals("咸阳"))
			return "610400";
		else if (name.equals("渭南"))
			return "610500";
		else if (name.equals("延安"))
			return "610600";
		else if (name.equals("汉中"))
			return "610700";
		else if (name.equals("榆林"))
			return "610800";
		else if (name.equals("安康"))
			return "610900";
		else if (name.equals("商洛"))
			return "611000";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("陕A"))
			return "610100";
		else if (vin.equals("陕B"))
			return "610200";
		else if (vin.equals("陕C"))
			return "610300";
		else if (vin.equals("陕D"))
			return "610400";
		else if (vin.equals("陕E"))
			return "610500";
		else if (vin.equals("陕J"))
			return "610600";
		else if (vin.equals("陕F"))
			return "610700";
		else if (vin.equals("陕K"))
			return "610800";
		else if (vin.equals("陕G"))
			return "610900";
		else if (vin.equals("陕H"))
			return "611000";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("610100"))
			return "陕A";
		else if (code.equals("610200"))
			return "陕B";
		else if (code.equals("610300"))
			return "陕C";
		else if (code.equals("610400"))
			return "陕D";
		else if (code.equals("610500"))
			return "陕E";
		else if (code.equals("610600"))
			return "陕J";
		else if (code.equals("610700"))
			return "陕F";
		else if (code.equals("610800"))
			return "陕K";
		else if (code.equals("610900"))
			return "陕G";
		else if (code.equals("611000"))
			return "陕H";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("610100"))
			return "108.948024,34.263161";
		else if (code.equals("610200"))
			return "108.979608,34.916582";
		else if (code.equals("610300"))
			return "107.144870,34.369315";
		else if (code.equals("610400"))
			return "108.705117,34.333439";
		else if (code.equals("610500"))
			return "109.502882,34.499381";
		else if (code.equals("610600"))
			return "109.490810,36.596537";
		else if (code.equals("610700"))
			return "107.028621,33.077668";
		else if (code.equals("610800"))
			return "109.741193,38.290162";
		else if (code.equals("610900"))
			return "109.029273,32.690300";
		else if (code.equals("611000"))
			return "109.939776,33.868319";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("610100"))
			return "710000";
		else if (code.equals("610200"))
			return "727000";
		else if (code.equals("610300"))
			return "721000";
		else if (code.equals("610400"))
			return "712000";
		else if (code.equals("610500"))
			return "714000";
		else if (code.equals("610600"))
			return "716000";
		else if (code.equals("610700"))
			return "723000";
		else if (code.equals("610800"))
			return "719000";
		else if (code.equals("610900"))
			return "725000";
		else if (code.equals("611000"))
			return "726000";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("610100"))
			return "029";
		else if (code.equals("610200"))
			return "0919";
		else if (code.equals("610300"))
			return "0917";
		else if (code.equals("610400"))
			return "029";
		else if (code.equals("610500"))
			return "0913";
		else if (code.equals("610600"))
			return "0911";
		else if (code.equals("610700"))
			return "0916";
		else if (code.equals("610800"))
			return "0912";
		else if (code.equals("610900"))
			return "0915";
		else if (code.equals("611000"))
			return "0914";
		else
			return null;
	}

}
