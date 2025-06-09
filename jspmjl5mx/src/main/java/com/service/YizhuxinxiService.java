package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YizhuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YizhuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YizhuxinxiView;


/**
 * 医嘱信息
 *
 * @author 
 * @email 
 * @date 2021-03-11 11:23:12
 */
public interface YizhuxinxiService extends IService<YizhuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YizhuxinxiVO> selectListVO(Wrapper<YizhuxinxiEntity> wrapper);
   	
   	YizhuxinxiVO selectVO(@Param("ew") Wrapper<YizhuxinxiEntity> wrapper);
   	
   	List<YizhuxinxiView> selectListView(Wrapper<YizhuxinxiEntity> wrapper);
   	
   	YizhuxinxiView selectView(@Param("ew") Wrapper<YizhuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YizhuxinxiEntity> wrapper);
   	
}

