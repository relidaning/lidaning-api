package xyz.lidaning.jxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.lidaning.jxc.domain.JxcTrdRtninlist;
import xyz.lidaning.jxc.mapper.JxcTrdRtninlistMapper;
import xyz.lidaning.jxc.service.IJxcTrdRtninlistService;

import java.util.List;
import java.util.UUID;

/**
 * 退回入库详情Service业务层处理
 *
 * @date 2021-02-23
 */
@Service
public class JxcTrdRtninlistServiceImpl implements IJxcTrdRtninlistService
{
    @Autowired
    private JxcTrdRtninlistMapper jxcTrdRtninlistMapper;

    /**
     * 查询退回入库详情
     *
     * @param id 退回入库详情ID
     * @return 退回入库详情
     */
    @Override
    public JxcTrdRtninlist selectJxcTrdRtninlistById(String id)
    {
        return jxcTrdRtninlistMapper.selectJxcTrdRtninlistById(id);
    }

    /**
     * 查询退回入库详情列表
     *
     * @param jxcTrdRtninlist 退回入库详情
     * @return 退回入库详情
     */
    @Override
    public List<JxcTrdRtninlist> selectJxcTrdRtninlistList(JxcTrdRtninlist jxcTrdRtninlist)
    {
        return jxcTrdRtninlistMapper.selectJxcTrdRtninlistList(jxcTrdRtninlist);
    }

    /**
     * 新增退回入库详情
     *
     * @param jxcTrdRtninlist 退回入库详情
     * @return 结果
     */
    @Override
    public int insertJxcTrdRtninlist(JxcTrdRtninlist jxcTrdRtninlist)
    {
        if (!StringUtils.hasLength(jxcTrdRtninlist.getId()))
        {
            jxcTrdRtninlist.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return jxcTrdRtninlistMapper.insertJxcTrdRtninlist(jxcTrdRtninlist);
    }

    /**
     * 修改退回入库详情
     *
     * @param jxcTrdRtninlist 退回入库详情
     * @return 结果
     */
    @Override
    public int updateJxcTrdRtninlist(JxcTrdRtninlist jxcTrdRtninlist)
    {
        return jxcTrdRtninlistMapper.updateJxcTrdRtninlist(jxcTrdRtninlist);
    }

    /**
     * 批量删除退回入库详情
     *
     * @param ids 需要删除的退回入库详情ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdRtninlistByIds(String[] ids)
    {
        return jxcTrdRtninlistMapper.deleteJxcTrdRtninlistByIds(ids);
    }

    /**
     * 删除退回入库详情信息
     *
     * @param id 退回入库详情ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdRtninlistById(String id)
    {
        return jxcTrdRtninlistMapper.deleteJxcTrdRtninlistById(id);
    }
    /**
     * 返回查询退回入库详情总量
     *
     * @param jxcTrdRtninlist 退回入库详情
     * @return 退回入库详情查询总量
     */
    @Override
    public Integer selectJxcTrdRtninlistCount(JxcTrdRtninlist jxcTrdRtninlist)
    {
        return jxcTrdRtninlistMapper.selectJxcTrdRtninlistCount(jxcTrdRtninlist);
    }
}
