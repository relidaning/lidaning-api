package xyz.lidaning.jxc.mapper;

import xyz.lidaning.jxc.domain.JxcGspDrugrecalllist;

import java.util.List;

/**
 * 召回详情Mapper接口
 *
 * @date 2021-02-23
 */
public interface JxcGspDrugrecalllistMapper
{
    /**
     * 查询召回详情
     *
     * @param id 召回详情ID
     * @return 召回详情
     */
    public JxcGspDrugrecalllist selectJxcGspDrugrecalllistById(String id);

    /**
     * 查询召回详情列表
     *
     * @param jxcGspDrugrecalllist 召回详情
     * @return 召回详情集合
     */
    public List<JxcGspDrugrecalllist> selectJxcGspDrugrecalllistList(JxcGspDrugrecalllist jxcGspDrugrecalllist);

    /**
     * 新增召回详情
     *
     * @param jxcGspDrugrecalllist 召回详情
     * @return 结果
     */
    public int insertJxcGspDrugrecalllist(JxcGspDrugrecalllist jxcGspDrugrecalllist);

    /**
     * 修改召回详情
     *
     * @param jxcGspDrugrecalllist 召回详情
     * @return 结果
     */
    public int updateJxcGspDrugrecalllist(JxcGspDrugrecalllist jxcGspDrugrecalllist);

    /**
     * 修改召回详情
     *
     * @param jxcGspDrugrecalllist 召回详情
     * @return 结果
     */
    public int updateJxcGspDrugrecalllistByPrimaryKey(JxcGspDrugrecalllist jxcGspDrugrecalllist);

    /**
     * 删除召回详情
     *
     * @param id 召回详情ID
     * @return 结果
     */
    public int deleteJxcGspDrugrecalllistById(String id);

    /**
     * 批量删除召回详情
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJxcGspDrugrecalllistByIds(String[] ids);


    /**
     * 返回查询召回详情总量
     *
     * @param jxcGspDrugrecalllist 召回详情
     * @return 召回详情查询总量
     */
    public Integer selectJxcGspDrugrecalllistCount(JxcGspDrugrecalllist jxcGspDrugrecalllist);
}
