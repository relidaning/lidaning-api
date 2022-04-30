package xyz.lidaning.jxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.lidaning.jxc.domain.JxcGoodBaseinfo;
import xyz.lidaning.jxc.mapper.JxcGoodBaseinfoMapper;
import xyz.lidaning.jxc.service.IJxcGoodBaseinfoService;

import java.util.List;
import java.util.UUID;

/**
 * 药品信息Service业务层处理
 *
 * @date 2021-02-23
 */
@Service
public class JxcGoodBaseinfoServiceImpl implements IJxcGoodBaseinfoService
{
    @Autowired
    private JxcGoodBaseinfoMapper jxcGoodBaseinfoMapper;

    /**
     * 查询药品信息
     *
     * @param id 药品信息ID
     * @return 药品信息
     */
    @Override
    public JxcGoodBaseinfo selectJxcGoodBaseinfoById(String id)
    {
        return jxcGoodBaseinfoMapper.selectJxcGoodBaseinfoById(id);
    }

    /**
     * 查询药品信息列表
     *
     * @param jxcGoodBaseinfo 药品信息
     * @return 药品信息
     */
    @Override
    public List<JxcGoodBaseinfo> selectJxcGoodBaseinfoList(JxcGoodBaseinfo jxcGoodBaseinfo)
    {
        return jxcGoodBaseinfoMapper.selectJxcGoodBaseinfoList(jxcGoodBaseinfo);
    }

    /**
     * 新增药品信息
     *
     * @param jxcGoodBaseinfo 药品信息
     * @return 结果
     */
    @Override
    public int insertJxcGoodBaseinfo(JxcGoodBaseinfo jxcGoodBaseinfo)
    {
        if (!StringUtils.hasLength(jxcGoodBaseinfo.getId()))
        {
            jxcGoodBaseinfo.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return jxcGoodBaseinfoMapper.insertJxcGoodBaseinfo(jxcGoodBaseinfo);
    }

    /**
     * 修改药品信息
     *
     * @param jxcGoodBaseinfo 药品信息
     * @return 结果
     */
    @Override
    public int updateJxcGoodBaseinfo(JxcGoodBaseinfo jxcGoodBaseinfo)
    {
        return jxcGoodBaseinfoMapper.updateJxcGoodBaseinfo(jxcGoodBaseinfo);
    }

    /**
     * 批量删除药品信息
     *
     * @param ids 需要删除的药品信息ID
     * @return 结果
     */
    @Override
    public int deleteJxcGoodBaseinfoByIds(String[] ids)
    {
        return jxcGoodBaseinfoMapper.deleteJxcGoodBaseinfoByIds(ids);
    }

    /**
     * 删除药品信息信息
     *
     * @param id 药品信息ID
     * @return 结果
     */
    @Override
    public int deleteJxcGoodBaseinfoById(String id)
    {
        return jxcGoodBaseinfoMapper.deleteJxcGoodBaseinfoById(id);
    }
    /**
     * 返回查询药品信息总量
     *
     * @param jxcGoodBaseinfo 药品信息
     * @return 药品信息查询总量
     */
    @Override
    public Integer selectJxcGoodBaseinfoCount(JxcGoodBaseinfo jxcGoodBaseinfo)
    {
        return jxcGoodBaseinfoMapper.selectJxcGoodBaseinfoCount(jxcGoodBaseinfo);
    }
}
