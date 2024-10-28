package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaigouyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaigouyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaigouyuanView;


/**
 * 采购员
 *
 * @author 
 * @email 
 * @date 2021-04-16 18:03:15
 */
public interface CaigouyuanService extends IService<CaigouyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaigouyuanVO> selectListVO(Wrapper<CaigouyuanEntity> wrapper);
   	
   	CaigouyuanVO selectVO(@Param("ew") Wrapper<CaigouyuanEntity> wrapper);
   	
   	List<CaigouyuanView> selectListView(Wrapper<CaigouyuanEntity> wrapper);
   	
   	CaigouyuanView selectView(@Param("ew") Wrapper<CaigouyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaigouyuanEntity> wrapper);
   	
}

