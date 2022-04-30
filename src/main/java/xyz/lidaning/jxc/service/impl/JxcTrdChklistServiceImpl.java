package xyz.lidaning.jxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.lidaning.jxc.domain.JxcTrdChklist;
import xyz.lidaning.jxc.mapper.JxcTrdChklistMapper;
import xyz.lidaning.jxc.service.IJxcTrdChklistService;

import java.util.List;
import java.util.UUID;

/**
 * 盘点信息详情Service业务层处理
 *
 * @date 2021-02-23
 */
@Service
public class JxcTrdChklistServiceImpl implements IJxcTrdChklistService
{
    @Autowired
    private JxcTrdChklistMapper jxcTrdChklistMapper;

    /**
     * 查询盘点信息详情
     *
     * @param id 盘点信息详情ID
     * @return 盘点信息详情
     */
    @Override
    public JxcTrdChklist selectJxcTrdChklistById(String id)
    {
        return jxcTrdChklistMapper.selectJxcTrdChklistById(id);
    }

    /**
     * 查询盘点信息详情列表
     *
     * @param jxcTrdChklist 盘点信息详情
     * @return 盘点信息详情
     */
    @Override
    public List<JxcTrdChklist> selectJxcTrdChklistList(JxcTrdChklist jxcTrdChklist)
    {
        return jxcTrdChklistMapper.selectJxcTrdChklistList(jxcTrdChklist);
    }

    /**
     * 新增盘点信息详情
     *
     * @param jxcTrdChklist 盘点信息详情
     * @return 结果
     */
    @Override
    public int insertJxcTrdChklist(JxcTrdChklist jxcTrdChklist)
    {
        if (!StringUtils.hasLength(jxcTrdChklist.getId()))
        {
            jxcTrdChklist.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return jxcTrdChklistMapper.insertJxcTrdChklist(jxcTrdChklist);
    }

    /**
     * 修改盘点信息详情
     *
     * @param jxcTrdChklist 盘点信息详情
     * @return 结果
     */
    @Override
    public int updateJxcTrdChklist(JxcTrdChklist jxcTrdChklist)
    {
        return jxcTrdChklistMapper.updateJxcTrdChklist(jxcTrdChklist);
    }

    /**
     * 批量删除盘点信息详情
     *
     * @param ids 需要删除的盘点信息详情ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdChklistByIds(String[] ids)
    {
        return jxcTrdChklistMapper.deleteJxcTrdChklistByIds(ids);
    }

    /**
     * 删除盘点信息详情信息
     *
     * @param id 盘点信息详情ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdChklistById(String id)
    {
        return jxcTrdChklistMapper.deleteJxcTrdChklistById(id);
    }
    /**
     * 返回查询盘点信息详情总量
     *
     * @param jxcTrdChklist 盘点信息详情
     * @return 盘点信息详情查询总量
     */
    @Override
    public Integer selectJxcTrdChklistCount(JxcTrdChklist jxcTrdChklist)
    {
        return jxcTrdChklistMapper.selectJxcTrdChklistCount(jxcTrdChklist);
    }
}
