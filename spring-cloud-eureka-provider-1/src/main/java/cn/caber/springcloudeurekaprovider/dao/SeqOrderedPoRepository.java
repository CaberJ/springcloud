package cn.caber.springcloudeurekaprovider.dao;

import cn.caber.springcloudeurekaprovider.po.SeqOrderedPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SeqOrderedPoRepository extends JpaRepository<SeqOrderedPo,Long> {

    @Query(value = "select * from  course_order c where c.id= ?1", nativeQuery = true)
    SeqOrderedPo findById(Integer id);

 /*   @Modifying
    @Query(value = "update course_order c set c.id=?2 where id=?1",nativeQuery = true)
    SeqOrderedPo update(SeqOrderedPo sq);*/
}
