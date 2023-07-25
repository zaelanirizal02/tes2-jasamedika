package com.example.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_pegawai")
public class Pegawai {

    @Id
    @GeneratedValue
    private Integer id;
    private String profile;
    private String idUser;
    private String namaLengkap;
    private String email;
    private String tempatLahir;
    private Integer tanggalLahir;
    private String password;
    private String nikUser;
    private Integer kdJabatan;
    private String namaJabatan;
    private Integer kdDepartemen;
    private String namaDepartemen;
    private Integer kdUnitKerja;
    private String namaUnitKerja;
    private Integer kdJenisKelamin;
    private String namaJenisKelamin;
    private Integer kdPendidikan;
    private String namaPendidikan;
    private String photo;
}
