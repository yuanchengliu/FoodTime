package com.foottime.receptiodesk.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.foottime.common.CommonPage;
import com.foottime.receptiodesk.dto.Address_InformationDTO;
import com.foottime.receptiodesk.dto.Forum_InformationDTO;
import com.foottime.receptiodesk.dto.Forum_publishedDTO;
import com.foottime.receptiodesk.entity.Forum;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-13
 */
public interface IForumService extends IService<Forum> {
///**
// * 模糊查询分页
// * @param val 查询参数
// * @param pageSize 每页条数
// * @param pageNum 当前多少页
// * @return 分页
// * */
//  CommonPage<Forum_InformationDTO> selectforum(String val, Integer pageSize, Integer pageNum);
  /**
   * 个人信息查询发表
   */

  List<Forum_InformationDTO> forumselect(Integer id);
  /**
   * 论坛详情页
   */
  List selectforum();
  /**
   * 论坛发表
   */
  Forum_publishedDTO addforum(Forum_publishedDTO forum_publishedDTO);

  /**
   * 每日干货分享
   */
  List selectforum1();

  /**
   * 论坛模块
   */
  List selectforum2();
}
