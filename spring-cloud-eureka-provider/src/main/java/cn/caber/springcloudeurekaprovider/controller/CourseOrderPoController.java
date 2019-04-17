package cn.caber.springcloudeurekaprovider.controller;


import cn.caber.springcloudeurekaprovider.dao.CourseOrderPoRepository;
import cn.caber.springcloudeurekaprovider.po.CourseOrderPo;
import cn.caber.springcloudeurekaprovider.po.SeqOrderedPo;
import cn.caber.springcloudeurekaprovider.service.CourseOrderPoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseOrderPoController {

    @Autowired
    private CourseOrderPoService courseOrderPoService;


    @RequestMapping(value = "/findAll" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<CourseOrderPo> querySeqOrderedPoList(){
        List<CourseOrderPo> all = courseOrderPoService.findAll();
        return all;
    }

    @RequestMapping(value = "/findById" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody CourseOrderPo findById(Integer id){
        CourseOrderPo byId= courseOrderPoService.findById(id);
        return byId;
    }

    @RequestMapping(value = "/saveOne",method = RequestMethod.POST)
    public void addOne(CourseOrderPo cq){
        courseOrderPoService.save(cq);
    }

    /*@RequestMapping("/delOne")
    public void delOne(CourseOrderPo sq){
        courseOrderPoRepository.delete(sq);
    }*/

  /*  @RequestMapping("/updateOne")
    public void updateOne(CourseOrderPo sq){

        CourseOrderPo update = courseOrderPoRepository.update(sq);

    }*/


}
