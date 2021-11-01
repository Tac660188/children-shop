package com.backstage.controller;

import com.backstage.service.SalerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author Yeqt
 * @create 2021-11-01
 */
//@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用
@RestController
@RequestMapping("/")
public class BackStageController {
    @Resource
    private SalerService salerService;

    @GetMapping("hello")
    public Object hello(){
        return salerService.selectList();
    }

    @GetMapping("hello1")
    public Object hello1(){
        return salerService.add("3");
    }
}
