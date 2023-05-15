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
 * 论坛详情页
 */
@RestController
@Tag(name="用户文章详情页")
@RequestMapping("forum_details")
public class Forum_details {
    @Resource
    IForumService forumService;
    /**
     * 论坛详情页面
     */
    @GetMapping("/forum")
    public CommonResult CarouselMap(){
        List list = forumService.selectforum();
        return CommonResult.success(list);
    }
}
