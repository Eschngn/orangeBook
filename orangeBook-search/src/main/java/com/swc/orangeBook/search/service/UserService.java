package com.swc.orangeBook.search.service;

import com.swc.framework.common.response.PageResponse;
import com.swc.orangeBook.search.model.vo.SearchUserReqVO;
import com.swc.orangeBook.search.model.vo.SearchUserRspVO;

/**
 * @author Wilson
 * @Description: 用户搜索业务
 * @date 2025/1/18 13:25
 */
public interface UserService {
    /**
     * 搜索用户
     * @param searchUserReqVO
     * @return
     */
    PageResponse<SearchUserRspVO> searchUser(SearchUserReqVO searchUserReqVO);
}
