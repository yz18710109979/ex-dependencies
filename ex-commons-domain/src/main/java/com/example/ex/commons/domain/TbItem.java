package com.example.ex.commons.domain;

import javax.persistence.Table;

import com.example.ex.commons.dto.AbstractBaseDomain;
import com.fasterxml.jackson.annotation.JsonInclude;
@Table(name = "tb_item")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbItem extends AbstractBaseDomain{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2029338315914468913L;

}
