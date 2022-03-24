package xyz.lidaning.api.jxc.mapper;

import xyz.lidaning.api.jxc.domain.JxcTrdRtninmain;

import java.util.List;

/**
 * 退回入库信息Mapper接口
 *
 * @date 2021-02-23
 */
public interface JxcTrdRtninmainMapper
{
    /**
     * 查询退回入库信息
     *
     * @param id 退回入库信息ID
     * @return 退回入库信息
     */
    public JxcTrdRtninmain selectJxcTrdRtninmainById(String id);

    /**
     * 查询退回入库信息列表
     *
     * @param jxcTrdRtninmain 退回入库信息
     * @return 退回入库信息集合
     */
    public List<JxcTrdRtninmain> selectJxcTrdRtninmainList(JxcTrdRtninmain jxcTrdRtninmain);

    /**
     * 新增退回入库信息
     *
     * @param jxcTrdRtninmain 退回入库信息
     * @return 结果
     */
    public int insertJxcTrdRtninmain(JxcTrdRtninmain jxcTrdRtninmain);

    /**
     * 修改退回入库信息
     *
     * @param jxcTrdRtninmain 退回入库信息
     * @return 结果
     */
    public int updateJxcTrdRtninmain(JxcTrdRtninmain jxcTrdRtninmain);

    /**
     * 修改退回入库信息
     *
     * @param jxcTrdRtninmain 退回入库信息
     * @return 结果
     */
    public int updateJxcTrdRtninmainByPrimaryKey(JxcTrdRtninmain jxcTrdRtninmain);

    /**
     * 删除退回入库信息
     *
     * @param id 退回入库信息ID
     * @return 结果
     */
    public int deleteJxcTrdRtninmainById(String id);

    /**
     * 批量删除退回入库信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJxcTrdRtninmainByIds(String[] ids);


    /**
     * 返回查询退回入库信息总量
     *
     * @param jxcTrdRtninmain 退回入库信息
     * @return 退回入库信息查询总量
     */
    public Integer selectJxcTrdRtninmainCount(JxcTrdRtninmain jxcTrdRtninmain);
}
