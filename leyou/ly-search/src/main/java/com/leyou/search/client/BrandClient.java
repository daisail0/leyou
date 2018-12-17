package com.leyou.search.client;

import com.leyou.item.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author: HuYi.Zhang
 * @create: 2018-08-23 10:10
 **/
@FeignClient("item-service")
public interface BrandClient extends BrandApi {
}
