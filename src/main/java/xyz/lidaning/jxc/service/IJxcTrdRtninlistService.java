package xyz.lidaning.jxc.service;

import xyz.lidaning.jxc.domain.JxcTrdRtninlist;

import java.util.List;

/**
 * 退回入库详情Service接口
 * @date 2021-02-23
 */
public interface IJxcTrdRtninlistService
{
    /**
     * 查询退回入库详情
     *
     * @param id 退回入库详情ID
     * @return 退回入库详情
     */
    public JxcTrdRtninlist selectJxcTrdRtninlistById(String id);

    /**
     * 查询退回入库详情列表
     *
     * @param jxcTrdRtninlist 退回入库详情
     * @return 退回入库详情集合
     */
    public List<JxcTrdRtninlist> selectJxcTrdRtninlistList(JxcTrdRtninlist jxcTrdRtninlist);

    /**
     * 新增退回入库详情
     *
     * @param jxcTrdRtninlist 退回入库详情
     * @return 结果
     */
    public int insertJxcTrdRtninlist(JxcTrdRtninlist jxcTrdRtninlist);

    /**
     * 修改退回入库详情
     *
     * @param jxcTrdRtninlist 退回入库详情
     * @return 结果
     */
    public int updateJxcTrdRtninlist(JxcTrdRtninlist jxcTrdRtninlist);

    /**
     * 批量删除退回入库详情
     *
     * @param ids 需要删除的退回入库详情ID
     * @return 结果
     */
    public int deleteJxcTrdRtninlistByIds(String[] ids);

    /**
     * 删除退回入库详情信息
     *
     * @param id 退回入库详情ID
     * @return 结果
     */
    public int deleteJxcTrdRtninlistById(String id);

    /**
     * 返回查询退回入库详情总量
     *
     * @param jxcTrdRtninlist 退回入库详情
     * @return 退回入库详情查询总量
     */
    public Integer selectJxcTrdRtninlistCount(JxcTrdRtninlist jxcTrdRtninlist);
}
