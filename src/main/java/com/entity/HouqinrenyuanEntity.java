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
 * 后勤人员
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-16 18:03:15
 */
@TableName("houqinrenyuan")
public class HouqinrenyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HouqinrenyuanEntity() {
		
	}
	
	public HouqinrenyuanEntity(T t) {
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
	 * 后勤人员工号
	 */
					
	private String houqinrenyuangonghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 后勤人员姓名
	 */
					
	private String houqinrenyuanxingming;
	
	/**
	 * 部门
	 */
					
	private String bumen;
	
	/**
	 * 职务
	 */
					
	private String zhiwu;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	
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
	 * 设置：后勤人员工号
	 */
	public void setHouqinrenyuangonghao(String houqinrenyuangonghao) {
		this.houqinrenyuangonghao = houqinrenyuangonghao;
	}
	/**
	 * 获取：后勤人员工号
	 */
	public String getHouqinrenyuangonghao() {
		return houqinrenyuangonghao;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：后勤人员姓名
	 */
	public void setHouqinrenyuanxingming(String houqinrenyuanxingming) {
		this.houqinrenyuanxingming = houqinrenyuanxingming;
	}
	/**
	 * 获取：后勤人员姓名
	 */
	public String getHouqinrenyuanxingming() {
		return houqinrenyuanxingming;
	}
	/**
	 * 设置：部门
	 */
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
	/**
	 * 设置：职务
	 */
	public void setZhiwu(String zhiwu) {
		this.zhiwu = zhiwu;
	}
	/**
	 * 获取：职务
	 */
	public String getZhiwu() {
		return zhiwu;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}

}
