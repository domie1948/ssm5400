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


import com.dao.YixuezhishiDao;
import com.entity.YixuezhishiEntity;
import com.service.YixuezhishiService;
import com.entity.vo.YixuezhishiVO;
import com.entity.view.YixuezhishiView;

@Service("yixuezhishiService")
public class YixuezhishiServiceImpl extends ServiceImpl<YixuezhishiDao, YixuezhishiEntity> implements YixuezhishiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YixuezhishiEntity> page = this.selectPage(
                new Query<YixuezhishiEntity>(params).getPage(),
                new EntityWrapper<YixuezhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YixuezhishiEntity> wrapper) {
		  Page<YixuezhishiView> page =new Query<YixuezhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YixuezhishiVO> selectListVO(Wrapper<YixuezhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YixuezhishiVO selectVO(Wrapper<YixuezhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YixuezhishiView> selectListView(Wrapper<YixuezhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YixuezhishiView selectView(Wrapper<YixuezhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
