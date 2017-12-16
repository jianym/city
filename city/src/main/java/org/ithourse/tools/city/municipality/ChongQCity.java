package org.ithourse.tools.city.municipality;

import org.ithourse.tools.city.MunicipalityCity;

/**
 * 
 * @author jianym
 * 重庆 直辖市
 *
 */
public class ChongQCity implements MunicipalityCity {

	@Override
	public String[] getNames() {
		return new String[] { "万州区", "涪陵区", "渝中区", "大渡口区", "江北区", "沙坪坝区",
				"九龙坡区", "南岸区", "北碚区", "綦江区", "大足区", "渝北区", "巴南区", "黔江区", "长寿区",
				"江津区", "合川区", "永川区", "南川区", "铜梁区", "璧山区", "潼南区", "荣昌区", "开县",
				"梁平县", "武隆县 ", "城口县", "丰都县", "垫江县", "忠县", "云阳县", "奉节县", "巫山县",
				"巫溪县", "石柱土家族自治县", "秀山土家族苗族自治县", "酉阳土家族苗族自治县", "彭水苗族土家族自治县" };
	}

	@Override
	public String[] getCodes() {
		return new String[] { "500101", "500102", "500103", "500104", "500105",
				"500106", "500107", "500108", "500109", "500110", "500111",
				"500112", "500113", "500114", "500115", "500116", "500117",
				"500118", "500119", "500120", "500121", "500152", "500153",
				"500154", "500155", "500156", "500229", "500230", "500231",
				"500233", "500235", "500236", "500237", "500238", "500240",
				"500241", "500242", "500243" };
	}

	@Override
	public String codeToName(String code) {
		if (code.equals("500101"))
			return "万州区";
		else if (code.equals("500102"))
			return "涪陵区";
		else if (code.equals("500103"))
			return "渝中区";
		else if (code.equals("500104"))
			return "大渡口区";
		else if (code.equals("500105"))
			return "江北区";
		else if (code.equals("500106"))
			return "沙坪坝区";
		else if (code.equals("500107"))
			return "九龙坡区";
		else if (code.equals("500108"))
			return "南岸区";
		else if (code.equals("500109"))
			return "北碚区";
		else if (code.equals("500110"))
			return "綦江区";
		else if (code.equals("500111"))
			return "大足区";
		else if (code.equals("500112"))
			return "渝北区";
		else if (code.equals("500113"))
			return "巴南区";
		else if (code.equals("500114"))
			return "黔江区";
		else if (code.equals("500115"))
			return "长寿区";
		else if (code.equals("500116"))
			return "江津区";
		else if (code.equals("500117"))
			return "合川区";
		else if (code.equals("500118"))
			return "永川区";
		else if (code.equals("500119"))
			return "南川区";
		else if (code.equals("500120"))
			return "铜梁区";
		else if (code.equals("500121"))
			return "璧山区";
		else if (code.equals("500152"))
			return "潼南区";
		else if (code.equals("500153"))
			return "荣昌区";
		else if (code.equals("500154"))
			return "开县";
		else if (code.equals("500155"))
			return "梁平县";
		else if (code.equals("500156"))
			return "武隆县 ";
		else if (code.equals("500229"))
			return "城口县";
		else if (code.equals("500230"))
			return "丰都县";
		else if (code.equals("500231"))
			return "垫江县";
		else if (code.equals("500233"))
			return "忠县";
		else if (code.equals("500235"))
			return "云阳县";
		else if (code.equals("500236"))
			return "奉节县";
		else if (code.equals("500237"))
			return "巫山县";
		else if (code.equals("500238"))
			return "巫溪县";
		else if (code.equals("500240"))
			return "石柱土家族自治县";
		else if (code.equals("500243"))
			return "秀山土家族苗族自治县";
		else if (code.equals("500241"))
			return "酉阳土家族苗族自治县";
		else if (code.equals("500242"))
			return "彭水苗族土家族自治县";
		else
			return null;
	}

