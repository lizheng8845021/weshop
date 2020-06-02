package tech.wetech.weshop.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.wetech.weshop.common.service.BaseService;
import tech.wetech.weshop.user.mapper.AdMapper;
import tech.wetech.weshop.user.po.Ad;
import tech.wetech.weshop.user.service.AdService;

import java.util.List;

/**
 * @author cjbi@outlook.com
 */
@Service
public class AdServiceImpl extends BaseService<Ad> implements AdService {

    @Autowired
    private AdMapper adMapper;

    public List<Ad> queryAdList(){
        return  adMapper.queryAdList();
    }

}
