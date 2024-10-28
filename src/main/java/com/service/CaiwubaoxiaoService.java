package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaiwubaoxiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaiwubaoxiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaiwubaoxiaoView;


/**
 * 财务报销
 *
 * @author 
 * @email 
 * @date 2021-04-16 18:03:15
 */
public interface CaiwubaoxiaoService extends IService<CaiwubaoxiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaiwubaoxiaoVO> selectListVO(Wrapper<CaiwubaoxiaoEntity> wrapper);
   	
   	CaiwubaoxiaoVO selectVO(@Param("ew") Wrapper<CaiwubaoxiaoEntity> wrapper);
   	
   	List<CaiwubaoxiaoView> selectListView(Wrapper<CaiwubaoxiaoEntity> wrapper);
   	
   	CaiwubaoxiaoView selectView(@Param("ew") Wrapper<CaiwubaoxiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaiwubaoxiaoEntity> wrapper);
   	
}

