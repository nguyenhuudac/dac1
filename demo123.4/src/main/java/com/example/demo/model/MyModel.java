package com.example.demo.model;

import com.example.demo.entity.attendance_slots;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MyModel extends PagingAndSortingRepository<attendance_slots, Integer> {
//    Page<Monan> findByStatusIsNot(int status, Pageable pageable);
}
