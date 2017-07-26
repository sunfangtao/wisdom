package com.sft.wisdom.common;
/**
 * Created by Administrator on 2017/7/26.
 */

import java.io.File;

public class Constant {

    // 服务器地址
    public static final String IP_PORT = "http://101.201.29.137:8200/";

    public static final class FilePath {
        // 头像路径
        public static final String HEADPIC_PHOTO_PATH = "headpic" + File.separator;
    }

    public static final class ApkKey {
        // 高德地图Key
        public static final String GAODE_APPKEY = "4hhjVPQEXmLQ8OadILG85bqBGVYMpu4U";
    }

    public static final class BroadcastKey {

    }

    public static final class HTTPKey {

    }

    public static final class HTTPUrl {
        //天气
        public static final String WEATHER = "http://api.map.baidu.com/telematics/v3/weather";
    }

    public static final class ShareKey {
        // 用户名
        public static final String USER_ACCOUND = "userAccount";
        // 密码
        public static final String USER_PASSWORD = "userPassword";
    }


    public static final class IntentKey {

    }

    public static final class RequestCode {
        //用户信息
        public static final int MAIN_USETDATA = 1;
    }
}
