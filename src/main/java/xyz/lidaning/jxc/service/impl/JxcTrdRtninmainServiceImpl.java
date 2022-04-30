package xyz.lidaning.jxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.lidaning.jxc.domain.JxcTrdRtninmain;
import xyz.lidaning.jxc.mapper.JxcTrdRtninmainMapper;
import xyz.lidaning.jxc.service.IJxcTrdRtninmainService;

import java.util.List;
import java.util.UUID;

/**
 * 退回入库信息Service业务层处理
 *
 * @date 2021-02-23
 */
@Service
public class JxcTrdRtninmainServiceImpl implements IJxcTrdRtninmainService
{
    @Autowired
    private JxcTrdRtninmainMapper jxcTrdRtninmainMapper;

    /**
     * 查询退回入库信息
     *
     * @param id 退回入库信息ID
     * @return 退回入库信息
     */
    @Override
    public JxcTrdRtninmain selectJxcTrdRtninmainById(String id)
    {
        return jxcTrdRtninmainMapper.selectJxcTrdRtninmainById(id);
    }

    /**
     * 查询退回入库信息列表
     *
     * @param jxcTrdRtninmain 退回入库信息
     * @return 退回入库信息
     */
    @Override
    public List<JxcTrdRtninmain> selectJxcTrdRtninmainList(JxcTrdRtninmain jxcTrdRtninmain)
    {
        return jxcTrdRtninmainMapper.selectJxcTrdRtninmainList(jxcTrdRtninmain);
    }

    /**
     * 新增退回入库信息
     *
     * @param jxcTrdRtninmain 退回入库信息
     * @return 结果
     */
    @Override
    public int insertJxcTrdRtninmain(JxcTrdRtninmain jxcTrdRtninmain)
    {
        if (!StringUtils.hasLength(jxcTrdRtninmain.getId()))
        {
            jxcTrdRtninmain.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return jxcTrdRtninmainMapper.insertJxcTrdRtninmain(jxcTrdRtninmain);
    }

    /**
     * 修改退回入库信息
     *
     * @param jxcTrdRtninmain 退回入库信息
     * @return 结果
     */
    @Override
    public int updateJxcTrdRtninmain(JxcTrdRtninmain jxcTrdRtninmain)
    {
        return jxcTrdRtninmainMapper.updateJxcTrdRtninmain(jxcTrdRtninmain);
    }

    /**
     * 批量删除退回入库信息
     *
     * @param ids 需要删除的退回入库信息ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdRtninmainByIds(String[] ids)
    {
        return jxcTrdRtninmainMapper.deleteJxcTrdRtninmainByIds(ids);
    }

    /**
     * 删除退回入库信息信息
     *
     * @param id 退回入库信息ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdRtninmainById(String id)
    {
        return jxcTrdRtninmainMapper.deleteJxcTrdRtninmainById(id);
    }
    /**
     * 返回查询退回入库信息总量
     *
     * @param jxcTrdRtninmain 退回入库信息
     * @return 退回入库信息查询总量
     */
    @Override
    public Integer selectJxcTrdRtninmainCount(JxcTrdRtninmain jxcTrdRtninmain)
    {
        return jxcTrdRtninmainMapper.selectJxcTrdRtninmainCount(jxcTrdRtninmain);
    }
}
