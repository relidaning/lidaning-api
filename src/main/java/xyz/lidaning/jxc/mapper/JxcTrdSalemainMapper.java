package xyz.lidaning.jxc.mapper;

import xyz.lidaning.jxc.domain.JxcTrdSalemain;

import java.util.List;

/**
 * 销售信息Mapper接口
 *
 * @date 2021-02-07
 */
public interface JxcTrdSalemainMapper
{
    /**
     * 查询销售信息
     *
     * @param id 销售信息ID
     * @return 销售信息
     */
    public JxcTrdSalemain selectJxcTrdSalemainById(String id);

    /**
     * 查询销售信息列表
     *
     * @param jxcTrdSalemain 销售信息
     * @return 销售信息集合
     */
    public List<JxcTrdSalemain> selectJxcTrdSalemainList(JxcTrdSalemain jxcTrdSalemain);

    /**
     * 新增销售信息
     *
     * @param jxcTrdSalemain 销售信息
     * @return 结果
     */
    public int insertJxcTrdSalemain(JxcTrdSalemain jxcTrdSalemain);

    /**
     * 修改销售信息
     *
     * @param jxcTrdSalemain 销售信息
     * @return 结果
     */
    public int updateJxcTrdSalemain(JxcTrdSalemain jxcTrdSalemain);

    /**
     * 修改销售信息
     *
     * @param jxcTrdSalemain 销售信息
     * @return 结果
     */
    public int updateJxcTrdSalemainByPrimaryKey(JxcTrdSalemain jxcTrdSalemain);

    /**
     * 删除销售信息
     *
     * @param id 销售信息ID
     * @return 结果
     */
    public int deleteJxcTrdSalemainById(String id);

    /**
     * 批量删除销售信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJxcTrdSalemainByIds(String[] ids);


    /**
     * 返回查询销售信息总量
     *
     * @param jxcTrdSalemain 销售信息
     * @return 销售信息查询总量
     */
    public Integer selectJxcTrdSalemainCount(JxcTrdSalemain jxcTrdSalemain);
}
