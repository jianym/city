package org.ithourse.tools.city;

import org.ithourse.tools.city.municipality.BeiJCity;
import org.ithourse.tools.city.municipality.ChongQCity;
import org.ithourse.tools.city.municipality.ShangHCity;
import org.ithourse.tools.city.municipality.TianJCity;
import org.ithourse.tools.city.province.AnHCity;
import org.ithourse.tools.city.province.FuJCity;
import org.ithourse.tools.city.province.GanSCity;
import org.ithourse.tools.city.province.GuangDCity;
import org.ithourse.tools.city.province.GuangXCity;
import org.ithourse.tools.city.province.GuiZCity;
import org.ithourse.tools.city.province.HaiNCity;
import org.ithourse.tools.city.province.HeBCity;
import org.ithourse.tools.city.province.HeNCity;
import org.ithourse.tools.city.province.HeiLongJCity;
import org.ithourse.tools.city.province.HuBCity;
import org.ithourse.tools.city.province.HuNCity;
import org.ithourse.tools.city.province.JiLCity;
import org.ithourse.tools.city.province.JiangSCity;
import org.ithourse.tools.city.province.JiangXCity;
import org.ithourse.tools.city.province.LiaoNCity;
import org.ithourse.tools.city.province.NeiMengGCity;
import org.ithourse.tools.city.province.NingXCity;
import org.ithourse.tools.city.province.QingHCity;
import org.ithourse.tools.city.province.ShaanXCity;
import org.ithourse.tools.city.province.ShanDCity;
import org.ithourse.tools.city.province.ShanXCity;
import org.ithourse.tools.city.province.SiCCity;
import org.ithourse.tools.city.province.XiZCity;
import org.ithourse.tools.city.province.XinJCity;
import org.ithourse.tools.city.province.YunNCity;
import org.ithourse.tools.city.province.ZheJCity;
import org.ithourse.tools.city.special.HongKCity;
import org.ithourse.tools.city.special.MacaoCity;

/**
 * 
 * @author jianym
 * 城市工具类,客户端调用
 *
 */
public class CityUtil {

	private static ChinaCity chinaCity = null;

	private synchronized static ChinaCity initChinaCity() {
		if (chinaCity == null)
			chinaCity = new ChinaCity();
		return chinaCity;
	}

	public static ChinaCity build() {
		return initChinaCity();
	}

	public static class Province {

		private static AnHCity anHCity = null;

		private static FuJCity fuJCity = null;

		private static GanSCity ganSCity = null;

		private static GuangDCity guangDCity = null;

		private static GuangXCity guangXCity = null;

		private static GuiZCity guiZCity = null;

		private static HaiNCity haiNCity = null;

		private static HeBCity heBCity = null;

		private static HeiLongJCity heiLongJCity = null;

		private static HeNCity heNCity = null;

		private static HuBCity huBCity = null;

		private static HuNCity huNCity = null;

		private static JiangSCity jiangSCity = null;

		private static JiangXCity jiangXCity = null;

		private static JiLCity jiLCity = null;

		private static LiaoNCity liaoNCity = null;

		private static NeiMengGCity neiMengGCity = null;

		private static NingXCity ningXCity = null;

		private static QingHCity qingHCity = null;

		private static ShaanXCity shaanXCity = null;

		private static ShanDCity shanDCity = null;

		private static ShanXCity shanXCity = null;

		private static SiCCity siCCity = null;

		private static XinJCity xinJCity = null;

		private static XiZCity xiZCity = null;

		private static YunNCity yunNCity = null;

		private static ZheJCity zheJCity = null;

		private synchronized static AnHCity initAnHCity() {
			if (anHCity == null)
				anHCity = new AnHCity();
			return anHCity;
		}

		private synchronized static FuJCity initFuJCity() {
			if (fuJCity == null)
				fuJCity = new FuJCity();
			return fuJCity;
		}

		private synchronized static GanSCity initGanSCity() {
			if (ganSCity == null)
				ganSCity = new GanSCity();
			return ganSCity;
		}

		private synchronized static GuangDCity initGuangDCity() {
			if (guangDCity == null)
				guangDCity = new GuangDCity();
			return guangDCity;
		}

		private synchronized static GuangXCity initGuangXCity() {
			if (guangXCity == null)
				guangXCity = new GuangXCity();
			return guangXCity;
		}

		private synchronized static GuiZCity initGuiZCity() {
			if (guiZCity == null)
				guiZCity = new GuiZCity();
			return guiZCity;
		}

		private synchronized static HaiNCity initHaiNCity() {
			if (haiNCity == null)
				haiNCity = new HaiNCity();
			return haiNCity;
		}

		private synchronized static HeBCity initHeBCity() {
			if (heBCity == null)
				heBCity = new HeBCity();
			return heBCity;
		}

		private synchronized static HeiLongJCity initHeiLongJCity() {
			if (heiLongJCity == null)
				heiLongJCity = new HeiLongJCity();
			return heiLongJCity;
		}

		private synchronized static HeNCity initHeNCity() {
			if (heNCity == null)
				heNCity = new HeNCity();
			return heNCity;
		}

		private synchronized static HuBCity initHuBCity() {
			if (huBCity == null)
				huBCity = new HuBCity();
			return huBCity;
		}

		private synchronized static HuNCity initHuNCity() {
			if (huNCity == null)
				huNCity = new HuNCity();
			return huNCity;
		}

		private synchronized static JiangSCity initJiangSCity() {
			if (jiangSCity == null)
				jiangSCity = new JiangSCity();
			return jiangSCity;
		}

