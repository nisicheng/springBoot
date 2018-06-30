package com.example.demo.dao;


import com.example.demo.entity.Resource;

import java.util.List;


public interface ResourceDao {

    public Resource createResource(Resource resource);
    public Resource updateResource(Resource resource);
    public void deleteResource(Long resourceId);

    Resource findOne(Long resourceId);
    List<Resource> findAll(Resource resource);

}
