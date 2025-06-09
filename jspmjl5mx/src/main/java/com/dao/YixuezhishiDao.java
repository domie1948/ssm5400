package com.dao;

import com.entity.YixuezhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YixuezhishiVO;
import com.entity.view.YixuezhishiView;


/**
 * 医学知识
 * 
 * @author 
 * @email 
 * @date 2021-03-11 11:23:12
 */
public interface YixuezhishiDao extends BaseMapper<YixuezhishiEntity> {
	
	List<YixuezhishiVO> selectListVO(@Param("ew") Wrapper<YixuezhishiEntity> wrapper);
	
	YixuezhishiVO selectVO(@Param("ew") Wrapper<YixuezhishiEntity> wrapper);
	
	List<YixuezhishiView> selectListView(@Param("ew") Wrapper<YixuezhishiEntity> wrapper);

	List<YixuezhishiView> selectListView(Pagination page,@Param("ew") Wrapper<YixuezhishiEntity> wrapper);
	
	YixuezhishiView selectView(@Param("ew") Wrapper<YixuezhishiEntity> wrapper);
	
}
