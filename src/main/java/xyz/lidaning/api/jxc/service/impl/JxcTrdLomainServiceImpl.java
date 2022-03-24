package xyz.lidaning.api.jxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.lidaning.api.jxc.domain.JxcTrdLomain;
import xyz.lidaning.api.jxc.mapper.JxcTrdLomainMapper;
import xyz.lidaning.api.jxc.service.IJxcTrdLomainService;

import java.util.List;
import java.util.UUID;

/**
 * 损益信息Service业务层处理
 *
 * @date 2021-02-23
 */
@Service
public class JxcTrdLomainServiceImpl implements IJxcTrdLomainService
{
    @Autowired
    private JxcTrdLomainMapper jxcTrdLomainMapper;

    /**
     * 查询损益信息
     *
     * @param id 损益信息ID
     * @return 损益信息
     */
    @Override
    public JxcTrdLomain selectJxcTrdLomainById(String id)
    {
        return jxcTrdLomainMapper.selectJxcTrdLomainById(id);
    }

    /**
     * 查询损益信息列表
     *
     * @param jxcTrdLomain 损益信息
     * @return 损益信息
     */
    @Override
    public List<JxcTrdLomain> selectJxcTrdLomainList(JxcTrdLomain jxcTrdLomain)
    {
        return jxcTrdLomainMapper.selectJxcTrdLomainList(jxcTrdLomain);
    }

    /**
     * 新增损益信息
     *
     * @param jxcTrdLomain 损益信息
     * @return 结果
     */
    @Override
    public int insertJxcTrdLomain(JxcTrdLomain jxcTrdLomain)
    {
        if (!StringUtils.hasLength(jxcTrdLomain.getId()))
        {
            jxcTrdLomain.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return jxcTrdLomainMapper.insertJxcTrdLomain(jxcTrdLomain);
    }

    /**
     * 修改损益信息
     *
     * @param jxcTrdLomain 损益信息
     * @return 结果
     */
    @Override
    public int updateJxcTrdLomain(JxcTrdLomain jxcTrdLomain)
    {
        return jxcTrdLomainMapper.updateJxcTrdLomain(jxcTrdLomain);
    }

    /**
     * 批量删除损益信息
     *
     * @param ids 需要删除的损益信息ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdLomainByIds(String[] ids)
    {
        return jxcTrdLomainMapper.deleteJxcTrdLomainByIds(ids);
    }

    /**
     * 删除损益信息信息
     *
     * @param id 损益信息ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdLomainById(String id)
    {
        return jxcTrdLomainMapper.deleteJxcTrdLomainById(id);
    }
    /**
     * 返回查询损益信息总量
     *
     * @param jxcTrdLomain 损益信息
     * @return 损益信息查询总量
     */
    @Override
    public Integer selectJxcTrdLomainCount(JxcTrdLomain jxcTrdLomain)
    {
        return jxcTrdLomainMapper.selectJxcTrdLomainCount(jxcTrdLomain);
    }
}
