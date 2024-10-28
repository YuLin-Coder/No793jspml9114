package com.dao;

import com.entity.HouqinrenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HouqinrenyuanVO;
import com.entity.view.HouqinrenyuanView;


/**
 * 后勤人员
 * 
 * @author 
 * @email 
 * @date 2021-04-16 18:03:15
 */
public interface HouqinrenyuanDao extends BaseMapper<HouqinrenyuanEntity> {
	
	List<HouqinrenyuanVO> selectListVO(@Param("ew") Wrapper<HouqinrenyuanEntity> wrapper);
	
	HouqinrenyuanVO selectVO(@Param("ew") Wrapper<HouqinrenyuanEntity> wrapper);
	
	List<HouqinrenyuanView> selectListView(@Param("ew") Wrapper<HouqinrenyuanEntity> wrapper);

	List<HouqinrenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<HouqinrenyuanEntity> wrapper);
	
	HouqinrenyuanView selectView(@Param("ew") Wrapper<HouqinrenyuanEntity> wrapper);
	
}
