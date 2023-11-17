package com.lyc.apisdk.utils;

import cn.hutool.crypto.digest.MD5;
import cn.hutool.json.JSONUtil;

/**
 * @Description:
 */
public class SignUtils {
    public static String getSign(String body, String secretKey) {
        return MD5.create().digestHex(JSONUtil.toJsonStr(body) + '.' + secretKey);
    }
}
