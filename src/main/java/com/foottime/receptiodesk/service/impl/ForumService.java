package com.foottime.receptiodesk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foottime.common.CommonPage;
import com.foottime.receptiodesk.dto.Address_InformationDTO;
import com.foottime.receptiodesk.dto.Forum_InformationDTO;
import com.foottime.receptiodesk.dto.Forum_publishedDTO;
import com.foottime.receptiodesk.entity.Forum;
import com.foottime.receptiodesk.entity.ReceiptInformation;
import com.foottime.receptiodesk.entity.User;
import com.foottime.receptiodesk.mapper.ForumMapper;
import com.foottime.receptiodesk.service.IForumService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-13
 */
@Service
public class ForumService extends ServiceImpl<ForumMapper, Forum> implements IForumService {
    @Resource
    ForumMapper mapper;
//    /**
//     * 模糊查询分页
//     * @param val 查询参数
//     * @param pageSize 每页条数
//     * @param pageNum 当前多少页
//     * @return 分页
//     * */
//    @Override
//    public CommonPage<Forum_InformationDTO> selectforum(String val, Integer pageSize, Integer pageNum) {
//        Page<Forum> page = new Page<>(pageNum, pageSize);
//        //         val传入有值 QueryWrapper模糊查询并 如果val没有传入值则就只执行分页查询
//        QueryWrapper<Forum> wrapper = new QueryWrapper<>();
//        if (val!=null){
//            wrapper.lambda().like(Forum::getMessage, val)
//                    .or().like(Forum::getPublication, val);
//        }
//        else {
//            wrapper.select("getMessage,getPublication");
//        }
//        //        将查询出来的数据与传入的分页的条件page 进行分页
//        mapper.selectPage(page, wrapper);
//        //        将分页出来的数据封装进list
//        List<Forum> list = page.getRecords();
//        //        通过String流的方式将查询出来的数据封装进DTO
//        List<Forum_InformationDTO> collect = list.stream().map((itme) -> {
//            Forum_InformationDTO informationDTO = new Forum_InformationDTO();
//            BeanUtils.copyProperties(itme, informationDTO);
//            return informationDTO;
//        }).collect(Collectors.toList());
//        //        将page数据和DOT数据返回给封装的分页方法
//        CommonPage<Forum_InformationDTO> commonPage = new CommonPage<>();
//        commonPage.setPageNum(pageNum);
//        commonPage.setPageSize(pageSize);
//        commonPage.setTotalPage((int) page.getPages());
//        commonPage.setTotal(page.getTotal());
//        commonPage.setList(collect);
//        return commonPage;
//    }


    @Override
    public List<Forum_InformationDTO> forumselect(Integer id) {
        return mapper.forumselect(id);
    }

    /**
     * 论坛详情页面
     */
    @Override
    public List selectforum() {
        QueryWrapper<Forum> queryWrapper = new QueryWrapper<>();
        queryWrapper.select( "fname","heandpicture","text","message","picture","publication");
        List<Forum> list = list(queryWrapper);
        return list;
    }
    /**
     * 论坛发表
     * @param forum_publishedDTO 发表信息
     * @return 发布信息
     */
    @Override
    public Forum_publishedDTO addforum(Forum_publishedDTO forum_publishedDTO) {
        Forum forum = new Forum();
        BeanUtils.copyProperties(forum_publishedDTO,forum);
        QueryWrapper<Forum> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(Forum::getMessage,forum_publishedDTO.getMessage());
        List<Forum> list = list(wrapper);
        if (list.size()>0){
            return null;
        }
        mapper.insert(forum);
        return forum_publishedDTO;
    }
    /**
     * 每日干货分享
     */
    @Override
    public List selectforum1() {
        QueryWrapper<Forum> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("fname","heandpicture","text","picture","publication","shares");
        List<Forum> list = list(queryWrapper);
        return list;
    }

    /**
     * 论坛信息
     */
    @Override
    public List selectforum2() {
        QueryWrapper<Forum> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("fname","picture","text","shares","likes","collections");
        List<Forum> list = list(queryWrapper);
        return list;
    }

}
