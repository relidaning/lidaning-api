package xyz.lidaning.api.jxc.mapper;

import xyz.lidaning.api.jxc.domain.JxcTrdLomain;

import java.util.List;

/**
 * 损益信息Mapper接口
 *
 * @date 2021-02-23
 */
public interface JxcTrdLomainMapper
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
     * 修改损益信息
     *
     * @param jxcTrdLomain 损益信息
     * @return 结果
     */
    public int updateJxcTrdLomainByPrimaryKey(JxcTrdLomain jxcTrdLomain);

    /**
     * 删除损益信息
     *
     * @param id 损益信息ID
     * @return 结果
     */
    public int deleteJxcTrdLomainById(String id);

    /**
     * 批量删除损益信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJxcTrdLomainByIds(String[] ids);


    /**
     * 返回查询损益信息总量
     *
     * @param jxcTrdLomain 损益信息
     * @return 损益信息查询总量
     */
    public Integer selectJxcTrdLomainCount(JxcTrdLomain jxcTrdLomain);
}
