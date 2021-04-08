package rw.co.gtbank.edwh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import rw.co.gtbank.edwh.entity.*;
import rw.co.gtbank.edwh.exceptions.CustomerErrorGenerator;
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

    @Autowired
    private TbBouncecheqRepository bouncecheqRepository;

    @Autowired
    private TbBranchinfoRepository branchinfoRepository;

    @Autowired
    private TbCcyratesRepository ccyratess;

    @Autowired
    private TbCollateralRepository collateralRepository;

    @Autowired
    private TbContloanRepository contloanRepository;

    @Autowired
    private TbContRepository contRepository;

    @Autowired
    private TbContscheRepository contscheRepository;

    @Autowired
    private TbCrossbtxnRepository crossbtxnRepository;

    @Autowired
    private TbCustomersRepository customersRepository;

    @Autowired
    private TbExauditorsRepository exauditorsRepository;

    @Autowired
    private TbFincaptxnRepository fincaptxnRepository;

    @Autowired
    private TbFinmthRepository finmthRepository;

    @Autowired
    private TbFintxnRepository fintxnRepository;

    @Autowired
    private TbFraudtxnRepository fraudtxnRepository;

    @Autowired
    private TbFxcapsFXRepository fxcapsFXRepository;

    @Autowired
    private TbFxdemandRepository fxdemandRepository;

    @Autowired
    private TbFxtxnFXRepository fxtxnFXRepository;

    @Autowired
    private TbGlcodesRepository glcodesRepository;

    @Autowired
    private TbGlmapsRepository glmapsRepository;

    @Autowired
    private TbInfrasinfoRepository infrasinfoRepository;

    @Autowired
    private TblncirepRepository lncirepRepository;

    @Autowired
    private TbLoanapp2Repository loanapp2Repository;

    @Autowired
    private TbLoanapppreRepository loanapppreRepository;

    @Autowired
    private TbLoanwrtoffRepository loanwrtoffRepository;

    @Autowired
    private TbMgtinfo2Repository mgtinfo2Repository;

    @Autowired
    private TbMtommtrfRepository mtommtrfRepository;

    @Autowired
    private TbNewperfRepository newperfRepository;

    @Autowired
    private TbNplrecovRepository nplrecovRepository;

    @Autowired
    private TbReadinessRepository readinessRepository;

    @Autowired
    private TbShmembersRepository shmembersRepository;

    @Autowired
    private TbStaffinfoRepository staffinfoRepository;

    @Autowired
    private TbSuspitxnRepository suspitxnRepository;

    @Autowired
    private TbTrailbalRepository trailbalRepository;

    @Autowired
    private CustomerErrorGenerator customerErrorGenerator;

    @PostMapping(value = "/TbAccounts")
    public ResponseEntity<?> saveTbAccountsReport(@Valid @RequestBody List<TbAccounts> data, BindingResult bindingResult){
        System.out.println("saved");
        if (customerErrorGenerator.getErrors(bindingResult) != null) {
            return new CustomerErrorGenerator().getErrors(bindingResult);
        } else {
            return new ResponseEntity<>(accountsRepository.saveAll(data), HttpStatus.ACCEPTED);
        }
    }
    @PostMapping(value = "/TbAcctmaps")
    public ResponseEntity<?> saveTbAcctmapsReport(@Valid @RequestBody List<TbAcctmaps> data){
        return new ResponseEntity<>(acctmapsRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbCustomers")
    public ResponseEntity<?> saveTbCustomersReport(@Valid @RequestBody List<TbCustomers> data){
        return new ResponseEntity<>(customersRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbAtmofustxn")
    public ResponseEntity<?> saveTbAtmofustxnReport(@Valid @RequestBody List<TbAtmofustxn> data){
        return new ResponseEntity<>(atmofustxnRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbAtmposdt")
    public ResponseEntity<?> saveTbTbAtmposdtReport(@Valid @RequestBody List<TbAtmposdt> data){
        return new ResponseEntity<>(atmposdtRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbAtmuptmth")
    public ResponseEntity<?> saveTbAtmuptmthReport(@Valid @RequestBody List<TbAtmuptmth> data){
        System.out.println(data);
        return new ResponseEntity<>(atmuptmthRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbBouncecheq")
    public ResponseEntity<?> saveTbBouncecheqReport(@Valid @RequestBody List<TbBouncecheq> data){
        System.out.println("saved");
        return new ResponseEntity<>(bouncecheqRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbBranchinfo")
    public ResponseEntity<?> saveTbTbBranchinfoReport(@Valid @RequestBody List<TbBranchinfo> data){
        return new ResponseEntity<>(branchinfoRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbCcyrates")
    public ResponseEntity<?> saveTbCcyratesReport(@Valid @RequestBody List<TbCcyrates> data){
        return new ResponseEntity<>(ccyratess.saveAll(data), HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/TbCollateral")
    public ResponseEntity<?> saveTbCollateralReport(@Valid @RequestBody List<TbCollateral> data){
        return new ResponseEntity<>(collateralRepository.saveAll(data), HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/TbContloan")
    public ResponseEntity<?> saveTbContloanReport(@Valid @RequestBody List<TbContloan> data){
        return new ResponseEntity<>(contloanRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbCont")
    public ResponseEntity<?> saveTbContReport(@Valid @RequestBody List<TbCont> data){
        System.out.println(data);
        return new ResponseEntity<>(contRepository.saveAll(data), HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/TbContsche")
    public ResponseEntity<?> saveTbContscheReport(@Valid @RequestBody List<TbContsche> data){
        return new ResponseEntity<>(contscheRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbCrossbtxn")
    public ResponseEntity<?> saveTbCrossbtxnReport(@Valid @RequestBody List<TbCrossbtxn> data){
        System.out.println("saved");
        return new ResponseEntity<>(crossbtxnRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbGlcodes")
    public ResponseEntity<?> saveTbGlcodesReport(@Valid @RequestBody List<TbGlcodes> data){
        return new ResponseEntity<>(glcodesRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbGlmaps")
    public ResponseEntity<?> saveTbGlmapsReport(@Valid @RequestBody List<TbGlmaps> data){
        return new ResponseEntity<>(glmapsRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbInfrasinfo")
    public ResponseEntity<?> saveTbInfrasinfoReport(@Valid @RequestBody List<TbInfrasinfo> data){
        return new ResponseEntity<>(infrasinfoRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/Tblncirep")
    public ResponseEntity<?> saveTblncirepReport(@Valid @RequestBody List<TbIncirep> data){
        System.out.println(data);
        return new ResponseEntity<>(lncirepRepository.saveAll(data), HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/TbLoanapp2")
    public ResponseEntity<?> saveTbLoanapp2Report(@Valid @RequestBody List<TbLoanapp2> data){
        System.out.println("saved");
        return new ResponseEntity<>(loanapp2Repository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbLoanapppre")
    public ResponseEntity<?> saveTbLoanapppreReport(@Valid @RequestBody List<TbLoanapppre> data){
        return new ResponseEntity<>(loanapppreRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbLoanwrtoff")
    public ResponseEntity<?> saveTbLoanwrtoffReport(@Valid @RequestBody List<TbLoanwrtoff> data){
        return new ResponseEntity<>(loanwrtoffRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbMgtinfo2")
    public ResponseEntity<?> saveTbMgtinfo2Report(@Valid @RequestBody List<TbMgtinfo2> data){
        return new ResponseEntity<>(mgtinfo2Repository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbMtommtrf")
    public ResponseEntity<?> saveTbMtommtrfReport(@Valid @RequestBody List<TbMtommtrf> data){
        return new ResponseEntity<>(mtommtrfRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbAnitcimat")
    public ResponseEntity<?> saveTbAnitcimatReport(@Valid @RequestBody List<TbAnitcimat> data){
        return new ResponseEntity<>(anitcimatRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbExauditors")
    public ResponseEntity<?> saveTbExauditorsReport(@Valid @RequestBody List<TbExauditors> data){
        return new ResponseEntity<>(exauditorsRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbFincaptxn")
    public ResponseEntity<?> saveTbFincaptxnReport(@Valid @RequestBody List<TbFincaptxn> data){
        return new ResponseEntity<>(fincaptxnRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbFinmth")
    public ResponseEntity<?> saveTbFinmthReport(@Valid @RequestBody List<TbFinmth> data){
        System.out.println(data);
        return new ResponseEntity<>(finmthRepository.saveAll(data), HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/TbFintxn")
    public ResponseEntity<?> saveTbFintxnReport(@Valid @RequestBody List<TbFintxn> data){
        System.out.println("saved");
        return new ResponseEntity<>(fintxnRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbFraudtxn")
    public ResponseEntity<?> saveTbFraudtxnReport(@Valid @RequestBody List<TbFraudtxn> data){
        return new ResponseEntity<>(fraudtxnRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbFxcaps")
    public ResponseEntity<?> saveTbFxcapsFXReport(@Valid @RequestBody List<TbFxcaps> data){
        return new ResponseEntity<>(fxcapsFXRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbFxdemand")
    public ResponseEntity<?> saveTbFxdemandReport(@Valid @RequestBody List<TbFxdemand> data){
        return new ResponseEntity<>(fxdemandRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbFxtxn")
    public ResponseEntity<?> saveTbFxtxnReport(@Valid @RequestBody List<TbFxtxn> data){
        return new ResponseEntity<>(fxtxnFXRepository.saveAll(data), HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/TbNewperf")
    public ResponseEntity<?> saveTbNewperfReport(@Valid @RequestBody List<TbNetwperf> data){
        System.out.println("saved");
        return new ResponseEntity<>(newperfRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbNplrecov")
    public ResponseEntity<?> saveTbNplrecovReport(@Valid @RequestBody List<TbNplrecov> data){
        return new ResponseEntity<>(nplrecovRepository.saveAll(data), HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/TbReadiness")
    public ResponseEntity<?> saveTbReadinessReport(@Valid @RequestBody List<TbReadiness> data){
        return new ResponseEntity<>(readinessRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbShmembers")
    public ResponseEntity<?> saveTbShmembersReport(@Valid @RequestBody List<TbShmembers> data){
        return new ResponseEntity<>(shmembersRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbStaffinfo")
    public ResponseEntity<?> saveTbStaffinfoReport(@Valid @RequestBody List<TbStaffinfo> data){
        return new ResponseEntity<>(staffinfoRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbSuspitxn")
    public ResponseEntity<?> saveTbSuspitxnReport(@Valid @RequestBody List<TbSuspitxn> data){
        return new ResponseEntity<>(suspitxnRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/TbTrailbal")
    public ResponseEntity<?> saveTbTrailbalReport(@Valid @RequestBody List<TbTrialbal> data){
        return new ResponseEntity<>(trailbalRepository.saveAll(data), HttpStatus.ACCEPTED);
    }
}
