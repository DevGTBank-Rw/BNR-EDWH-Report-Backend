package rw.co.gtbank.edwh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rw.co.gtbank.edwh.entity.*;
import rw.co.gtbank.edwh.repository.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "report")
public class AppController {

    @Autowired
    private TbAccountsRepository accountsRepository;

    @Autowired
    private TbAcctmapsRepository acctmapsRepository;

    @Autowired
    private TbAnitcimatRepository anitcimatRepository;

    @Autowired
    private TbAtmofustxnRepository atmofustxnRepository;

    @Autowired
    private TbAtmposdtRepository atmposdtRepository;

    @Autowired
    private TbAtmuptmthRepository atmuptmthRepository;

    @PostMapping(value = "/TbAccounts")
    public ResponseEntity<?> saveTbAccountsReport(@Valid @RequestBody List<TbAccounts> data){
        System.out.println("saved");
       return new ResponseEntity<>(accountsRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbAcctmaps")
    public ResponseEntity<?> saveTbAcctmapsReport(@Valid @RequestBody List<TbAcctmaps> data){
        return new ResponseEntity<>(acctmapsRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbAnitcimat")
    public ResponseEntity<?> saveTbAnitcimatReport(@Valid @RequestBody List<TbAnitcimat> data){
        return new ResponseEntity<>(anitcimatRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbAtmofustxn")
    public ResponseEntity<?> saveTbAtmofustxnReport(@Valid @RequestBody List<TbAtmofustxn> data){
        return new ResponseEntity<>(atmofustxnRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbTbAtmposdt")
    public ResponseEntity<?> saveTbTbAtmposdtReport(@Valid @RequestBody List<TbAtmposdt> data){
        return new ResponseEntity<>(atmposdtRepository.saveAll(data), HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/TbAtmuptmth")
    public ResponseEntity<?> saveTbAtmuptmthReport(@Valid @RequestBody List<TbAtmuptmth> data){
        System.out.println(data);
        return new ResponseEntity<>(atmuptmthRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
   //TbAtmuptmth


}
