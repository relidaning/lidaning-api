package xyz.lidaning.jxc.service;

import xyz.lidaning.jxc.domain.JxcTrdLomain;

import java.util.List;

/**
 * 损益信息Service接口
 * @date 2021-02-23
 */
public interface IJxcTrdLomainService
{
    /**
     * 查询损益信息
     *
     * @param id 损益信息ID
     * @return 损益信息
     */
    public JxcTrdLomain selectJxcTrdLomainById(String id);

    /**
     * 查询损益信息列表
     *
     * @param jxcTrdLomain 损益信息
     * @return 损益信息集合
     */
    public List<JxcTrdLomain> selectJxcTrdLomainList(JxcTrdLomain jxcTrdLomain);

    /**
     * 新增损益信息
     *
     * @param jxcTrdLomain 损益信息
     * @return 结果
     */
    public int insertJxcTrdLomain(JxcTrdLomain jxcTrdLomain);

    /**
     * 修改损益信息
     *
     * @param jxcTrdLomain 损益信息
     * @return 结果
     */
    public int updateJxcTrdLomain(JxcTrdLomain jxcTrdLomain);

    /**
     * 批量删除损益信息
     *
     * @param ids 需要删除的损益信息ID
     * @return 结果
     */
    public int deleteJxcTrdLomainByIds(String[] ids);

    /**
     * 删除损益信息信息
     *
     * @param id 损益信息ID
     * @return 结果
     */
    public int deleteJxcTrdLomainById(String id);

    /**
     * 返回查询损益信息总量
     *
     * @param jxcTrdLomain 损益信息
     * @return 损益信息查询总量
     */
    public Integer selectJxcTrdLomainCount(JxcTrdLomain jxcTrdLomain);
}
