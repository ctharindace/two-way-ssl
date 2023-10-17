package com.chethiya.visa.helloworld.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * @author Chethiya
 *
 * This holds the response from the helloworld service
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HelloMessage {

    private String message;

    private Date timestamp;

}
