package com.example.demo.dao;


import com.example.demo.entity.Resource;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface ResourceDao {

     Resource createResource(Resource resource);
     Resource updateResource(Resource resource);
     void deleteResource(Long resourceId);

    Resource findOne(Long resourceId);
    List<Resource> findAll(Resource resource);

}
