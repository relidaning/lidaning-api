package xyz.lidaning.jxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.lidaning.jxc.domain.JxcTrdBuylist;
import xyz.lidaning.jxc.mapper.JxcTrdBuylistMapper;
import xyz.lidaning.jxc.service.IJxcTrdBuylistService;

import java.util.List;
import java.util.UUID;

/**
 * 购进详情Service业务层处理
 *
 * @date 2021-02-23
 */
@Service
public class JxcTrdBuylistServiceImpl implements IJxcTrdBuylistService
{
    @Autowired
    private JxcTrdBuylistMapper jxcTrdBuylistMapper;

    /**
     * 查询购进详情
     *
     * @param id 购进详情ID
     * @return 购进详情
     */
    @Override
    public JxcTrdBuylist selectJxcTrdBuylistById(String id)
    {
        return jxcTrdBuylistMapper.selectJxcTrdBuylistById(id);
    }

    /**
     * 查询购进详情列表
     *
     * @param jxcTrdBuylist 购进详情
     * @return 购进详情
     */
    @Override
    public List<JxcTrdBuylist> selectJxcTrdBuylistList(JxcTrdBuylist jxcTrdBuylist)
    {
        return jxcTrdBuylistMapper.selectJxcTrdBuylistList(jxcTrdBuylist);
    }

    /**
     * 新增购进详情
     *
     * @param jxcTrdBuylist 购进详情
     * @return 结果
     */
    @Override
    public int insertJxcTrdBuylist(JxcTrdBuylist jxcTrdBuylist)
    {
        if (!StringUtils.hasLength(jxcTrdBuylist.getId()))
        {
            jxcTrdBuylist.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return jxcTrdBuylistMapper.insertJxcTrdBuylist(jxcTrdBuylist);
    }

    /**
     * 修改购进详情
     *
     * @param jxcTrdBuylist 购进详情
     * @return 结果
     */
    @Override
    public int updateJxcTrdBuylist(JxcTrdBuylist jxcTrdBuylist)
    {
        return jxcTrdBuylistMapper.updateJxcTrdBuylist(jxcTrdBuylist);
    }

    /**
     * 批量删除购进详情
     *
     * @param ids 需要删除的购进详情ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdBuylistByIds(String[] ids)
    {
        return jxcTrdBuylistMapper.deleteJxcTrdBuylistByIds(ids);
    }

    /**
     * 删除购进详情信息
     *
     * @param id 购进详情ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdBuylistById(String id)
    {
        return jxcTrdBuylistMapper.deleteJxcTrdBuylistById(id);
    }
    /**
     * 返回查询购进详情总量
     *
     * @param jxcTrdBuylist 购进详情
     * @return 购进详情查询总量
     */
    @Override
    public Integer selectJxcTrdBuylistCount(JxcTrdBuylist jxcTrdBuylist)
    {
        return jxcTrdBuylistMapper.selectJxcTrdBuylistCount(jxcTrdBuylist);
    }
}
