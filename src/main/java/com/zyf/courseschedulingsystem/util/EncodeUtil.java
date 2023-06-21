package com.zyf.courseschedulingsystem.util;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import com.zyf.courseschedulingsystem.constant.EncodeConstant;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

public class EncodeUtil {
    private static String bytesToHex(byte[] bytes) {
        StringBuilder md5str = new StringBuilder();
        // 把数组每一字节换成16进制连成md5字符串
        int digital;
        for (byte aByte : bytes) {
            digital = aByte;

            if (digital < 0) {
                digital += 256;
            }
            if (digital < 16) {
                md5str.append("0");
            }
            md5str.append(Integer.toHexString(digital));
        }
        return md5str.toString().toUpperCase();
    }
    public static String md5(String text) {
        String message = text + EncodeConstant.MD5_SALT;
        String md5str = "";
        try {
            // 1 创建一个提供信息摘要算法的对象，初始化为md5算法对象
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 2 将消息变成byte数组
            byte[] input = message.getBytes();
            // 3 计算后获得字节数组,这就是那128位了
            byte[] buff = md.digest(input);
            // 4 把数组每一字节（一个字节占八位）换成16进制连成md5字符串
            md5str = bytesToHex(buff);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return md5str;
    }

    public static String base64(String str) {
        if (str == null || "".equals(str)) {
            return "";
        }
        try {
            byte[] bt = str.getBytes("UTF-8");
            str = Base64.encode(bt);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str;
    }
}
