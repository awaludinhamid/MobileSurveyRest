package com.safasoft.pentaho.datatrans.main;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.safasoft.pentaho.datatrans.run.*;

public class Main {
	
  private static final Logger logger = Logger.getLogger("others");
  private static int numOfRecord;
  private static int numOfBulkRecord;
  private static int numOfThreadActive;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		initProperty();
		//ApplBankBranch
		ApplBankBranchRun abbRun = new ApplBankBranchRun();
		//abbRun.transferData(numOfBulkRecord);
		//ApplCompanyData
		ApplCompanyDataRun acdRun = new ApplCompanyDataRun();
		//acdRun.transferData(numOfBulkRecord);
		//ApplCoyBankacctRun
		ApplCoyBankacctRun acbRun = new ApplCoyBankacctRun();
		//acbRun.transferData(numOfBulkRecord);
		//ApplCoyarea
		ApplCoyareaRun acRun = new ApplCoyareaRun();
		//acRun.transferData(numOfBulkRecord);
		//ApplCoyoutlet
		ApplCoyoutletRun acoRun = new ApplCoyoutletRun();
		//acoRun.transferData(numOfBulkRecord);
		//ApplCustBank
		ApplCustBankRun acubRun = new ApplCustBankRun();
		//acubRun.transferData(numOfBulkRecord);
		//ApplCustGroup
		ApplCustGroupRun acgRun = new ApplCustGroupRun();
		//acgRun.transferData(numOfBulkRecord);
		//ApplCustInd
		ApplCustIndRun aciRun = new ApplCustIndRun();
		//aciRun.transferData(numOfBulkRecord);
		//ApplCustcoyCat
		ApplCustcoyCatRun accRun = new ApplCustcoyCatRun();
		//accRun.transferData(numOfBulkRecord);
		//ApplCustindCat
		ApplCustindCatRun acicRun = new ApplCustindCatRun();
		//acicRun.transferData(numOfBulkRecord);
		//ApplMstArea
		ApplMstAreaRun amaRun = new ApplMstAreaRun();
		//amaRun.transferData(numOfBulkRecord);
		//ApplMstBank
		ApplMstBankRun ambRun = new ApplMstBankRun();
		//ambRun.transferData(numOfBulkRecord);
		//ApplMstCarabayar
		ApplMstCarabayarRun amcRun = new ApplMstCarabayarRun();
		//amcRun.transferData(numOfBulkRecord);
		//ApplMstCash
		ApplMstCashRun amcaRun = new ApplMstCashRun();
		//amcaRun.transferData(numOfBulkRecord);
		//ApplMstCurrency
		ApplMstCurrencyRun amcuRun = new ApplMstCurrencyRun();
		//amcuRun.transferData(numOfBulkRecord);
		//ApplMstCustomer
		ApplMstCustomerRun amcusRun = new ApplMstCustomerRun();
		//amcusRun.transferData(numOfBulkRecord);
		//ApplMstEducation
		ApplMstEducationRun ameRun = new ApplMstEducationRun();
		//ameRun.transferData(numOfBulkRecord);
		//ApplMstHousestatus
		ApplMstHousestatusRun amhRun = new ApplMstHousestatusRun();
		//amhRun.transferData(numOfBulkRecord);
		//ApplMstIdtyp
		ApplMstIdtypeRun amiRun = new ApplMstIdtypeRun();
		//amiRun.transferData(numOfBulkRecord);
		//ApplMstKabkota
		ApplMstKabkotaRun amkRun = new ApplMstKabkotaRun();
		//amkRun.transferData(numOfBulkRecord);
		//ApplMstKecamatan
		ApplMstKecamatanRun amkeRun = new ApplMstKecamatanRun();
		//amkeRun.transferData(numOfBulkRecord);
		//ApplMstKontak
		ApplMstKontakRun amkoRun = new ApplMstKontakRun();
		//amkoRun.transferData(numOfBulkRecord);
		//ApplMstMarketprog
		ApplMstMarketprogRun ammRun = new ApplMstMarketprogRun();
		//ammRun.transferData(numOfBulkRecord);
		//ApplMstOccupation
		ApplMstOccupationRun amoRun = new ApplMstOccupationRun();
		//amoRun.transferData(numOfBulkRecord);
		//ApplMstOrderType
		ApplMstOrderTypeRun amotRun = new ApplMstOrderTypeRun();
		//amotRun.transferData(numOfBulkRecord);
		//ApplMstProvince
		ApplMstProvinceRun ampRun = new ApplMstProvinceRun();
		//ampRun.transferData(numOfBulkRecord);
		//ApplMstReligion
		ApplMstReligionRun amrRun = new ApplMstReligionRun();
		//amrRun.transferData(numOfBulkRecord);
		//ApplMstWiltagih
		ApplMstWiltagihRun amwRun = new ApplMstWiltagihRun();
		//amwRun.transferData(numOfBulkRecord);
		//ApplMstZipcode
		ApplMstZipcodeRun amzRun = new ApplMstZipcodeRun();
		//amzRun.transferData(numOfBulkRecord);
		//ApplUsers
		ApplUsersRun auRun = new ApplUsersRun();
		//auRun.transferData(numOfBulkRecord);
		//CfinArBeban
		CfinArBebanRun cabRun = new CfinArBebanRun();
		//cabRun.transferData(numOfBulkRecord);
		//CfinCfgroup
		CfinCfgroupRun ccRun = new CfinCfgroupRun();
		//ccRun.transferData(numOfBulkRecord);
		//CfinCfgroupAccount
		CfinCfgroupAccountRun ccaRun = new CfinCfgroupAccountRun();
		//ccaRun.transferData(numOfBulkRecord);
		//CfinContCancel
		CfinContCancelRun cccRun = new CfinContCancelRun();
		//cccRun.transferData(numOfBulkRecord);
		//CfinContCustind
		CfinContCustindRun cccuRun = new CfinContCustindRun();
		//cccuRun.transferData(numOfBulkRecord);
		//CfinContaddrTgh
		CfinContaddrTghRun cctRun = new CfinContaddrTghRun();
		//cctRun.transferData(numOfBulkRecord);
		//CfinInterestType
		CfinInterestTypeRun citRun = new CfinInterestTypeRun();
		//citRun.transferData(numOfBulkRecord);
		//CfinMstCfgacct
		CfinMstCfgacctRun cmcRun = new CfinMstCfgacctRun();
		//cmcRun.transferData(numOfBulkRecord);
		//CfinMstCollector
		CfinMstCollectorRun cmcoRun = new CfinMstCollectorRun();
		//cmcoRun.transferData(numOfBulkRecord);
		//CfinMstMemoAr
		CfinMstMemoArRun cmmRun = new CfinMstMemoArRun();
		//cmmRun.transferData(numOfBulkRecord);
		//CfinMstObject
		CfinMstObjectRun cmoRun = new CfinMstObjectRun();
		//cmoRun.transferData(numOfBulkRecord);
		//CfinMstParamProyeksi
		CfinMstParamProyeksiRun cppRun = new CfinMstParamProyeksiRun();
		//cppRun.transferData(numOfBulkRecord);
		//CfinMstPotensiProyeksi
		CfinMstPotensiProyeksiRun cpprRun = new CfinMstPotensiProyeksiRun();
		//cpprRun.transferData(numOfBulkRecord);
		//CfinMstRevOrRejPkpd
		CfinMstRevOrRejPkpdRun crrRun = new CfinMstRevOrRejPkpdRun();
		//crrRun.transferData(numOfBulkRecord);
		//CfinMstRiFamilyMeet
		CfinMstRiFamilyMeetRun cmrRun = new CfinMstRiFamilyMeetRun();
		//cmrRun.transferData(numOfBulkRecord);
		//CfinMstRiParam
		CfinMstRiParamRun cmrpRun = new CfinMstRiParamRun();
		//cmrpRun.transferData(numOfBulkRecord);
		//CfinMstRiPrioHdrs
		CfinMstRiPrioHdrsRun cmrphRun = new CfinMstRiPrioHdrsRun();
		//cmrphRun.transferData(numOfBulkRecord);
		//CfinMstRiPrioDtls
		CfinMstRiPrioDtlsRun cmrpdRun = new CfinMstRiPrioDtlsRun();
		//cmrpdRun.transferData(numOfBulkRecord);
		//CfinMstRiPriorities
		CfinMstRiPrioritiesRun cmrprRun = new CfinMstRiPrioritiesRun();
		//cmrprRun.transferData(numOfBulkRecord);
		//CfinMstSourceofbooking
		CfinMstSourceofbookingRun cmsRun = new CfinMstSourceofbookingRun();
		//cmsRun.transferData(numOfBulkRecord);
		//CfinMstVehicle
		CfinMstVehicleRun cmvRun = new CfinMstVehicleRun();
		//cmvRun.transferData(numOfBulkRecord);
		//CfinMstVmktprice
		CfinMstVmktpriceRun cmvmRun = new CfinMstVmktpriceRun();
		//cmvmRun.transferData(numOfBulkRecord);
		//CfinOrderRefinance
		CfinOrderRefinanceRun corRun = new CfinOrderRefinanceRun();
		//corRun.transferData(numOfBulkRecord);
		//CfinOverbookDtl
		CfinOverbookDtlRun codRun = new CfinOverbookDtlRun();
		//codRun.transferData(numOfBulkRecord);
		//CfinOverbookHdr
		CfinOverbookHdrRun cohRun = new CfinOverbookHdrRun();
		//cohRun.transferData(numOfBulkRecord);
		//CfinPenaltyNego
		CfinPenaltyNegoRun cpnRun = new CfinPenaltyNegoRun();
		//cpnRun.transferData(numOfBulkRecord);
		//CfinRepayHistory
		CfinRepayHistoryRun cphRun = new CfinRepayHistoryRun();
		//cphRun.transferData(numOfBulkRecord);
		//CfinRepaySchd
		CfinRepaySchdRun crsRun = new CfinRepaySchdRun();
		//crsRun.transferData(numOfBulkRecord);
		//CfinStktrKredit
		CfinStktrKreditRun cskRun = new CfinStktrKreditRun();
		cskRun.transferData(numOfRecord, numOfBulkRecord, numOfThreadActive);
		//CfinTbSaldo
		CfinTbSaldoRun ctsRun = new CfinTbSaldoRun();
		//ctsRun.transferData(numOfBulkRecord);
		//CfinTermination
		CfinTerminationRun ctRun = new CfinTerminationRun();
		//ctRun.transferData(numOfBulkRecord);
		//CfinTrnBtca
		CfinTrnBtcaRun ctbRun = new CfinTrnBtcaRun();
		//ctbRun.transferData(numOfBulkRecord);
		//CfinTrnContracts
		CfinTrnContractsRun ctcRun = new CfinTrnContractsRun();
		//ctcRun.transferData(numOfBulkRecord, numOfThreadActive);
		//CfinTrnOrder
		CfinTrnOrderRun ctoRun = new CfinTrnOrderRun();
		//ctoRun.transferData(numOfBulkRecord, numOfThreadActive);
		//CfinTrnRiContract
		CfinTrnRiContractRun ctrcRun = new CfinTrnRiContractRun();
		//ctrcRun.transferData(numOfBulkRecord);
		//CfinTrnRiLkriHdr
		CfinTrnRiLkriHdrRun ctrlhRun = new CfinTrnRiLkriHdrRun();
		//ctrlhRun.transferData(numOfBulkRecord);
		//CfinTrnRiLkriDtl
		CfinTrnRiLkriDtlRun ctrldRun = new CfinTrnRiLkriDtlRun();
		//ctrldRun.transferData(numOfBulkRecord);
		//CfinTrnRiMemo
		CfinTrnRiMemoRun ctrmRun = new CfinTrnRiMemoRun();
		//ctrmRun.transferData(numOfBulkRecord);
		//CfinTrnRiRepayHistory
		CfinTrnRiRepayHistoryRun ctrrhRun = new CfinTrnRiRepayHistoryRun();
		//ctrrhRun.transferData(numOfBulkRecord);
		//RinvOutHdr
		RinvOutHdrRun rohRun = new RinvOutHdrRun();
		//rohRun.transferData(numOfBulkRecord);
		//RinvOutDtl
		RinvOutDtlRun rodRun = new RinvOutDtlRun();
		//rodRun.transferData(numOfBulkRecord);
		//RinvPickupHdr
		RinvPickupHdrRun rphRun = new RinvPickupHdrRun();
		//rphRun.transferData(numOfBulkRecord);
		//RinvPickupDtl
		RinvPickupDtlRun rpdRun = new RinvPickupDtlRun();
		//rpdRun.transferData(numOfBulkRecord);
		//RinvPkgsoldHdr
		RinvPkgsoldHdrRun rpshRun = new RinvPkgsoldHdrRun();
		//rpshRun.transferData(numOfBulkRecord);
		//RinvPkgsoldDtl
		RinvPkgsoldDtlRun rpsdRun = new RinvPkgsoldDtlRun();
		//rpsdRun.transferData(numOfBulkRecord);
		//RinvReceivedHdr
		RinvReceivedHdrRun rrhRun = new RinvReceivedHdrRun();
		//rrhRun.transferData(numOfBulkRecord);
		//RinvReceivedDtl
		RinvReceivedDtlRun rrdRun = new RinvReceivedDtlRun();
		//rrdRun.transferData(numOfBulkRecord);
		//RinvTrnInventory
		RinvTrnInventoryRun rtiRun = new RinvTrnInventoryRun();
		//rtiRun.transferData(numOfBulkRecord);
		//FinInvhdrMstparam
		FinInvhdrMstparamRun fimRun = new FinInvhdrMstparamRun();
		//fimRun.transferData(numOfBulkRecord);
		//FinMstCardAccount
		FinMstCardAccountRun fmcaRun = new FinMstCardAccountRun();
		//fmcaRun.transferData(numOfBulkRecord);
		//FinMstCardIssuer
		FinMstCardIssuerRun fmciRun = new FinMstCardIssuerRun();
		//fmciRun.transferData(numOfBulkRecord);
		//FinMstGroupCoahdr
		FinMstGroupCoahdrRun fmgcRun = new FinMstGroupCoahdrRun();
		//fmgcRun.transferData(numOfBulkRecord);
		//FinMstGroupCoadtl
		FinMstGroupCoadtlRun fmgcdRun = new FinMstGroupCoadtlRun();
		//fmgcdRun.transferData(numOfBulkRecord);
		//FinMstPphcode
		FinMstPphcodeRun fmpRun = new FinMstPphcodeRun();
		//fmpRun.transferData(numOfBulkRecord);
		//FinMstPymtcard
		FinMstPymtcardRun fmpcRun = new FinMstPymtcardRun();
		//fmpcRun.transferData(numOfBulkRecord);
		//FinMstTrxdtl
		FinMstTrxdtlRun fmtRun = new FinMstTrxdtlRun();
		//fmtRun.transferData(numOfBulkRecord);
		//FinRvInterface
		FinRvInterfaceRun friRun = new FinRvInterfaceRun();
		//friRun.transferData(numOfBulkRecord);
		//FinRvhdrMstparam
		FinRvhdrMstparamRun frmRun = new FinRvhdrMstparamRun();
		//frmRun.transferData(numOfBulkRecord);
		//FinTrnbankBalance
		FinTrnbankBalanceRun ftbRun = new FinTrnbankBalanceRun();
		//ftbRun.transferData(numOfBulkRecord);
		//FinTrncashBalance
		FinTrncashBalanceRun ftcbRun = new FinTrncashBalanceRun();
		//ftcbRun.transferData(numOfBulkRecord);
		//FinTrxdtlParam
		FinTrxdtlParamRun ftpRun = new FinTrxdtlParamRun();
		//ftpRun.transferData(numOfBulkRecord);
		//GlMstAccount
		GlMstAccountRun gmaRun = new GlMstAccountRun();
		//gmaRun.transferData(numOfBulkRecord);
		//GlMstBuAccount
		GlMstBuAccountRun gmbaRun = new GlMstBuAccountRun();
		//gmbaRun.transferData(numOfBulkRecord);
		//GlMstJcatg
		GlMstJcatgRun gmjRun = new GlMstJcatgRun();
		//gmjRun.transferData(numOfBulkRecord);
		//GlMstJsource
		GlMstJsourceRun gmjsRun = new GlMstJsourceRun();
		//gmjsRun.transferData(numOfBulkRecord);
		//GlPeriod
		GlPeriodRun gpRun = new GlPeriodRun();
		//gpRun.transferData(numOfBulkRecord);
		//HrDeptAll
		HrDeptAllRun hdaRun = new HrDeptAllRun();
		//hdaRun.transferData(numOfBulkRecord);
		//HrMstBenefitType
		HrMstBenefitTypeRun hmbtRun = new HrMstBenefitTypeRun();
		//hmbtRun.transferData(numOfBulkRecord);
		//HrMstEmployeeSts
		HrMstEmployeeStsRun hmesRun = new HrMstEmployeeStsRun();
		//hmesRun.transferData(numOfBulkRecord);
		//HrMstJob
		HrMstJobRun hmjRun = new HrMstJobRun();
		//hmjRun.transferData(numOfBulkRecord);
		//HrMstPosition
		HrMstPositionRun hmpRun = new HrMstPositionRun();
		//hmpRun.transferData(numOfBulkRecord);
		//HrMstRelation
		HrMstRelationRun hmrRun = new HrMstRelationRun();
		//hmrRun.transferData(numOfBulkRecord);
		//HrMstorgType
		HrMstorgTypeRun hmtRun = new HrMstorgTypeRun();
		//hmtRun.transferData(numOfBulkRecord);
		//HrPeopleAll
		HrPeopleAllRun hpaRun = new HrPeopleAllRun();
		//hpaRun.transferData(numOfBulkRecord);
		//HrPeopleAssignment
		HrPeopleAssignmentRun hpasRun = new HrPeopleAssignmentRun();
		//hpasRun.transferData(numOfBulkRecord);
		//CmMstPitStop
		CmMstPitStopRun cmpsRun = new CmMstPitStopRun();
		//cmpsRun.transferData(numOfBulkRecord);
		//CmTghLkpHdrs
		CmTghLkpHdrsRun ctlhRun = new CmTghLkpHdrsRun();
		//ctlhRun.transferData(numOfBulkRecord);
		//CmTghLkpDtls
		CmTghLkpDtlsRun ctldRun = new CmTghLkpDtlsRun();
		//ctldRun.transferData(numOfBulkRecord);
		//CmTghMstActionPlan
		CmTghMstActionPlanRun ctmapRun = new CmTghMstActionPlanRun();
		//ctmapRun.transferData(numOfBulkRecord);
		//CmTghMstAreaSpv
		CmTghMstAreaSpvRun ctmasRun = new CmTghMstAreaSpvRun();
		//ctmasRun.transferData(numOfBulkRecord);
		//CmTghMstAreaZona
		CmTghMstAreaZonaRun ctmazRun = new CmTghMstAreaZonaRun();
		//ctmazRun.transferData(numOfBulkRecord);
		//CmTghMstClassifications
		CmTghMstClassificationsRun ctmcRun = new CmTghMstClassificationsRun();
		//ctmcRun.transferData(numOfBulkRecord);
		//CmTghMstCycles
		CmTghMstCyclesRun ctmcyRun = new CmTghMstCyclesRun();
		//ctmcyRun.transferData(numOfBulkRecord);
		//CmTghMstDelqReasons
		CmTghMstDelqReasonsRun ctmdrRun = new CmTghMstDelqReasonsRun();
		//ctmdrRun.transferData(numOfBulkRecord);
		//CmTghMstLkpParam
		CmTghMstLkpParamRun ctmlpRun = new CmTghMstLkpParamRun();
		//ctmlpRun.transferData(numOfBulkRecord);
		//CmTghMstMatrix
		CmTghMstMatrixRun ctmmRun = new CmTghMstMatrixRun();
		//ctmmRun.transferData(numOfBulkRecord);
		//CmTghMstPattern
		CmTghMstPatternRun ctmpRun = new CmTghMstPatternRun();
		//ctmpRun.transferData(numOfBulkRecord);
		//CmTghMstPitstop
		CmTghMstPitstopRun ctmpiRun = new CmTghMstPitstopRun();
		//ctmpiRun.transferData(numOfBulkRecord);
		//CmTghMstPotential
		CmTghMstPotentialRun ctmpoRun = new CmTghMstPotentialRun();
		//ctmpoRun.transferData(numOfBulkRecord);
		//CmTghMstPriorities
		CmTghMstPrioritiesRun ctmprRun = new CmTghMstPrioritiesRun();
		//ctmprRun.transferData(numOfBulkRecord);
		//CmTghMstRelation
		CmTghMstRelationRun ctmrRun = new CmTghMstRelationRun();
		//ctmrRun.transferData(numOfBulkRecord);
		//CmTghMstSomationType
		CmTghMstSomationTypeRun ctmstRun = new CmTghMstSomationTypeRun();
		//ctmstRun.transferData(numOfBulkRecord);
		//CmTghMstUnitLocation
		CmTghMstUnitLocationRun ctmulRun = new CmTghMstUnitLocationRun();
		//ctmulRun.transferData(numOfBulkRecord);
		//CmTghTrnVisitHdr
		CmTghTrnVisitHdrRun cttvhRun = new CmTghTrnVisitHdrRun();
		//cttvhRun.transferData(numOfBulkRecord);
		//CmTghTrnVisitDtl
		CmTghTrnVisitDtlRun cttvdRun = new CmTghTrnVisitDtlRun();
		//cttvdRun.transferData(numOfBulkRecord);
		//CollMstLocation
		CollMstLocationRun cmlRun = new CollMstLocationRun();
		//cmlRun.transferData(numOfBulkRecord);
	}
  
  private static void initProperty() {
		//
    try {
      Properties prop = new Properties();
			prop.load(Main.class.getClassLoader().getResourceAsStream("jdbc.properties"));
			numOfRecord = Integer.parseInt(prop.getProperty("batch.numOfRecord"));
			numOfBulkRecord = Integer.parseInt(prop.getProperty("batch.numOfBulkRecord"));
			numOfThreadActive = Integer.parseInt(prop.getProperty("batch.numOfThreadActive"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			numOfRecord = 0;
			numOfBulkRecord = 0;
			numOfThreadActive = 0;
			logger.error(e);
		}
  }

}
