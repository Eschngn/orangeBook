package com.swc.orangeBook.search.biz.service;

import com.swc.framework.common.response.PageResponse;
import com.swc.framework.common.response.Response;
import com.swc.orangeBook.search.biz.model.vo.SearchUserReqVO;
import com.swc.orangeBook.search.biz.model.vo.SearchUserRspVO;
import com.swc.orangeBook.search.dto.RebuildUserDocumentReqDTO;

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

    /**
     * 重建用户文档
     * @param rebuildUserDocumentReqDTO
     * @return
     */
    Response<Long> rebuildDocument(RebuildUserDocumentReqDTO rebuildUserDocumentReqDTO);
}
