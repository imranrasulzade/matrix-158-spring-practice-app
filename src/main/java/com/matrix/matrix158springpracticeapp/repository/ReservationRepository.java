package com.matrix.matrix158springpracticeapp.repository;

import com.matrix.matrix158springpracticeapp.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
}
