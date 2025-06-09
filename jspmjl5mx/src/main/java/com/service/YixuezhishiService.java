package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YixuezhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YixuezhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YixuezhishiView;


/**
 * 医学知识
 *
 * @author 
 * @email 
 * @date 2021-03-11 11:23:12
 */
public interface YixuezhishiService extends IService<YixuezhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YixuezhishiVO> selectListVO(Wrapper<YixuezhishiEntity> wrapper);
   	
   	YixuezhishiVO selectVO(@Param("ew") Wrapper<YixuezhishiEntity> wrapper);
   	
   	List<YixuezhishiView> selectListView(Wrapper<YixuezhishiEntity> wrapper);
   	
   	YixuezhishiView selectView(@Param("ew") Wrapper<YixuezhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YixuezhishiEntity> wrapper);
   	
}

