package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.entities.Pegawai;
import com.example.models.repositry.PegawaiRepository;

@Service
public class PegawaiService {
    
    @Autowired
    private PegawaiRepository repositroy;

    public Pegawai savePegawai(Pegawai pegawai){
        return repositroy.save(pegawai);
    }

    public List<Pegawai> savePegawais(List<Pegawai> pegawais){
        return repositroy.saveAll(pegawais);
    }

    public List<Pegawai> getPegawais(){
        return repositroy.findAll();
    }

//    public Pegawai getPegawaiById(int id){
//        return repositroy.findById(id).orElse(null);
//    }

//    public Pegawai getPegawaiByName(String namaJabatan){
//        return repositroy.findByName(namaJabatan).orElse(null);
//    }

    public String deletePegawai(int id){
        repositroy.deleteById(id);
        return "Pegawai Removed || "+id;
    }

//    public Pegawai updatePegawai(Pegawai pegawai){
//        Pegawai existingPegawai = repositroy.findById(pegawai.getId()).orElse(null);
//        existingPegawai.setnamaLengkap(pegawai.getnamaLengkap());
//        existingPegawai.setDescription(pegawai.getDescription());
//        existingPegawai.setQuantity(pegawai.getQuantity());
//        existingPegawai.setPrice(pegawai.getPrice());
//        return repositroy.save(existingPegawai);
//
//    }

}
