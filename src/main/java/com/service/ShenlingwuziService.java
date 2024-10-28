package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenlingwuziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenlingwuziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenlingwuziView;


/**
 * 申领物资
 *
 * @author 
 * @email 
 * @date 2021-04-16 18:03:15
 */
public interface ShenlingwuziService extends IService<ShenlingwuziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenlingwuziVO> selectListVO(Wrapper<ShenlingwuziEntity> wrapper);
   	
   	ShenlingwuziVO selectVO(@Param("ew") Wrapper<ShenlingwuziEntity> wrapper);
   	
   	List<ShenlingwuziView> selectListView(Wrapper<ShenlingwuziEntity> wrapper);
   	
   	ShenlingwuziView selectView(@Param("ew") Wrapper<ShenlingwuziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenlingwuziEntity> wrapper);
   	
}

