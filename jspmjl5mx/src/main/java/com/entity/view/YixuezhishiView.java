package com.entity.view;

import com.entity.YixuezhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医学知识
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-11 11:23:12
 */
@TableName("yixuezhishi")
public class YixuezhishiView  extends YixuezhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YixuezhishiView(){
	}
 
 	public YixuezhishiView(YixuezhishiEntity yixuezhishiEntity){
 	try {
			BeanUtils.copyProperties(this, yixuezhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
