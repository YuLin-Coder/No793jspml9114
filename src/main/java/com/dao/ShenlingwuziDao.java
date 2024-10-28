package com.dao;

import com.entity.ShenlingwuziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenlingwuziVO;
import com.entity.view.ShenlingwuziView;


/**
 * 申领物资
 * 
 * @author 
 * @email 
 * @date 2021-04-16 18:03:15
 */
public interface ShenlingwuziDao extends BaseMapper<ShenlingwuziEntity> {
	
	List<ShenlingwuziVO> selectListVO(@Param("ew") Wrapper<ShenlingwuziEntity> wrapper);
	
	ShenlingwuziVO selectVO(@Param("ew") Wrapper<ShenlingwuziEntity> wrapper);
	
	List<ShenlingwuziView> selectListView(@Param("ew") Wrapper<ShenlingwuziEntity> wrapper);

	List<ShenlingwuziView> selectListView(Pagination page,@Param("ew") Wrapper<ShenlingwuziEntity> wrapper);
	
	ShenlingwuziView selectView(@Param("ew") Wrapper<ShenlingwuziEntity> wrapper);
	
}
