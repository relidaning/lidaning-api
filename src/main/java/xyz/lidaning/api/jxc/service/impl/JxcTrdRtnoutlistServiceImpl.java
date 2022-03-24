package xyz.lidaning.api.jxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.lidaning.api.jxc.domain.JxcTrdRtnoutlist;
import xyz.lidaning.api.jxc.mapper.JxcTrdRtnoutlistMapper;
import xyz.lidaning.api.jxc.service.IJxcTrdRtnoutlistService;

import java.util.List;
import java.util.UUID;

/**
 * 退回出库详情Service业务层处理
 *
 * @author hisicom
 * @date 2021-02-23
 */
@Service
public class JxcTrdRtnoutlistServiceImpl implements IJxcTrdRtnoutlistService
{
    @Autowired
    private JxcTrdRtnoutlistMapper jxcTrdRtnoutlistMapper;

    /**
     * 查询退回出库详情
     *
     * @param id 退回出库详情ID
     * @return 退回出库详情
     */
    @Override
    public JxcTrdRtnoutlist selectJxcTrdRtnoutlistById(String id)
    {
        return jxcTrdRtnoutlistMapper.selectJxcTrdRtnoutlistById(id);
    }

    /**
     * 查询退回出库详情列表
     *
     * @param jxcTrdRtnoutlist 退回出库详情
     * @return 退回出库详情
     */
    @Override
    public List<JxcTrdRtnoutlist> selectJxcTrdRtnoutlistList(JxcTrdRtnoutlist jxcTrdRtnoutlist)
    {
        return jxcTrdRtnoutlistMapper.selectJxcTrdRtnoutlistList(jxcTrdRtnoutlist);
    }

    /**
     * 新增退回出库详情
     *
     * @param jxcTrdRtnoutlist 退回出库详情
     * @return 结果
     */
    @Override
    public int insertJxcTrdRtnoutlist(JxcTrdRtnoutlist jxcTrdRtnoutlist)
    {
        if (!StringUtils.hasLength(jxcTrdRtnoutlist.getId()))
        {
            jxcTrdRtnoutlist.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return jxcTrdRtnoutlistMapper.insertJxcTrdRtnoutlist(jxcTrdRtnoutlist);
    }

    /**
     * 修改退回出库详情
     *
     * @param jxcTrdRtnoutlist 退回出库详情
     * @return 结果
     */
    @Override
    public int updateJxcTrdRtnoutlist(JxcTrdRtnoutlist jxcTrdRtnoutlist)
    {
        return jxcTrdRtnoutlistMapper.updateJxcTrdRtnoutlist(jxcTrdRtnoutlist);
    }

    /**
     * 批量删除退回出库详情
     *
     * @param ids 需要删除的退回出库详情ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdRtnoutlistByIds(String[] ids)
    {
        return jxcTrdRtnoutlistMapper.deleteJxcTrdRtnoutlistByIds(ids);
    }

    /**
     * 删除退回出库详情信息
     *
     * @param id 退回出库详情ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdRtnoutlistById(String id)
    {
        return jxcTrdRtnoutlistMapper.deleteJxcTrdRtnoutlistById(id);
    }
    /**
     * 返回查询退回出库详情总量
     *
     * @param jxcTrdRtnoutlist 退回出库详情
     * @return 退回出库详情查询总量
     */
    @Override
    public Integer selectJxcTrdRtnoutlistCount(JxcTrdRtnoutlist jxcTrdRtnoutlist)
    {
        return jxcTrdRtnoutlistMapper.selectJxcTrdRtnoutlistCount(jxcTrdRtnoutlist);
    }
}
