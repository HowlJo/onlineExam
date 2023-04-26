package com.joxp.exam.modules.repo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.joxp.exam.core.api.dto.PagingReqDTO;
import com.joxp.exam.modules.repo.dto.RepoDTO;
import com.joxp.exam.modules.repo.dto.request.RepoReqDTO;
import com.joxp.exam.modules.repo.dto.response.RepoRespDTO;
import com.joxp.exam.modules.repo.entity.Repo;

/**
* <p>
* 题库业务类
* </p>
*
* @author 聪明笨狗
* @since 2020-05-25 13:23
*/
public interface RepoService extends IService<Repo> {

    /**
    * 分页查询数据
    * @param reqDTO
    * @return
    */
    IPage<RepoRespDTO> paging(PagingReqDTO<RepoReqDTO> reqDTO);


    /**
     * 保存
     * @param reqDTO
     */
    void save(RepoDTO reqDTO);
}
