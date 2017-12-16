package org.ithourse.tools.city;

/**
 * 
 * @author jianym
 * 中国各省
 *
 */
public class ChinaCity implements City {
	
	@Override
	public String[] getNames() {
		return new String[] { "北京", "天津", "河北", "山西", "内蒙古", "辽宁", "吉林", "黑龙江",
				"上海", "江苏", "浙江", "安徽", "福建", "江西", "山东", "河南", "湖北", "湖南",
				"广东", "广西", "海南", "重庆", "四川", "贵州", "云南", "西藏", "陕西", "甘肃",
				"青海", "宁夏", "新疆", "香港", "澳门", "台湾" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "110000", "120000", "130000", "140000", "150000",
				"210000", "220000", "230000", "310000", "320000", "330000",
				"340000", "350000", "360000", "370000", "410000", "420000",
				"430000", "440000", "450000", "460000", "500000", "510000",
				"520000", "530000", "540000", "610000", "620000", "630000",
				"640000", "650000", "810000", "820000", "710000" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("110000"))
			return "北京";
		else if (code.equals("120000"))
			return "天津";
		else if (code.equals("130000"))
			return "河北";
		else if (code.equals("140000"))
			return "山西";
		else if (code.equals("150000"))
			return "内蒙古";
		else if (code.equals("210000"))
			return "辽宁";
		else if (code.equals("220000"))
			return "吉林";
		else if (code.equals("230000"))
			return "黑龙江";
		else if (code.equals("310000"))
			return "上海";
		else if (code.equals("320000"))
			return "江苏";
		else if (code.equals("330000"))
			return "浙江";
		else if (code.equals("340000"))
			return "安徽";
		else if (code.equals("350000"))
			return "福建";
		else if (code.equals("360000"))
			return "江西";
		else if (code.equals("370000"))
			return "山东";
		else if (code.equals("410000"))
			return "河南";
		else if (code.equals("420000"))
			return "湖北";
		else if (code.equals("430000"))
			return "湖南";
		else if (code.equals("440000"))
			return "广东";
		else if (code.equals("450000"))
			return "广西";
		else if (code.equals("460000"))
			return "海南";
		else if (code.equals("500000"))
			return "重庆";
		else if (code.equals("510000"))
			return "四川";
		else if (code.equals("520000"))
			return "贵州";
		else if (code.equals("530000"))
			return "云南";
		else if (code.equals("540000"))
			return "西藏";
		else if (code.equals("610000"))
			return "陕西";
		else if (code.equals("620000"))
			return "甘肃";
		else if (code.equals("630000"))
			return "青海";
		else if (code.equals("640000"))
			return "宁夏";
		else if (code.equals("650000"))
			return "新疆";
		else if (code.equals("810000"))
			return "香港";
		else if (code.equals("820000"))
			return "澳门";
		else if (code.equals("710000"))
			return "台湾";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("北京"))
			return "110000";
		else if (name.equals("天津"))
			return "120000";
		else if (name.equals("河北"))
			return "130000";
		else if (name.equals("山西"))
			return "140000";
		else if (name.equals("内蒙古"))
			return "150000";
		else if (name.equals("辽宁"))
			return "210000";
		else if (name.equals("吉林"))
			return "220000";
		else if (name.equals("黑龙江"))
			return "230000";
		else if (name.equals("上海"))
			return "310000";
		else if (name.equals("江苏"))
			return "320000";
		else if (name.equals("浙江"))
			return "330000";
		else if (name.equals("安徽"))
			return "340000";
		else if (name.equals("福建"))
			return "350000";
		else if (name.equals("江西"))
			return "360000";
		else if (name.equals("山东"))
			return "370000";
		else if (name.equals("河南"))
			return "410000";
		else if (name.equals("湖北"))
			return "420000";
		else if (name.equals("湖南"))
			return "430000";
		else if (name.equals("广东"))
			return "440000";
		else if (name.equals("广西"))
			return "450000";
		else if (name.equals("海南"))
			return "460000";
		else if (name.equals("重庆"))
			return "500000";
		else if (name.equals("四川"))
			return "510000";
		else if (name.equals("贵州"))
			return "520000";
		else if (name.equals("云南"))
			return "530000";
		else if (name.equals("西藏"))
			return "540000";
		else if (name.equals("陕西"))
			return "610000";
		else if (name.equals("甘肃"))
			return "620000";
		else if (name.equals("青海"))
			return "630000";
		else if (name.equals("宁夏"))
			return "640000";
		else if (name.equals("新疆"))
			return "650000";
		else if (name.equals("香港"))
			return "810000";
		else if (name.equals("澳门"))
			return "820000";
		else if (name.equals("台湾"))
			return "710000";
		else
			return null;
	}

	public String vinToCode(String vin) {
		if (vin.equals("京"))
			return "110000";
		else if (vin.equals("津"))
			return "120000";
		else if (vin.equals("冀"))
			return "130000";
		else if (vin.equals("晋"))
			return "140000";
		else if (vin.equals("蒙"))
			return "150000";
		else if (vin.equals("辽"))
			return "210000";
		else if (vin.equals("吉"))
			return "220000";
		else if (vin.equals("黑"))
			return "230000";
		else if (vin.equals("沪"))
			return "310000";
		else if (vin.equals("苏"))
			return "320000";
		else if (vin.equals("浙"))
			return "330000";
		else if (vin.equals("皖"))
			return "340000";
		else if (vin.equals("闽"))
			return "350000";
		else if (vin.equals("赣"))
			return "360000";
		else if (vin.equals("鲁"))
			return "370000";
		else if (vin.equals("豫"))
			return "410000";
		else if (vin.equals("鄂"))
			return "420000";
		else if (vin.equals("湘"))
			return "430000";
		else if (vin.equals("粤"))
			return "440000";
		else if (vin.equals("桂"))
			return "450000";
		else if (vin.equals("琼"))
			return "460000";
		else if (vin.equals("渝"))
			return "500000";
		else if (vin.equals("川"))
			return "510000";
		else if (vin.equals("贵"))
			return "520000";
		else if (vin.equals("云"))
			return "530000";
		else if (vin.equals("藏"))
			return "540000";
		else if (vin.equals("陕"))
			return "610000";
		else if (vin.equals("甘"))
			return "620000";
		else if (vin.equals("青"))
			return "630000";
		else if (vin.equals("宁"))
			return "640000";
		else if (vin.equals("新"))
			return "650000";
		else if (vin.equals("粤Z"))
			return "810000";
		else if (vin.equals("粤Z"))
			return "820000";
		else
			return null;
	}

	public String codeToVin(String code) {
		if (code.equals("110000"))
			return "京";
		else if (code.equals("120000"))
			return "津";
		else if (code.equals("130000"))
			return "冀";
		else if (code.equals("140000"))
			return "晋";
		else if (code.equals("150000"))
			return "蒙";
		else if (code.equals("210000"))
			return "辽";
		else if (code.equals("220000"))
			return "吉";
		else if (code.equals("230000"))
			return "黑";
		else if (code.equals("310000"))
			return "沪";
		else if (code.equals("320000"))
			return "苏";
		else if (code.equals("330000"))
			return "浙";
		else if (code.equals("340000"))
			return "皖";
		else if (code.equals("350000"))
			return "闽";
		else if (code.equals("360000"))
			return "赣";
		else if (code.equals("370000"))
			return "鲁";
		else if (code.equals("410000"))
			return "豫";
		else if (code.equals("420000"))
			return "鄂";
		else if (code.equals("430000"))
			return "湘";
		else if (code.equals("440000"))
			return "粤";
		else if (code.equals("450000"))
			return "桂";
		else if (code.equals("460000"))
			return "琼";
		else if (code.equals("500000"))
			return "渝";
		else if (code.equals("510000"))
			return "川";
		else if (code.equals("520000"))
			return "贵";
		else if (code.equals("530000"))
			return "云";
		else if (code.equals("540000"))
			return "藏";
		else if (code.equals("610000"))
			return "陕";
		else if (code.equals("620000"))
			return "甘";
		else if (code.equals("630000"))
			return "青";
		else if (code.equals("640000"))
			return "宁";
		else if (code.equals("650000"))
			return "新";
		else if (code.equals("810000"))
			return "粤Z";
		else if (code.equals("820000"))
			return "粤Z";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("110000"))
			return "116.405285,39.904989";
		else if (code.equals("120000"))
			return "117.190182,39.125596";
		else if (code.equals("130000"))
			return "114.502461,38.045474";
		else if (code.equals("140000"))
			return "112.549248,37.857014";
		else if (code.equals("150000"))
			return "111.670801,40.818311";
		else if (code.equals("210000"))
			return "123.429096,41.796767";
		else if (code.equals("220000"))
			return "125.324500,43.886841";
		else if (code.equals("230000"))
			return "126.642464,45.756967";
		else if (code.equals("310000"))
			return "121.472644,31.231706";
		else if (code.equals("320000"))
			return "118.767413,32.041544";
		else if (code.equals("330000"))
			return "120.153576,30.287459";
		else if (code.equals("340000"))
			return "117.283042,31.861190";
		else if (code.equals("350000"))
			return "119.306239,26.075302";
		else if (code.equals("360000"))
			return "115.892151,28.676493";
		else if (code.equals("370000"))
			return "117.000923,36.675807";
		else if (code.equals("410000"))
			return "113.665412,34.757975";
		else if (code.equals("420000"))
			return "114.298572,30.584355";
		else if (code.equals("430000"))
			return "112.982279,28.194090";
		else if (code.equals("440000"))
			return "113.280637,23.125178";
		else if (code.equals("450000"))
			return "108.320004,22.824020";
		else if (code.equals("460000"))
			return "110.331190,20.031971";
		else if (code.equals("500000"))
			return "106.504962,29.533155";
		else if (code.equals("510000"))
			return "104.065735,30.659462";
		else if (code.equals("520000"))
			return "106.713478,26.578343";
		else if (code.equals("530000"))
			return "102.712251,25.040609";
		else if (code.equals("540000"))
			return "91.132212,29.660361";
		else if (code.equals("610000"))
			return "108.948024,34.263161";
		else if (code.equals("620000"))
			return "103.823557,36.058039";
		else if (code.equals("630000"))
			return "101.778916,36.623178";
		else if (code.equals("640000"))
			return "106.278179,38.466370";
		else if (code.equals("650000"))
			return "87.617733,43.792818";
		else if (code.equals("810000"))
			return "114.173355,22.320048";
		else if (code.equals("820000"))
			return "113.54909,22.198951";
		else if (code.equals("710000"))
			return "121.509062,25.044332";
		else
			return null;
	}

}
