package com.ch.api.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: CH
 * @date: 2021-08-10
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 8989803125263141185L;

    private Long id;

    private String name;
}
