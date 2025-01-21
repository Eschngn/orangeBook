package com.swc.orangBook.search.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

/**
 * @author Wilson
 * @Description: 笔记发布时间范围
 * @date 2025/1/21 22:04
 */
@Getter
@AllArgsConstructor
public enum NotePublishTimeRangeEnum {

    // 一天内
    DAY(0),
    // 一周内
    WEEK(1),
    // 半年内
    HALF_YEAR(2),
    ;

    private final Integer code;

    /**
     * 根据类型 code 获取对应的枚举
     *
     * @param code
     * @return
     */
    public static NotePublishTimeRangeEnum valueOf(Integer code) {
        for (NotePublishTimeRangeEnum notePublishTimeRangeEnum : NotePublishTimeRangeEnum.values()) {
            if (Objects.equals(code, notePublishTimeRangeEnum.getCode())) {
                return notePublishTimeRangeEnum;
            }
        }
        return null;
    }

}

