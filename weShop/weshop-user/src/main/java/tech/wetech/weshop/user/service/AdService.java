package tech.wetech.weshop.user.service;

import tech.wetech.weshop.common.service.IService;
import tech.wetech.weshop.user.po.Ad;

import java.util.List;

public interface AdService extends IService<Ad> {
     List<Ad> queryAdList();
}
