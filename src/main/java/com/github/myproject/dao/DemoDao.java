package com.github.myproject.dao;


import com.github.myproject.domain.Demo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiedan on 2016/12/17.
 */
@Mapper
public interface DemoDao {
    List<Demo> findByAge(Integer age);
}
