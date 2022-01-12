/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PWS.C.Assesment_129;

import PWS.C.Assesment_129.exceptions.NonexistentEntityException;
import PWS.C.Assesment_129.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rafif
 * 
 */
@CrossOrigin
@RestController
@RequestMapping("/obat")
public class ObatJpaController implements Serializable {
@Autowired
    private ObatRepo Obat;
    
    @GetMapping("/Obat")
    public List<Obat> getAllObat() {
        return Obat.findAll();
    }

    @GetMapping("/jualbaju/{id_baju}")
    public Class<? extends Object> getErialbById(@PathVariable String id_baju) {
        return Obat.findById(id_baju).getClass();
    }

    
    @PostMapping("/Obat")
    public Obat saveObat(@RequestBody Obat j) {
        return Obat.save(j);
    }

    @PutMapping("/Obat")
    public Obat updateObat(@RequestBody Obat j) {
        return Obat.save(j);
    }

    @DeleteMapping("/Obat/{id_Obat}")
    public ResponseEntity<HttpStatus> deleteObat(@PathVariable String idproduct) {
        Obat.deleteById(idproduct);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    
}
 
