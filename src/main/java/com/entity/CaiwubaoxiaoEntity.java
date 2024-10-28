package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 财务报销
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-16 18:03:15
 */
@TableName("caiwubaoxiao")
public class CaiwubaoxiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CaiwubaoxiaoEntity() {
		
	}
	
	public CaiwubaoxiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 报销内容
	 */
					
	private String baoxiaoneirong;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：报销内容
	 */
	public void setBaoxiaoneirong(String baoxiaoneirong) {
		this.baoxiaoneirong = baoxiaoneirong;
	}
	/**
	 * 获取：报销内容
	 */
	public String getBaoxiaoneirong() {
		return baoxiaoneirong;
	}
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
