package com.swc.orangeBook.search.biz.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Wilson
 * @Description: 搜索用户
 * @date 2025/1/18 13:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchUserRspVO {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 小橙书ID
     */
    private String xiaochengshuId;

    /**
     * 笔记发布总数
     */
    private Integer noteTotal;

    /**
     * 粉丝总数
     */
    private String fansTotal;

    /**
     * 昵称:关键词高亮
     */
    private String highlightNickname;

}

