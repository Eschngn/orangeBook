package com.swc.orangeBook.search.biz.service;

import com.swc.framework.common.response.PageResponse;
import com.swc.framework.common.response.Response;
import com.swc.orangeBook.search.biz.model.vo.SearchNoteReqVO;
import com.swc.orangeBook.search.biz.model.vo.SearchNoteRspVO;
import com.swc.orangeBook.search.dto.RebuildNoteDocumentReqDTO;


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

    /**
     * 重建笔记文档
     * @param rebuildNoteDocumentReqDTO
     * @return
     */
    Response<Long> rebuildDocument(RebuildNoteDocumentReqDTO rebuildNoteDocumentReqDTO);
}
