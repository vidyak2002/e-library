package com.training.demo.repository;

import com.training.demo.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public interface BlogRepository extends JpaRepository <Blog,Integer>{

}
