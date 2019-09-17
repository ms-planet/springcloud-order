package com.imooc.order;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zxlei
 * @date 2019/9/2 14:44
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
public class ListTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(1);
        System.out.println(list);
        System.out.println(list.isEmpty());

        list = null;
        System.out.println(list);

        System.out.println(CollectionUtils.isEmpty(list));

        Map<String, String> map = new HashMap<>();
        System.out.println(map);
        System.out.println(CollectionUtils.isEmpty(map));


        map = null;
        System.out.println(map);
        System.out.println(CollectionUtils.isEmpty(map));


    }
}
