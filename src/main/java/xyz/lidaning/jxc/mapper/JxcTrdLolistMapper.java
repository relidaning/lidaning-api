package xyz.lidaning.jxc.mapper;

import xyz.lidaning.jxc.domain.JxcTrdLolist;

import java.util.List;

/**
 * jxcTrdLolistMapper接口
 *
 * @date 2021-02-23
 */
public interface JxcTrdLolistMapper
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
     * 修改jxcTrdLolist
     *
     * @param jxcTrdLolist jxcTrdLolist
     * @return 结果
     */
    public int updateJxcTrdLolistByPrimaryKey(JxcTrdLolist jxcTrdLolist);

    /**
     * 删除jxcTrdLolist
     *
     * @param id jxcTrdLolistID
     * @return 结果
     */
    public int deleteJxcTrdLolistById(String id);

    /**
     * 批量删除jxcTrdLolist
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJxcTrdLolistByIds(String[] ids);


    /**
     * 返回查询jxcTrdLolist总量
     *
     * @param jxcTrdLolist jxcTrdLolist
     * @return jxcTrdLolist查询总量
     */
    public Integer selectJxcTrdLolistCount(JxcTrdLolist jxcTrdLolist);
}
