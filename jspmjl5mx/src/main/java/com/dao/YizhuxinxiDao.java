package com.dao;

import com.entity.YizhuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YizhuxinxiVO;
import com.entity.view.YizhuxinxiView;


/**
 * 医嘱信息
 * 
 * @author 
 * @email 
 * @date 2021-03-11 11:23:12
 */
public interface YizhuxinxiDao extends BaseMapper<YizhuxinxiEntity> {
	
	List<YizhuxinxiVO> selectListVO(@Param("ew") Wrapper<YizhuxinxiEntity> wrapper);
	
	YizhuxinxiVO selectVO(@Param("ew") Wrapper<YizhuxinxiEntity> wrapper);
	
	List<YizhuxinxiView> selectListView(@Param("ew") Wrapper<YizhuxinxiEntity> wrapper);

	List<YizhuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YizhuxinxiEntity> wrapper);
	
	YizhuxinxiView selectView(@Param("ew") Wrapper<YizhuxinxiEntity> wrapper);
	
}
