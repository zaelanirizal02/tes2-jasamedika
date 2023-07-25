package com.example.models.repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.entities.Pegawai;

public interface PegawaiRepository extends JpaRepository<Pegawai, Integer> {

//    Optional<Pegawai> findByName(String namaJabatan);

}
