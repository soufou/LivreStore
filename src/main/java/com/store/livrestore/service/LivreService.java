package com.store.livrestore.service;

import com.store.livrestore.exception.LivreNotFoundException;
import com.store.livrestore.model.Livre;
import com.store.livrestore.repo.LivreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LivreService {
    private final LivreRepo livreRepo;

    @Autowired
    public LivreService(LivreRepo livreRepo) {
        this.livreRepo = livreRepo;
    }
    public Livre addLivre(Livre livre){
        return livreRepo.save(livre);
    }
    public List<Livre> findAllLivres(){
        return livreRepo.findAll();
    }
    public Livre updateLivre(Livre livre){
        return livreRepo.save(livre);
    }
    public Livre findLivreById(Long id){
        return livreRepo.findLivreById(id).orElseThrow(()-> new LivreNotFoundException("Livre by id "+id+"was not found"));
    }
    public void deleteLivre(Long id){
        livreRepo.deleteLivreById(id);
    }

}
