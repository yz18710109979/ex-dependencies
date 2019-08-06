package com.example.ex.commons.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

/**
 * 通用的响应结果
 * <p>Title: AbstractBaseResult</p>
 * <p>Description: </p>
 *
 * @author 
 * @version 1.0.0
 * @date 2019/1/23 15:10
 */
@Data
public abstract class AbstractBaseResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3096173875937590947L;

	@Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected static class Links {
        private String self;
        private String next;
        private String last;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected static class DataBean<T extends AbstractBaseDomain> {
        private String type;
        private Long id;
        private T attributes;
        private T relationships;
        private Links links;
    }
}
