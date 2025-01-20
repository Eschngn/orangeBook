package com.swc.orangBook.search.controller;

import com.swc.framework.biz.operationlog.aspect.ApiOperationLog;
import com.swc.framework.common.response.PageResponse;
import com.swc.orangBook.search.model.vo.SearchNoteReqVO;
import com.swc.orangBook.search.model.vo.SearchNoteRspVO;
import com.swc.orangBook.search.service.NoteService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wilson
 * @Description: 笔记搜索
 * @date 2025/1/19 15:27
 */
@RestController
@RequestMapping("/search")
@Slf4j
public class NoteController {
    @Resource
    private NoteService noteService;

    @PostMapping("/note")
    @ApiOperationLog(description = "搜索笔记")
    public PageResponse<SearchNoteRspVO> searchNote(@RequestBody @Validated SearchNoteReqVO searchNoteReqVO) {
        return noteService.searchNote(searchNoteReqVO);
    }
}
