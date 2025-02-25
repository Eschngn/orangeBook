package com.swc.orangeBook.search.domain.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author Wilson
 * @Description: TODO
 * @date 2025-02-25
 */
public interface SelectMapper {
    /**
     * 查询笔记文档所需的全字段数据
     * @param noteId
     * @return
     */
    List<Map<String, Object>> selectEsNoteIndexData(@Param("noteId") long noteId);
}
