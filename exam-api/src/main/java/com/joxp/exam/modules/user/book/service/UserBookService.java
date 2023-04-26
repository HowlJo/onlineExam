package com.joxp.exam.modules.user.book.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.joxp.exam.modules.user.book.dto.UserBookDTO;
import com.joxp.exam.modules.user.book.entity.UserBook;
import com.joxp.exam.core.api.dto.PagingReqDTO;

/**
* <p>
* 错题本业务类
* </p>
*
* @author 聪明笨狗
* @since 2020-05-27 17:56
*/
public interface UserBookService extends IService<UserBook> {

    /**
    * 分页查询数据
    * @param reqDTO
    * @return
    */
    IPage<UserBookDTO> paging(PagingReqDTO<UserBookDTO> reqDTO);

    /**
     * 加入错题本
     * @param quId
     * @param examId
     */
    void addBook(String examId, String quId);

    /**
     * 查找第一个错题
     * @param quId
     * @param examId
     * @return
     */
    String findNext(String examId, String quId);
}
