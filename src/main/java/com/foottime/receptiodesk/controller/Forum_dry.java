package com.foottime.receptiodesk.controller;

import com.foottime.common.CommonResult;
import com.foottime.receptiodesk.service.IForumService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * 每日干货分享-------论坛信息
 */
@Tag(name="每日干货分享和论坛文章信息")
@RestController
@RequestMapping("/forum")
public class Forum_dry {
    @Resource
    IForumService selectforum;
    /**
     *
     * 每日干货分享
     */
    @GetMapping("/forum_dry")
    public CommonResult CarouselMap(){
        List list = selectforum.selectforum1();
        return CommonResult.success(list);
    }


    @GetMapping("/forum_information")
    public CommonResult CarouselMap1(){
        List list = selectforum.selectforum2();
        return CommonResult.success(list);
    }
}
