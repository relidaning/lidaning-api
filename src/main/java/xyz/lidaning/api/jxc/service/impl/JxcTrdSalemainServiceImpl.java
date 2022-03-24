package xyz.lidaning.api.jxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.lidaning.api.jxc.domain.JxcTrdSalemain;
import xyz.lidaning.api.jxc.mapper.JxcTrdSalemainMapper;
import xyz.lidaning.api.jxc.service.IJxcTrdSalemainService;

import java.util.List;
import java.util.UUID;

/**
 * 销售信息Service业务层处理
 *
 * @author hisicom
 * @date 2021-02-07
 */
@Service
public class JxcTrdSalemainServiceImpl implements IJxcTrdSalemainService
{
    @Autowired
    private JxcTrdSalemainMapper jxcTrdSalemainMapper;

    /**
     * 查询销售信息
     *
     * @param id 销售信息ID
     * @return 销售信息
     */
    @Override
    public JxcTrdSalemain selectJxcTrdSalemainById(String id)
    {
        return jxcTrdSalemainMapper.selectJxcTrdSalemainById(id);
    }

    /**
     * 查询销售信息列表
     *
     * @param jxcTrdSalemain 销售信息
     * @return 销售信息
     */
    @Override
    public List<JxcTrdSalemain> selectJxcTrdSalemainList(JxcTrdSalemain jxcTrdSalemain)
    {
        return jxcTrdSalemainMapper.selectJxcTrdSalemainList(jxcTrdSalemain);
    }

    /**
     * 新增销售信息
     *
     * @param jxcTrdSalemain 销售信息
     * @return 结果
     */
    @Override
    public int insertJxcTrdSalemain(JxcTrdSalemain jxcTrdSalemain)
    {
        if (!StringUtils.hasLength(jxcTrdSalemain.getId()))
        {
            jxcTrdSalemain.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return jxcTrdSalemainMapper.insertJxcTrdSalemain(jxcTrdSalemain);
    }

    /**
     * 修改销售信息
     *
     * @param jxcTrdSalemain 销售信息
     * @return 结果
     */
    @Override
    public int updateJxcTrdSalemain(JxcTrdSalemain jxcTrdSalemain)
    {
        return jxcTrdSalemainMapper.updateJxcTrdSalemain(jxcTrdSalemain);
    }

    /**
     * 批量删除销售信息
     *
     * @param ids 需要删除的销售信息ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdSalemainByIds(String[] ids)
    {
        return jxcTrdSalemainMapper.deleteJxcTrdSalemainByIds(ids);
    }

    /**
     * 删除销售信息信息
     *
     * @param id 销售信息ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdSalemainById(String id)
    {
        return jxcTrdSalemainMapper.deleteJxcTrdSalemainById(id);
    }
    /**
     * 返回查询销售信息总量
     *
     * @param jxcTrdSalemain 销售信息
     * @return 销售信息查询总量
     */
    @Override
    public Integer selectJxcTrdSalemainCount(JxcTrdSalemain jxcTrdSalemain)
    {
        return jxcTrdSalemainMapper.selectJxcTrdSalemainCount(jxcTrdSalemain);
    }


}
