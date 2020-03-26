package com.leyou.item.web;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.item.pojo.Category;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @ClassName CategoryController
 * @Description TODO
 * @Author qiuyanxin
 * @Date 2019/12/11 15:41
 * @Version
 **/
@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
@RequestMapping("list")
public ResponseEntity<List<Category>> queryCategoryByPid(@RequestParam("pid") Long pid)  {
    return ResponseEntity.ok(categoryService.queryCategoryByPid(pid));


}


}
