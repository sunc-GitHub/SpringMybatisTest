package com.jsu.dao;

import com.jsu.bean.Card;
import org.springframework.stereotype.Repository;

/**
 * @Auther: next door
 * @Date: 2020/3/29 17:10
 * @Description:
 */
@Repository()
public interface CardMapper {

    public Card getCardById(int id);

}
