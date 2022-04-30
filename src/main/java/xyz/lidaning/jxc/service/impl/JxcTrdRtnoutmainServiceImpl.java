package xyz.lidaning.jxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.lidaning.jxc.domain.JxcTrdRtnoutlist;
import xyz.lidaning.jxc.domain.JxcTrdRtnoutmain;
import xyz.lidaning.jxc.mapper.JxcTrdRtnoutmainMapper;
import xyz.lidaning.jxc.service.IJxcTrdRtnoutlistService;
import xyz.lidaning.jxc.service.IJxcTrdRtnoutmainService;

import java.util.List;
import java.util.UUID;

/**
 * 退回出库信息Service业务层处理
 *
 * @date 2021-02-23
 */
@Service
public class JxcTrdRtnoutmainServiceImpl implements IJxcTrdRtnoutmainService
{
    @Autowired
    private JxcTrdRtnoutmainMapper jxcTrdRtnoutmainMapper;

    @Autowired
    private IJxcTrdRtnoutlistService jxcTrdRtnoutlistService;

    /**
     * 查询退回出库信息
     *
     * @param id 退回出库信息ID
     * @return 退回出库信息
     */
    @Override
    public JxcTrdRtnoutmain selectJxcTrdRtnoutmainById(String id)
    {
        JxcTrdRtnoutmain jxcTrdRtnoutmain= jxcTrdRtnoutmainMapper.selectJxcTrdRtnoutmainById(id);
        JxcTrdRtnoutlist jxcTrdRtnoutlist = new JxcTrdRtnoutlist();
        jxcTrdRtnoutlist.setRtnno(jxcTrdRtnoutmain.getRtnno());
        jxcTrdRtnoutmain.setRtnoutlist(jxcTrdRtnoutlistService.selectJxcTrdRtnoutlistList(jxcTrdRtnoutlist));
        return jxcTrdRtnoutmain;
    }

    /**
     * 查询退回出库信息列表
     *
     * @param jxcTrdRtnoutmain 退回出库信息
     * @return 退回出库信息
     */
    @Override
    public List<JxcTrdRtnoutmain> selectJxcTrdRtnoutmainList(JxcTrdRtnoutmain jxcTrdRtnoutmain)
    {
        return jxcTrdRtnoutmainMapper.selectJxcTrdRtnoutmainList(jxcTrdRtnoutmain);
    }

    /**
     * 新增退回出库信息
     *
     * @param jxcTrdRtnoutmain 退回出库信息
     * @return 结果
     */
    @Override
    public int insertJxcTrdRtnoutmain(JxcTrdRtnoutmain jxcTrdRtnoutmain)
    {
        if (!StringUtils.hasLength(jxcTrdRtnoutmain.getId()))
        {
            jxcTrdRtnoutmain.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return jxcTrdRtnoutmainMapper.insertJxcTrdRtnoutmain(jxcTrdRtnoutmain);
    }

    /**
     * 修改退回出库信息
     *
     * @param jxcTrdRtnoutmain 退回出库信息
     * @return 结果
     */
    @Override
    public int updateJxcTrdRtnoutmain(JxcTrdRtnoutmain jxcTrdRtnoutmain)
    {
        return jxcTrdRtnoutmainMapper.updateJxcTrdRtnoutmain(jxcTrdRtnoutmain);
    }

    /**
     * 批量删除退回出库信息
     *
     * @param ids 需要删除的退回出库信息ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdRtnoutmainByIds(String[] ids)
    {
        return jxcTrdRtnoutmainMapper.deleteJxcTrdRtnoutmainByIds(ids);
    }

    /**
     * 删除退回出库信息信息
     *
     * @param id 退回出库信息ID
     * @return 结果
     */
    @Override
    public int deleteJxcTrdRtnoutmainById(String id)
    {
        return jxcTrdRtnoutmainMapper.deleteJxcTrdRtnoutmainById(id);
    }
    /**
     * 返回查询退回出库信息总量
     *
     * @param jxcTrdRtnoutmain 退回出库信息
     * @return 退回出库信息查询总量
     */
    @Override
    public Integer selectJxcTrdRtnoutmainCount(JxcTrdRtnoutmain jxcTrdRtnoutmain)
    {
        return jxcTrdRtnoutmainMapper.selectJxcTrdRtnoutmainCount(jxcTrdRtnoutmain);
    }
}
