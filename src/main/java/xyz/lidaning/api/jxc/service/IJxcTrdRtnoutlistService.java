package xyz.lidaning.api.jxc.service;

import xyz.lidaning.api.jxc.domain.JxcTrdRtnoutlist;

import java.util.List;

/**
 * 退回出库详情Service接口
 * @date 2021-02-23
 */
public interface IJxcTrdRtnoutlistService
{
    /**
     * 查询退回出库详情
     *
     * @param id 退回出库详情ID
     * @return 退回出库详情
     */
    public JxcTrdRtnoutlist selectJxcTrdRtnoutlistById(String id);

    /**
     * 查询退回出库详情列表
     *
     * @param jxcTrdRtnoutlist 退回出库详情
     * @return 退回出库详情集合
     */
    public List<JxcTrdRtnoutlist> selectJxcTrdRtnoutlistList(JxcTrdRtnoutlist jxcTrdRtnoutlist);

    /**
     * 新增退回出库详情
     *
     * @param jxcTrdRtnoutlist 退回出库详情
     * @return 结果
     */
    public int insertJxcTrdRtnoutlist(JxcTrdRtnoutlist jxcTrdRtnoutlist);

    /**
     * 修改退回出库详情
     *
     * @param jxcTrdRtnoutlist 退回出库详情
     * @return 结果
     */
    public int updateJxcTrdRtnoutlist(JxcTrdRtnoutlist jxcTrdRtnoutlist);

    /**
     * 批量删除退回出库详情
     *
     * @param ids 需要删除的退回出库详情ID
     * @return 结果
     */
    public int deleteJxcTrdRtnoutlistByIds(String[] ids);

    /**
     * 删除退回出库详情信息
     *
     * @param id 退回出库详情ID
     * @return 结果
     */
    public int deleteJxcTrdRtnoutlistById(String id);

    /**
     * 返回查询退回出库详情总量
     *
     * @param jxcTrdRtnoutlist 退回出库详情
     * @return 退回出库详情查询总量
     */
    public Integer selectJxcTrdRtnoutlistCount(JxcTrdRtnoutlist jxcTrdRtnoutlist);
}
