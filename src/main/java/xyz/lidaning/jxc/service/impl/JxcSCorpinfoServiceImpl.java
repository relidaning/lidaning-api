package xyz.lidaning.jxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.lidaning.jxc.domain.JxcSCorpinfo;
import xyz.lidaning.jxc.mapper.JxcSCorpinfoMapper;
import xyz.lidaning.jxc.service.IJxcSCorpinfoService;

import java.util.List;
import java.util.UUID;

/**
 * jxcSCorpinfoService业务层处理
 *
 * @date 2021-02-23
 */
@Service
public class JxcSCorpinfoServiceImpl implements IJxcSCorpinfoService
{
    @Autowired
    private JxcSCorpinfoMapper jxcSCorpinfoMapper;

    /**
     * 查询jxcSCorpinfo
     *
     * @param id jxcSCorpinfoID
     * @return jxcSCorpinfo
     */
    @Override
    public JxcSCorpinfo selectJxcSCorpinfoById(String id)
    {
        return jxcSCorpinfoMapper.selectJxcSCorpinfoById(id);
    }

    /**
     * 查询jxcSCorpinfo列表
     *
     * @param jxcSCorpinfo jxcSCorpinfo
     * @return jxcSCorpinfo
     */
    @Override
    public List<JxcSCorpinfo> selectJxcSCorpinfoList(JxcSCorpinfo jxcSCorpinfo)
    {
        return jxcSCorpinfoMapper.selectJxcSCorpinfoList(jxcSCorpinfo);
    }

    /**
     * 新增jxcSCorpinfo
     *
     * @param jxcSCorpinfo jxcSCorpinfo
     * @return 结果
     */
    @Override
    public int insertJxcSCorpinfo(JxcSCorpinfo jxcSCorpinfo)
    {
        if (!StringUtils.hasLength(jxcSCorpinfo.getId()))
        {
            jxcSCorpinfo.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return jxcSCorpinfoMapper.insertJxcSCorpinfo(jxcSCorpinfo);
    }

    /**
     * 修改jxcSCorpinfo
     *
     * @param jxcSCorpinfo jxcSCorpinfo
     * @return 结果
     */
    @Override
    public int updateJxcSCorpinfo(JxcSCorpinfo jxcSCorpinfo)
    {
        return jxcSCorpinfoMapper.updateJxcSCorpinfo(jxcSCorpinfo);
    }

    /**
     * 批量删除jxcSCorpinfo
     *
     * @param ids 需要删除的jxcSCorpinfoID
     * @return 结果
     */
    @Override
    public int deleteJxcSCorpinfoByIds(String[] ids)
    {
        return jxcSCorpinfoMapper.deleteJxcSCorpinfoByIds(ids);
    }

    /**
     * 删除jxcSCorpinfo信息
     *
     * @param id jxcSCorpinfoID
     * @return 结果
     */
    @Override
    public int deleteJxcSCorpinfoById(String id)
    {
        return jxcSCorpinfoMapper.deleteJxcSCorpinfoById(id);
    }
    /**
     * 返回查询jxcSCorpinfo总量
     *
     * @param jxcSCorpinfo jxcSCorpinfo
     * @return jxcSCorpinfo查询总量
     */
    @Override
    public Integer selectJxcSCorpinfoCount(JxcSCorpinfo jxcSCorpinfo)
    {
        return jxcSCorpinfoMapper.selectJxcSCorpinfoCount(jxcSCorpinfo);
    }
}
