package cn.caber.springcloudeurekaprovider.service.impl;

import cn.caber.springcloudeurekaprovider.dao.CourseOrderPoRepository;
import cn.caber.springcloudeurekaprovider.po.CourseOrderPo;
import cn.caber.springcloudeurekaprovider.service.CourseOrderPoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class CourseOrderPoServiceImpl implements CourseOrderPoService {

    @Autowired
    private CourseOrderPoRepository courseOrderPoRepository;

    @Override
    public  List<CourseOrderPo> findAll(){
        List<CourseOrderPo> all = courseOrderPoRepository.findAll();
        return all;
    }

    @Override
    public  CourseOrderPo findById(Integer id){
        CourseOrderPo byId= courseOrderPoRepository.findById(id);
        return byId;
    }

    @Override
    public void save(CourseOrderPo cp) {
       courseOrderPoRepository.save(cp);
    }




   /* public void delOne(CourseOrderPo sq){
        courseOrderPoRepository.delete(sq);
    }*/

  /*  @RequestMapping("/updateOne")
    public void updateOne(CourseOrderPo sq){

        CourseOrderPo update = courseOrderPoRepository.update(sq);

    }*/

}
