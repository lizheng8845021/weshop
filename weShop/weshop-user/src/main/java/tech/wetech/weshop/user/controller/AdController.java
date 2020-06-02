package tech.wetech.weshop.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.common.api.BaseApi;
import tech.wetech.weshop.common.utils.Result;
import tech.wetech.weshop.user.api.AdApi;
import tech.wetech.weshop.user.po.Ad;
import tech.wetech.weshop.user.service.AdService;

import java.util.List;

@RestController
@RequestMapping("/ad")
public class AdController extends BaseApi<Ad> implements AdApi {

    @Autowired
    private AdService adService;


    @RequestMapping(value = "/queryList", method = RequestMethod.GET)
    public Result<List<Ad>> queryAdList(){
        return Result.success(adService.queryAdList());
    }
}
