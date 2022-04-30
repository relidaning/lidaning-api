package xyz.lidaning.jxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.lidaning.jxc.domain.JxcTrdSalelist;
import xyz.lidaning.jxc.mapper.JxcTrdSalelistMapper;
import xyz.lidaning.jxc.service.IJxcTrdSalelistService;

import java.util.List;
import java.util.UUID;

/**
 * 销售信息详情Service业务层处理
 *
 * @author hisicom
 * @date 2021-02-23
 */
@Service
public class JxcTrdSalelistServiceImpl implements IJxcTrdSalelistService
{
    @Autowired
    private JxcTrdSalelistMapper jxcTrdSalelistMapper;

    /**
     * 查询销售信息详情
     *
     * @param id 销售信息详情ID
     * @return 销售信息详情
     */
    @Override
    public JxcTrdSalelist selectJxcTrdSalelistById(String id)
    {
        return jxcTrdSalelistMapper.selectJxcTrdSalelistById(id);
    }

    /**
     * 查询销售信息详情列表
     *
     * @param jxcTrdSalelist 销售信息详情
     * @return 销售信息详情
     */
    @Override
    public List<JxcTrdSalelist> selectJxcTrdSalelistList(JxcTrdSalelist jxcTrdSalelist)
    {
        return jxcTrdSalelistMapper.selectJxcTrdSalelistList(jxcTrdSalelist);
    }

    /**
     * 新增销售信息详情
     *
     * @param jxcTrdSalelist 销售信息详情
     * @return 结果
     */
    @Override
    public int insertJxcTrdSalelist(JxcTrdSalelist jxcTrdSalelist)
    {
        if (!StringUtils.hasLength(jxcTrdSalelist.getId()))
        {
            jxcTrdSalelist.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return jxcTrdSalelistMapper.insertJxcTrdSalelist(jxcTrdSalelist);
    }

    /**
     * 修改销售信息详情
     *
     * @param jxcTrdSalelist 销售信息详情
     * @return 结果
     */
    @Override
    public int updateJxcTrdSalelist(JxcTrdSalelist jxcTrdSalelist)
    {
        return jxcTrdSalelistMapper.updateJxcTrdSalelist(jxcTrdSalelist);
    }

    /**
     * 批量删除销售信息详情
     *
     * @param ids 需要删除的销售信息详情ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdSalelistByIds(String[] ids)
    {
        return jxcTrdSalelistMapper.deleteJxcTrdSalelistByIds(ids);
    }

    /**
     * 删除销售信息详情信息
     *
     * @param id 销售信息详情ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdSalelistById(String id)
    {
        return jxcTrdSalelistMapper.deleteJxcTrdSalelistById(id);
    }
    /**
     * 返回查询销售信息详情总量
     *
     * @param jxcTrdSalelist 销售信息详情
     * @return 销售信息详情查询总量
     */
    @Override
    public Integer selectJxcTrdSalelistCount(JxcTrdSalelist jxcTrdSalelist)
    {
        return jxcTrdSalelistMapper.selectJxcTrdSalelistCount(jxcTrdSalelist);
    }
}
