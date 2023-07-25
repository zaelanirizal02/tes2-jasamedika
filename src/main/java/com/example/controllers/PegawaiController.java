package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.entities.Pegawai;
import com.example.services.PegawaiService;

@RestController
public class PegawaiController {
    
    @Autowired
    private PegawaiService service;

    @PostMapping("/api/pegawai/tambah")
    public Pegawai addPegawai(@RequestBody Pegawai pegawai){
        return service.savePegawai(pegawai);
    }

    @PostMapping("/api/pegawai/tambah-multiple")
    public List<Pegawai> addPegawais(@RequestBody  List<Pegawai> pegawais){
        return service.savePegawais(pegawais);
    }

    @GetMapping("/api/pegawai/daftar")
    public List<Pegawai> findAlPegawais(){
        return service.getPegawais();
    }

//    @GetMapping("/api/pegawai/{id}")
//    public Pegawai findPegawaiById(@PathVariable int id){
//        return service.getPegawaiById(id);
//    }

//    @GetMapping("/api/pegawai/combo/{jabatan}")
//    public Pegawai findPegawaiByName(@PathVariable String namaJabatan){
//        return service.getPegawaiByName(namaJabatan);
//    }

//    @PutMapping("/api/admin/ubah-pegawai/{id}")
//    public Pegawai updatePegawai(@RequestBody Pegawai pegawai){
//        return service.updatePegawai(pegawai);
//    }

    @DeleteMapping("/api/hapus-pegawai/{id}")
    public String deletePegawai(@PathVariable int id){
        return service.deletePegawai(id);
    }

}