		private synchronized static JiangXCity initJiangXCity() {
			if (jiangXCity == null)
				jiangXCity = new JiangXCity();
			return jiangXCity;
		}

		private synchronized static JiLCity initJiLCity() {
			if (jiLCity == null)
				jiLCity = new JiLCity();
			return jiLCity;
		}

		private synchronized static LiaoNCity initLiaoNCity() {
			if (liaoNCity == null)
				liaoNCity = new LiaoNCity();
			return liaoNCity;
		}

		private synchronized static NeiMengGCity initNeiMengGCity() {
			if (neiMengGCity == null)
				neiMengGCity = new NeiMengGCity();
			return neiMengGCity;
		}

		private synchronized static NingXCity initNingXCity() {
			if (ningXCity == null)
				ningXCity = new NingXCity();
			return ningXCity;
		}

		private synchronized static QingHCity initQingHCity() {
			if (qingHCity == null)
				qingHCity = new QingHCity();
			return qingHCity;
		}

		private synchronized static ShaanXCity initShaanXCity() {
			if (shaanXCity == null)
				shaanXCity = new ShaanXCity();
			return shaanXCity;
		}

		private synchronized static ShanDCity initShanDCity() {
			if (shanDCity == null)
				shanDCity = new ShanDCity();
			return shanDCity;
		}

		private synchronized static ShanXCity initShanXCity() {
			if (shanXCity == null)
				shanXCity = new ShanXCity();
			return shanXCity;
		}

		private synchronized static SiCCity initSiCCity() {
			if (siCCity == null)
				siCCity = new SiCCity();
			return siCCity;
		}

		private synchronized static XinJCity initXinJCity() {
			if (xinJCity == null)
				xinJCity = new XinJCity();
			return xinJCity;
		}

		private synchronized static XiZCity initXiZCity() {
			if (xiZCity == null)
				xiZCity = new XiZCity();
			return xiZCity;
		}

		private synchronized static YunNCity initYunNCity() {
			if (yunNCity == null)
				yunNCity = new YunNCity();
			return yunNCity;
		}

		private synchronized static ZheJCity initZheJCity() {
			if (zheJCity == null)
				zheJCity = new ZheJCity();
			return zheJCity;
		}

		public static ProvinceCity build(String name) {
			switch (name.toLowerCase()) {
			case "anhui":
				return initAnHCity();
			case "fujian":
				return initFuJCity();
			case "gansu":
				return initGanSCity();
			case "guangdong":
				return initGuangDCity();
			case "guangxi":
				return initGuangXCity();
			case "guizhou":
				return initGuiZCity();
			case "hainan":
				return initHaiNCity();
			case "hebei":
				return initHeBCity();
			case "heilongjiang":
				return initHeiLongJCity();
			case "henan":
				return initHeNCity();
			case "hubei":
				return initHuBCity();
			case "hunan":
				return initHuNCity();
			case "jiangsu":
				return initJiangSCity();
			case "jiangxi":
				return initJiangXCity();
			case "jilin":
				return initJiLCity();
			case "liaoning":
				return initLiaoNCity();
			case "innermongolia":
				return initNeiMengGCity();
			case "ningxia":
				return initNingXCity();
			case "qinghai":
				return initQingHCity();
			case "shaanxi":
				return initShaanXCity();
			case "shandong":
				return initShanDCity();
			case "shanxi":
				return initShanXCity();
			case "sichuan":
				return initSiCCity();
			case "xinjiang":
				return initXinJCity();
			case "xizhang":
				return initXiZCity();
			case "yunnan":
				return initYunNCity();
			case "zhejiang":
				return initZheJCity();
			}

			return null;
		};

	}

	public static class Municipality {

		private static BeiJCity beiJCity = null;

		private static ChongQCity chongQCity = null;

		private static ShangHCity shangHCity = null;

		private static TianJCity tainJCity = null;

		private synchronized static BeiJCity initBeiJCity() {
			if (beiJCity == null)
				beiJCity = new BeiJCity();
			return beiJCity;
		}

		private synchronized static ChongQCity initChongQCity() {
			if (chongQCity == null)
				chongQCity = new ChongQCity();
			return chongQCity;
		}

		private synchronized static ShangHCity initShangHCity() {
			if (shangHCity == null)
				shangHCity = new ShangHCity();
			return shangHCity;
		}

		private synchronized static TianJCity initTainJCity() {
			if (tainJCity == null)
				tainJCity = new TianJCity();
			return tainJCity;
		}

		public static MunicipalityCity build(String name) {
			switch (name.toLowerCase()) {
			case "beijing":
				return initBeiJCity();
			case "chongqing":
				return initChongQCity();
			case "shanghai":
				return initShangHCity();
			case "tianjin":
				return initTainJCity();
			}

			return null;
		}
	};

	public static class Special {

		private static HongKCity hongKCity = null;

		private static MacaoCity macaoCity = null;

		private synchronized static HongKCity initHongKCity() {
			if (hongKCity == null)
				hongKCity = new HongKCity();
			return hongKCity;
		}

		private synchronized static MacaoCity initMacaoCity() {
			if (macaoCity == null)
				macaoCity = new MacaoCity();
			return macaoCity;
		}

		public static SpecialCity build(String name) {
			switch (name.toLowerCase()) {
			case "hongkong":
				return initHongKCity();
			case "macao":
				return initMacaoCity();
			}
			return null;
		}
	};
}
