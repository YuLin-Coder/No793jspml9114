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


import com.dao.WuzicaigouDao;
import com.entity.WuzicaigouEntity;
import com.service.WuzicaigouService;
import com.entity.vo.WuzicaigouVO;
import com.entity.view.WuzicaigouView;

@Service("wuzicaigouService")
public class WuzicaigouServiceImpl extends ServiceImpl<WuzicaigouDao, WuzicaigouEntity> implements WuzicaigouService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuzicaigouEntity> page = this.selectPage(
                new Query<WuzicaigouEntity>(params).getPage(),
                new EntityWrapper<WuzicaigouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuzicaigouEntity> wrapper) {
		  Page<WuzicaigouView> page =new Query<WuzicaigouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuzicaigouVO> selectListVO(Wrapper<WuzicaigouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuzicaigouVO selectVO(Wrapper<WuzicaigouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuzicaigouView> selectListView(Wrapper<WuzicaigouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuzicaigouView selectView(Wrapper<WuzicaigouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
