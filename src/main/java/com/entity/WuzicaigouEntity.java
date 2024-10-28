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
 * 物资采购
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-16 18:03:15
 */
@TableName("wuzicaigou")
public class WuzicaigouEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WuzicaigouEntity() {
		
	}
	
	public WuzicaigouEntity(T t) {
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
	 * 待办事项
	 */
					
	private String daibanshixiang;
	
	/**
	 * 采购状态
	 */
					
	private String caigouzhuangtai;
	
	/**
	 * 采购的物资
	 */
					
	private String caigoudewuzi;
	
	/**
	 * 类别
	 */
					
	private String leibie;
	
	/**
	 * 时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shijian;
	
	/**
	 * 采购员工号
	 */
					
	private String caigouyuangonghao;
	
	/**
	 * 采购员姓名
	 */
					
	private String caigouyuanxingming;
	
	
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
	 * 设置：待办事项
	 */
	public void setDaibanshixiang(String daibanshixiang) {
		this.daibanshixiang = daibanshixiang;
	}
	/**
	 * 获取：待办事项
	 */
	public String getDaibanshixiang() {
		return daibanshixiang;
	}
	/**
	 * 设置：采购状态
	 */
	public void setCaigouzhuangtai(String caigouzhuangtai) {
		this.caigouzhuangtai = caigouzhuangtai;
	}
	/**
	 * 获取：采购状态
	 */
	public String getCaigouzhuangtai() {
		return caigouzhuangtai;
	}
	/**
	 * 设置：采购的物资
	 */
	public void setCaigoudewuzi(String caigoudewuzi) {
		this.caigoudewuzi = caigoudewuzi;
	}
	/**
	 * 获取：采购的物资
	 */
	public String getCaigoudewuzi() {
		return caigoudewuzi;
	}
	/**
	 * 设置：类别
	 */
	public void setLeibie(String leibie) {
		this.leibie = leibie;
	}
	/**
	 * 获取：类别
	 */
	public String getLeibie() {
		return leibie;
	}
	/**
	 * 设置：时间
	 */
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
	}
	/**
	 * 设置：采购员工号
	 */
	public void setCaigouyuangonghao(String caigouyuangonghao) {
		this.caigouyuangonghao = caigouyuangonghao;
	}
	/**
	 * 获取：采购员工号
	 */
	public String getCaigouyuangonghao() {
		return caigouyuangonghao;
	}
	/**
	 * 设置：采购员姓名
	 */
	public void setCaigouyuanxingming(String caigouyuanxingming) {
		this.caigouyuanxingming = caigouyuanxingming;
	}
	/**
	 * 获取：采购员姓名
	 */
	public String getCaigouyuanxingming() {
		return caigouyuanxingming;
	}

}
