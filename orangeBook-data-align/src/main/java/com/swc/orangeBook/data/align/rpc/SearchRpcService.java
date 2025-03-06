package com.swc.orangeBook.data.align.rpc;

import com.swc.orangeBook.search.api.SearchFeignApi;
import com.swc.orangeBook.search.dto.RebuildNoteDocumentReqDTO;
import com.swc.orangeBook.search.dto.RebuildUserDocumentReqDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * @author Wilson
 * @Description: 搜索服务
 * @date 2025-03-06
 */
@Component
public class SearchRpcService {

    @Resource
    private SearchFeignApi searchFeignApi;

    /**
     * 调用重建笔记文档接口
     * @param noteId
     */
    public void rebuildNoteDocument(Long noteId) {
        RebuildNoteDocumentReqDTO rebuildNoteDocumentReqDTO = RebuildNoteDocumentReqDTO.builder()
                .id(noteId)
                .build();

        searchFeignApi.rebuildNoteDocument(rebuildNoteDocumentReqDTO);
    }

    /**
     * 调用重建用户文档接口
     * @param userId
     */
    public void rebuildUserDocument(Long userId) {
        RebuildUserDocumentReqDTO rebuildUserDocumentReqDTO = RebuildUserDocumentReqDTO.builder()
                .id(userId)
                .build();

        searchFeignApi.rebuildUserDocument(rebuildUserDocumentReqDTO);
    }

}
