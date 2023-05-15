package com.foottime.receptiodesk.controller;

import com.foottime.common.CommonResult;
import com.foottime.receptiodesk.dto.Forum_publishedDTO;

import com.foottime.receptiodesk.service.IForumService;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Tag(name="用户发表文章")
@RequestMapping("/forum_published")
public class Forum_published {
    @Resource
    IForumService forumService;

    /**
     * 论坛发表
     * @param forum_publishedDTO 发表信息
     * @return 发布信息
     */
    @PutMapping("/pulished")
    public CommonResult<Forum_publishedDTO> addforum(@RequestBody Forum_publishedDTO forum_publishedDTO){
        Forum_publishedDTO forum_published = forumService.addforum(forum_publishedDTO);
        if (forum_published == null) {
            return CommonResult.failed("请编辑信息");
        }
        return CommonResult.success(forum_publishedDTO);
    }
}
