package com.dnd.packmule.data;

import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository {

    List<Item> findByName(@Param("name") String name);
}
