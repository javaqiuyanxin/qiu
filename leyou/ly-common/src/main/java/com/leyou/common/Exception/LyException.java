package com.leyou.common.Exception;

import com.leyou.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @ClassName LyException
 * @Description TODO
 * @Author qiuyanxin
 * @Date 2019/12/11 13:41
 * @Version
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class LyException extends RuntimeException {
private ExceptionEnum exceptionEnum;
}
