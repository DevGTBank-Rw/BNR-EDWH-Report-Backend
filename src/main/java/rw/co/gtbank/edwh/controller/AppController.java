package rw.co.gtbank.edwh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import rw.co.gtbank.edwh.entity.*;
import rw.co.gtbank.edwh.exceptions.CustomerErrorGenerator;
import rw.co.gtbank.edwh.repository.*;

import javax.validation.Valid;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	private TbAtmuptdlyRepository atmuptdlyRepository;

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

	@Autowired
	private TbStakeHoldRepository tbStakeHoldRepository;

	@Autowired
	private TbContDisbRepository tbContDispRepository;

	@PostMapping(value = "/TbAccounts")
	@Transactional
	public ResponseEntity<?> saveTbAccountsReport(@Valid @RequestBody List<TbAccounts> data,
			BindingResult bindingResult) {
		System.out.println("saved" + data);
		accountsRepository.deleteByDateModified(data.get(0).getDateLastModified());
		if (customerErrorGenerator.getErrors(bindingResult) != null) {
			return new CustomerErrorGenerator().getErrors(bindingResult);
		} else {
			return new ResponseEntity<>(accountsRepository.saveAll(data), HttpStatus.ACCEPTED);
		}
	}

	@PostMapping(value = "/TbAcctmaps")
	@Transactional
	public ResponseEntity<?> saveTbAcctmapsReport(@Valid @RequestBody List<TbAcctmaps> data) {
		acctmapsRepository.deleteByDateModified(data.get(0).getDateLastModified());
		List<TbAcctmaps> list1 = acctmapsRepository.saveAll(data);
		if (list1.size() > 0) {
			return ResponseEntity.ok().body("file uploaded");
		} else {
			return new ResponseEntity<>("Error occurred", HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping(value = "/TbCustomers")
	@Transactional
	public ResponseEntity<?> saveTbCustomersReport(@Valid @RequestBody List<TbCustomers> data) {
		customersRepository.deleteByDateModified(data.get(0).getDateLastModified());
		return new ResponseEntity<>(customersRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbAtmofustxn")
	@Transactional
	public ResponseEntity<?> saveTbAtmofustxnReport(@Valid @RequestBody List<TbAtmofustxn> data) {
		atmofustxnRepository.deleteByDateModified(data.get(0).getYearMonth());
		return new ResponseEntity<>(atmofustxnRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbAtmposdt")
	@Transactional
	public ResponseEntity<?> saveTbTbAtmposdtReport(@Valid @RequestBody List<TbAtmposdt> data) {
		atmposdtRepository.deleteByDateModified(data.get(0).getYearMonth());
		return new ResponseEntity<>(atmposdtRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbAtmuptdly")
	@Transactional
	public ResponseEntity<?> saveTbAtmuptdly(@Valid @RequestBody List<TbAtmuptdly> data) {
		atmuptdlyRepository.deleteByDate(data.get(0).getBusinessDate());
		return new ResponseEntity<>(atmuptdlyRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbAtmuptmth")
	@Transactional
	public ResponseEntity<?> saveTbAtmuptmthReport(@Valid @RequestBody List<TbAtmuptmth> data) {
		atmuptmthRepository.deleteByDateModified(data.get(0).getYearMonth());
		return new ResponseEntity<>(atmuptmthRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbBouncecheq")
	@Transactional
	public ResponseEntity<?> saveTbBouncecheqReport(@Valid @RequestBody List<TbBouncecheq> data) {
		bouncecheqRepository.deleteByDate(data.get(0).getBusinessDate());
		return new ResponseEntity<>(bouncecheqRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbBranchinfo")
	@Transactional
	public ResponseEntity<?> saveTbTbBranchinfoReport(@Valid @RequestBody List<TbBranchinfo> data) {
		branchinfoRepository.deleteByDate(data.get(0).getDateLastModified());
		return new ResponseEntity<>(branchinfoRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbCcyrates")
	@Transactional
	public ResponseEntity<?> saveTbCcyratesReport(@Valid @RequestBody List<TbCcyrates> data) {
		ccyratess.deleteByDate(data.get(0).getBusinessDate());
		return new ResponseEntity<>(ccyratess.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbCollateral")
	@Transactional
	public ResponseEntity<?> saveTbCollateralReport(@Valid @RequestBody List<TbCollateral> data) {
		collateralRepository.deleteByDate(data.get(0).getDateLastModified());
		return new ResponseEntity<>(collateralRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbContloan")
	@Transactional
	public ResponseEntity<?> saveTbContloanReport(@Valid @RequestBody List<TbContloan> data) {
		contloanRepository.deleteByDate(data.get(0).getYearMonth());
		return new ResponseEntity<>(contloanRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbCont")
	@Transactional
	public ResponseEntity<?> saveTbContReport(@Valid @RequestBody List<TbCont> data) {
		contRepository.deleteByDateModified(data.get(0).getDateLastModified());
		List<TbCont> list1 = contRepository.saveAll(data);
		if (list1.size() > 0) {
			return ResponseEntity.ok().body("file uploaded");
		} else {
			return new ResponseEntity<>("Error occurred", HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping(value = "/TbContsche")
	@Transactional
	public ResponseEntity<?> saveTbContscheReport(@Valid @RequestBody List<TbContsche> data) {
		contscheRepository.deleteByDate(data.get(0).getYearMonth());
		return new ResponseEntity<>(contscheRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbCrossbtxn")
	@Transactional
	public ResponseEntity<?> saveTbCrossbtxnReport(@Valid @RequestBody List<TbCrossbtxn> data) {
		crossbtxnRepository.deleteByDate(data.get(0).getYearMonth());
		return new ResponseEntity<>(crossbtxnRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbGlcodes")
	@Transactional
	public ResponseEntity<?> saveTbGlcodesReport(@Valid @RequestBody List<TbGlcodes> data) {
		glcodesRepository.deleteByDate(data.get(0).getDateLastModified());
		return new ResponseEntity<>(glcodesRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbGlmaps")
	@Transactional
	public ResponseEntity<?> saveTbGlmapsReport(@Valid @RequestBody List<TbGlmaps> data) {
		glmapsRepository.deleteByDate(data.get(0).getDateLastModified());
		return new ResponseEntity<>(glmapsRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbInfrasinfo")
	@Transactional
	public ResponseEntity<?> saveTbInfrasinfoReport(@Valid @RequestBody List<TbInfrasinfo> data) {
		infrasinfoRepository.deleteByDate(data.get(0).getYearMonth());
		return new ResponseEntity<>(infrasinfoRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/Tblncirep")
	@Transactional
	public ResponseEntity<?> saveTblncirepReport(@Valid @RequestBody List<TbIncirep> data) {
		lncirepRepository.deleteByDate(data.get(0).getDateLastModified());
		return new ResponseEntity<>(lncirepRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbLoanapp2")
	@Transactional
	public ResponseEntity<?> saveTbLoanapp2Report(@Valid @RequestBody List<TbLoanapp2> data) {
		loanapp2Repository.deleteByDate(data.get(0).getBusinessDate());
		return new ResponseEntity<>(loanapp2Repository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbLoanapppre")
	@Transactional
	public ResponseEntity<?> saveTbLoanapppreReport(@Valid @RequestBody List<TbLoanapppre> data) {
		loanapppreRepository.deleteByDate(data.get(0).getBusinessDate());
		return new ResponseEntity<>(loanapppreRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbLoanwrtoff")
	@Transactional
	public ResponseEntity<?> saveTbLoanwrtoffReport(@Valid @RequestBody List<TbLoanwrtoff> data) {
		loanwrtoffRepository.deleteByDate(data.get(0).getYearMonth());
		return new ResponseEntity<>(loanwrtoffRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbMgtinfo2")
	@Transactional
	public ResponseEntity<?> saveTbMgtinfo2Report(@Valid @RequestBody List<TbMgtinfo2> data) {
		mgtinfo2Repository.deleteByDate(data.get(0).getYearMonth());
		return new ResponseEntity<>(mgtinfo2Repository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbMtommtrf")
	@Transactional
	public ResponseEntity<?> saveTbMtommtrfReport(@Valid @RequestBody List<TbMtommtrf> data) {
		mtommtrfRepository.deleteByDate(data.get(0).getBusinessDate());
		return new ResponseEntity<>(mtommtrfRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbAnitcimat")
	@Transactional
	public ResponseEntity<?> saveTbAnitcimatReport(@Valid @RequestBody List<TbAnitcimat> data) {
		anitcimatRepository.deleteByDate(data.get(0).getYearMonth());
		return new ResponseEntity<>(anitcimatRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbExauditors")
	@Transactional
	public ResponseEntity<?> saveTbExauditorsReport(@Valid @RequestBody List<TbExauditors> data) {
		exauditorsRepository.deleteByDate(data.get(0).getYearMonth());
		return new ResponseEntity<>(exauditorsRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbFincaptxn")
	@Transactional
	public ResponseEntity<?> saveTbFincaptxnReport(@Valid @RequestBody List<TbFincaptxn> data) {
		fincaptxnRepository.deleteByDate(data.get(0).getBusinessDate());
		return new ResponseEntity<>(fincaptxnRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbFinmth")
	@Transactional
	public ResponseEntity<?> saveTbFinmthReport(@Valid @RequestBody List<TbFinmth> data) {
		finmthRepository.deleteByDate(data.get(0).getYearMonth());
		return new ResponseEntity<>(finmthRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbFintxn")
	@Transactional
	public ResponseEntity<?> saveTbFintxnReport(@Valid @RequestBody List<TbFintxn> data) {
		fintxnRepository.deleteByDate(data.get(0).getYearMonth());
		return new ResponseEntity<>(fintxnRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbFraudtxn")
	@Transactional
	public ResponseEntity<?> saveTbFraudtxnReport(@Valid @RequestBody List<TbFraudtxn> data) {
		fraudtxnRepository.deleteByDate(data.get(0).getBusinessDate());
		return new ResponseEntity<>(fraudtxnRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbFxcaps")
	@Transactional
	public ResponseEntity<?> saveTbFxcapsFXReport(@Valid @RequestBody List<TbFxcaps> data) {
		fxcapsFXRepository.deleteByDate(data.get(0).getBusinessDate());
		return new ResponseEntity<>(fxcapsFXRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbFxdemand")
	@Transactional
	public ResponseEntity<?> saveTbFxdemandReport(@Valid @RequestBody List<TbFxdemand> data) {
		fxdemandRepository.deleteByDate(data.get(0).getBusinessDate());
		return new ResponseEntity<>(fxdemandRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbFxtxn")
	@Transactional
	public ResponseEntity<?> saveTbFxtxnReport(@Valid @RequestBody List<TbFxtxn> data) {
		fxtxnFXRepository.deleteByDate(data.get(0).getYearMonth());
		return new ResponseEntity<>(fxtxnFXRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbNewperf")
	@Transactional
	public ResponseEntity<?> saveTbNewperfReport(@Valid @RequestBody List<TbNetwperf> data) {
		newperfRepository.deleteByDate(data.get(0).getYearMonth());
		return new ResponseEntity<>(newperfRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbNplrecov")
	@Transactional
	public ResponseEntity<?> saveTbNplrecovReport(@Valid @RequestBody List<TbNplrecov> data) {
		nplrecovRepository.deleteByDate(data.get(0).getYearMonth());
		return new ResponseEntity<>(nplrecovRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbReadiness")
	@Transactional
	public ResponseEntity<?> saveTbReadinessReport(@Valid @RequestBody List<TbReadiness> data) {
		readinessRepository.deleteByDate(data.get(0).getBusinessDate());
		return new ResponseEntity<>(readinessRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbShmembers")
	@Transactional
	public ResponseEntity<?> saveTbShmembersReport(@Valid @RequestBody List<TbShmembers> data) {
		shmembersRepository.deleteByDate(data.get(0).getYearMonth());
		return new ResponseEntity<>(shmembersRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbStaffinfo")
	@Transactional
	public ResponseEntity<?> saveTbStaffinfoReport(@Valid @RequestBody List<TbStaffinfo> data) {
		staffinfoRepository.deleteByDate(data.get(0).getYearMonth());
		return new ResponseEntity<>(staffinfoRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbSuspitxn")
	@Transactional
	public ResponseEntity<?> saveTbSuspitxnReport(@Valid @RequestBody List<TbSuspitxn> data) {
		suspitxnRepository.deleteByDate(data.get(0).getBusinessDate());
		return new ResponseEntity<>(suspitxnRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbTrailbal")
	@Transactional
	public ResponseEntity<?> saveTbTrailbalReport(@Valid @RequestBody List<TbTrialbal> data) {
		trailbalRepository.deleteByDate(data.get(0).getBusinessDate());
		return new ResponseEntity<>(trailbalRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbStakeHold")
	@Transactional
	public ResponseEntity<?> saveTbStakeHold(@Valid @RequestBody List<TbStakehold> data) {
		tbStakeHoldRepository.deleteByDate(data.get(0).getYearMonth());
		return new ResponseEntity<>(tbStakeHoldRepository.saveAll(data), HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/TbContDisb")
	@Transactional
	public ResponseEntity<?> saveTbContDisp(@Valid @RequestBody List<TbContDisb> data) {
		tbContDispRepository.deleteByDate(data.get(0).getBusinessDate());
		return new ResponseEntity<>(tbContDispRepository.saveAll(data), HttpStatus.ACCEPTED);
	}
}
