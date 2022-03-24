package xyz.lidaning.api.jxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.lidaning.api.jxc.domain.JxcGoodBatch;
import xyz.lidaning.api.jxc.mapper.JxcGoodBatchMapper;
import xyz.lidaning.api.jxc.service.IJxcGoodBatchService;

import java.util.List;
import java.util.UUID;

/**
 * 批次库存Service业务层处理
 *
 * @date 2021-02-23
 */
@Service
public class JxcGoodBatchServiceImpl implements IJxcGoodBatchService
{
    @Autowired
    private JxcGoodBatchMapper jxcGoodBatchMapper;

    /**
     * 查询批次库存
     *
     * @param id 批次库存ID
     * @return 批次库存
     */
    @Override
    public JxcGoodBatch selectJxcGoodBatchById(Long id)
    {
        return jxcGoodBatchMapper.selectJxcGoodBatchById(id);
    }

    /**
     * 查询批次库存列表
     *
     * @param jxcGoodBatch 批次库存
     * @return 批次库存
     */
    @Override
    public List<JxcGoodBatch> selectJxcGoodBatchList(JxcGoodBatch jxcGoodBatch)
    {
        return jxcGoodBatchMapper.selectJxcGoodBatchList(jxcGoodBatch);
    }

    /**
     * 新增批次库存
     *
     * @param jxcGoodBatch 批次库存
     * @return 结果
     */
    @Override
    public int insertJxcGoodBatch(JxcGoodBatch jxcGoodBatch)
    {
        if (!StringUtils.hasLength(jxcGoodBatch.getId()))
        {
            jxcGoodBatch.setId(UUID.randomUUID().toString().replaceAll("-", "").toString());
        }
        return jxcGoodBatchMapper.insertJxcGoodBatch(jxcGoodBatch);
    }

    /**
     * 修改批次库存
     *
     * @param jxcGoodBatch 批次库存
     * @return 结果
     */
    @Override
    public int updateJxcGoodBatch(JxcGoodBatch jxcGoodBatch)
    {
        return jxcGoodBatchMapper.updateJxcGoodBatch(jxcGoodBatch);
    }

    /**
     * 批量删除批次库存
     *
     * @param ids 需要删除的批次库存ID
     * @return 结果
     */
    @Override
    public int deleteJxcGoodBatchByIds(Long[] ids)
    {
        return jxcGoodBatchMapper.deleteJxcGoodBatchByIds(ids);
    }

    /**
     * 删除批次库存信息
     *
     * @param id 批次库存ID
     * @return 结果
     */
    @Override
    public int deleteJxcGoodBatchById(Long id)
    {
        return jxcGoodBatchMapper.deleteJxcGoodBatchById(id);
    }
    /**
     * 返回查询批次库存总量
     *
     * @param jxcGoodBatch 批次库存
     * @return 批次库存查询总量
     */
    @Override
    public Integer selectJxcGoodBatchCount(JxcGoodBatch jxcGoodBatch)
    {
        return jxcGoodBatchMapper.selectJxcGoodBatchCount(jxcGoodBatch);
    }
}
