package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {
      PRICE_NOT_BE_NULL(400,"价格不能为空"),
      PARENT_ID_IS_NULL(404,"商品列表为空")

    ;
    private int code;
    private String msg;
}
