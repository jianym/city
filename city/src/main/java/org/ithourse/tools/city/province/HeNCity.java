package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 河南 各地市
 *
 */
public class HeNCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "郑州", "开封", "洛阳", "平顶山", "安阳", "鹤壁", "新乡", "焦作",
				"濮阳", "许昌", "漯河", "三门峡", "南阳", "商丘", "信阳", "周口", "驻马店", "济源" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "410100", "410200", "410300", "410400", "410500",
				"410600", "410700", "410800", "410900", "411000", "411100",
				"411200", "411300", "411400", "411500", "411600", "411700",
				"419001" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("410100"))
			return "郑州";
		else if (code.equals("410200"))
			return "开封";
		else if (code.equals("410300"))
			return "洛阳";
		else if (code.equals("410400"))
			return "平顶山";
		else if (code.equals("410500"))
			return "安阳";
		else if (code.equals("410600"))
			return "鹤壁";
		else if (code.equals("410700"))
			return "新乡";
		else if (code.equals("410800"))
			return "焦作";
		else if (code.equals("410900"))
			return "濮阳";
		else if (code.equals("411000"))
			return "许昌";
		else if (code.equals("411100"))
			return "漯河";
		else if (code.equals("411200"))
			return "三门峡";
		else if (code.equals("411300"))
			return "南阳";
		else if (code.equals("411400"))
			return "商丘";
		else if (code.equals("411500"))
			return "信阳";
		else if (code.equals("411600"))
			return "周口";
		else if (code.equals("411700"))
			return "驻马店";
		else if (code.equals("419001"))
			return "济源";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("郑州"))
			return "410100";
		else if (name.equals("开封"))
			return "410200";
		else if (name.equals("洛阳"))
			return "410300";
		else if (name.equals("平顶山"))
			return "410400";
		else if (name.equals("安阳"))
			return "410500";
		else if (name.equals("鹤壁"))
			return "410600";
		else if (name.equals("新乡"))
			return "410700";
		else if (name.equals("焦作"))
			return "410800";
		else if (name.equals("濮阳"))
			return "410900";
		else if (name.equals("许昌"))
			return "411000";
		else if (name.equals("漯河"))
			return "411100";
		else if (name.equals("三门峡"))
			return "411200";
		else if (name.equals("南阳"))
			return "411300";
		else if (name.equals("商丘"))
			return "411400";
		else if (name.equals("信阳"))
			return "411500";
		else if (name.equals("周口"))
			return "411600";
		else if (name.equals("驻马店"))
			return "411700";
		else if (name.equals("济源"))
			return "419001";
		else
			return null;
	}

	@Override
	public String vinToCode(String VehicleNo) {
		if (VehicleNo.equals("豫A"))
			return "410100";
		else if (VehicleNo.equals("豫B"))
			return "410200";
		else if (VehicleNo.equals("豫C"))
			return "410300";
		else if (VehicleNo.equals("豫D"))
			return "410400";
		else if (VehicleNo.equals("豫E"))
			return "410500";
		else if (VehicleNo.equals("豫F"))
			return "410600";
		else if (VehicleNo.equals("豫G"))
			return "410700";
		else if (VehicleNo.equals("豫H"))
			return "410800";
		else if (VehicleNo.equals("豫J"))
			return "410900";
		else if (VehicleNo.equals("豫K"))
			return "411000";
		else if (VehicleNo.equals("豫L"))
			return "411100";
		else if (VehicleNo.equals("豫M"))
			return "411200";
		else if (VehicleNo.equals("豫R"))
			return "411300";
		else if (VehicleNo.equals("豫N"))
			return "411400";
		else if (VehicleNo.equals("豫S"))
			return "411500";
		else if (VehicleNo.equals("豫P"))
			return "411600";
		else if (VehicleNo.equals("豫Q"))
			return "411700";
		else if (VehicleNo.equals("豫U"))
			return "419001";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("410100"))
			return "豫A";
		else if (code.equals("410200"))
			return "豫B";
		else if (code.equals("410300"))
			return "豫C";
		else if (code.equals("410400"))
			return "豫D";
		else if (code.equals("410500"))
			return "豫E";
		else if (code.equals("410600"))
			return "豫F";
		else if (code.equals("410700"))
			return "豫G";
		else if (code.equals("410800"))
			return "豫H";
		else if (code.equals("410900"))
			return "豫J";
		else if (code.equals("411000"))
			return "豫K";
		else if (code.equals("411100"))
			return "豫L";
		else if (code.equals("411200"))
			return "豫M";
		else if (code.equals("411300"))
			return "豫R";
		else if (code.equals("411400"))
			return "豫N";
		else if (code.equals("411500"))
			return "豫S";
		else if (code.equals("411600"))
			return "豫P";
		else if (code.equals("411700"))
			return "豫Q";
		else if (code.equals("419001"))
			return "豫U";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("410100"))
			return "113.665412,34.757975";
		else if (code.equals("410200"))
			return "114.341447,34.797049";
		else if (code.equals("410300"))
			return "112.434468,34.663041";
		else if (code.equals("410400"))
			return "113.307718,33.735241";
		else if (code.equals("410500"))
			return "114.352482,36.103442";
		else if (code.equals("410600"))
			return "114.295444,35.748236";
		else if (code.equals("410700"))
			return "113.883991,35.302616";
		else if (code.equals("410800"))
			return "113.238266,35.239040";
		else if (code.equals("410900"))
			return "115.041299,35.768234";
		else if (code.equals("411000"))
			return "113.826063,34.022956";
		else if (code.equals("411100"))
			return "114.026405,33.575855";
		else if (code.equals("411200"))
			return "111.194099,34.777338";
		else if (code.equals("411300"))
			return "112.540918,32.999082";
		else if (code.equals("411400"))
			return "115.650497,34.437054";
		else if (code.equals("411500"))
			return "114.075031,32.123274";
		else if (code.equals("411600"))
			return "114.649653,33.620357";
		else if (code.equals("411700"))
			return "114.024736,32.980169";
		else if (code.equals("419001"))
			return "112.590047,35.090378";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("410100"))
			return "450000";
		else if (code.equals("410200"))
			return "475000";
		else if (code.equals("410300"))
			return "471000";
		else if (code.equals("410400"))
			return "462500";
		else if (code.equals("410500"))
			return "455000";
		else if (code.equals("410600"))
			return "456200";
		else if (code.equals("410700"))
			return "453000";
		else if (code.equals("410800"))
			return "454000";
		else if (code.equals("410900"))
			return "457000";
		else if (code.equals("411000"))
			return "461000";
		else if (code.equals("411100"))
			return "462000";
		else if (code.equals("411200"))
			return "472000";
		else if (code.equals("411300"))
			return "473000";
		else if (code.equals("411400"))
			return "476000";
		else if (code.equals("411500"))
			return "464000";
		else if (code.equals("411600"))
			return "461300";
		else if (code.equals("411700"))
			return "463000";
		else if (code.equals("419001"))
			return "454000";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("410100"))
			return "0371";
		else if (code.equals("410200"))
			return "0371";
		else if (code.equals("410300"))
			return "0379";
		else if (code.equals("410400"))
			return "0375";
		else if (code.equals("410500"))
			return "0372";
		else if (code.equals("410600"))
			return "0392";
		else if (code.equals("410700"))
			return "0373";
		else if (code.equals("410800"))
			return "0391";
		else if (code.equals("410900"))
			return "0393";
		else if (code.equals("411000"))
			return "0374";
		else if (code.equals("411100"))
			return "0395";
		else if (code.equals("411200"))
			return "0398";
		else if (code.equals("411300"))
			return "0377";
		else if (code.equals("411400"))
			return "0370";
		else if (code.equals("411500"))
			return "0376";
		else if (code.equals("411600"))
			return "0394";
		else if (code.equals("411700"))
			return "0396";
		else if (code.equals("419001"))
			return "0391";
		else
			return null;
	}

}
