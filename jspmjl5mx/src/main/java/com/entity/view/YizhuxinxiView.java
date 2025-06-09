package com.entity.view;

import com.entity.YizhuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医嘱信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-11 11:23:12
 */
@TableName("yizhuxinxi")
public class YizhuxinxiView  extends YizhuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YizhuxinxiView(){
	}
 
 	public YizhuxinxiView(YizhuxinxiEntity yizhuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yizhuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
