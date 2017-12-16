package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;
/**
 * 
 * @author jianym
 * 江西 各地市
 *
 */
public class JiangXCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "南昌", "景德镇", "萍乡", "九江", "新余", "鹰潭", "赣州", "吉安",
				"宜春", "抚州", "上饶" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "360100", "360200", "360300", "360400", "360500",
				"360600", "360700", "360800", "360900", "361000", "361100" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("360100"))
			return "南昌";
		else if (code.equals("360200"))
			return "景德镇";
		else if (code.equals("360300"))
			return "萍乡";
		else if (code.equals("360400"))
			return "九江";
		else if (code.equals("360500"))
			return "新余";
		else if (code.equals("360600"))
			return "鹰潭";
		else if (code.equals("360700"))
			return "赣州";
		else if (code.equals("360800"))
			return "吉安";
		else if (code.equals("360900"))
			return "宜春";
		else if (code.equals("361000"))
			return "抚州";
		else if (code.equals("361100"))
			return "上饶";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("南昌"))
			return "360100";
		else if (name.equals("景德镇"))
			return "360200";
		else if (name.equals("萍乡"))
			return "360300";
		else if (name.equals("九江"))
			return "360400";
		else if (name.equals("新余"))
			return "360500";
		else if (name.equals("鹰潭"))
			return "360600";
		else if (name.equals("赣州"))
			return "360700";
		else if (name.equals("吉安"))
			return "360800";
		else if (name.equals("宜春"))
			return "360900";
		else if (name.equals("抚州"))
			return "361000";
		else if (name.equals("上饶"))
			return "361100";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("赣A"))
			return "360100";
		else if (vin.equals("赣H"))
			return "360200";
		else if (vin.equals("赣J"))
			return "360300";
		else if (vin.equals("赣G"))
			return "360400";
		else if (vin.equals("赣K"))
			return "360500";
		else if (vin.equals("赣L"))
			return "360600";
		else if (vin.equals("赣B"))
			return "360700";
		else if (vin.equals("赣D"))
			return "360800";
		else if (vin.equals("赣C"))
			return "360900";
		else if (vin.equals("赣F"))
			return "361000";
		else if (vin.equals("赣E"))
			return "361100";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("360100"))
			return "赣A";
		else if (code.equals("360200"))
			return "赣H";
		else if (code.equals("360300"))
			return "赣J";
		else if (code.equals("360400"))
			return "赣G";
		else if (code.equals("360500"))
			return "赣K";
		else if (code.equals("360600"))
			return "赣L";
		else if (code.equals("360700"))
			return "赣B";
		else if (code.equals("360800"))
			return "赣D";
		else if (code.equals("360900"))
			return "赣C";
		else if (code.equals("361000"))
			return "赣F";
		else if (code.equals("361100"))
			return "赣E";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("360100"))
			return "115.892151,28.676493";
		else if (code.equals("360200"))
			return "117.214664,29.292560";
		else if (code.equals("360300"))
			return "113.852186,27.622946";
		else if (code.equals("360400"))
			return "115.992811,29.712034";
		else if (code.equals("360500"))
			return "114.930835,27.810834";
		else if (code.equals("360600"))
			return "117.033838,28.238638";
		else if (code.equals("360700"))
			return "114.940278,25.850970";
		else if (code.equals("360800"))
			return "114.986373,27.111699";
		else if (code.equals("360900"))
			return "114.391136,27.804300";
		else if (code.equals("361000"))
			return "116.358351,27.983850";
		else if (code.equals("361100"))
			return "117.971185,28.444420";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("360100"))
			return "330000";
		else if (code.equals("360200"))
			return "333000";
		else if (code.equals("360300"))
			return "337000";
		else if (code.equals("360400"))
			return "332000";
		else if (code.equals("360500"))
			return "338000";
		else if (code.equals("360600"))
			return "335000";
		else if (code.equals("360700"))
			return "341000";
		else if (code.equals("360800"))
			return "343000";
		else if (code.equals("360900"))
			return "336000";
		else if (code.equals("361000"))
			return "344000";
		else if (code.equals("361100"))
			return "334000";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("360100"))
			return "0791";
		else if (code.equals("360200"))
			return "0798";
		else if (code.equals("360300"))
			return "0799";
		else if (code.equals("360400"))
			return "0792";
		else if (code.equals("360500"))
			return "0790";
		else if (code.equals("360600"))
			return "0701";
		else if (code.equals("360700"))
			return "0797";
		else if (code.equals("360800"))
			return "0796";
		else if (code.equals("360900"))
			return "0795";
		else if (code.equals("361000"))
			return "0794";
		else if (code.equals("361100"))
			return "0793";
		else
			return null;
	}

}
