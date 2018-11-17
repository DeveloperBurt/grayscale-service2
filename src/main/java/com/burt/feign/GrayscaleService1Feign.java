package com.burt.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with Burt
 * Date: 2018/11/17
 * Time: 12:10 AM
 */
@FeignClient("grayscale-service1")
public interface GrayscaleService1Feign {

    @RequestMapping(value = "/test/msg", method = RequestMethod.GET)
    String getService1Msg();
}
