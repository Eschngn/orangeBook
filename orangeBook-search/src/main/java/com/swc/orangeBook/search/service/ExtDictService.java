package com.swc.orangeBook.search.service;

import org.springframework.http.ResponseEntity;

/**
 * @author Wilson
 * @Description: 拓展词典
 * @date 2025-02-01
 */
public interface ExtDictService {
    /**
     * 获取热更新词典
     * @return
     */
    ResponseEntity<String> getHotUpdateExtDict();
}
