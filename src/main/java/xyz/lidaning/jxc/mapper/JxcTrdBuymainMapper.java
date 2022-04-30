package xyz.lidaning.jxc.mapper;


import xyz.lidaning.jxc.domain.JxcTrdBuymain;

import java.util.List;

/**
 * jxcTrdBuymainMapper接口
 *
 * @date 2021-02-23
 */
public interface JxcTrdBuymainMapper
{
    /**
     * 查询jxcTrdBuymain
     *
     * @param id jxcTrdBuymainID
     * @return jxcTrdBuymain
     */
    public JxcTrdBuymain selectJxcTrdBuymainById(String id);

    /**
     * 查询jxcTrdBuymain列表
     *
     * @param jxcTrdBuymain jxcTrdBuymain
     * @return jxcTrdBuymain集合
     */
    public List<JxcTrdBuymain> selectJxcTrdBuymainList(JxcTrdBuymain jxcTrdBuymain);

    /**
     * 新增jxcTrdBuymain
     *
     * @param jxcTrdBuymain jxcTrdBuymain
     * @return 结果
     */
    public int insertJxcTrdBuymain(JxcTrdBuymain jxcTrdBuymain);

    /**
     * 修改jxcTrdBuymain
     *
     * @param jxcTrdBuymain jxcTrdBuymain
     * @return 结果
     */
    public int updateJxcTrdBuymain(JxcTrdBuymain jxcTrdBuymain);

    /**
     * 修改jxcTrdBuymain
     *
     * @param jxcTrdBuymain jxcTrdBuymain
     * @return 结果
     */
    public int updateJxcTrdBuymainByPrimaryKey(JxcTrdBuymain jxcTrdBuymain);

    /**
     * 删除jxcTrdBuymain
     *
     * @param id jxcTrdBuymainID
     * @return 结果
     */
    public int deleteJxcTrdBuymainById(String id);

    /**
     * 批量删除jxcTrdBuymain
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJxcTrdBuymainByIds(String[] ids);


    /**
     * 返回查询jxcTrdBuymain总量
     *
     * @param jxcTrdBuymain jxcTrdBuymain
     * @return jxcTrdBuymain查询总量
     */
    public Integer selectJxcTrdBuymainCount(JxcTrdBuymain jxcTrdBuymain);
}
