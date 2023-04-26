package com.joxp.exam.modules.repo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.joxp.exam.modules.repo.service.RepoService;
import com.joxp.exam.core.api.dto.PagingReqDTO;
import com.joxp.exam.core.utils.BeanMapper;
import com.joxp.exam.modules.repo.dto.RepoDTO;
import com.joxp.exam.modules.repo.dto.request.RepoReqDTO;
import com.joxp.exam.modules.repo.dto.response.RepoRespDTO;
import com.joxp.exam.modules.repo.entity.Repo;
import com.joxp.exam.modules.repo.mapper.RepoMapper;
import org.springframework.stereotype.Service;

/**
* <p>
* 语言设置 服务实现类
* </p>
*
* @author 聪明笨狗
* @since 2020-05-25 13:23
*/
@Service
public class RepoServiceImpl extends ServiceImpl<RepoMapper, Repo> implements RepoService {

    @Override
    public IPage<RepoRespDTO> paging(PagingReqDTO<RepoReqDTO> reqDTO) {
        return baseMapper.paging(reqDTO.toPage(), reqDTO.getParams());
     }

    @Override
    public void save(RepoDTO reqDTO) {

        //复制参数
        Repo entity = new Repo();
        BeanMapper.copy(reqDTO, entity);
        this.saveOrUpdate(entity);
    }
}
