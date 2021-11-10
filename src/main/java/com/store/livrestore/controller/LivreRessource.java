package com.store.livrestore.controller;

import com.store.livrestore.model.Livre;
import com.store.livrestore.service.LivreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livre")
public class LivreRessource {
    private final LivreService livreService;

    public LivreRessource(LivreService livreService) {
        this.livreService = livreService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Livre>> getAllLivres (){
        List<Livre> livres = livreService.findAllLivres();
        return new ResponseEntity<>(livres, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Livre> getLivreById(@PathVariable("id") Long id){
        Livre livre = livreService.findLivreById(id);
        return new ResponseEntity<>(livre, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Livre> addLivre(@RequestBody Livre livre){
        Livre newLivre = livreService.addLivre(livre);
        return new ResponseEntity<>(newLivre, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Livre> updateLivre(@RequestBody Livre livre){
        Livre updateLivre = livreService.updateLivre(livre);
        return new ResponseEntity<>(updateLivre, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Livre> deleteLivre(@PathVariable("id") Long id){
        livreService.deleteLivre(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