	@Override
	public String nameToCode(String name) {
		if (name.equals("万州区"))
			return "500101";
		else if (name.equals("涪陵区"))
			return "500102";
		else if (name.equals("渝中区"))
			return "500103";
		else if (name.equals("大渡口区"))
			return "500104";
		else if (name.equals("江北区"))
			return "500105";
		else if (name.equals("沙坪坝区"))
			return "500106";
		else if (name.equals("九龙坡区"))
			return "500107";
		else if (name.equals("南岸区"))
			return "500108";
		else if (name.equals("北碚区"))
			return "500109";
		else if (name.equals("綦江区"))
			return "500110";
		else if (name.equals("大足区"))
			return "500111";
		else if (name.equals("渝北区"))
			return "500112";
		else if (name.equals("巴南区"))
			return "500113";
		else if (name.equals("黔江区"))
			return "500114";
		else if (name.equals("长寿区"))
			return "500115";
		else if (name.equals("江津区"))
			return "500116";
		else if (name.equals("合川区"))
			return "500117";
		else if (name.equals("永川区"))
			return "500118";
		else if (name.equals("南川区"))
			return "500119";
		else if (name.equals("铜梁区"))
			return "500120";
		else if (name.equals("璧山区"))
			return "500121";
		else if (name.equals("潼南区"))
			return "500152";
		else if (name.equals("荣昌区"))
			return "500153";
		else if (name.equals("开县"))
			return "500154";
		else if (name.equals("梁平县"))
			return "500155";
		else if (name.equals("武隆县 "))
			return "500156";
		else if (name.equals("城口县"))
			return "500229";
		else if (name.equals("丰都县"))
			return "500230";
		else if (name.equals("垫江县"))
			return "500231";
		else if (name.equals("忠县"))
			return "500233";
		else if (name.equals("云阳县"))
			return "500235";
		else if (name.equals("奉节县"))
			return "500236";
		else if (name.equals("巫山县"))
			return "500237";
		else if (name.equals("巫溪县"))
			return "500238";
		else if (name.equals("石柱土家族自治县"))
			return "500240";
		else if (name.equals("秀山土家族苗族自治县"))
			return "500243";
		else if (name.equals("酉阳土家族苗族自治县"))
			return "500241";
		else if (name.equals("彭水苗族土家族自治县"))
			return "500242";
		else
			return null;
	}

	@Override
	public String[] getVheicleNo() {
		return new String[] { "渝A", "渝B", "渝C", "渝D", "渝F", "渝G", "渝H" };
	}

	@Override
	public String codeToPostion(String code) {
		if (code.equals("500101"))
			return "108.380246,30.807807";
		else if (code.equals("500102"))
			return "107.394905,29.703652";
		else if (code.equals("500103"))
			return "106.56288,29.556742";
		else if (code.equals("500104"))
			return "106.48613,29.481002";
		else if (code.equals("500105"))
			return "106.532844,29.575352";
		else if (code.equals("500106"))
			return "106.454200,29.541224";
		else if (code.equals("500107"))
			return "106.480989,29.523492";
		else if (code.equals("500108"))
			return "106.560813,29.523992";
		else if (code.equals("500109"))
			return "106.437868,29.825430";
		else if (code.equals("500110"))
			return "106.651417,29.028091";
		else if (code.equals("500111"))
			return "105.715319,29.700498";
		else if (code.equals("500112"))
			return "106.512851,29.601451";
		else if (code.equals("500113"))
			return "106.519423,29.381919";
		else if (code.equals("500114"))
			return "108.782577,29.527548";
		else if (code.equals("500115"))
			return "107.074854,29.833671";
		else if (code.equals("500116"))
			return "106.253156,29.283387";
		else if (code.equals("500117"))
			return "106.265554,29.990993";
		else if (code.equals("500118"))
			return "105.894714,29.348748";
		else if (code.equals("500119"))
			return "107.098153,29.156646";
		else if (code.equals("500120"))
			return "106.054948,29.839944";
		else if (code.equals("500121"))
			return "106.231126,29.593581";
		else if (code.equals("500152"))
			return "105.841818,30.189554";
		else if (code.equals("500153"))
			return "105.594061,29.403627";
		else if (code.equals("500154"))
			return "108.413317,31.167735";
		else if (code.equals("500155"))
			return "107.800034,30.672168";
		else if (code.equals("500156"))
			return "107.756550,29.323760";
		else if (code.equals("500229"))
			return "108.664900,31.946293";
		else if (code.equals("500230"))
			return "107.732480,29.866424";
		else if (code.equals("500231"))
			return "107.348692,30.330012";
		else if (code.equals("500233"))
			return "108.037518,30.291537";
		else if (code.equals("500235"))
			return "108.697698,30.930529";
		else if (code.equals("500236"))
			return "109.465774,31.019967";
		else if (code.equals("500237"))
			return "109.878928,31.074843";
		else if (code.equals("500238"))
			return "109.628912,31.396600";
		else if (code.equals("500240"))
			return "108.112448,29.998530";
		else if (code.equals("500243"))
			return "108.996043,28.444772";
		else if (code.equals("500241"))
			return "108.767201,28.839828";
		else if (code.equals("500242"))
			return "108.166551,29.293856";
		else
			return null;
	}

