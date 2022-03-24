package xyz.lidaning.api.jxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.lidaning.api.jxc.domain.JxcGspDrugrecalllist;
import xyz.lidaning.api.jxc.mapper.JxcGspDrugrecalllistMapper;
import xyz.lidaning.api.jxc.service.IJxcGspDrugrecalllistService;

import java.util.List;
import java.util.UUID;

/**
 * 召回详情Service业务层处理
 *
 * @date 2021-02-23
 */
@Service
public class JxcGspDrugrecalllistServiceImpl implements IJxcGspDrugrecalllistService
{
    @Autowired
    private JxcGspDrugrecalllistMapper jxcGspDrugrecalllistMapper;

    /**
     * 查询召回详情
     *
     * @param id 召回详情ID
     * @return 召回详情
     */
    @Override
    public JxcGspDrugrecalllist selectJxcGspDrugrecalllistById(String id)
    {
        return jxcGspDrugrecalllistMapper.selectJxcGspDrugrecalllistById(id);
    }

    /**
     * 查询召回详情列表
     *
     * @param jxcGspDrugrecalllist 召回详情
     * @return 召回详情
     */
    @Override
    public List<JxcGspDrugrecalllist> selectJxcGspDrugrecalllistList(JxcGspDrugrecalllist jxcGspDrugrecalllist)
    {
        return jxcGspDrugrecalllistMapper.selectJxcGspDrugrecalllistList(jxcGspDrugrecalllist);
    }

    /**
     * 新增召回详情
     *
     * @param jxcGspDrugrecalllist 召回详情
     * @return 结果
     */
    @Override
    public int insertJxcGspDrugrecalllist(JxcGspDrugrecalllist jxcGspDrugrecalllist)
    {
        if (!StringUtils.hasLength(jxcGspDrugrecalllist.getId()))
        {
            jxcGspDrugrecalllist.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return jxcGspDrugrecalllistMapper.insertJxcGspDrugrecalllist(jxcGspDrugrecalllist);
    }

    /**
     * 修改召回详情
     *
     * @param jxcGspDrugrecalllist 召回详情
     * @return 结果
     */
    @Override
    public int updateJxcGspDrugrecalllist(JxcGspDrugrecalllist jxcGspDrugrecalllist)
    {
        return jxcGspDrugrecalllistMapper.updateJxcGspDrugrecalllist(jxcGspDrugrecalllist);
    }

    /**
     * 批量删除召回详情
     *
     * @param ids 需要删除的召回详情ID
     * @return 结果
     */
    @Override
    public int deleteJxcGspDrugrecalllistByIds(String[] ids)
    {
        return jxcGspDrugrecalllistMapper.deleteJxcGspDrugrecalllistByIds(ids);
    }

    /**
     * 删除召回详情信息
     *
     * @param id 召回详情ID
     * @return 结果
     */
    @Override
    public int deleteJxcGspDrugrecalllistById(String id)
    {
        return jxcGspDrugrecalllistMapper.deleteJxcGspDrugrecalllistById(id);
    }
    /**
     * 返回查询召回详情总量
     *
     * @param jxcGspDrugrecalllist 召回详情
     * @return 召回详情查询总量
     */
    @Override
    public Integer selectJxcGspDrugrecalllistCount(JxcGspDrugrecalllist jxcGspDrugrecalllist)
    {
        return jxcGspDrugrecalllistMapper.selectJxcGspDrugrecalllistCount(jxcGspDrugrecalllist);
    }
}
