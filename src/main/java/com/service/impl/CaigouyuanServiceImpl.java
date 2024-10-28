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


import com.dao.CaigouyuanDao;
import com.entity.CaigouyuanEntity;
import com.service.CaigouyuanService;
import com.entity.vo.CaigouyuanVO;
import com.entity.view.CaigouyuanView;

@Service("caigouyuanService")
public class CaigouyuanServiceImpl extends ServiceImpl<CaigouyuanDao, CaigouyuanEntity> implements CaigouyuanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaigouyuanEntity> page = this.selectPage(
                new Query<CaigouyuanEntity>(params).getPage(),
                new EntityWrapper<CaigouyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaigouyuanEntity> wrapper) {
		  Page<CaigouyuanView> page =new Query<CaigouyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaigouyuanVO> selectListVO(Wrapper<CaigouyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaigouyuanVO selectVO(Wrapper<CaigouyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaigouyuanView> selectListView(Wrapper<CaigouyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaigouyuanView selectView(Wrapper<CaigouyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
