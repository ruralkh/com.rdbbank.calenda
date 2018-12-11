package com.rdbbank.calenda.models.secusers;


import com.rdbbank.calenda.models.base.BaseEntity;

import javax.persistence.*;

/**
 * Create By: Ron Rith
 * Create Date on: 12/11/2018.
 */
@Entity
@Table(name = "sec_role")
public class SecRole extends BaseEntity{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SecRole() {
	}
}
