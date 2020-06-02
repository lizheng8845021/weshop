package tech.wetech.weshop.user.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.common.fallback.ApiFallback;
import tech.wetech.weshop.common.utils.Result;
import tech.wetech.weshop.user.api.AdApi;
import tech.wetech.weshop.user.po.Ad;

import java.util.List;

@Component
public class AdApiFallback extends ApiFallback<Ad> implements AdApi {
    @Override
    public Result<List<Ad>> queryAdList() {
        return null;
    }
}
