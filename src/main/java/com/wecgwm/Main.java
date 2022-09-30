package com.wecgwm;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ：wecgwm
 * @date ：2022/09/30 22:15
 */
public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.merge("a", 0, (oldValue, __) -> ++oldValue);
        new ArrayList<>().add(123);
    }

}
