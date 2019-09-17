package com.imooc.order.utils;

import java.util.Random;

/**
 * @author zxlei
 * @date 2019/8/21 16:36
 * ----------------------------------------------
 * 生成唯一的主键
 * ----------------------------------------------
 */
public class KeyUtil {


    /**
     * 生成唯一主键
     * 格式：时间+随机数
     *
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        int number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }


}
