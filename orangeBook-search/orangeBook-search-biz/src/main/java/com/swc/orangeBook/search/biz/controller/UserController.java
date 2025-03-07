package com.swc.orangeBook.search.biz.controller;

import com.swc.framework.biz.operationlog.aspect.ApiOperationLog;
import com.swc.framework.common.response.PageResponse;
import com.swc.framework.common.response.Response;
import com.swc.orangeBook.search.biz.model.vo.SearchUserReqVO;
import com.swc.orangeBook.search.biz.model.vo.SearchUserRspVO;
import com.swc.orangeBook.search.biz.service.UserService;
import com.swc.orangeBook.search.dto.RebuildUserDocumentReqDTO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wilson
 * @Description: 用户
 * @date 2025/1/18 13:34
 */
@RestController
@RequestMapping("/search")
@Slf4j
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/user")
    @ApiOperationLog(description = "搜索用户")
    public PageResponse<SearchUserRspVO> searchUser(@RequestBody @Validated SearchUserReqVO searchUserReqVO) {
        return userService.searchUser(searchUserReqVO);
    }

    // ===================================== 对其他服务提供的接口 =====================================
    @PostMapping("/user/document/rebuild")
    @ApiOperationLog(description = "用户文档重建")
    public Response<Long> rebuildDocument(@Validated @RequestBody RebuildUserDocumentReqDTO rebuildUserDocumentReqDTO) {
        return userService.rebuildDocument(rebuildUserDocumentReqDTO);
    }
}
