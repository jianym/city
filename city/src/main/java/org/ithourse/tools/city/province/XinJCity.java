package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;
/**
 * 
 * @author jianym
 * 新疆 各地市
 *
 */
public class XinJCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "乌鲁木齐", "克拉玛依", "吐鲁番", "哈密地区", "昌吉回族自治州",
				"博尔塔拉蒙古自治州", "巴音郭楞蒙古自治州", "阿克苏地区", "克孜勒苏柯尔克孜自治州", "喀什地区",
				"和田地区", "伊犁哈萨克自治州", "塔城地区", "阿勒泰地区", "石河子", "阿拉尔", "图木舒克",
				"五家渠", "北屯", "铁门关", "双河", "可克达拉", "昆玉" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "650100", "650200", "652100", "652200", "652300",
				"652700", "652800", "652900", "653000", "653100", "653200",
				"654000", "654200", "654300", "659001", "659002", "659003",
				"659004", "659005", "659006", "659007", "659008", "659009" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("650100"))
			return "乌鲁木齐";
		else if (code.equals("650200"))
			return "克拉玛依";
		else if (code.equals("652100"))
			return "吐鲁番";
		else if (code.equals("652200"))
			return "哈密地区";
		else if (code.equals("652300"))
			return "昌吉回族自治州";
		else if (code.equals("652700"))
			return "博尔塔拉蒙古自治州";
		else if (code.equals("652800"))
			return "巴音郭楞蒙古自治州";
		else if (code.equals("652900"))
			return "阿克苏地区";
		else if (code.equals("653000"))
			return "克孜勒苏柯尔克孜自治州";
		else if (code.equals("653100"))
			return "喀什地区";
		else if (code.equals("653200"))
			return "和田地区";
		else if (code.equals("654000"))
			return "伊犁哈萨克自治州";
		else if (code.equals("654200"))
			return "塔城地区";
		else if (code.equals("654300"))
			return "阿勒泰地区";
		else if (code.equals("659001"))
			return "石河子";
		else if (code.equals("659002"))
			return "阿拉尔";
		else if (code.equals("659003"))
			return "图木舒克";
		else if (code.equals("659004"))
			return "五家渠";
		else if (code.equals("659005"))
			return "北屯";
		else if (code.equals("659006"))
			return "铁门关";
		else if (code.equals("659007"))
			return "双河";
		else if (code.equals("659008"))
			return "可克达拉";
		else if (code.equals("659009"))
			return "昆玉";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("乌鲁木齐"))
			return "650100";
		else if (name.equals("克拉玛依"))
			return "650200";
		else if (name.equals("吐鲁番"))
			return "652100";
		else if (name.equals("哈密地区"))
			return "652200";
		else if (name.equals("昌吉回族自治州"))
			return "652300";
		else if (name.equals("博尔塔拉蒙古自治州"))
			return "652700";
		else if (name.equals("巴音郭楞蒙古自治州"))
			return "652800";
		else if (name.equals("阿克苏地区"))
			return "652900";
		else if (name.equals("克孜勒苏柯尔克孜自治州"))
			return "653000";
		else if (name.equals("喀什地区"))
			return "653100";
		else if (name.equals("和田地区"))
			return "653200";
		else if (name.equals("伊犁哈萨克自治州"))
			return "654000";
		else if (name.equals("塔城地区"))
			return "654200";
		else if (name.equals("阿勒泰地区"))
			return "654300";
		else if (name.equals("石河子"))
			return "659001";
		else if (name.equals("阿拉尔"))
			return "659002";
		else if (name.equals("图木舒克"))
			return "659003";
		else if (name.equals("五家渠"))
			return "659004";
		else if (name.equals("北屯"))
			return "659005";
		else if (name.equals("铁门关"))
			return "659006";
		else if (name.equals("双河"))
			return "659007";
		else if (name.equals("可克达拉"))
			return "659008";
		else if (name.equals("昆玉"))
			return "659009";
		else
			return null;
	}

	@Override
	public String vinToCode(String VehicleNo) {
		if ("新A".equals(VehicleNo))
			return "650100";
		else if ("新B".equals(VehicleNo))
			return "652300,659004";
		else if ("新C".equals(VehicleNo))
			return "659001";
		else if ("新D".equals(VehicleNo))
			return "654003";
		else if ("新E".equals(VehicleNo))
			return "652700,659007";
		else if ("新F".equals(VehicleNo))
			return "654000,659008";
		else if ("新G".equals(VehicleNo))
			return "654200";
		else if ("新H".equals(VehicleNo))
			return "654300,659005";
		else if ("新J".equals(VehicleNo))
			return "650200";
		else if ("新K".equals(VehicleNo))
			return "652100";
		else if ("新L".equals(VehicleNo))
			return "652200";
		else if ("新M".equals(VehicleNo))
			return "652800,659006";
		else if ("新N".equals(VehicleNo))
			return "652900,659002";
		else if ("新P".equals(VehicleNo))
			return "653000";
		else if ("新Q".equals(VehicleNo))
			return "653100,659003";
		else if ("新R".equals(VehicleNo))
			return "653200";
		else if ("新S".equals(VehicleNo))
			return "659009";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if ("650100".equals(code))
			return "新A";
		else if ("652300".equals(code) || "659004".equals(code))
			return "新B";
		else if ("659001".equals(code))
			return "新C";
		else if ("654003".equals(code))
			return "新D";
		else if ("652700".equals(code) || "659007".equals(code))
			return "新E";
		else if ("654000".equals(code) || "659008".equals(code))
			return "新F";
		else if ("654200".equals(code))
			return "新G";
		else if ("654300".equals(code) || "659005".equals(code))
			return "新H";
		else if ("650200".equals(code))
			return "新J";
		else if ("652100".equals(code))
			return "新K";
		else if ("652200".equals(code))
			return "新L";
		else if ("652800".equals(code) || "659006".equals(code) )
			return "新M";
		else if ("652900".equals(code) || "659002".equals(code))
			return "新N";
		else if ("653000".equals(code))
			return "新P";
		else if ("653100".equals(code) || "659003".equals(code))
			return "新Q";
		else if ("653200".equals(code))
			return "新R";
		else if ("659009".equals(code))
			return "新S";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("650100"))
			return "87.617733,43.792818";
		else if (code.equals("650200"))
			return "84.873946,45.595886";
		else if (code.equals("652100"))
			return "89.184078,42.947613";
		else if (code.equals("652200"))
			return "93.513160,42.833248";
		else if (code.equals("652300"))
			return "87.304012,44.014577";
		else if (code.equals("652700"))
			return "82.074778,44.903258";
		else if (code.equals("652800"))
			return "86.150969,41.768552";
		else if (code.equals("652900"))
			return "80.265068,41.170712";
		else if (code.equals("653000"))
			return "76.172825,39.713431";
		else if (code.equals("653100"))
			return "75.989138,39.467664";
		else if (code.equals("653200"))
			return "79.925330,37.110687";
		else if (code.equals("654000"))
			return "81.317946,43.921860";
		else if (code.equals("654200"))
			return "82.985732,46.746301";
		else if (code.equals("654300"))
			return "88.139630,47.848393";
		else if (code.equals("659001"))
			return "86.041075,44.305886";
		else if (code.equals("659002"))
			return "81.285884,40.541914";
		else if (code.equals("659003"))
			return "79.077978,39.867316";
		else if (code.equals("659004"))
			return "87.526884,44.167401";
		else if (code.equals("659005"))
			return "87.824932,47.353177";
		else if (code.equals("659006"))
			return "85.501218,41.827251";
		else if (code.equals("659007"))
			return "82.353656,44.840524";
		else if (code.equals("659008"))
			return "81.044640,43.945020";
		else if (code.equals("659009"))
			return "79.291080,37.209640";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("650100"))
			return "830000";
		else if (code.equals("650200"))
			return "834000";
		else if (code.equals("652100"))
			return "838000";
		else if (code.equals("652200"))
			return "839000";
		else if (code.equals("652300"))
			return "831100";
		else if (code.equals("652700"))
			return "833400";
		else if (code.equals("652800"))
			return "841000";
		else if (code.equals("652900"))
			return "843000";
		else if (code.equals("653000"))
			return "845350";
		else if (code.equals("653100"))
			return "844000";
		else if (code.equals("653200"))
			return "848000";
		else if (code.equals("654000"))
			return "835000";
		else if (code.equals("654200"))
			return "834700";
		else if (code.equals("654300"))
			return "836500";
		else if (code.equals("659001"))
			return "832000";
		else if (code.equals("659002"))
			return "843300";
		else if (code.equals("659003"))
			return "844000";
		else if (code.equals("659004"))
			return "831300";
		else if (code.equals("659005"))
			return "836000";
		else if (code.equals("659006"))
			return "836000";
		else if (code.equals("659007"))
			return "833408";
		else if (code.equals("659008"))
			return "835200";
		else if (code.equals("659009"))
			return "848100";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("650100"))
			return "0991";
		else if (code.equals("650200"))
			return "0990";
		else if (code.equals("652100"))
			return "0995";
		else if (code.equals("652200"))
			return "0902";
		else if (code.equals("652300"))
			return "0994";
		else if (code.equals("652700"))
			return "0909";
		else if (code.equals("652800"))
			return "0996";
		else if (code.equals("652900"))
			return "0997";
		else if (code.equals("653000"))
			return "0908";
		else if (code.equals("653100"))
			return "0998";
		else if (code.equals("653200"))
			return "0903";
		else if (code.equals("654000"))
			return "0999";
		else if (code.equals("654200"))
			return "0901";
		else if (code.equals("654300"))
			return "0906";
		else if (code.equals("659001"))
			return "0993";
		else if (code.equals("659002"))
			return "0997";
		else if (code.equals("659003"))
			return "0998";
		else if (code.equals("659004"))
			return "0994";
		else if (code.equals("659005"))
			return "0906";
		else if (code.equals("659006"))
			return "0996";
		else if (code.equals("659007"))
			return "0909";
		else if (code.equals("659008"))
			return "0999";
		else if (code.equals("659009"))
			return "0903";
		else
			return null;
	}
}
