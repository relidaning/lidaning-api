package xyz.lidaning.jxc.service;

import xyz.lidaning.jxc.domain.JxcTrdMoncode;

import java.util.List;

/**
 * jxcTrdMoncodeService接口
 * @date 2021-02-23
 */
public interface IJxcTrdMoncodeService
{
    /**
     * 查询jxcTrdMoncode
     *
     * @param id jxcTrdMoncodeID
     * @return jxcTrdMoncode
     */
    public JxcTrdMoncode selectJxcTrdMoncodeById(String id);

    /**
     * 查询jxcTrdMoncode列表
     *
     * @param jxcTrdMoncode jxcTrdMoncode
     * @return jxcTrdMoncode集合
     */
    public List<JxcTrdMoncode> selectJxcTrdMoncodeList(JxcTrdMoncode jxcTrdMoncode);

    /**
     * 新增jxcTrdMoncode
     *
     * @param jxcTrdMoncode jxcTrdMoncode
     * @return 结果
     */
    public int insertJxcTrdMoncode(JxcTrdMoncode jxcTrdMoncode);

    /**
     * 修改jxcTrdMoncode
     *
     * @param jxcTrdMoncode jxcTrdMoncode
     * @return 结果
     */
    public int updateJxcTrdMoncode(JxcTrdMoncode jxcTrdMoncode);

    /**
     * 批量删除jxcTrdMoncode
     *
     * @param ids 需要删除的jxcTrdMoncodeID
     * @return 结果
     */
    public int deleteJxcTrdMoncodeByIds(String[] ids);

    /**
     * 删除jxcTrdMoncode信息
     *
     * @param id jxcTrdMoncodeID
     * @return 结果
     */
    public int deleteJxcTrdMoncodeById(String id);

    /**
     * 返回查询jxcTrdMoncode总量
     *
     * @param jxcTrdMoncode jxcTrdMoncode
     * @return jxcTrdMoncode查询总量
     */
    public Integer selectJxcTrdMoncodeCount(JxcTrdMoncode jxcTrdMoncode);
}
