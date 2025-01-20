package com.swc.orangeBook.note.biz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

/**
 * @author Wilson
 * @Description: 笔记点赞：执行 Lua 脚本返回结果
 * @date 2024/10/17 14:36
 */
@Getter
@AllArgsConstructor
public enum NoteLikeLuaResultEnum {
    // 布隆过滤器或者 ZSET 不存在
    NOT_EXIST(-1L),
    // 笔记已点赞
    NOTE_LIKED(1L),
    // 笔记点赞成功
    NOTE_LIKE_SUCCESS(0L),
    ;

    private final Long code;

    /**
     * 根据类型 code 获取对应的枚举
     *
     * @param code
     * @return
     */
    public static NoteLikeLuaResultEnum valueOf(Long code) {
        for (NoteLikeLuaResultEnum noteLikeLuaResultEnum : NoteLikeLuaResultEnum.values()) {
            if (Objects.equals(code, noteLikeLuaResultEnum.getCode())) {
                return noteLikeLuaResultEnum;
            }
        }
        return null;
    }
}

