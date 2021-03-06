package com.example.digiturnosrv.Repository;


import java.util.List;
import java.util.UUID;

import com.example.digiturnosrv.Model.Turn;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnRepository extends CrudRepository<Turn, UUID> {
    List<Turn> findByOrderByCreationDateDesc();
}
