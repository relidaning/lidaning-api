package xyz.lidaning.api.jxc.service;

import xyz.lidaning.api.jxc.domain.JxcTrdChkmain;

import java.util.List;

/**
 * 盘点信息Service接口
 * @date 2021-02-23
 */
public interface IJxcTrdChkmainService
{
    /**
     * 查询盘点信息
     *
     * @param id 盘点信息ID
     * @return 盘点信息
     */
    public JxcTrdChkmain selectJxcTrdChkmainById(String id);

    /**
     * 查询盘点信息列表
     *
     * @param jxcTrdChkmain 盘点信息
     * @return 盘点信息集合
     */
    public List<JxcTrdChkmain> selectJxcTrdChkmainList(JxcTrdChkmain jxcTrdChkmain);

    /**
     * 新增盘点信息
     *
     * @param jxcTrdChkmain 盘点信息
     * @return 结果
     */
    public int insertJxcTrdChkmain(JxcTrdChkmain jxcTrdChkmain);

    /**
     * 修改盘点信息
     *
     * @param jxcTrdChkmain 盘点信息
     * @return 结果
     */
    public int updateJxcTrdChkmain(JxcTrdChkmain jxcTrdChkmain);

    /**
     * 批量删除盘点信息
     *
     * @param ids 需要删除的盘点信息ID
     * @return 结果
     */
    public int deleteJxcTrdChkmainByIds(String[] ids);

    /**
     * 删除盘点信息信息
     *
     * @param id 盘点信息ID
     * @return 结果
     */
    public int deleteJxcTrdChkmainById(String id);

    /**
     * 返回查询盘点信息总量
     *
     * @param jxcTrdChkmain 盘点信息
     * @return 盘点信息查询总量
     */
    public Integer selectJxcTrdChkmainCount(JxcTrdChkmain jxcTrdChkmain);
}
