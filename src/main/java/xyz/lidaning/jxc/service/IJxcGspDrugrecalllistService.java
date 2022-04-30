package xyz.lidaning.jxc.service;

import xyz.lidaning.jxc.domain.JxcGspDrugrecalllist;

import java.util.List;

/**
 * 召回详情Service接口
 * @date 2021-02-23
 */
public interface IJxcGspDrugrecalllistService
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
     * 批量删除召回详情
     *
     * @param ids 需要删除的召回详情ID
     * @return 结果
     */
    public int deleteJxcGspDrugrecalllistByIds(String[] ids);

    /**
     * 删除召回详情信息
     *
     * @param id 召回详情ID
     * @return 结果
     */
    public int deleteJxcGspDrugrecalllistById(String id);

    /**
     * 返回查询召回详情总量
     *
     * @param jxcGspDrugrecalllist 召回详情
     * @return 召回详情查询总量
     */
    public Integer selectJxcGspDrugrecalllistCount(JxcGspDrugrecalllist jxcGspDrugrecalllist);
}
