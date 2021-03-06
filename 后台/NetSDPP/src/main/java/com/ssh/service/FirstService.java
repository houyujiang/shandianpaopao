package com.ssh.service;

import com.ssh.base.DomainDao;
import com.ssh.entity.Banner;
import com.ssh.entity.First;

import java.util.List;

public interface FirstService extends DomainDao<First, Long> {
    void updateFirstStateByOrderId(Long orderId, String state);

    List<First> orderByState(String openId, String state,int page,int pageSize);


    First findFirstByOrderId(Long orderId);

    Double findPriceByOrderId(Long orderId);
}
