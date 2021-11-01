package com.backstage.service;

import com.backstage.entity.Saler;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Author Yeqt
 * @create 2021/11/1 14:06
 */
public interface SalerService extends IService<Saler> {
    Object selectList();

    Object add(String i);
}
