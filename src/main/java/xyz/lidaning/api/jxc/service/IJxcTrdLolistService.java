package xyz.lidaning.api.jxc.service;

import xyz.lidaning.api.jxc.domain.JxcTrdLolist;

import java.util.List;

/**
 * jxcTrdLolistService接口
 * @date 2021-02-23
 */
public interface IJxcTrdLolistService
{
    /**
     * 查询jxcTrdLolist
     *
     * @param id jxcTrdLolistID
     * @return jxcTrdLolist
     */
    public JxcTrdLolist selectJxcTrdLolistById(String id);

    /**
     * 查询jxcTrdLolist列表
     *
     * @param jxcTrdLolist jxcTrdLolist
     * @return jxcTrdLolist集合
     */
    public List<JxcTrdLolist> selectJxcTrdLolistList(JxcTrdLolist jxcTrdLolist);

    /**
     * 新增jxcTrdLolist
     *
     * @param jxcTrdLolist jxcTrdLolist
     * @return 结果
     */
    public int insertJxcTrdLolist(JxcTrdLolist jxcTrdLolist);

    /**
     * 修改jxcTrdLolist
     *
     * @param jxcTrdLolist jxcTrdLolist
     * @return 结果
     */
    public int updateJxcTrdLolist(JxcTrdLolist jxcTrdLolist);

    /**
     * 批量删除jxcTrdLolist
     *
     * @param ids 需要删除的jxcTrdLolistID
     * @return 结果
     */
    public int deleteJxcTrdLolistByIds(String[] ids);

    /**
     * 删除jxcTrdLolist信息
     *
     * @param id jxcTrdLolistID
     * @return 结果
     */
    public int deleteJxcTrdLolistById(String id);

    /**
     * 返回查询jxcTrdLolist总量
     *
     * @param jxcTrdLolist jxcTrdLolist
     * @return jxcTrdLolist查询总量
     */
    public Integer selectJxcTrdLolistCount(JxcTrdLolist jxcTrdLolist);
}
