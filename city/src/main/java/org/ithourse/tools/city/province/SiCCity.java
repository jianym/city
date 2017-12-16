package org.ithourse.tools.city.province;

import org.ithourse.tools.city.ProvinceCity;
/**
 * 
 * @author jianym
 * 四川 各地市
 *
 */
public class SiCCity implements ProvinceCity {

	@Override
	public String[] getNames() {
		return new String[] { "成都", "自贡", "攀枝花", "泸州", "德阳", "绵阳", "广元", "遂宁",
				"内江", "乐山", "南充", "眉山", "宜宾", "广安", "达州", "雅安", "巴中", "资阳",
				"阿坝", "甘孜", "凉山州" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "510100", "510300", "	510400", "510500",
				"510600", "510700", "510800", "510900", "511000", "	511100",
				"511300", "511400", "511500", "511600", "511700", "511800",
				"511900", "512000", "513200", "513300", "513400" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("510100"))
			return "成都";
		else if (code.equals("510300"))
			return "自贡";
		else if (code.equals("510400"))
			return "攀枝花";
		else if (code.equals("510500"))
			return "泸州";
		else if (code.equals("510600"))
			return "德阳";
		else if (code.equals("510700"))
			return "绵阳";
		else if (code.equals("510800"))
			return "广元";
		else if (code.equals("510900"))
			return "遂宁";
		else if (code.equals("511000"))
			return "内江";
		else if (code.equals("511100"))
			return "乐山";
		else if (code.equals("511300"))
			return "南充";
		else if (code.equals("511400"))
			return "眉山";
		else if (code.equals("511500"))
			return "宜宾";
		else if (code.equals("511600"))
			return "广安";
		else if (code.equals("511700"))
			return "达州";
		else if (code.equals("511800"))
			return "雅安";
		else if (code.equals("511900"))
			return "巴中";
		else if (code.equals("512000"))
			return "资阳";
		else if (code.equals("513200"))
			return "阿坝";
		else if (code.equals("513300"))
			return "甘孜";
		else if (code.equals("513400"))
			return "凉山州";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("成都"))
			return "510100";
		else if (name.equals("自贡"))
			return "510300";
		else if (name.equals("攀枝花"))
			return "510400";
		else if (name.equals("泸州"))
			return "510500";
		else if (name.equals("德阳"))
			return "510600";
		else if (name.equals("绵阳"))
			return "510700";
		else if (name.equals("广元"))
			return "510800";
		else if (name.equals("遂宁"))
			return "510900";
		else if (name.equals("内江"))
			return "511000";
		else if (name.equals("乐山"))
			return "511100";
		else if (name.equals("南充"))
			return "511300";
		else if (name.equals("眉山"))
			return "511400";
		else if (name.equals("宜宾"))
			return "511500";
		else if (name.equals("广安"))
			return "511600";
		else if (name.equals("达州"))
			return "511700";
		else if (name.equals("雅安"))
			return "511800";
		else if (name.equals("巴中"))
			return "511900";
		else if (name.equals("资阳"))
			return "512000";
		else if (name.equals("阿坝"))
			return "513200";
		else if (name.equals("甘孜"))
			return "513300";
		else if (name.equals("凉山州"))
			return "513400";
		else
			return null;
	}

	@Override
	public String vinToCode(String vin) {
		if (vin.equals("川A"))
			return "510100";
		else if (vin.equals("川C"))
			return "510300";
		else if (vin.equals("川D"))
			return "510400";
		else if (vin.equals("川E"))
			return "510500";
		else if (vin.equals("川F"))
			return "510600";
		else if (vin.equals("川B"))
			return "510700";
		else if (vin.equals("川H"))
			return "510800";
		else if (vin.equals("川J"))
			return "510900";
		else if (vin.equals("川K"))
			return "511000";
		else if (vin.equals("川L"))
			return "511100";
		else if (vin.equals("川R"))
			return "511300";
		else if (vin.equals("川Z"))
			return "511400";
		else if (vin.equals("川Q"))
			return "511500";
		else if (vin.equals("川X"))
			return "511600";
		else if (vin.equals("川S"))
			return "511700";
		else if (vin.equals("川T"))
			return "511800";
		else if (vin.equals("川Y"))
			return "511900";
		else if (vin.equals("川M"))
			return "512000";
		else if (vin.equals("川U"))
			return "513200";
		else if (vin.equals("川V"))
			return "513300";
		else if (vin.equals("川W"))
			return "513400";
		else
			return null;
	}

	@Override
	public String codeToVin(String code) {
		if (code.equals("510100"))
			return "川A";
		else if (code.equals("510300"))
			return "川C";
		else if (code.equals("510400"))
			return "川D";
		else if (code.equals("510500"))
			return "川E";
		else if (code.equals("510600"))
			return "川F";
		else if (code.equals("510700"))
			return "川B";
		else if (code.equals("510800"))
			return "川H";
		else if (code.equals("510900"))
			return "川J";
		else if (code.equals("511000"))
			return "川K";
		else if (code.equals("511100"))
			return "川L";
		else if (code.equals("511300"))
			return "川R";
		else if (code.equals("511400"))
			return "川Z";
		else if (code.equals("511500"))
			return "川Q";
		else if (code.equals("511600"))
			return "川X";
		else if (code.equals("511700"))
			return "川S";
		else if (code.equals("511800"))
			return "川T";
		else if (code.equals("511900"))
			return "川Y";
		else if (code.equals("512000"))
			return "川M";
		else if (code.equals("513200"))
			return "川U";
		else if (code.equals("513300"))
			return "川V";
		else if (code.equals("513400"))
			return "川W";
		else
			return null;
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("510100"))
			return "104.065735,30.659462";
		else if (code.equals("510300"))
			return "104.773447,29.352765";
		else if (code.equals("510400"))
			return "101.716007,26.580446";
		else if (code.equals("510500"))
			return "105.443348,28.889138";
		else if (code.equals("510600"))
			return "104.398651,31.127991";
		else if (code.equals("510700"))
			return "104.741722,31.464020";
		else if (code.equals("510800"))
			return "105.829757,32.433668";
		else if (code.equals("510900"))
			return "105.571331,30.513311";
		else if (code.equals("511000"))
			return "105.066138,29.587080";
		else if (code.equals("511100"))
			return "103.761263,29.582024";
		else if (code.equals("511300"))
			return "106.082974,30.795281";
		else if (code.equals("511400"))
			return "103.831788,30.048318";
		else if (code.equals("511500"))
			return "104.630825,28.760189";
		else if (code.equals("511600"))
			return "106.633369,30.456398";
		else if (code.equals("511700"))
			return "107.502262,31.209484";
		else if (code.equals("511800"))
			return "103.001033,29.987722";
		else if (code.equals("511900"))
			return "106.753669,31.858809";
		else if (code.equals("512000"))
			return "104.641917,30.122211";
		else if (code.equals("513200"))
			return "102.221374,31.899792";
		else if (code.equals("513300"))
			return "101.963815,30.050663";
		else if (code.equals("513400"))
			return "102.258746,27.886762";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("510100"))
			return "610000";
		else if (code.equals("510300"))
			return "643000";
		else if (code.equals("510400"))
			return "617000";
		else if (code.equals("510500"))
			return "646000";
		else if (code.equals("510600"))
			return "618000";
		else if (code.equals("510700"))
			return "621000";
		else if (code.equals("510800"))
			return "628000";
		else if (code.equals("510900"))
			return "629000";
		else if (code.equals("511000"))
			return "641000";
		else if (code.equals("511100"))
			return "614000";
		else if (code.equals("511300"))
			return "637000";
		else if (code.equals("511400"))
			return "620000";
		else if (code.equals("511500"))
			return "644000";
		else if (code.equals("511600"))
			return "638500";
		else if (code.equals("511700"))
			return "635000";
		else if (code.equals("511800"))
			return "625000";
		else if (code.equals("511900"))
			return "636600";
		else if (code.equals("512000"))
			return "641300";
		else if (code.equals("513200"))
			return "624000";
		else if (code.equals("513300"))
			return "626700";
		else if (code.equals("513400"))
			return "615000";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("510100"))
			return "028";
		else if (code.equals("510300"))
			return "0813";
		else if (code.equals("510400"))
			return "0812";
		else if (code.equals("510500"))
			return "0830";
		else if (code.equals("510600"))
			return "0838";
		else if (code.equals("510700"))
			return "0816";
		else if (code.equals("510800"))
			return "0839";
		else if (code.equals("510900"))
			return "0825";
		else if (code.equals("511000"))
			return "0832";
		else if (code.equals("511100"))
			return "0833";
		else if (code.equals("511300"))
			return "0817";
		else if (code.equals("511400"))
			return "0833";
		else if (code.equals("511500"))
			return "0831";
		else if (code.equals("511600"))
			return "0826";
		else if (code.equals("511700"))
			return "0818";
		else if (code.equals("511800"))
			return "0835";
		else if (code.equals("511900"))
			return "0827";
		else if (code.equals("512000"))
			return "0832";
		else if (code.equals("513200"))
			return "0837";
		else if (code.equals("513300"))
			return "0836";
		else if (code.equals("513400"))
			return "0834";
		else
			return null;
	}

}
