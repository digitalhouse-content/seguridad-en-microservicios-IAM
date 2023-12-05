package com.dh.paymentservice.repository;

import javax.websocket.server.PathParam;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dh.paymentservice.configuration.feign.FeignInterceptor;
import com.dh.paymentservice.model.SupplierDTO;

import feign.Param;

@FeignClient(name= "subscription-service",url = "http://localhost:8083", configuration = FeignInterceptor.class)
public interface FeignSupplierRepository {

    @RequestMapping(method = RequestMethod.GET,value = "/supplier/blacklist/{name}")
    boolean isInBlackList(@PathVariable String name);
}
