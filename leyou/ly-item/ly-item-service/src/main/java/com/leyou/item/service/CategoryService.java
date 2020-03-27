package com.leyou.item.service;

import com.leyou.common.Exception.LyException;
import com.leyou.common.enums.ExceptionEnum;
import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @ClassName CategoryService
 * @Description TODO
 * @Author qiuyanxin
 * @Date 2019/12/11 15:40
 * @Version
 **/
@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
@Transactional(rollbackFor = Exception.class)
    public List<Category> queryCategoryByPid(Long pid) {
        Category category = new Category();
        List<Category> list = categoryMapper.select(category);
        if (CollectionUtils.isEmpty(list)) {
            throw new LyException(ExceptionEnum.PARENT_ID_IS_NULL);
        }
        return list;
    }

    public static void main(String[] args) {

    }

}
