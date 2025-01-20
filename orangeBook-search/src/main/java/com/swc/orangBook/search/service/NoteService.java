package com.swc.orangBook.search.service;

import com.swc.framework.common.response.PageResponse;
import com.swc.orangBook.search.model.vo.SearchNoteReqVO;
import com.swc.orangBook.search.model.vo.SearchNoteRspVO;

/**
 * @author Wilson
 * @Description: 笔记搜索业务
 * @date 2025/1/19 11:41
 */
public interface NoteService {
    /**
     * 搜索笔记
     * @param searchNoteReqVO
     * @return
     */
    PageResponse<SearchNoteRspVO> searchNote(SearchNoteReqVO searchNoteReqVO);
}
