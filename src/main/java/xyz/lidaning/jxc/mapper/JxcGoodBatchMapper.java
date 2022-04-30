package xyz.lidaning.jxc.mapper;

import xyz.lidaning.jxc.domain.JxcGoodBatch;

import java.util.List;

/**
 * 批次库存Mapper接口
 *
 * @date 2021-02-23
 */
public interface JxcGoodBatchMapper
{
    /**
     * 查询批次库存
     *
     * @param id 批次库存ID
     * @return 批次库存
     */
    public JxcGoodBatch selectJxcGoodBatchById(Long id);

    /**
     * 查询批次库存列表
     *
     * @param jxcGoodBatch 批次库存
     * @return 批次库存集合
     */
    public List<JxcGoodBatch> selectJxcGoodBatchList(JxcGoodBatch jxcGoodBatch);

    /**
     * 新增批次库存
     *
     * @param jxcGoodBatch 批次库存
     * @return 结果
     */
    public int insertJxcGoodBatch(JxcGoodBatch jxcGoodBatch);

    /**
     * 修改批次库存
     *
     * @param jxcGoodBatch 批次库存
     * @return 结果
     */
    public int updateJxcGoodBatch(JxcGoodBatch jxcGoodBatch);

    /**
     * 修改批次库存
     *
     * @param jxcGoodBatch 批次库存
     * @return 结果
     */
    public int updateJxcGoodBatchByPrimaryKey(JxcGoodBatch jxcGoodBatch);

    /**
     * 删除批次库存
     *
     * @param id 批次库存ID
     * @return 结果
     */
    public int deleteJxcGoodBatchById(Long id);

    /**
     * 批量删除批次库存
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJxcGoodBatchByIds(Long[] ids);


    /**
     * 返回查询批次库存总量
     *
     * @param jxcGoodBatch 批次库存
     * @return 批次库存查询总量
     */
    public Integer selectJxcGoodBatchCount(JxcGoodBatch jxcGoodBatch);
}
