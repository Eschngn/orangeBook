package com.swc.orangeBook.note.biz.model.vo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Wilson
 * @Description: 取消收藏笔记
 * @date 2024/11/13 0:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnCollectNoteReqVO {

    @NotNull(message = "笔记 ID 不能为空")
    private Long id;

}