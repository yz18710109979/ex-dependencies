package com.example.ex.commons.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * 通用的领域模型
 * <p>Title: AbstractBaseDomain</p>
 * <p>Description: </p>
 *
 * @author 
 * @version 1.0.0
 * @date 2019/1/23 15:50
 */
@Data
public class AbstractBaseDomain implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 509448633480490845L;
	private Long id;
}
