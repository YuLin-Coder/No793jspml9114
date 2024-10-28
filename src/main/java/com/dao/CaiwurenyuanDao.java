package com.dao;

import com.entity.CaiwurenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaiwurenyuanVO;
import com.entity.view.CaiwurenyuanView;


/**
 * 财务人员
 * 
 * @author 
 * @email 
 * @date 2021-04-16 18:03:15
 */
public interface CaiwurenyuanDao extends BaseMapper<CaiwurenyuanEntity> {
	
	List<CaiwurenyuanVO> selectListVO(@Param("ew") Wrapper<CaiwurenyuanEntity> wrapper);
	
	CaiwurenyuanVO selectVO(@Param("ew") Wrapper<CaiwurenyuanEntity> wrapper);
	
	List<CaiwurenyuanView> selectListView(@Param("ew") Wrapper<CaiwurenyuanEntity> wrapper);

	List<CaiwurenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<CaiwurenyuanEntity> wrapper);
	
	CaiwurenyuanView selectView(@Param("ew") Wrapper<CaiwurenyuanEntity> wrapper);
	
}
