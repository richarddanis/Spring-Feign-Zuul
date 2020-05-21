package com.richard.danis.www.skeleton.client;

import com.richard.danis.www.skeleton.model.CustomerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "customer-app")
public interface CustomerFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/customers/all")
    Iterable<CustomerDTO> getAvailablePets();

    @RequestMapping(method = RequestMethod.POST, value = "/customers/save")
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
}
