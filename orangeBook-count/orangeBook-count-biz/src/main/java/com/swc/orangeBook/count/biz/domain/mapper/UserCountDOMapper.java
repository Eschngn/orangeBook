package com.swc.orangeBook.count.biz.domain.mapper;

import com.swc.orangeBook.count.biz.domain.dataobject.UserCountDO;
import org.apache.ibatis.annotations.Param;

public interface UserCountDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserCountDO record);

    int insertSelective(UserCountDO record);

    UserCountDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserCountDO record);

    int updateByPrimaryKey(UserCountDO record);

    /**
     * 添加或更新粉丝总数
     * @param count
     * @param userId
     * @return
     */
    int insertOrUpdateFansTotalByUserId(@Param("count") Integer count, @Param("userId") Long userId);

    /**
     * 添加或更新关注总数
     * @param count
     * @param userId
     * @return
     */
    int insertOrUpdateFollowingTotalByUserId(@Param("count") Integer count, @Param("userId") Long userId);

    /**
     * 添加记录或更新笔记点赞数
     * @param count
     * @param userId
     * @return
     */
    int insertOrUpdateLikeTotalByUserId(@Param("count") Integer count, @Param("userId") Long userId);

    /**
     * 添加记录或更新笔记收藏数
     * @param count
     * @param userId
     * @return
     */
    int insertOrUpdateCollectTotalByUserId(@Param("count") Integer count, @Param("userId") Long userId);

    /**
     * 添加记录或更新笔记发布数
     * @param count
     * @param userId
     * @return
     */
    int insertOrUpdateNoteTotalByUserId(@Param("count") Long count, @Param("userId") Long userId);


}