package com.h1.mycardeepdive.options.domain.repository;

import com.h1.mycardeepdive.options.domain.WheelOptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionsRepository extends JpaRepository<WheelOptions, Long> {}
