package xyz.lidaning.api.jxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.lidaning.api.jxc.domain.JxcTrdLolist;
import xyz.lidaning.api.jxc.mapper.JxcTrdLolistMapper;
import xyz.lidaning.api.jxc.service.IJxcTrdLolistService;

import java.util.List;
import java.util.UUID;

/**
 * jxcTrdLolistService业务层处理
 *
 * @date 2021-02-23
 */
@Service
public class JxcTrdLolistServiceImpl implements IJxcTrdLolistService
{
    @Autowired
    private JxcTrdLolistMapper jxcTrdLolistMapper;

    /**
     * 查询jxcTrdLolist
     *
     * @param id jxcTrdLolistID
     * @return jxcTrdLolist
     */
    @Override
    public JxcTrdLolist selectJxcTrdLolistById(String id)
    {
        return jxcTrdLolistMapper.selectJxcTrdLolistById(id);
    }

    /**
     * 查询jxcTrdLolist列表
     *
     * @param jxcTrdLolist jxcTrdLolist
     * @return jxcTrdLolist
     */
    @Override
    public List<JxcTrdLolist> selectJxcTrdLolistList(JxcTrdLolist jxcTrdLolist)
    {
        return jxcTrdLolistMapper.selectJxcTrdLolistList(jxcTrdLolist);
    }

    /**
     * 新增jxcTrdLolist
     *
     * @param jxcTrdLolist jxcTrdLolist
     * @return 结果
     */
    @Override
    public int insertJxcTrdLolist(JxcTrdLolist jxcTrdLolist)
    {
        if (!StringUtils.hasLength(jxcTrdLolist.getId()))
        {
            jxcTrdLolist.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return jxcTrdLolistMapper.insertJxcTrdLolist(jxcTrdLolist);
    }

    /**
     * 修改jxcTrdLolist
     *
     * @param jxcTrdLolist jxcTrdLolist
     * @return 结果
     */
    @Override
    public int updateJxcTrdLolist(JxcTrdLolist jxcTrdLolist)
    {
        return jxcTrdLolistMapper.updateJxcTrdLolist(jxcTrdLolist);
    }

    /**
     * 批量删除jxcTrdLolist
     *
     * @param ids 需要删除的jxcTrdLolistID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdLolistByIds(String[] ids)
    {
        return jxcTrdLolistMapper.deleteJxcTrdLolistByIds(ids);
    }

    /**
     * 删除jxcTrdLolist信息
     *
     * @param id jxcTrdLolistID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdLolistById(String id)
    {
        return jxcTrdLolistMapper.deleteJxcTrdLolistById(id);
    }
    /**
     * 返回查询jxcTrdLolist总量
     *
     * @param jxcTrdLolist jxcTrdLolist
     * @return jxcTrdLolist查询总量
     */
    @Override
    public Integer selectJxcTrdLolistCount(JxcTrdLolist jxcTrdLolist)
    {
        return jxcTrdLolistMapper.selectJxcTrdLolistCount(jxcTrdLolist);
    }
}
