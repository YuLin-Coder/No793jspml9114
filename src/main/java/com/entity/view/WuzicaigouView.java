package com.entity.view;

import com.entity.WuzicaigouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物资采购
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 18:03:15
 */
@TableName("wuzicaigou")
public class WuzicaigouView  extends WuzicaigouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuzicaigouView(){
	}
 
 	public WuzicaigouView(WuzicaigouEntity wuzicaigouEntity){
 	try {
			BeanUtils.copyProperties(this, wuzicaigouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
