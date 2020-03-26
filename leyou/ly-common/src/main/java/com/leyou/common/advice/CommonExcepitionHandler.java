package com.leyou.common.advice;

import com.leyou.common.Exception.LyException;
import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ClassName CommonExcepitionHandler
 * @Description TODO
 * @Author qiuyanxin
 * @Date 2019/12/11 13:15
 * @Version
 **/
@ControllerAdvice
public class CommonExcepitionHandler {
    @ExceptionHandler(LyException.class)
 public ResponseEntity<ExceptionResult> handlerException(LyException e){
        return ResponseEntity.status(e.getExceptionEnum().getCode()).body(new ExceptionResult(e.getExceptionEnum()));

    }
}
