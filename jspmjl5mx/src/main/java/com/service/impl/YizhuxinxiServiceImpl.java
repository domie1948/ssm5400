package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YizhuxinxiDao;
import com.entity.YizhuxinxiEntity;
import com.service.YizhuxinxiService;
import com.entity.vo.YizhuxinxiVO;
import com.entity.view.YizhuxinxiView;

@Service("yizhuxinxiService")
public class YizhuxinxiServiceImpl extends ServiceImpl<YizhuxinxiDao, YizhuxinxiEntity> implements YizhuxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YizhuxinxiEntity> page = this.selectPage(
                new Query<YizhuxinxiEntity>(params).getPage(),
                new EntityWrapper<YizhuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YizhuxinxiEntity> wrapper) {
		  Page<YizhuxinxiView> page =new Query<YizhuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YizhuxinxiVO> selectListVO(Wrapper<YizhuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YizhuxinxiVO selectVO(Wrapper<YizhuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YizhuxinxiView> selectListView(Wrapper<YizhuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YizhuxinxiView selectView(Wrapper<YizhuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
