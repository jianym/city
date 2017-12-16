package org.ithourse.tools.city.municipality;

import org.ithourse.tools.city.MunicipalityCity;

/**
 * 
 * @author jianym
 * 天津 直辖市
 *
 */
public class TianJCity implements MunicipalityCity {

	@Override
	public String[] getNames() {

		return new String[] { "和平区", "河东区", "河西区", "南开区", "河北区", "红桥区", "东丽区",
				"西青区", "津南区", "北辰区", "武清区", "宝坻区", "滨海新区", "宁河县", "静海县", "蓟县" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "120101", "120102", "120103", "120104", "120105",
				"120106", "120110", "120111", "120112", "120113", "120114",
				"120115", "120116", "120221", "120223", "120225" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("120101"))
			return "和平区";
		else if (code.equals("120102"))
			return "河东区";
		else if (code.equals("120103"))
			return "河西区";
		else if (code.equals("120104"))
			return "南开区";
		else if (code.equals("120105"))
			return "河北区";
		else if (code.equals("120106"))
			return "红桥区";
		else if (code.equals("120110"))
			return "东丽区";
		else if (code.equals("120111"))
			return "西青区";
		else if (code.equals("120112"))
			return "津南区";
		else if (code.equals("120113"))
			return "北辰区";
		else if (code.equals("120114"))
			return "武清区";
		else if (code.equals("120115"))
			return "宝坻区";
		else if (code.equals("120116"))
			return "滨海新区";
		else if (code.equals("120221"))
			return "宁河县";
		else if (code.equals("120223"))
			return "静海县";
		else if (code.equals("120225"))
			return "蓟县";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("和平区"))
			return "120101";
		else if (name.equals("河东区"))
			return "120102";
		else if (name.equals("河西区"))
			return "120103";
		else if (name.equals("南开区"))
			return "120104";
		else if (name.equals("河北区"))
			return "120105";
		else if (name.equals("红桥区"))
			return "120106";
		else if (name.equals("东丽区"))
			return "120110";
		else if (name.equals("西青区"))
			return "120111";
		else if (name.equals("津南区"))
			return "120112";
		else if (name.equals("北辰区"))
			return "120113";
		else if (name.equals("武清区"))
			return "120114";
		else if (name.equals("宝坻区"))
			return "120115";
		else if (name.equals("滨海新区"))
			return "120116";
		else if (name.equals("宁河县"))
			return "120221";
		else if (name.equals("静海县"))
			return "120223";
		else if (name.equals("蓟县"))
			return "120225";
		else
			return null;
	}

	@Override
	public String[] getVheicleNo() {
		return new String[] { "津A", "津B", "津C", "津D", "津E", "津F", "津G", "津H",
				"津J", "津K", "津L", "津M", "津N", "津Q", "津R" };
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("120101"))
			return "117.195907,39.118327";
		else if (code.equals("120102"))
			return "117.226568,39.122125";
		else if (code.equals("120103"))
			return "117.217536,39.101897";
		else if (code.equals("120104"))
			return "117.164143,39.120474";
		else if (code.equals("120105"))
			return "117.201569,39.156632";
		else if (code.equals("120106"))
			return "117.163301,39.175066";
		else if (code.equals("120110"))
			return "117.313967,39.087764";
		else if (code.equals("120111"))
			return "117.012247,39.139446";
		else if (code.equals("120112"))
			return "117.382549,38.989577";
		else if (code.equals("120113"))
			return "117.134820,39.225555";
		else if (code.equals("120114"))
			return "117.057959,39.376925";
		else if (code.equals("120115"))
			return "117.308094,39.716965";
		else if (code.equals("120116"))
			return "117.654173,39.032846";
		else if (code.equals("120221"))
			return "117.828280,39.328886";
		else if (code.equals("120223"))
			return "116.925304,38.935671";
		else if (code.equals("120225"))
			return "117.407449,40.045342";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("120101"))
			return "300041";
		else if (code.equals("120102"))
			return "300171";
		else if (code.equals("120103"))
			return "300202";
		else if (code.equals("120104"))
			return "300110";
		else if (code.equals("120105"))
			return "300143";
		else if (code.equals("120106"))
			return "300131";
		else if (code.equals("120110"))
			return "300300";
		else if (code.equals("120111"))
			return "300380";
		else if (code.equals("120112"))
			return "300350";
		else if (code.equals("120113"))
			return "300400";
		else if (code.equals("120114"))
			return "301700";
		else if (code.equals("120115"))
			return "301800";
		else if (code.equals("120116"))
			return "300450";
		else if (code.equals("120221"))
			return "301500";
		else if (code.equals("120223"))
			return "301600";
		else if (code.equals("120225"))
			return "301900";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("120101"))
			return "022";
		else if (code.equals("120102"))
			return "022";
		else if (code.equals("120103"))
			return "022";
		else if (code.equals("120104"))
			return "022";
		else if (code.equals("120105"))
			return "022";
		else if (code.equals("120106"))
			return "022";
		else if (code.equals("120110"))
			return "022";
		else if (code.equals("120111"))
			return "022";
		else if (code.equals("120112"))
			return "022";
		else if (code.equals("120113"))
			return "022";
		else if (code.equals("120114"))
			return "022";
		else if (code.equals("120115"))
			return "022";
		else if (code.equals("120116"))
			return "022";
		else if (code.equals("120221"))
			return "022";
		else if (code.equals("120223"))
			return "022";
		else if (code.equals("120225"))
			return "022";
		else
			return null;
	}

}
