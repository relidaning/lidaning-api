package xyz.lidaning.jxc.mapper;

import xyz.lidaning.jxc.domain.JxcTrdRtninlist;

import java.util.List;

/**
 * 退回入库详情Mapper接口
 *
 * @date 2021-02-23
 */
public interface JxcTrdRtninlistMapper
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
     * 修改退回入库详情
     *
     * @param jxcTrdRtninlist 退回入库详情
     * @return 结果
     */
    public int updateJxcTrdRtninlistByPrimaryKey(JxcTrdRtninlist jxcTrdRtninlist);

    /**
     * 删除退回入库详情
     *
     * @param id 退回入库详情ID
     * @return 结果
     */
    public int deleteJxcTrdRtninlistById(String id);

    /**
     * 批量删除退回入库详情
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJxcTrdRtninlistByIds(String[] ids);


    /**
     * 返回查询退回入库详情总量
     *
     * @param jxcTrdRtninlist 退回入库详情
     * @return 退回入库详情查询总量
     */
    public Integer selectJxcTrdRtninlistCount(JxcTrdRtninlist jxcTrdRtninlist);
}
