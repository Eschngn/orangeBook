package com.swc.orangeBook.search.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Wilson
 * @Description: 重建用户文档
 * @date 2025-03-06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RebuildUserDocumentReqDTO {

    @NotNull(message = "用户 ID 不能为空")
    private Long id;

}
