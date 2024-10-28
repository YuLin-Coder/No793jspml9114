package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HouqinrenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HouqinrenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HouqinrenyuanView;


/**
 * 后勤人员
 *
 * @author 
 * @email 
 * @date 2021-04-16 18:03:15
 */
public interface HouqinrenyuanService extends IService<HouqinrenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HouqinrenyuanVO> selectListVO(Wrapper<HouqinrenyuanEntity> wrapper);
   	
   	HouqinrenyuanVO selectVO(@Param("ew") Wrapper<HouqinrenyuanEntity> wrapper);
   	
   	List<HouqinrenyuanView> selectListView(Wrapper<HouqinrenyuanEntity> wrapper);
   	
   	HouqinrenyuanView selectView(@Param("ew") Wrapper<HouqinrenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HouqinrenyuanEntity> wrapper);
   	
}

