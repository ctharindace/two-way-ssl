package com.chethiya.visa.helloworld.clients;

import com.chethiya.visa.helloworld.configs.HelloAPIProperties;
import com.chethiya.visa.helloworld.dto.HelloMessage;
import com.chethiya.visa.helloworld.exception.ServiceRuntimeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * @author Chethiya
 *
 * REST client for calling the remote helloworld service
 */
@Slf4j
@Component
public class HelloRestClient {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HelloAPIProperties apiProps;

    /**
     * This calls the remote service
     * <a href="https://sandbox.api.visa.com/vdp/helloworld">Visa Hello World microservice endpoint</a>
     * and returns the response
     *
     * @return Response from the service
     * @throws ServiceRuntimeException Wrapped service exception
     */
    public HelloMessage getHelloMessage() throws ServiceRuntimeException {
        ResponseEntity<HelloMessage> responseEntity;
        try {
            log.debug("Calling the remote service, {}", apiProps.getHelloServiceUrl());
            responseEntity = restTemplate.getForEntity(apiProps.getHelloServiceUrl(), HelloMessage.class);
            log.info("Remote service call success. Response: {}", responseEntity.getBody());
        } catch (RestClientException ex) {
           throw new ServiceRuntimeException("Error in calling the service.", ex);
        }
        return responseEntity.getBody();
    }

}
