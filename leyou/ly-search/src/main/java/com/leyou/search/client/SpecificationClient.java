package com.leyou.search.client;

import com.leyou.item.api.SpecificationApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author: HuYi.Zhang
 * @create: 2018-08-23 10:11
 **/
@FeignClient("item-service")
public interface SpecificationClient extends SpecificationApi {
}
