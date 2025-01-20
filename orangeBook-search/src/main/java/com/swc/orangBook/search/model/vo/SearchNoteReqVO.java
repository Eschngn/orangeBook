package com.swc.orangBook.search.model.vo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Wilson
 * @Description: 搜索笔记
 * @date 2025/1/18 23:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchNoteReqVO {

    @NotBlank(message = "搜索关键词不能为空")
    private String keyword;

    @Min(value = 1, message = "页码不能小于 1")
    private Integer pageNo = 1; // 默认值为第一页

    /**
     * 笔记类型：null：综合 / 0：图文 / 1：视频
     */
    private Integer type;

    /**
     * 排序：null：不限 / 0：最新 / 1：最多点赞 / 2：最多评论 / 3：最多收藏
     */
    private Integer sort;


}
