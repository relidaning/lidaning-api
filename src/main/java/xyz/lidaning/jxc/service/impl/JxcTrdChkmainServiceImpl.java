package xyz.lidaning.jxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.lidaning.jxc.domain.JxcTrdChkmain;
import xyz.lidaning.jxc.mapper.JxcTrdChkmainMapper;
import xyz.lidaning.jxc.service.IJxcTrdChkmainService;

import java.util.List;
import java.util.UUID;

/**
 * 盘点信息Service业务层处理
 *
 * @date 2021-02-23
 */
@Service
public class JxcTrdChkmainServiceImpl implements IJxcTrdChkmainService
{
    @Autowired
    private JxcTrdChkmainMapper jxcTrdChkmainMapper;

    /**
     * 查询盘点信息
     *
     * @param id 盘点信息ID
     * @return 盘点信息
     */
    @Override
    public JxcTrdChkmain selectJxcTrdChkmainById(String id)
    {
        return jxcTrdChkmainMapper.selectJxcTrdChkmainById(id);
    }

    /**
     * 查询盘点信息列表
     *
     * @param jxcTrdChkmain 盘点信息
     * @return 盘点信息
     */
    @Override
    public List<JxcTrdChkmain> selectJxcTrdChkmainList(JxcTrdChkmain jxcTrdChkmain)
    {
        return jxcTrdChkmainMapper.selectJxcTrdChkmainList(jxcTrdChkmain);
    }

    /**
     * 新增盘点信息
     *
     * @param jxcTrdChkmain 盘点信息
     * @return 结果
     */
    @Override
    public int insertJxcTrdChkmain(JxcTrdChkmain jxcTrdChkmain)
    {
        if (!StringUtils.hasLength(jxcTrdChkmain.getId()))
        {
            jxcTrdChkmain.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return jxcTrdChkmainMapper.insertJxcTrdChkmain(jxcTrdChkmain);
    }

    /**
     * 修改盘点信息
     *
     * @param jxcTrdChkmain 盘点信息
     * @return 结果
     */
    @Override
    public int updateJxcTrdChkmain(JxcTrdChkmain jxcTrdChkmain)
    {
        return jxcTrdChkmainMapper.updateJxcTrdChkmain(jxcTrdChkmain);
    }

    /**
     * 批量删除盘点信息
     *
     * @param ids 需要删除的盘点信息ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdChkmainByIds(String[] ids)
    {
        return jxcTrdChkmainMapper.deleteJxcTrdChkmainByIds(ids);
    }

    /**
     * 删除盘点信息信息
     *
     * @param id 盘点信息ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdChkmainById(String id)
    {
        return jxcTrdChkmainMapper.deleteJxcTrdChkmainById(id);
    }
    /**
     * 返回查询盘点信息总量
     *
     * @param jxcTrdChkmain 盘点信息
     * @return 盘点信息查询总量
     */
    @Override
    public Integer selectJxcTrdChkmainCount(JxcTrdChkmain jxcTrdChkmain)
    {
        return jxcTrdChkmainMapper.selectJxcTrdChkmainCount(jxcTrdChkmain);
    }
}