	@Override
	public String codeToPost(String code) {
		if (code.equals("500101"))
			return "404100";
		else if (code.equals("500102"))
			return "408000";
		else if (code.equals("500103"))
			return "400010";
		else if (code.equals("500104"))
			return "400000";
		else if (code.equals("500105"))
			return "400000";
		else if (code.equals("500106"))
			return "400000";
		else if (code.equals("500107"))
			return "400000";
		else if (code.equals("500108"))
			return "400000";
		else if (code.equals("500109"))
			return "400700";
		else if (code.equals("500110"))
			return "401420";
		else if (code.equals("500111"))
			return "402360";
		else if (code.equals("500112"))
			return "401120";
		else if (code.equals("500113"))
			return "401320";
		else if (code.equals("500114"))
			return "409000";
		else if (code.equals("500115"))
			return "401220";
		else if (code.equals("500116"))
			return "402260";
		else if (code.equals("500117"))
			return "401520";
		else if (code.equals("500118"))
			return "402160";
		else if (code.equals("500119"))
			return "408400";
		else if (code.equals("500120"))
			return "402560";
		else if (code.equals("500121"))
			return "402760";
		else if (code.equals("500152"))
			return "402660";
		else if (code.equals("500153"))
			return "402460";
		else if (code.equals("500154"))
			return "405400";
		else if (code.equals("500155"))
			return "405200";
		else if (code.equals("500156"))
			return "408500";
		else if (code.equals("500229"))
			return "405900";
		else if (code.equals("500230"))
			return "408200";
		else if (code.equals("500231"))
			return "408300";
		else if (code.equals("500233"))
			return "404300";
		else if (code.equals("500235"))
			return "404500";
		else if (code.equals("500236"))
			return "404600";
		else if (code.equals("500237"))
			return "404700";
		else if (code.equals("500238"))
			return "405800";
		else if (code.equals("500240"))
			return "409100";
		else if (code.equals("500243"))
			return "409900 ";
		else if (code.equals("500241"))
			return "648800";
		else if (code.equals("500242"))
			return "409600";
		else
			return null;
	}

	@Override
	public String codeToPhone(String code) {
		if (code.equals("500101"))
			return "023";
		else if (code.equals("500102"))
			return "023";
		else if (code.equals("500103"))
			return "023";
		else if (code.equals("500104"))
			return "023";
		else if (code.equals("500105"))
			return "023";
		else if (code.equals("500106"))
			return "023";
		else if (code.equals("500107"))
			return "023";
		else if (code.equals("500108"))
			return "023";
		else if (code.equals("500109"))
			return "023";
		else if (code.equals("500110"))
			return "023";
		else if (code.equals("500111"))
			return "023";
		else if (code.equals("500112"))
			return "023";
		else if (code.equals("500113"))
			return "023";
		else if (code.equals("500114"))
			return "023";
		else if (code.equals("500115"))
			return "023";
		else if (code.equals("500116"))
			return "023";
		else if (code.equals("500117"))
			return "023";
		else if (code.equals("500118"))
			return "023";
		else if (code.equals("500119"))
			return "023";
		else if (code.equals("500120"))
			return "023";
		else if (code.equals("500121"))
			return "023";
		else if (code.equals("500152"))
			return "023";
		else if (code.equals("500153"))
			return "023";
		else if (code.equals("500154"))
			return "023";
		else if (code.equals("500155"))
			return "023";
		else if (code.equals("500156"))
			return "023";
		else if (code.equals("500229"))
			return "023";
		else if (code.equals("500230"))
			return "023";
		else if (code.equals("500231"))
			return "023";
		else if (code.equals("500233"))
			return "023";
		else if (code.equals("500235"))
			return "023";
		else if (code.equals("500236"))
			return "023";
		else if (code.equals("500237"))
			return "023";
		else if (code.equals("500238"))
			return "023";
		else if (code.equals("500240"))
			return "023";
		else if (code.equals("500243"))
			return "023";
		else if (code.equals("500241"))
			return "023";
		else if (code.equals("500242"))
			return "023";
		else
			return null;
	}

}
