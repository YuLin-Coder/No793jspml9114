package com.entity.vo;

import com.entity.WuzicaigouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 物资采购
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-16 18:03:15
 */
public class WuzicaigouVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
