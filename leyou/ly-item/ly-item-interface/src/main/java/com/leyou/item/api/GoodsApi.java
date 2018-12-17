package com.leyou.item.api;

import com.leyou.common.vo.PageResult;
import com.leyou.item.dto.CartDTO;
import com.leyou.item.pojo.Sku;
import com.leyou.item.pojo.Spu;
import com.leyou.item.pojo.SpuDetail;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface GoodsApi {
    /**
     * 根据spu查询detail
     *
     * @param spuId
     * @return
     */
    @GetMapping("/spu/detail/{spuId}")
    SpuDetail queryDetailBySpuId(@PathVariable("spuId")Long spuId);

    /**
     * 根据spnu查询sku集合
     * @param spuId
     * @return
     */
    @GetMapping("sku/list")
    List<Sku> querySkuListBySpuId(@RequestParam("id") Long spuId);

    /**
     * 分页查询spu
     * @param page
     * @param rows
     * @param saleable
     * @param key
     * @return
     */
    @GetMapping("spu/page")
    PageResult<Spu> querySpuByPage(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "5") Integer rows,
            @RequestParam(value = "saleable", required = false) Boolean saleable,
            @RequestParam(value = "key", required = false) String key
    );

    @GetMapping("spu/{id}")
    Spu querySpuById(@PathVariable("id") Long id);

    /**
     * 根据sku的id集合查询sku
     * @param ids
     * @return
     */
    @GetMapping("/sku/list/ids")
    List<Sku> querySkuListByIds(@RequestParam("ids") List<Long> ids);

    /**
     * 减库存接口
     * @param cartDTOS
     */
    @PostMapping("stock/decrease")
    void decreaseStock(@RequestBody List<CartDTO> cartDTOS);
}