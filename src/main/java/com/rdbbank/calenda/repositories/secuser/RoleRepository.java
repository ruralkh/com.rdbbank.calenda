package com.rdbbank.calenda.repositories.secuser;

import com.rdbbank.calenda.models.secusers.SecRole;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Create By: Ron Rith
 * Create Date on: 12/11/2018.
 */
@Repository("roleRepository")
public interface RoleRepository extends PagingAndSortingRepository<SecRole, Integer> {
    SecRole findByName(String role);
}
