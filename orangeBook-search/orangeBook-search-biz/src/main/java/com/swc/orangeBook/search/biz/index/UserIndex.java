package com.swc.orangeBook.search.biz.index;

/**
 * @author Wilson
 * @Description: 用户索引
 * @date 2025/1/18 13:28
 */
public class UserIndex {
    /**
     * 索引名称
     */
    public static final String NAME = "user";

    /**
     * 用户ID
     */
    public static final String FIELD_USER_ID = "id";

    /**
     * 昵称
     */
    public static final String FIELD_USER_NICKNAME = "nickname";

    /**
     * 头像
     */
    public static final String FIELD_USER_AVATAR = "avatar";

    /**
     * 小橙书ID
     */
    public static final String FIELD_USER_XIAOCHENGSHU_ID = "xiaochengshu_id";

    /**
     * 发布笔记总数
     */
    public static final String FIELD_USER_NOTE_TOTAL = "note_total";

    /**
     * 粉丝总数
     */
    public static final String FIELD_USER_FANS_TOTAL = "fans_total";
}
