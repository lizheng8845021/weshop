package tech.wetech.weshop.user.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tech.wetech.weshop.common.api.Api;
import tech.wetech.weshop.common.utils.Criteria;
import tech.wetech.weshop.common.utils.Result;
import tech.wetech.weshop.user.fallback.AdApiFallback;
import tech.wetech.weshop.user.po.Ad;

import java.util.List;

@FeignClient(value = "weshop-user", path = "ad", fallback = AdApiFallback.class)
public interface AdApi extends Api<Ad> {

    @RequestMapping(value = "/ad/queryList", method = RequestMethod.GET)
    Result<List<Ad>> queryAdList();
}
