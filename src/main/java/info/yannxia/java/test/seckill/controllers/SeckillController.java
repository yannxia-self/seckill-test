package info.yannxia.java.test.seckill.controllers;

import info.yannxia.java.test.seckill.entities.Transaction;
import info.yannxia.java.test.seckill.services.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by yann on 2017/3/26.
 */

@RestController
public class SeckillController {


    @Autowired
    private SeckillService seckillService;

    @RequestMapping(value = "/seckill", method = RequestMethod.POST)
    public Optional<Transaction> seckill(@RequestParam("user_id") long userId, @RequestParam("product_id") long productId) {
        return seckillService.seckill(userId, productId);
    }

}
