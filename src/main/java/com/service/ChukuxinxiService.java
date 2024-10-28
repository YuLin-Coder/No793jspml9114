package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChukuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChukuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChukuxinxiView;


/**
 * 出库信息
 *
 * @author 
 * @email 
 * @date 2021-04-16 18:03:14
 */
public interface ChukuxinxiService extends IService<ChukuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChukuxinxiVO> selectListVO(Wrapper<ChukuxinxiEntity> wrapper);
   	
   	ChukuxinxiVO selectVO(@Param("ew") Wrapper<ChukuxinxiEntity> wrapper);
   	
   	List<ChukuxinxiView> selectListView(Wrapper<ChukuxinxiEntity> wrapper);
   	
   	ChukuxinxiView selectView(@Param("ew") Wrapper<ChukuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChukuxinxiEntity> wrapper);
   	
}

