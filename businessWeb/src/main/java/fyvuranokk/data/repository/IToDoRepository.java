package fyvuranokk.data.repository;
import TechCareerFYV.data.entity.ToDoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IToDoRepository extends CrudRepository<ToDoEntity, Long> {
    //DELIVERED QUERY
    ToDoEntity findById(int id);
    //QUERY
    @Query("select b from ToDoEntity b")
    List<ToDoEntity> myToDoList();
}
