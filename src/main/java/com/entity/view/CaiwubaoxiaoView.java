package com.entity.view;

import com.entity.CaiwubaoxiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 财务报销
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 18:03:15
 */
@TableName("caiwubaoxiao")
public class CaiwubaoxiaoView  extends CaiwubaoxiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaiwubaoxiaoView(){
	}
 
 	public CaiwubaoxiaoView(CaiwubaoxiaoEntity caiwubaoxiaoEntity){
 	try {
			BeanUtils.copyProperties(this, caiwubaoxiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
