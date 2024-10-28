package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShenlingwuziDao;
import com.entity.ShenlingwuziEntity;
import com.service.ShenlingwuziService;
import com.entity.vo.ShenlingwuziVO;
import com.entity.view.ShenlingwuziView;

@Service("shenlingwuziService")
public class ShenlingwuziServiceImpl extends ServiceImpl<ShenlingwuziDao, ShenlingwuziEntity> implements ShenlingwuziService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenlingwuziEntity> page = this.selectPage(
                new Query<ShenlingwuziEntity>(params).getPage(),
                new EntityWrapper<ShenlingwuziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenlingwuziEntity> wrapper) {
		  Page<ShenlingwuziView> page =new Query<ShenlingwuziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenlingwuziVO> selectListVO(Wrapper<ShenlingwuziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenlingwuziVO selectVO(Wrapper<ShenlingwuziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenlingwuziView> selectListView(Wrapper<ShenlingwuziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenlingwuziView selectView(Wrapper<ShenlingwuziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
