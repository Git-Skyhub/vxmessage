package com.pt.vx.config;

import com.pt.vx.entity.BirthDay;
import com.pt.vx.entity.User;

import java.util.ArrayList;
import java.util.List;

public class WechatConfig {
    /**
     * 你的微信的APPID
     * appId
     */
    public static final String VxAppId = "wxdf18fd1692bccedc";

    /**
     * 你的微信的密钥
     * appSecret
     */
    public static final String VxAppSecret = "98c307feb0dc6256f5daf114da7ea9bf";

    public static final List<User> userList = new ArrayList<>();

    /**
     * 配置用户信息
     *
     *如果要多个人的话，就复制这个一遍，然后填写里面的内容。这里默认两个人,大伙应该是两个人吧（笑）
     *如果开启了master模式，除第一个用户外，其他用户只需要填写微信号
     * 要计算几个日期，就写几个new BirthDay,第一个在模板中是{{birthDay.DATA}}，第二个是{{birthDay1.DATA}}，第三个是{{birthDay2.DATA}}以此类推
     * new BirthDay()里面的参数分别代表：
     * 1. [年]，日期里面的数字，填正常的数字就行了.比如1就是1，不要填01
     * 2. [月]
     * 3. [日]
     * 4. [是否是农历(true 为农历、false 为公历)]
     * 5. [是否统计天数(true 为统计，false 为倒计时)]
     * 6. [倒计时到0天提示信息(如果类型为统计可以不填)]
     * 注意：每个用户信息的最后一项不需要加逗号！！！
     */
    static {
        userList.add(getUser(
                "oqUyg6GKEG_H8zRgSXvXKJyCJoNU", //扫码关注你的测试号以后，测试平台会出现TA的微信号
                "a_Att5b_YyPuWiqLey8cCT7iFSTeDCf0tHbEOTFWolk", //要给这个人发送的模板ID
                "小萱宝宝", //咋称呼这个人
                "北京市通州区", //这个人的详细地址
                "北京", //这个人在的城市
                new BirthDay(2025,3,13,false,true,"pt生日快乐！！"),
                new BirthDay(2024,4,27,false,true,"周年快乐")
        ));

        userList.add(getUser(
                "oqUyg6OfxdwuBWIARY3aujhylqn8", //扫码关注你的测试号以后，测试平台会出现TA的微信号
                "a_Att5b_YyPuWiqLey8cCT7iFSTeDCf0tHbEOTFWolk", //要给这个人发送的模板ID
                "小萱宝宝", //咋称呼这个人
                "北京市通州区", //这个人的详细地址
                "北京", //这个人在的城市
                new BirthDay(2025,3,13,false,true,"pt生日快乐！！"),
                new BirthDay(2024,4,27,false,true,"周年快乐")
        ));
    }

    private static User getUser(String vx, String templateId, String username, String address, String city, BirthDay... birthDays){
        User user=new User();
        user.setVx(vx);
        user.setUserName(username);
        user.setBirthDays(birthDays);
        user.setAddress(address);
        user.setCity(city);
        user.setTemplateId(templateId);
        return user;
    }


}
