package com.creolophus.liuyi.controller;

import com.creolophus.liuyi.common.api.ApiResult;
import com.creolophus.liuyi.common.base.AbstractController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author magicnana
 * @date 2020/5/27 上午10:05
 */
@Validated
@RestController
@RequestMapping(value = "/liuyi/public", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ProviderController extends AbstractController {

    private static final Logger logger = LoggerFactory.getLogger(ProviderController.class);

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ApiResult hello() {
        String msg = "Hello Kubernetes,I am a public Api in liuyi-ms-k8s-provider " + System.currentTimeMillis();
        logger.info("output： " + msg);
        return new ApiResult(msg);
    }

}
