package com;

import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final String url = "https://m.youdao.com/translate";

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("");
        for (String arg : args) {
            sb.append(arg + " ");
        }
        String s = sb.toString();
        System.out.println(getRes(s));
    }

    public static String getRes(String s) {
        Map<String, Object> map = new HashMap<>();
        map.put("inputtext", s);
        map.put("type", "AUTO");
        String resHTML = HttpUtil.post(url, map);
        List<String> resList = ReUtil.findAll("\"translateResult\">\\n.+<li>(.*)</li>", resHTML, 0);
        if (resList.isEmpty()) return "错误V_V";
        String p = resList.get(0).split("<li>")[1];
        String[] s1 = p.split("</li>");
        if (s1.length == 0) return "错误V_V";
        return s1[0];
    }
}
