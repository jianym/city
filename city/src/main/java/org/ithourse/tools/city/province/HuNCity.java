package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;

/**
 * 
 * @author jianym
 * 湖南 各地市
 *
 */
public class HuNCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "长沙", "株洲", "湘潭", "衡阳", "邵阳", "岳阳", "常德", "张家界",
				"益阳", "娄底", "郴州", "永州", "怀化", "湘西土家族苗族自治州"};
	}

	@Override
	public String[] getCodes() {
		return new String[] { "430100", "430200", "430300", "430400", "430500",
				"430600", "430700", "430800", "430900", "431300", "431000",
				"431100", "431200", "433100" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("430100"))
			return "长沙";
		else if (code.equals("430200"))
			return "株洲";
		else if (code.equals("430300"))
			return "湘潭";
		else if (code.equals("430400"))
			return "衡阳";
		else if (code.equals("430500"))
			return "邵阳";
		else if (code.equals("430600"))
			return "岳阳";
		else if (code.equals("430700"))
			return "常德";
		else if (code.equals("430800"))
			return "张家界";
		else if (code.equals("430900"))
			return "益阳";
		else if (code.equals("431300"))
			return "娄底";
		else if (code.equals("431000"))
			return "郴州";
		else if (code.equals("431100"))
			return "永州";
		else if (code.equals("431200"))
			return "怀化";
		else if (code.equals("433100"))
			return "湘西土家族苗族自治州";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("长沙"))
			return "430100";
		else if (name.equals("株洲"))
			return "430200";
		else if (name.equals("湘潭"))
			return "430300";
		else if (name.equals("衡阳"))
			return "430400";
		else if (name.equals("邵阳"))
			return "430500";
		else if (name.equals("岳阳"))
			return "430600";
		else if (name.equals("常德"))
			return "430700";
		else if (name.equals("张家界"))
			return "430800";
		else if (name.equals("益阳"))
			return "430900";
		else if (name.equals("娄底"))
			return "431300";
		else if (name.equals("郴州"))
			return "431000";
		else if (name.equals("永州"))
			return "431100";
		else if (name.equals("怀化"))
			return "431200";
		else if (name.equals("湘西土家族苗族自治州"))
			return "433100";
		else
			return null;
	}

	@Override
	public String vinToCode(String VehicleNo) {
		if ("湘A".equals(VehicleNo))
			return "430100";
		else if ("湘B".equals(VehicleNo))
			return "430200";
		else if ("湘C".equals(VehicleNo))
			return "430300";
		else if ("湘D".equals(VehicleNo))
			return "430400";
		else if ("湘E".equals(VehicleNo))
			return "430500";
		else if ("湘F".equals(VehicleNo))
			return "430600";
		else if ("湘J".equals(VehicleNo))
			return "430700";
		else if ("湘G".equals(VehicleNo))
			return "430800";
		else if ("湘H".equals(VehicleNo))
			return "430900";
		else if ("湘K".equals(VehicleNo))
			return "431300";
		else if ("湘L".equals(VehicleNo))
			return "431000";
		else if ("湘M".equals(VehicleNo))
			return "431100";
		else if ("湘N".equals(VehicleNo))
			return "431200";
		else if ("湘U".equals(VehicleNo))
			return "433100";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if ("430100".equals(code))
			return "湘A";
		else if ("430200".equals(code))
			return "湘B";
		else if ("430300".equals(code))
			return "湘C";
		else if ("430400".equals(code))
			return "湘D";
		else if ("430500".equals(code))
			return "湘E";
		else if ("430600".equals(code))
			return "湘F";
		else if ("430700".equals(code))
			return "湘J";
		else if ("430800".equals(code))
			return "湘G";
		else if ("430900".equals(code))
			return "湘H";
		else if ("431300".equals(code))
			return "湘K";
		else if ("431000".equals(code))
			return "湘L";
		else if ("431100".equals(code))
			return "湘M";
		else if ("431200".equals(code))
			return "湘N";
		else if ("433100".equals(code))
			return "湘U";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("430100"))
			return "112.982279,28.194090";
		else if (code.equals("430200"))
			return "113.151737,27.835806";
		else if (code.equals("430300"))
			return "112.944052,27.829730";
		else if (code.equals("430400"))
			return "112.607693,26.900358";
		else if (code.equals("430500"))
			return "111.469230,27.237842";
		else if (code.equals("430600"))
			return "113.132855,29.370290";
		else if (code.equals("430700"))
			return "111.691347,29.040225";
		else if (code.equals("430800"))
			return "110.479921,29.127401";
		else if (code.equals("430900"))
			return "112.355042,28.570066";
		else if (code.equals("431300"))
			return "112.008497,27.728136";
		else if (code.equals("431000"))
			return "113.032067,25.793589";
		else if (code.equals("431100"))
			return "111.608019,26.434516";
		else if (code.equals("431200"))
			return "109.978240,27.550082";
		else if (code.equals("433100"))
			return "109.739735,28.314296";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if ("430100".equals(code))
			return "410011";
		else if ("430200".equals(code))
			return "412000";
		else if ("430300".equals(code))
			return "411100";
		else if ("430400".equals(code))
			return "421001";
		else if ("430500".equals(code))
			return "422000";
		else if ("430600".equals(code))
			return "414000";
		else if ("430700".equals(code))
			return "415000";
		else if ("430800".equals(code))
			return "427000";
		else if ("430900".equals(code))
			return "413000";
		else if ("431300".equals(code))
			return "417000";
		else if ("431000".equals(code))
			return "423000";
		else if ("431100".equals(code))
			return "425000";
		else if ("431200".equals(code))
			return "418000";
		else if ("433100".equals(code))
			return "416000";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("430100"))
			return "0731";
		else if (code.equals("430200"))
			return "0731";
		else if (code.equals("430300"))
			return "0731";
		else if (code.equals("430400"))
			return "0734";
		else if (code.equals("430500"))
			return "0739";
		else if (code.equals("430600"))
			return "0730";
		else if (code.equals("430700"))
			return "0736";
		else if (code.equals("430800"))
			return "0744";
		else if (code.equals("430900"))
			return "0737";
		else if (code.equals("431300"))
			return "0738";
		else if (code.equals("431000"))
			return "0735";
		else if (code.equals("431100"))
			return "0746";
		else if (code.equals("431200"))
			return "0745";
		else if (code.equals("433100"))
			return "0743";
		else
			return null;
	}
}
