package cn.caber.springcloudeurekaprovider.service;

import cn.caber.springcloudeurekaprovider.po.CourseOrderPo;
import cn.caber.springcloudeurekaprovider.po.SeqOrderedPo;

import java.util.List;

public interface CourseOrderPoService {
    List<CourseOrderPo> findAll();
    CourseOrderPo findById(Integer id);
    void save(CourseOrderPo cp);
//    void delete(CourseOrderPo cp);
}
