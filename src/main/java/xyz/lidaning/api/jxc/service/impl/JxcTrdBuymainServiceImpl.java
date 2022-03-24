package xyz.lidaning.api.jxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.lidaning.api.jxc.domain.JxcTrdBuymain;
import xyz.lidaning.api.jxc.mapper.JxcTrdBuymainMapper;
import xyz.lidaning.api.jxc.service.IJxcTrdBuymainService;

import java.util.List;
import java.util.UUID;

/**
 * jxcTrdBuymainService业务层处理
 *
 * @date 2021-02-23
 */
@Service
public class JxcTrdBuymainServiceImpl implements IJxcTrdBuymainService
{
    @Autowired
    private JxcTrdBuymainMapper jxcTrdBuymainMapper;

    /**
     * 查询jxcTrdBuymain
     *
     * @param id jxcTrdBuymainID
     * @return jxcTrdBuymain
     */
    @Override
    public JxcTrdBuymain selectJxcTrdBuymainById(String id)
    {
        return jxcTrdBuymainMapper.selectJxcTrdBuymainById(id);
    }

    /**
     * 查询jxcTrdBuymain列表
     *
     * @param jxcTrdBuymain jxcTrdBuymain
     * @return jxcTrdBuymain
     */
    @Override
    public List<JxcTrdBuymain> selectJxcTrdBuymainList(JxcTrdBuymain jxcTrdBuymain)
    {
        return jxcTrdBuymainMapper.selectJxcTrdBuymainList(jxcTrdBuymain);
    }

    /**
     * 新增jxcTrdBuymain
     *
     * @param jxcTrdBuymain jxcTrdBuymain
     * @return 结果
     */
    @Override
    public int insertJxcTrdBuymain(JxcTrdBuymain jxcTrdBuymain)
    {
        if (!StringUtils.hasLength(jxcTrdBuymain.getId()))
        {
            jxcTrdBuymain.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return jxcTrdBuymainMapper.insertJxcTrdBuymain(jxcTrdBuymain);
    }

    /**
     * 修改jxcTrdBuymain
     *
     * @param jxcTrdBuymain jxcTrdBuymain
     * @return 结果
     */
    @Override
    public int updateJxcTrdBuymain(JxcTrdBuymain jxcTrdBuymain)
    {
        return jxcTrdBuymainMapper.updateJxcTrdBuymain(jxcTrdBuymain);
    }

    /**
     * 批量删除jxcTrdBuymain
     *
     * @param ids 需要删除的jxcTrdBuymainID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdBuymainByIds(String[] ids)
    {
        return jxcTrdBuymainMapper.deleteJxcTrdBuymainByIds(ids);
    }

    /**
     * 删除jxcTrdBuymain信息
     *
     * @param id jxcTrdBuymainID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdBuymainById(String id)
    {
        return jxcTrdBuymainMapper.deleteJxcTrdBuymainById(id);
    }
    /**
     * 返回查询jxcTrdBuymain总量
     *
     * @param jxcTrdBuymain jxcTrdBuymain
     * @return jxcTrdBuymain查询总量
     */
    @Override
    public Integer selectJxcTrdBuymainCount(JxcTrdBuymain jxcTrdBuymain)
    {
        return jxcTrdBuymainMapper.selectJxcTrdBuymainCount(jxcTrdBuymain);
    }
}
