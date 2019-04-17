package cn.caber.springcloudeurekaprovider.controller;


import cn.caber.springcloudeurekaprovider.dao.SeqOrderedPoRepository;
import cn.caber.springcloudeurekaprovider.po.CourseOrderPo;
import cn.caber.springcloudeurekaprovider.po.SeqOrderedPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Controller
public class SeqOrderedPoController {
    @Autowired
    private SeqOrderedPoRepository seqOrderedPoRepository;


    @RequestMapping("/findAll")
    public @ResponseBody List<SeqOrderedPo> querySeqOrderedPoList(){
        List<SeqOrderedPo> all = seqOrderedPoRepository.findAll();
        return all;
    }

    @RequestMapping("/findById")
    public @ResponseBody SeqOrderedPo findById(Integer id){
        SeqOrderedPo byId=seqOrderedPoRepository.findById(id);
        return byId;
    }

    @RequestMapping("/saveOne")
    public @ResponseBody SeqOrderedPo addOne(SeqOrderedPo sq){
        SeqOrderedPo save = seqOrderedPoRepository.save(sq);
        return save;
    }

    @RequestMapping("/delOne")
    public void delOne(SeqOrderedPo sq){
        seqOrderedPoRepository.delete(sq);
    }

  /*  @RequestMapping("/updateOne")
    public void updateOne(SeqOrderedPo sq){

        SeqOrderedPo update = seqOrderedPoRepository.update(sq);

    }*/


}
