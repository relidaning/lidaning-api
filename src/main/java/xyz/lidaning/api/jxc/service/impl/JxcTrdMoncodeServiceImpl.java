package xyz.lidaning.api.jxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.lidaning.api.jxc.domain.JxcTrdMoncode;
import xyz.lidaning.api.jxc.mapper.JxcTrdMoncodeMapper;
import xyz.lidaning.api.jxc.service.IJxcTrdMoncodeService;

import java.util.List;
import java.util.UUID;

/**
 * jxcTrdMoncodeService业务层处理
 *
 * @date 2021-02-23
 */
@Service
public class JxcTrdMoncodeServiceImpl implements IJxcTrdMoncodeService
{
    @Autowired
    private JxcTrdMoncodeMapper jxcTrdMoncodeMapper;

    /**
     * 查询jxcTrdMoncode
     *
     * @param id jxcTrdMoncodeID
     * @return jxcTrdMoncode
     */
    @Override
    public JxcTrdMoncode selectJxcTrdMoncodeById(String id)
    {
        return jxcTrdMoncodeMapper.selectJxcTrdMoncodeById(id);
    }

    /**
     * 查询jxcTrdMoncode列表
     *
     * @param jxcTrdMoncode jxcTrdMoncode
     * @return jxcTrdMoncode
     */
    @Override
    public List<JxcTrdMoncode> selectJxcTrdMoncodeList(JxcTrdMoncode jxcTrdMoncode)
    {
        return jxcTrdMoncodeMapper.selectJxcTrdMoncodeList(jxcTrdMoncode);
    }

    /**
     * 新增jxcTrdMoncode
     *
     * @param jxcTrdMoncode jxcTrdMoncode
     * @return 结果
     */
    @Override
    public int insertJxcTrdMoncode(JxcTrdMoncode jxcTrdMoncode)
    {
        if (!StringUtils.hasLength(jxcTrdMoncode.getId()))
        {
            jxcTrdMoncode.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return jxcTrdMoncodeMapper.insertJxcTrdMoncode(jxcTrdMoncode);
    }

    /**
     * 修改jxcTrdMoncode
     *
     * @param jxcTrdMoncode jxcTrdMoncode
     * @return 结果
     */
    @Override
    public int updateJxcTrdMoncode(JxcTrdMoncode jxcTrdMoncode)
    {
        return jxcTrdMoncodeMapper.updateJxcTrdMoncode(jxcTrdMoncode);
    }

    /**
     * 批量删除jxcTrdMoncode
     *
     * @param ids 需要删除的jxcTrdMoncodeID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdMoncodeByIds(String[] ids)
    {
        return jxcTrdMoncodeMapper.deleteJxcTrdMoncodeByIds(ids);
    }

    /**
     * 删除jxcTrdMoncode信息
     *
     * @param id jxcTrdMoncodeID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdMoncodeById(String id)
    {
        return jxcTrdMoncodeMapper.deleteJxcTrdMoncodeById(id);
    }
    /**
     * 返回查询jxcTrdMoncode总量
     *
     * @param jxcTrdMoncode jxcTrdMoncode
     * @return jxcTrdMoncode查询总量
     */
    @Override
    public Integer selectJxcTrdMoncodeCount(JxcTrdMoncode jxcTrdMoncode)
    {
        return jxcTrdMoncodeMapper.selectJxcTrdMoncodeCount(jxcTrdMoncode);
    }
}
