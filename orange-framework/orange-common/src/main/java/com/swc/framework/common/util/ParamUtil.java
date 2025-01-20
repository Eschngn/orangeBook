package com.swc.framework.common.util;

import java.util.regex.Pattern;

/**
 * @author Wilson
 * @Description: 参数条件工具
 * @date 2024/9/16 15:42
 */
public final class ParamUtil {
    private ParamUtil(){
    }// ============================== 校验昵称 ==============================
    // 定义昵称长度范围
    private static final int NICK_NAME_MIN_LENGTH = 2;
    private static final int NICK_NAME_MAX_LENGTH = 24;

    // 定义特殊字符的正则表达式
    private static final String NICK_NAME_REGEX = "[!@#$%^&*(),.?\":{}|<>]";

    /**
     * 昵称校验
     * @param nickname
     * @return
     */
    public static boolean checkNickname(String nickname){
        // 检查长度
        if(nickname.length()<NICK_NAME_MIN_LENGTH||nickname.length()>NICK_NAME_MAX_LENGTH){
            return false;
        }
        Pattern pattern = Pattern.compile(NICK_NAME_REGEX);
        return !pattern.matcher(nickname).find();
    }

    // ============================== 校验小橙书号 ==============================
    // 定义 ID 长度范围
    private static final int ID_MIN_LENGTH = 6;
    private static final int ID_MAX_LENGTH = 15;

    // 定义正则表达式
    private static final String ID_REGEX = "^[a-zA-Z0-9_]+$";
    /**
     * 小橙书 ID 校验
     *
     * @param xiaochengshuId
     * @return
     */
    public static boolean checkXiaochengshuId(String xiaochengshuId) {
        // 检查长度
        if (xiaochengshuId.length() < ID_MIN_LENGTH || xiaochengshuId.length() > ID_MAX_LENGTH) {
            return false;
        }
        // 检查格式
        Pattern pattern = Pattern.compile(ID_REGEX);
        return pattern.matcher(xiaochengshuId).matches();
    }

    /**
     * 字符串长度校验
     *
     * @param str
     * @param length
     * @return
     */
    public static boolean checkLength(String str, int length) {
        // 检查长度
        if (str.isEmpty() || str.length() > length) {
            return false;
        }
        return true;
    }
}
