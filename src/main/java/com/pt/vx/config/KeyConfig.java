package com.pt.vx.config;

import com.pt.vx.dto.KeyDTO;

/**
 * 所有内置的模板
 * new KeyDTO("模板key", "颜色", 是否开启);
 * 在微信模板里添加 {{模板key.DATA}}
 */
public class KeyConfig {
    /**
     * 昵称，在模板里面就是{{userName.DATA}}
     */
    public static final KeyDTO KEY_USER_NAME = new KeyDTO("u",true);

    /**
     * 日期计算
     */
    public static final KeyDTO KEY_BIRTHDAY = new KeyDTO("bD",true);
    /**
     * 额外提示
     */
    public static final KeyDTO KEY_OTHER_INFO = new KeyDTO("o",true);

    /**
     * 日期
     */
    public static final KeyDTO KEY_DATE = new KeyDTO("da",true);
    /**
     * 星期
     */
    public static final KeyDTO KEY_WEEK = new KeyDTO("wk",true);
    /**
     * 白天天气
     */
    public static final KeyDTO KEY_WEATHER_DAY = new KeyDTO("wd",true);
    /**
     * 白天温度
     */
    public static final KeyDTO KEY_TEMPERATURE_DAY = new KeyDTO("td",true);
    /**
     * 白天风向
     */
    public static final KeyDTO KEY_WIND_DAY = new KeyDTO("wd",true);
    /**
     * 白天风力
     */
    public static final KeyDTO KEY_POWER_DAY = new KeyDTO("pd",true);

    /**
     * 晚上天气
     */
    public static final KeyDTO KEY_WEATHER_NIGHT = new KeyDTO("wi",true);
    /**
     * 晚上温度
     */
    public static final KeyDTO KEY_TEMPERATURE_NIGHT = new KeyDTO("tn",true);

    /**
     * 晚上风向
     */
    public static final KeyDTO KEY_WIND_NIGHT = new KeyDTO("ww",true);

    /**
     * 晚上风力
     */
    public static final KeyDTO KEY_POWER_NIGHT = new KeyDTO("pn",true);
    /**
     * 现在天气
     */
    public static final KeyDTO KEY_WEATHER_NOW = new KeyDTO("wn",true);
    /**
     * 实时天气
     */
    public static final KeyDTO KEY_TEMPERATURE_NOW = new KeyDTO("t",true);
    /**
     * 现在风向
     */
    public static final KeyDTO KEY_WIND_NOW = new KeyDTO("w",true);
    /**
     * 现在风力
     */
    public static final KeyDTO KEY_POWER_NOW = new KeyDTO("p",true);
    /**
     * 现在湿度
     */
    public static final KeyDTO KEY_HUMIDITY_NOW = new KeyDTO("h",true);
    /**
     * 日出时间
     * 只有和风天气才有
     */
    public static final KeyDTO KEY_SUN_RISE = new KeyDTO("sr",true);

    /**
     * 日落时间
     * 只有和风天气才有
     */
    public static final KeyDTO KEY_SUN_SET = new KeyDTO("ss",true);

    /**
     * 随机API消息
     */
    public static final KeyDTO KEY_RANDOM_INFO = new KeyDTO("r",true);
    /**
     * 情话
     */
    public static final KeyDTO KEY_QING_HUA = new KeyDTO("q",true);

    /**
     * 随机段子
     */
    public static final KeyDTO KEY_DUAN_ZI = new KeyDTO("d",true);

    /**
     * 谜语
     */
    public static final KeyDTO KEY_MI_YU= new KeyDTO("m",true);

}
