package com.was.ListaBeer.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Beers extends JpaRepository<Beer,Long> {
}
