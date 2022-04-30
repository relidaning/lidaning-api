package xyz.lidaning.jxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.lidaning.jxc.domain.JxcGspDrugrecallmain;
import xyz.lidaning.jxc.mapper.JxcGspDrugrecallmainMapper;
import xyz.lidaning.jxc.service.IJxcGspDrugrecallmainService;

import java.util.List;
import java.util.UUID;

/**
 * 召回信息Service业务层处理
 *
 * @date 2021-02-23
 */
@Service
public class JxcGspDrugrecallmainServiceImpl implements IJxcGspDrugrecallmainService
{
    @Autowired
    private JxcGspDrugrecallmainMapper jxcGspDrugrecallmainMapper;

    /**
     * 查询召回信息
     *
     * @param id 召回信息ID
     * @return 召回信息
     */
    @Override
    public JxcGspDrugrecallmain selectJxcGspDrugrecallmainById(String id)
    {
        return jxcGspDrugrecallmainMapper.selectJxcGspDrugrecallmainById(id);
    }

    /**
     * 查询召回信息列表
     *
     * @param jxcGspDrugrecallmain 召回信息
     * @return 召回信息
     */
    @Override
    public List<JxcGspDrugrecallmain> selectJxcGspDrugrecallmainList(JxcGspDrugrecallmain jxcGspDrugrecallmain)
    {
        return jxcGspDrugrecallmainMapper.selectJxcGspDrugrecallmainList(jxcGspDrugrecallmain);
    }

    /**
     * 新增召回信息
     *
     * @param jxcGspDrugrecallmain 召回信息
     * @return 结果
     */
    @Override
    public int insertJxcGspDrugrecallmain(JxcGspDrugrecallmain jxcGspDrugrecallmain)
    {
        if (!StringUtils.hasLength(jxcGspDrugrecallmain.getId()))
        {
            jxcGspDrugrecallmain.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return jxcGspDrugrecallmainMapper.insertJxcGspDrugrecallmain(jxcGspDrugrecallmain);
    }

    /**
     * 修改召回信息
     *
     * @param jxcGspDrugrecallmain 召回信息
     * @return 结果
     */
    @Override
    public int updateJxcGspDrugrecallmain(JxcGspDrugrecallmain jxcGspDrugrecallmain)
    {
        return jxcGspDrugrecallmainMapper.updateJxcGspDrugrecallmain(jxcGspDrugrecallmain);
    }

    /**
     * 批量删除召回信息
     *
     * @param ids 需要删除的召回信息ID
     * @return 结果
     */
    @Override
    public int deleteJxcGspDrugrecallmainByIds(String[] ids)
    {
        return jxcGspDrugrecallmainMapper.deleteJxcGspDrugrecallmainByIds(ids);
    }

    /**
     * 删除召回信息信息
     *
     * @param id 召回信息ID
     * @return 结果
     */
    @Override
    public int deleteJxcGspDrugrecallmainById(String id)
    {
        return jxcGspDrugrecallmainMapper.deleteJxcGspDrugrecallmainById(id);
    }
    /**
     * 返回查询召回信息总量
     *
     * @param jxcGspDrugrecallmain 召回信息
     * @return 召回信息查询总量
     */
    @Override
    public Integer selectJxcGspDrugrecallmainCount(JxcGspDrugrecallmain jxcGspDrugrecallmain)
    {
        return jxcGspDrugrecallmainMapper.selectJxcGspDrugrecallmainCount(jxcGspDrugrecallmain);
    }
}
