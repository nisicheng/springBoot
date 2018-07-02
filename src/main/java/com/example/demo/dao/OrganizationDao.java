package com.example.demo.dao;


import com.example.demo.entity.Organization;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface OrganizationDao {

     Organization createOrganization(Organization organization);
     Organization updateOrganization(Organization organization);
     void deleteOrganization(Long organizationId);

    Organization findOne(Long organizationId);
    List<Organization> findAll();

    List<Organization> findAllWithExclude(Organization excludeOraganization);

    void move(Organization source, Organization target);
}
