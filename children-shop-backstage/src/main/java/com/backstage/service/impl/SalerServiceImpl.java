package com.backstage.service.impl;

import com.backstage.entity.Saler;
import com.backstage.mapper.SalerMapper;
import com.backstage.service.SalerService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author Yeqt
 * @create 2021/11/1 14:04
 */
@Service
public class SalerServiceImpl extends ServiceImpl<SalerMapper, Saler> implements SalerService {
    @Resource
    private SalerMapper salerMapper;


    @Override
    public Object selectList() {
        QueryWrapper queryWrapper = new QueryWrapper();
        return salerMapper.selectList(queryWrapper);
    }

    @Override
    public Object add(String i) {
        Saler a = new Saler();
        a.setId(i);
        return salerMapper.insert(a);
    }
}
