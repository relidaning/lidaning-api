package xyz.lidaning.jxc.service;

import xyz.lidaning.jxc.domain.JxcTrdBuymain;

import java.util.List;

/**
 * jxcTrdBuymainService接口
 * @date 2021-02-23
 */
public interface IJxcTrdBuymainService
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
     * 批量删除jxcTrdBuymain
     *
     * @param ids 需要删除的jxcTrdBuymainID
     * @return 结果
     */
    public int deleteJxcTrdBuymainByIds(String[] ids);

    /**
     * 删除jxcTrdBuymain信息
     *
     * @param id jxcTrdBuymainID
     * @return 结果
     */
    public int deleteJxcTrdBuymainById(String id);

    /**
     * 返回查询jxcTrdBuymain总量
     *
     * @param jxcTrdBuymain jxcTrdBuymain
     * @return jxcTrdBuymain查询总量
     */
    public Integer selectJxcTrdBuymainCount(JxcTrdBuymain jxcTrdBuymain);
}
