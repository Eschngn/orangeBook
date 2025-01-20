package com.swc.orangeBook.user.biz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

/**
 * @author Wilson
 * @Description: TODO
 * @date 2024/9/16 15:39
 */
@Getter
@AllArgsConstructor
public enum SexEnum {
    WOMAN(0),
    MAN(1);
    private final Integer value;

    public static boolean isValid(Integer value){
        for(SexEnum loginTypeEnum: SexEnum.values()){
            if(Objects.equals(value,loginTypeEnum.getValue())){
                return true;
            }
        }
        return false;
    }
}
