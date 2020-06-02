package tech.wetech.weshop.user.mapper;

import tech.wetech.weshop.common.utils.MyMapper;
import tech.wetech.weshop.user.po.Ad;

import java.util.List;

public interface AdMapper extends MyMapper<Ad> {

    List<Ad> queryAdList();
}
