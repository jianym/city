package org.ithourse.tools.city.municipality;

import org.ithourse.tools.city.MunicipalityCity;

/**
 * 
 * @author jianym
 * 上海 直辖市
 *
 */
public class ShangHCity implements MunicipalityCity {

	@Override
	public String[] getNames() {
		return new String[] { "黄浦区", "徐汇区", "长宁区", "静安区", "普陀区", "虹口区", "杨浦区",
				"闵行区", "宝山区", "嘉定区", "浦东新区", "金山区", "松江区", "青浦区", "奉贤区", "崇明县" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "310101", "310104", "310105", "310106", "310107",
				"310109", "310110", "310112", "310113", "310114", "310115",
				"310116", "310117", "310118", "310120", "310230" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("310101"))
			return "黄浦区";
		else if (code.equals("310104"))
			return "徐汇区";
		else if (code.equals("310105"))
			return "长宁区";
		else if (code.equals("310106"))
			return "静安区";
		else if (code.equals("310107"))
			return "普陀区";
		else if (code.equals("310109"))
			return "虹口区";
		else if (code.equals("310110"))
			return "杨浦区";
		else if (code.equals("310112"))
			return "闵行区";
		else if (code.equals("310113"))
			return "宝山区";
		else if (code.equals("310114"))
			return "嘉定区";
		else if (code.equals("310115"))
			return "浦东新区";
		else if (code.equals("310116"))
			return "金山区";
		else if (code.equals("310117"))
			return "松江区";
		else if (code.equals("310118"))
			return "青浦区";
		else if (code.equals("310120"))
			return "奉贤区";
		else if (code.equals("310230"))
			return "崇明县";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("黄浦区"))
			return "310101";
		else if (name.equals("徐汇区"))
			return "310104";
		else if (name.equals("长宁区"))
			return "310105";
		else if (name.equals("静安区"))
			return "310106";
		else if (name.equals("普陀区"))
			return "310107";
		else if (name.equals("虹口区"))
			return "310109";
		else if (name.equals("杨浦区"))
			return "310110";
		else if (name.equals("闵行区"))
			return "310112";
		else if (name.equals("宝山区"))
			return "310113";
		else if (name.equals("嘉定区"))
			return "310114";
		else if (name.equals("浦东新区"))
			return "310115";
		else if (name.equals("金山区"))
			return "310116";
		else if (name.equals("松江区"))
			return "310117";
		else if (name.equals("青浦区"))
			return "310118";
		else if (name.equals("奉贤区"))
			return "310120";
		else if (name.equals("崇明县"))
			return "310230";
		else
			return null;
	}

	@Override
	public String[] getVheicleNo() {
		// TODO Auto-generated method stub
		return new String[] { "沪A", "沪B", "沪C", "沪D", "沪E", "沪F", "沪G", "沪H",
				"沪J", "沪K", "沪L", "沪M", "沪N", "沪R" };
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("310101"))
			return "121.490317,31.222771";
		else if (code.equals("310104"))
			return "121.437520,31.179973";
		else if (code.equals("310105"))
			return "121.422200,31.218123";
		else if (code.equals("310106"))
			return "121.448224,31.229003";
		else if (code.equals("310107"))
			return "121.392499,31.241701";
		else if (code.equals("310109"))
			return "121.491832,31.260970";
		else if (code.equals("310110"))
			return "121.522797,31.270755";
		else if (code.equals("310112"))
			return "121.375972,31.111658";
		else if (code.equals("310113"))
			return "121.489934,31.398896";
		else if (code.equals("310114"))
			return "121.250333,31.383524";
		else if (code.equals("310115"))
			return "121.567706,31.245944";
		else if (code.equals("310116"))
			return "121.330736,30.724697";
		else if (code.equals("310117"))
			return "121.223543,31.030470";
		else if (code.equals("310118"))
			return "121.113021,31.151209";
		else if (code.equals("310120"))
			return "121.458472,30.912345";
		else if (code.equals("310230"))
			return "121.397516,31.626946";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("310101"))
			return "200001";
		else if (code.equals("310104"))
			return "200030";
		else if (code.equals("310105"))
			return "200050";
		else if (code.equals("310106"))
			return "200040";
		else if (code.equals("310107"))
			return "200333";
		else if (code.equals("310109"))
			return "200080";
		else if (code.equals("310110"))
			return "200082";
		else if (code.equals("310112"))
			return "201100";
		else if (code.equals("310113"))
			return "201900";
		else if (code.equals("310114"))
			return "201800";
		else if (code.equals("310115"))
			return "200120";
		else if (code.equals("310116"))
			return "201500";
		else if (code.equals("310117"))
			return "201600";
		else if (code.equals("310118"))
			return "201799";
		else if (code.equals("310120"))
			return "201499";
		else if (code.equals("310230"))
			return "202150";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("310101"))
			return "021";
		else if (code.equals("310104"))
			return "021";
		else if (code.equals("310105"))
			return "021";
		else if (code.equals("310106"))
			return "021";
		else if (code.equals("310107"))
			return "021";
		else if (code.equals("310109"))
			return "021";
		else if (code.equals("310110"))
			return "021";
		else if (code.equals("310112"))
			return "021";
		else if (code.equals("310113"))
			return "021";
		else if (code.equals("310114"))
			return "021";
		else if (code.equals("310115"))
			return "021";
		else if (code.equals("310116"))
			return "021";
		else if (code.equals("310117"))
			return "021";
		else if (code.equals("310118"))
			return "021";
		else if (code.equals("310120"))
			return "021";
		else if (code.equals("310230"))
			return "021";
		else
			return null;
	}

}
