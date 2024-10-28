package com.dao;

import com.entity.CaigouyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaigouyuanVO;
import com.entity.view.CaigouyuanView;


/**
 * 采购员
 * 
 * @author 
 * @email 
 * @date 2021-04-16 18:03:15
 */
public interface CaigouyuanDao extends BaseMapper<CaigouyuanEntity> {
	
	List<CaigouyuanVO> selectListVO(@Param("ew") Wrapper<CaigouyuanEntity> wrapper);
	
	CaigouyuanVO selectVO(@Param("ew") Wrapper<CaigouyuanEntity> wrapper);
	
	List<CaigouyuanView> selectListView(@Param("ew") Wrapper<CaigouyuanEntity> wrapper);

	List<CaigouyuanView> selectListView(Pagination page,@Param("ew") Wrapper<CaigouyuanEntity> wrapper);
	
	CaigouyuanView selectView(@Param("ew") Wrapper<CaigouyuanEntity> wrapper);
	
}
