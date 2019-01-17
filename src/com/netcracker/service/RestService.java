package com.netcracker.service;

import com.netcracker.dao.Dao;
import com.netcracker.model.Bank;
import com.netcracker.model.BasicEntity;
import com.netcracker.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RestService {
    /* @Autowired
     private ServiceDB<Company> companyService;

     @GetMapping(value = "/company", produces = "application/json")
     public ResponseEntity<List<Company>> getAllCompanies() {
         List<Company> list = companyService.getAll();
         if(list.isEmpty()) {
             return new ResponseEntity<List<Company>>(HttpStatus.NO_CONTENT);
         }
         return new ResponseEntity<List<Company>>(list, HttpStatus.OK);
     }
 */
    private final Map<String, Dao<?>> daoMap;

    @Autowired
    public RestService(List<Dao<?>> daoList) {
        this.daoMap = new HashMap<String, Dao<?>>(daoList.size());

        for (Dao<?> dao : daoList) {
            daoMap.put(dao.getEntityName(), dao);
        }
    }

    @GetMapping(value = "/{entity}", produces = "application/json")
    public ResponseEntity<List<?>> getAll(@PathVariable("entity") String entity) {

        Dao<?> dao = daoMap.get(entity);

        List<?> allObjects = dao.getAllObjects();
        if (allObjects.isEmpty()) {
            return new ResponseEntity<List<?>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<?>>(allObjects, HttpStatus.OK);
    }

    @GetMapping(value = "/{entity}/{id}", produces = "application/json")
    public <T extends BasicEntity> ResponseEntity<?> getById(@PathVariable("entity") String entity, @PathVariable("id") BigInteger id) {

        Dao<?> dao = daoMap.get(entity);

        T object = (T) dao.getObject(id);
        if (object == null) {
            return new ResponseEntity<List<?>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<T>(object, HttpStatus.OK);
    }

    @PostMapping(value = "/Bank", consumes = "application/json", produces = "application/json")
    public void addBank(@RequestBody Bank entity) {
        Dao<Bank> dao = (Dao<Bank>) daoMap.get("Bank");
        dao.add(entity);
    }

    @PostMapping(value = "/Company", consumes = "application/json")
    public void addCompany(@RequestBody Company entity) {
        Dao<Company> dao = (Dao<Company>) daoMap.get("Company");
        dao.add(entity);
    }


}
