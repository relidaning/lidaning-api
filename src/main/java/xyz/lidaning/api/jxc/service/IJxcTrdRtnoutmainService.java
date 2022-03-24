package xyz.lidaning.api.jxc.service;

import xyz.lidaning.api.jxc.domain.JxcTrdRtnoutmain;

import java.util.List;

/**
 * 退回出库信息Service接口
 * @date 2021-02-23
 */
public interface IJxcTrdRtnoutmainService
{
    /**
     * 查询退回出库信息
     *
     * @param id 退回出库信息ID
     * @return 退回出库信息
     */
    public JxcTrdRtnoutmain selectJxcTrdRtnoutmainById(String id);

    /**
     * 查询退回出库信息列表
     *
     * @param jxcTrdRtnoutmain 退回出库信息
     * @return 退回出库信息集合
     */
    public List<JxcTrdRtnoutmain> selectJxcTrdRtnoutmainList(JxcTrdRtnoutmain jxcTrdRtnoutmain);

    /**
     * 新增退回出库信息
     *
     * @param jxcTrdRtnoutmain 退回出库信息
     * @return 结果
     */
    public int insertJxcTrdRtnoutmain(JxcTrdRtnoutmain jxcTrdRtnoutmain);

    /**
     * 修改退回出库信息
     *
     * @param jxcTrdRtnoutmain 退回出库信息
     * @return 结果
     */
    public int updateJxcTrdRtnoutmain(JxcTrdRtnoutmain jxcTrdRtnoutmain);

    /**
     * 批量删除退回出库信息
     *
     * @param ids 需要删除的退回出库信息ID
     * @return 结果
     */
    public int deleteJxcTrdRtnoutmainByIds(String[] ids);

    /**
     * 删除退回出库信息信息
     *
     * @param id 退回出库信息ID
     * @return 结果
     */
    public int deleteJxcTrdRtnoutmainById(String id);

    /**
     * 返回查询退回出库信息总量
     *
     * @param jxcTrdRtnoutmain 退回出库信息
     * @return 退回出库信息查询总量
     */
    public Integer selectJxcTrdRtnoutmainCount(JxcTrdRtnoutmain jxcTrdRtnoutmain);
}
