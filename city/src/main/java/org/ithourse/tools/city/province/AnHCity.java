package org.ithourse.tools.city.province;


import org.ithourse.tools.city.ProvinceCity;
/**
 * 
 * @author jianym
 * 安徽 各地市
 *
 */
public class AnHCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "合肥", "芜湖", "蚌埠", "淮南", "马鞍山", "淮北", "铜陵", "安庆",
				"黄山", "滁州", "阜阳", "宿州", "六安", "亳州", "池州", "宣城" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "340100", "340200", "340300", "340400", "340500",
				"340600", "340700", "340800", "341000", "341100", "341200",
				"341300", "341500", "341600", "341700", "341800" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("340100"))
			return "合肥";
		else if (code.equals("340200"))
			return "芜湖";
		else if (code.equals("340300"))
			return "蚌埠";
		else if (code.equals("340400"))
			return "淮南";
		else if (code.equals("340500"))
			return "马鞍山";
		else if (code.equals("340600"))
			return "淮北";
		else if (code.equals("340700"))
			return "铜陵";
		else if (code.equals("340800"))
			return "安庆";
		else if (code.equals("341000"))
			return "黄山";
		else if (code.equals("341100"))
			return "滁州";
		else if (code.equals("341200"))
			return "阜阳";
		else if (code.equals("341300"))
			return "宿州";
		else if (code.equals("341500"))
			return "六安";
		else if (code.equals("341600"))
			return "亳州";
		else if (code.equals("341700"))
			return "池州";
		else if (code.equals("341800"))
			return "宣城";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("合肥"))
			return "340100";
		else if (name.equals("芜湖"))
			return "340200";
		else if (name.equals("蚌埠"))
			return "340300";
		else if (name.equals("淮南"))
			return "340400";
		else if (name.equals("马鞍山"))
			return "340500";
		else if (name.equals("淮北"))
			return "340600";
		else if (name.equals("铜陵"))
			return "340700";
		else if (name.equals("安庆"))
			return "340800";
		else if (name.equals("黄山"))
			return "341000";
		else if (name.equals("滁州"))
			return "341100";
		else if (name.equals("阜阳"))
			return "341200";
		else if (name.equals("宿州"))
			return "341300";
		else if (name.equals("六安"))
			return "341500";
		else if (name.equals("亳州"))
			return "341600";
		else if (name.equals("池州"))
			return "341700";
		else if (name.equals("宣城"))
			return "341800";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("皖A"))
			return "340100";
		else if (vin.equals("皖B"))
			return "340200";
		else if (vin.equals("皖C"))
			return "340300";
		else if (vin.equals("皖D"))
			return "340400";
		else if (vin.equals("皖E"))
			return "340500";
		else if (vin.equals("皖F"))
			return "340600";
		else if (vin.equals("皖G"))
			return "340700";
		else if (vin.equals("皖H"))
			return "340800";
		else if (vin.equals("皖J"))
			return "341000";
		else if (vin.equals("皖M"))
			return "341100";
		else if (vin.equals("皖K"))
			return "341200";
		else if (vin.equals("皖L"))
			return "341300";
		else if (vin.equals("皖N"))
			return "341500";
		else if (vin.equals("皖S"))
			return "341600";
		else if (vin.equals("皖R"))
			return "341700";
		else if (vin.equals("皖P"))
			return "341800";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("340100"))
			return "皖A";
		else if (code.equals("340200"))
			return "皖B";
		else if (code.equals("340300"))
			return "皖C";
		else if (code.equals("340400"))
			return "皖D";
		else if (code.equals("340500"))
			return "皖E";
		else if (code.equals("340600"))
			return "皖F";
		else if (code.equals("340700"))
			return "皖G";
		else if (code.equals("340800"))
			return "皖H";
		else if (code.equals("341000"))
			return "皖J";
		else if (code.equals("341100"))
			return "皖M";
		else if (code.equals("341200"))
			return "皖K";
		else if (code.equals("341300"))
			return "皖L";
		else if (code.equals("341500"))
			return "皖N";
		else if (code.equals("341600"))
			return "皖S";
		else if (code.equals("341700"))
			return "皖R";
		else if (code.equals("341800"))
			return "皖P";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("340100"))
			return "117.283042,31.861190";
		else if (code.equals("340200"))
			return "118.376451,31.326319";
		else if (code.equals("340300"))
			return "117.363228,32.939667";
		else if (code.equals("340400"))
			return "117.018329,32.647574";
		else if (code.equals("340500"))
			return "118.507906,31.689362";
		else if (code.equals("340600"))
			return "116.794664,33.971707";
		else if (code.equals("340700"))
			return "117.816576,30.929935";
		else if (code.equals("340800"))
			return "117.043551,30.50883";
		else if (code.equals("341000"))
			return "118.317325,29.709239";
		else if (code.equals("341100"))
			return "118.316264,32.303627";
		else if (code.equals("341200"))
			return "115.819729,32.896969";
		else if (code.equals("341300"))
			return "116.984084,33.633891";
		else if (code.equals("341500"))
			return "116.507676,31.752889";
		else if (code.equals("341600"))
			return "115.782939,33.869338";
		else if (code.equals("341700"))
			return "117.489157,30.656037";
		else if (code.equals("341800"))
			return "118.757995,30.945667";
		else
			return null;
	}
	@Override
	public String codeToPost(String code) {
		if (code.equals("340100"))
			return "230000";
		else if (code.equals("340200"))
			return "241000";
		else if (code.equals("340300"))
			return "233000";
		else if (code.equals("340400"))
			return "232000";
		else if (code.equals("340500"))
			return "243000";
		else if (code.equals("340600"))
			return "235000";
		else if (code.equals("340700"))
			return "244000";
		else if (code.equals("340800"))
			return "246000";
		else if (code.equals("341000"))
			return "245000";
		else if (code.equals("341100"))
			return "239000";
		else if (code.equals("341200"))
			return "236000";
		else if (code.equals("341300"))
			return "234000";
		else if (code.equals("341500"))
			return "237000";
		else if (code.equals("341600"))
			return "236000";
		else if (code.equals("341700"))
			return "247000";
		else if (code.equals("341800"))
			return "242000";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("340100"))
			return "0551";
		else if (code.equals("340200"))
			return "0553";
		else if (code.equals("340300"))
			return "0552";
		else if (code.equals("340400"))
			return "0554";
		else if (code.equals("340500"))
			return "0555";
		else if (code.equals("340600"))
			return "0561";
		else if (code.equals("340700"))
			return "0562";
		else if (code.equals("340800"))
			return "0556";
		else if (code.equals("341000"))
			return "0559";
		else if (code.equals("341100"))
			return "0550";
		else if (code.equals("341200"))
			return "0558";
		else if (code.equals("341300"))
			return "0557";
		else if (code.equals("341500"))
			return "0564";
		else if (code.equals("341600"))
			return "0558";
		else if (code.equals("341700"))
			return "0566";
		else if (code.equals("341800"))
			return "0563";
		else
			return null;
	}

}
