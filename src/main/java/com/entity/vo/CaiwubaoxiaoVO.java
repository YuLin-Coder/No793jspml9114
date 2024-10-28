package com.entity.vo;

import com.entity.CaiwubaoxiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 财务报销
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-16 18:03:15
 */
public class CaiwubaoxiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 报销总金额
	 */
	
	private String baoxiaozongjine;
		
	/**
	 * 申请人
	 */
	
	private String shenqingren;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：报销总金额
	 */
	 
	public void setBaoxiaozongjine(String baoxiaozongjine) {
		this.baoxiaozongjine = baoxiaozongjine;
	}
	
	/**
	 * 获取：报销总金额
	 */
	public String getBaoxiaozongjine() {
		return baoxiaozongjine;
	}
				
	
	/**
	 * 设置：申请人
	 */
	 
	public void setShenqingren(String shenqingren) {
		this.shenqingren = shenqingren;
	}
	
	/**
	 * 获取：申请人
	 */
	public String getShenqingren() {
		return shenqingren;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
