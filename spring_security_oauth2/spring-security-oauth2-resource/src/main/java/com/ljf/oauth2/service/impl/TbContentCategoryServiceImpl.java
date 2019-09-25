package com.ljf.oauth2.service.impl;

/**
 * description
 *
 * @author ljf 2019/09/25 10:46
 */
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ljf.oauth2.mapper.TbContentCategoryMapper;
import com.ljf.oauth2.service.TbContentCategoryService;
@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService{

    @Resource
    private TbContentCategoryMapper tbContentCategoryMapper;

}
