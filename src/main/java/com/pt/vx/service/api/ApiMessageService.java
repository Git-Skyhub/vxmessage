package com.pt.vx.service.api;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.pt.vx.config.KeyConfig;
import com.pt.vx.config.MainConfig;
import com.pt.vx.entity.User;
import com.pt.vx.dto.KeyDTO;
import com.pt.vx.utils.HttpUtil;
import lombok.extern.slf4j.Slf4j;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class ApiMessageService {

    private final SecureRandom random = new SecureRandom();

    public static List<KeyDTO> keyDTOS = new ArrayList<>();

    static {
        keyDTOS.add(KeyConfig.KEY_QING_HUA);
        keyDTOS.add(KeyConfig.KEY_DUAN_ZI);
        keyDTOS.add(KeyConfig.KEY_MI_YU);
    }
    public String getApiMessage(KeyDTO keyDTO, User user){
        String result = null;
        if (KeyConfig.KEY_QING_HUA.equalsKey(keyDTO)){
            result =  getQinghua();
        }else if (KeyConfig.KEY_DUAN_ZI.equalsKey(keyDTO)){
            result = getDuanZi();
        }else if (KeyConfig.KEY_MI_YU.equalsKey(keyDTO)){
            result = getRiddle();
        }
        log.info("随机API接口为：{},获取的结果为：{}",keyDTO.getKey(),result);
        return result;
    }

    /**
     *
     * @return 随机一个API访问
     */
    public KeyDTO getRandomKey(){
        List<KeyDTO> collect = keyDTOS.stream().filter(KeyDTO::isOpen).collect(Collectors.toList());
        if(collect.isEmpty()){
            return null;
        }
        int i = random.nextInt(collect.size());
        return collect.get(i);
    }



    /**
     * 随机情话
     *
     * @return
     */
    private String getQinghua() {
        String url = "https://api.vvhan.com/api/text/love?type=json";
        String s = HttpUtil.get(url);
        JSONObject jsonObject = JSONUtil.parseObj(s);
        JSONObject dataObject = jsonObject.getJSONObject("data");
        String content = dataObject.getStr("content");
        return content;
    }

    /**
     * @return 获取段子-----------------没找到合适的接口
     */
    private String getDuanZi() {
        String url = "https://api.vvhan.com/api/text/love?type=json";
        String result = HttpUtil.get(url);
        JSONObject jsonObject = JSONUtil.parseObj(result);
        JSONObject dataObject = jsonObject.getJSONObject("data");
        String content = dataObject.getStr("content");
        return content;
    }


    /**
     * @return 谜语
     */
    private String getRiddle() {
        String url = "https://v.api.aa1.cn/api/api-miyu/index.php";
        String result = HttpUtil.get(url);
        JSONObject jsonObject = JSONUtil.parseObj(result);
        String questions = jsonObject.getStr("mt");
        String tips = jsonObject.getStr("ts");
        String answer = jsonObject.getStr("md");
        log.info("---获取谜语--- 谜题：{}，提示：{}，谜底：{}", questions, tips, answer);
        return questions + "(提示：" + tips + ")";
    }


}
