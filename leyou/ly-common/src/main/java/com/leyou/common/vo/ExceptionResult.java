package com.leyou.common.vo;

import com.leyou.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * @ClassName ExceptionResult
 * @Description TODO
 * @Author qiuyanxin
 * @Date 2019/12/11 14:04
 * @Version
 **/
@Data
public class ExceptionResult {
    private int code;
    private String msg;
    private Long timestamp;

    public ExceptionResult(ExceptionEnum e) {
        this.code=e.getCode();
        this.msg=e.getMsg();
        this.timestamp=System.currentTimeMillis();
    }
}
