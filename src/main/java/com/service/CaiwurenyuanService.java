package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaiwurenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaiwurenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaiwurenyuanView;


/**
 * 财务人员
 *
 * @author 
 * @email 
 * @date 2021-04-16 18:03:15
 */
public interface CaiwurenyuanService extends IService<CaiwurenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaiwurenyuanVO> selectListVO(Wrapper<CaiwurenyuanEntity> wrapper);
   	
   	CaiwurenyuanVO selectVO(@Param("ew") Wrapper<CaiwurenyuanEntity> wrapper);
   	
   	List<CaiwurenyuanView> selectListView(Wrapper<CaiwurenyuanEntity> wrapper);
   	
   	CaiwurenyuanView selectView(@Param("ew") Wrapper<CaiwurenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaiwurenyuanEntity> wrapper);
   	
}

