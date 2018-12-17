package com.leyou.item.api;

import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author: HuYi.Zhang
 * @create: 2018-08-23 10:10
 **/
public interface SpecificationApi {
    @GetMapping("spec/params")
    List<SpecParam> queryParams(
            @RequestParam(value = "gid", required = false) Long gid,
            @RequestParam(value = "cid", required = false) Long cid,
            @RequestParam(value = "generic", required = false) Boolean generic,
            @RequestParam(value = "searching", required = false) Boolean searching
    );

    /**
     * 根据商品分类查询规格组及组内参数
     * @param cid
     * @return
     */
    @GetMapping("spec/{cid}")
    List<SpecGroup> querySpecs(@PathVariable("cid") Long cid);
}
