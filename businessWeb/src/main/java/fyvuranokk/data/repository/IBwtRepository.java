package fyvuranokk.data.repository;
import  fyvuranokk.data.entity.BwtEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IBwtRepository extends CrudRepository<BwtEntity, Long> {
    //DELIVERED QUERY
    BwtEntity findByName(String name);
    //QUERY
    @Query("select t from BwtEntity t")
    List<BwtEntity> myBwtList();
}
