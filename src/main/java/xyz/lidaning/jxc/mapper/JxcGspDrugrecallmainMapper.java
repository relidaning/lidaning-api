package xyz.lidaning.jxc.mapper;

import xyz.lidaning.jxc.domain.JxcGspDrugrecallmain;

import java.util.List;

/**
 * 召回信息Mapper接口
 *
 * @date 2021-02-23
 */
public interface JxcGspDrugrecallmainMapper
{
    /**
     * 查询召回信息
     *
     * @param id 召回信息ID
     * @return 召回信息
     */
    public JxcGspDrugrecallmain selectJxcGspDrugrecallmainById(String id);

    /**
     * 查询召回信息列表
     *
     * @param jxcGspDrugrecallmain 召回信息
     * @return 召回信息集合
     */
    public List<JxcGspDrugrecallmain> selectJxcGspDrugrecallmainList(JxcGspDrugrecallmain jxcGspDrugrecallmain);

    /**
     * 新增召回信息
     *
     * @param jxcGspDrugrecallmain 召回信息
     * @return 结果
     */
    public int insertJxcGspDrugrecallmain(JxcGspDrugrecallmain jxcGspDrugrecallmain);

    /**
     * 修改召回信息
     *
     * @param jxcGspDrugrecallmain 召回信息
     * @return 结果
     */
    public int updateJxcGspDrugrecallmain(JxcGspDrugrecallmain jxcGspDrugrecallmain);

    /**
     * 修改召回信息
     *
     * @param jxcGspDrugrecallmain 召回信息
     * @return 结果
     */
    public int updateJxcGspDrugrecallmainByPrimaryKey(JxcGspDrugrecallmain jxcGspDrugrecallmain);

    /**
     * 删除召回信息
     *
     * @param id 召回信息ID
     * @return 结果
     */
    public int deleteJxcGspDrugrecallmainById(String id);

    /**
     * 批量删除召回信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJxcGspDrugrecallmainByIds(String[] ids);


    /**
     * 返回查询召回信息总量
     *
     * @param jxcGspDrugrecallmain 召回信息
     * @return 召回信息查询总量
     */
    public Integer selectJxcGspDrugrecallmainCount(JxcGspDrugrecallmain jxcGspDrugrecallmain);
}
