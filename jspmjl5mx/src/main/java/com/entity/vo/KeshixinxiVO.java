package com.entity.vo;

import com.entity.KeshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 科室信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-11 11:23:12
 */
public class KeshixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 医生人数
	 */
	
	private String yishengrenshu;
		
	/**
	 * 科室简介
	 */
	
	private String keshijianjie;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：医生人数
	 */
	 
	public void setYishengrenshu(String yishengrenshu) {
		this.yishengrenshu = yishengrenshu;
	}
	
	/**
	 * 获取：医生人数
	 */
	public String getYishengrenshu() {
		return yishengrenshu;
	}
				
	
	/**
	 * 设置：科室简介
	 */
	 
	public void setKeshijianjie(String keshijianjie) {
		this.keshijianjie = keshijianjie;
	}
	
	/**
	 * 获取：科室简介
	 */
	public String getKeshijianjie() {
		return keshijianjie;
	}
			
}
