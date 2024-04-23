package com.ctrip.car.util;

import com.ctrip.car.osd.framework.common.utils.GzipUtil;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GzipUtilTest {
    @Test
    public void compressToString() {
        String compressedStr = GzipUtil.compressToString(unCompressedStr);
        String unzipCompressedStr = GzipUtil.uncompressToString(compressedStr);
        Assert.assertTrue(compressedStr.length() <= unzipCompressedStr.length());
        Assert.assertEquals(unCompressedStr, unzipCompressedStr);


        String base64 = "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";
        unzipCompressedStr = GzipUtil.uncompressToString(base64);
        Assert.assertEquals(unCompressedStr, unzipCompressedStr);
    }

    private static String unCompressedStr = "{\"baseResponse\":{\"code\":\"success\",\"cost\":504,\"extraIndexTags\":{\"pcountryId\":\"98\",\"rprovinceId\":\"10728\",\"preHours\":\"157\",\"pcountryName\":\"New Zealand\",\"pdate\":\"2019-06-03 10:00:00\",\"rcountryId\":\"98\",\"pprovinceId\":\"10728\",\"rcityName\":\"Auckland\",\"rdate\":\"2019-06-08 10:00:00\",\"pcityName\":\"Auckland\",\"rprovinceName\":\"Auckland\",\"easyLifeType\":\"0\",\"pprovinceName\":\"Auckland\",\"rcountryName\":\"New Zealand\",\"rentalDays\":\"5\",\"age\":\"30\",\"key\":\"osd:QueryProduct:gzip_pl_AKL_plt_1_pc_678_ps_AKLFF01_polo_0.0_pola_0.0_pd_20190603100000_rl_AKL_rlt_1_rc_678_rs_AKLFF01_rolo_0.0_rola_0.0_rd_20190608100000_ch_14595_lg_en_iv_1_vl_v_14057_vc_null_invl_10931_exvl__pil__sc_15_cur_CNY_ag_30_vg_null_isp_true_ver__uid_null_dvt_null_sf_IBU_Online_ey_0\"},\"isSuccess\":true,\"requestId\":\"6d915132-4dea-437f-929a-91885af0b15f\",\"returnMsg\":\"success\"},\"pickupLocation\":{\"bjDate\":\"2019-06-03 06:00:00\",\"cityId\":678,\"cityName\":\"Auckland\",\"continentId\":3,\"countryId\":98,\"countryName\":\"New Zealand\",\"date\":\"2019-06-03 10:00:00\",\"latitude\":-37.008248,\"locationCode\":\"AKL\",\"locationType\":1,\"longitude\":174.785036,\"provinceId\":10728,\"provinceName\":\"Auckland\",\"storeCode\":\"AKLFF01\"},\"rentalDays\":5,\"responseStatus\":{\"ack\":\"Success\",\"errors\":[],\"extension\":[],\"timestamp\":\"2019-05-27 16:54:40\"},\"returnLocation\":{\"bjDate\":\"2019-06-08 06:00:00\",\"cityId\":678,\"cityName\":\"Auckland\",\"continentId\":3,\"countryId\":98,\"countryName\":\"New Zealand\",\"date\":\"2019-06-08 10:00:00\",\"latitude\":-37.008248,\"locationCode\":\"AKL\",\"locationType\":1,\"longitude\":174.785036,\"provinceId\":10728,\"provinceName\":\"Auckland\",\"storeCode\":\"AKLFF01\"},\"vehicles\":[{\"abVersion\":\"B\",\"brandEName\":\"Toyota\",\"brandId\":49,\"brandName\":\"丰田\",\"comment\":\"\",\"defaultImageUrl\":\"//pic.c-ctrip.com/car/osd/online/vehicle_new/Toyota_RAV4.png\",\"displacement\":\"\",\"displaySortNum\":519,\"doorNo\":4,\"driveMode\":0,\"ename\":\"Toyota Rav4\",\"friendDesc\":\"\",\"fuelType\":1,\"greyBgImageUrl\":\"//pic.c-ctrip.com/car/osd/mobile/vehimg/gray/Toyota_RAV4.jpg\",\"groupBigName\":\"SUVs\",\"groupCode\":\"G05\",\"groupEName\":\"Intermediate SUV\",\"groupImgUrl\":\"//pic.ctrip.com//car/osd/mobile/21_car_group/intermediate_suv.png\",\"groupMappingId\":931,\"groupName\":\"Intermediate SUV\",\"groupSortNum\":5,\"hotTitle\":\"人气热销\",\"id\":10931,\"isDiscount\":true,\"isHot\":true,\"isMaster\":false,\"isNew\":true,\"largeLuggageNo\":2,\"luggageNo\":4,\"name\":\"Toyota Rav4\",\"passengerNo\":5,\"premiumLevel\":\"0\",\"realityImageUrl\":\"//pic.c-ctrip.com/car/osd/mobile/vehimg/vehcrn/Toyota--Rav4.jpg\",\"similarDesc\":\"\",\"sippCode\":\"IFAR\",\"smallLuggageNo\":2,\"spaceDesc\":\"\",\"structure\":5,\"subClassCode\":\"J\",\"topSortNum\":0,\"transmissionType\":1,\"vehicleCode\":\"10931\",\"whiteBgImageUrl\":\"//pic.c-ctrip.com/car/osd/mobile/vehimg/white/Toyota_RAV4.jpg\",\"year\":0}],\"vendors\":[{\"bizVendorCode\":\"14057\",\"brandDescription\":\"\",\"crossislandInfo\":{\"crossType\":\"crossIsland\",\"crossislandLocationList\":[{\"crossStatus\":3,\"locationId\":\"1\",\"locationName\":\"南岛\"},{\"crossStatus\":3,\"locationId\":\"2\",\"locationName\":\"北岛\"}],\"crossislandPolicyList\":[{\"policyDescription\":\"显示不允许跨岛的，是由于租车公司政策限制或选择的车型受限制，如果您必须驾车跨岛，建议您更换其它租车公司或车型组\",\"policyTitle\":\"不允许跨岛\",\"policyType\":3},{\"policyDescription\":\"显示不允许跨岛的，是由于租车公司政策限制或选择的车型受限制，如果您必须驾车跨岛，建议您更换其它租车公司或车型组\",\"policyTitle\":\"不允许跨岛\",\"policyType\":3}]},\"dataCreateTime\":\"2017-05-18 17:39:27\",\"easyLifeInfoList\":[null],\"hasFlightCertificate\":false,\"isBroker\":false,\"izucheLogoType\":3,\"packageList\":[{\"contractCode\":\"\",\"cooperationCode\":\"\",\"isEasyLife\":false,\"mutiDriverCount\":0,\"packageId\":4550,\"packageItems\":[{\"coverageDesc\":\"If the car’s bodywork gets damaged, the most you’ll pay is the damage excess.\",\"ctripGroupCode\":\"CDW\",\"ctripGroupName\":\"Damage Waiver\",\"ctripGroupTitle\":\"Damage Waiver\",\"ctripItemCode\":\"CDW\",\"ctripItemDesc\":\"Collision Damage Waiver\",\"itemLongDesc\":\"Reduce your financial liability if the car’s bodywork is damaged.\",\"packageId\":4550,\"type\":\"Insurance\",\"unCoverageDesc\":\"The policy's exclusions and limits:(1) Vehicle shall not be driven by any person other than Renter, or Additional Driver without Owner's prior written consent.(2) Vehicle shall not be used for transporting persons for hire; as a school bus; or for driver training.(3) Vehicle shall not be used for transport of products for hire as a common carrier, a contract carrier or a private carrier of property.(4) Vehicle shall not be used for: any illegal purposes; in any illegal or reckless manner; in a race or speed contest; or to tow or push anything.(5) Vehicle shall not be used to carry passengers in excess of the number of seat belts provided by manufacturer or outside of the passenger compartment.(6) Renter shall not remove any seats from Vehicle.(7) Vehicle shall not be driven by any person impaired by the use of alcohol, narcotics, intoxicants, or drugs, used with or without a prescription.(8) Vehicle shall not be loaded in excess of Vehicle's Gross Vehicle Weight Rating (GVWR) which is, weight of Vehicle plus weight of load, as indicated on the driver side door jam, or with an improperly or unevenly divided load as per Vehicle manufacturer's specifications and/or guidelines. (9) Vehicle shall not be driven or taken outside the United States unless authorized on the Rental Agreement Summary.(10) Vehicle shall not be driven on an unpaved road or off-road.(11) Vehicle shall not be operated by anyone: who has given a fictitious name, false address, or a false or invalid drive's license; whose driver's license becomes invalid during the Rental Period; who has obtained the keys without permission of Owner; or who misrepresents or withholds facts to/from Owner material to rental, use or operation of Vehicle.(12) Renter shall not transfer or assign this Agreement and/or sublease Vehicle.(13) Vehicle shall not be used to store or transport explosives, chemicals, corrosives or other hazardous materials or pollutants of any kind or nature.\",\"vendorItemCode\":\"CDW\",\"vendorItemName\":\"Collision Damage Waiver\"},{\"coverageDesc\":\"\",\"ctripGroupCode\":\"\",\"ctripGroupName\":\"\",\"ctripGroupTitle\":\"\",\"ctripItemCode\":\"FRFB\",\"ctripItemDesc\":\"Full to Full\",\"itemLongDesc\":\"The vehicle is supplied with a full tank of fuel, it should be returned full or refuelling charges will be applied.\",\"packageId\":4550,\"type\":\"Fuel\",\"unCoverageDesc\":\"\",\"vendorItemCode\":\"FRFB\",\"vendorItemName\":\"Full to Full\"},{\"coverageDesc\":\"\",\"ctripGroupCode\":\"\",\"ctripGroupName\":\"\",\"ctripGroupTitle\":\"\",\"ctripItemCode\":\"Fees\",\"ctripItemDesc\":\"Basic rental fee\",\"itemLongDesc\":\"The baisc charge that only vehicle renting fee included.\",\"packageId\":4550,\"type\":\"Car\",\"unCoverageDesc\":\"\",\"vendorItemCode\":\"Fees\",\"vendorItemName\":\"Basic rental fee\"},{\"coverageDesc\":\"If the car is stolen, all you’ll pay is the theft excess – not the full cost of the car.\",\"ctripGroupCode\":\"CDW\",\"ctripGroupName\":\"Damage Waiver\",\"ctripGroupTitle\":\"Damage Waiver\",\"ctripItemCode\":\"TP\",\"ctripItemDesc\":\"Theft Protection\",\"itemLongDesc\":\"Reduce your financial liability if the car is stolen.\",\"packageId\":4550,\"type\":\"Insurance\",\"unCoverageDesc\":\"THE POLICY DOES NOT COVER (1) outside the countries without permission; (2) by persons who are evidently under the influence of narcotics, alcohol or drugs; (3) keys are locked inside Vehicle; (4) Loss due to forgot to shut the door; (5)anything in the car (e.g. child seats, GPS devices or personal belongings); (6) on unpaved roads, racetracks and test courses; (7) in violation of the legally prescribed safety precautions; (8) for hire or reward or sublease; (9) for any purpose beyond the predictable and usual use, in particular any careless or reckless use, or intentional damage of the vehicle; (10)Loss or damage due to theft unless reported to Police; (11)Loss by mysterious disappearance; (12)Loss caused by war or any act of war.\",\"vendorItemCode\":\"TP\",\"vendorItemName\":\"Theft Protection\"},{\"coverageDesc\":\"It covers the driver’s liability for injuries and property damage which are covered by the policy. It does not cover injuries to the driver or damage to the rental car. This cover is only valid if you stick to the terms of the rental agreement.\",\"ctripGroupCode\":\"TPI\",\"ctripGroupName\":\"Third Party Liability\",\"ctripGroupTitle\":\"Third Party Liability\",\"ctripItemCode\":\"TPL\",\"ctripItemDesc\":\"Third Party Liability\",\"itemLongDesc\":\"Coverage on bodily injury to persons other than the driver and on property damage to anything other than the vehicle.\",\"packageId\":4550,\"type\":\"Insurance\",\"unCoverageDesc\":\"\",\"vendorItemCode\":\"TPL\",\"vendorItemName\":\"Third Party Liability\"},{\"coverageDesc\":\"\",\"ctripGroupCode\":\"\",\"ctripGroupName\":\"\",\"ctripGroupTitle\":\"\",\"ctripItemCode\":\"Taxes\",\"ctripItemDesc\":\"Taxes include Airport tax (pick up in airport), Customer facilities, Tourism tax, Sales tax\",\"itemLongDesc\":\"Taxes include Airport tax (pick up in airport), Customer facilities, Tourism tax, Sales tax, subject to location policy.\",\"packageId\":4550,\"type\":\"Tax\",\"unCoverageDesc\":\"\",\"vendorItemCode\":\"Taxes\",\"vendorItemName\":\"Taxes include Airport tax (pick up in airport), Customer facilities, Tourism tax, Sales tax\"},{\"coverageDesc\":\"\",\"ctripGroupCode\":\"\",\"ctripGroupName\":\"\",\"ctripGroupTitle\":\"\",\"ctripItemCode\":\"ULM\",\"ctripItemDesc\":\"Unlimited mileage\",\"itemLongDesc\":\"Unlimited mileage\",\"packageId\":4550,\"type\":\"Mile\",\"unCoverageDesc\":\"\",\"vendorItemCode\":\"ULM\",\"vendorItemName\":\"Unlimited mileage\"}],\"packageType\":0,\"promotionCode\":\"\",\"rateCode\":\"F05NNZ\",\"specialPriceCode\":\"\"}],\"productInfos\":[{\"bizVendorCode\":\"14057\",\"bomGroupCode\":\"AKLFF01_10931_CDW_FRFB_Fees_TP_TPL_Taxes_ULM_0_0\",\"decorateType\":0,\"fuleInfo\":{\"code\":\"FRFB\",\"desc\":\"The vehicle is supplied with a full tank of fuel, it should be returned full or refuelling charges will be applied.\",\"isGiven\":false,\"name\":\"Full to Full\"},\"isEasyLife\":false,\"needCreditCardInfo\":false,\"needFlightNo\":true,\"pickupStoreCode\":\"AKLFF01\",\"priceInfoList\":[{\"ageRestriction\":{\"description\":\"\",\"licenceAge\":1,\"licenceAgeDesc\":\"the driver must present a valid driver's license which has been held for at least 1 year.\",\"maxDriverAge\":99,\"minDriverAge\":18,\"oldDriverAge\":0,\"oldDriverAgeDesc\":\"\",\"oldDriverExtraFee\":{\"currentPrice\":0.0,\"feeType\":0,\"localCurrencyCode\":\"NZD\",\"localPrice\":0.0},\"youngDriverAge\":24,\"youngDriverAgeDesc\":\"The car rental company will charge an addtional \\\"young driver fee\\\" for the drivers under 18-24 at the counter. The fee will depend on the actual situation.\",\"youngDriverExtraFee\":{\"currentPrice\":0.0,\"feeType\":0,\"localCurrencyCode\":\"NZD\",\"localPrice\":0.0}},\"allowCoupon\":false,\"cancelRule\":{\"cancelDescription\":\"Free cancellation before pick-up\",\"hours\":0,\"isFreeCancel\":true,\"isTotalLoss\":false},\"chargeList\":[{\"code\":\"5\",\"description\":\"\",\"dueCurrenctAmount\":203.0,\"dueLocalAmount\":45.0,\"isIncludedInRate\":false,\"name\":\"AIRPORT CONCESSION FEE RECOVERY\",\"netCurrentAmount\":0.0,\"netLocalAmount\":0.0,\"payMode\":1,\"vendorCode\":\"5\",\"vendorName\":\"AIRPORT CONCESSION FEE RECOVERY\"},{\"code\":\"1\",\"description\":\"\",\"dueCurrenctAmount\":0.0,\"dueLocalAmount\":0.0,\"isIncludedInRate\":true,\"name\":\"Vehicle rental\",\"netCurrentAmount\":1386.0,\"netLocalAmount\":306.9,\"payMode\":1,\"vendorCode\":\"1\",\"vendorName\":\"Vehicle rental\"}],\"commissionBase\":306.9,\"commissionBaseCurrencyCode\":\"NZD\",\"confirmInfo\":{\"change\":false,\"confirmDesc\":\"Book now and your car will be confirmed instantly\",\"confirmRightNow\":true,\"confirmTime\":0.0,\"confirmTitle\":\"Quick Confirmation\"},\"couponbindId\":\"9999\",\"creditCard\":{\"cardList\":[{\"cardName\":\"Visa Card\",\"cardType\":\"VI\"},{\"cardName\":\"MasterCard\",\"cardType\":\"MC\"}],\"deduct\":0,\"depositCurrencyCode\":\"\",\"description\":\"The main driver must be in possession of the international chip Credit Card in their own name when picking up the car. The deposit amount will be blocked on the Card for the duration of the rental.Card holder’s name must be in accordance with that of the main driver's passport.2 credit cards are required for high-end vehicle models.The Card must have enough available funds to cover the excess / deposit amount.The deposit is expected to be refunded within 30-60 days after returning the car. You will not receive message notifying pre-authorization thawing. Please check if the credit card amout has been restored by yourself.\",\"formsofPayment\":1,\"isNeedChip\":true,\"isNeedEmbossed\":true,\"isSupportUnionLogo\":false,\"maxCreditCardFeePercent\":0.0,\"maxDeposit\":0.0,\"maxRefundDay\":60,\"minCreditCardFeePercent\":0.0,\"minDeposit\":0.0,\"minRefundDay\":30},\"currentBasePrice\":1827,\"currentCurrencyCode\":\"CNY\",\"currentDailyPrice\":365,\"currentOnewayfee\":0,\"currentPoaPrice\":1827,\"currentPrepaidPrice\":0,\"currentTaxPrice\":0,\"currentTotalPrice\":1827,\"exchangeRate\":4.5147,\"insuranceDetalList\":[{\"code\":\"CDW\",\"currencyCode\":\"NZD\",\"maxExcess\":5000.0,\"minExcess\":5000.0,\"name\":\"Collision Damage Waiver\"},{\"code\":\"TP\",\"currencyCode\":\"NZD\",\"maxExcess\":5000.0,\"minExcess\":5000.0,\"name\":\"Theft Protection\"}],\"localBasePrice\":404.69,\"localCurrencyCode\":\"NZD\",\"localDailyPrice\":80.94,\"localOnewayfee\":0.00,\"localPoaPrice\":404.69,\"localPrepaidPrice\":0.00,\"localTaxPrice\":0.00,\"localTotalPrice\":404.69,\"markupRate\":1.0,\"mileInfo\":{\"limitedDistance\":0.0,\"unLimited\":true},\"onewayfeeInclusive\":true,\"packageId\":4550,\"packageType\":0,\"payMode\":1,\"priceVersion\":\"ARYAPvt8+dLayztz9zBBlgWWY02tLtpqm8bV\",\"promotionList\":[],\"subType\":0,\"vcExtendRequest\":{}}],\"productCode\":\"1V000007642179\",\"returnStoreCode\":\"AKLFF01\",\"vendorVehicle\":{\"hasConditioner\":true,\"isSpecilized\":false,\"qualityScore\":0.0,\"vehicleCode\":\"10931\",\"vendorVehicleCode\":\"IFAR_JTOYOTARAV4\"}}],\"showIzuche\":true,\"sortNum\":1,\"storeList\":[{\"address\":\"AUCKLAND APT,ANDREW MCKEE AVENUE\",\"cityId\":678,\"cityName\":\"Auckland\",\"commentInfo\":{\"commentCount\":1,\"level\":\"Good\",\"newVendorDescDescription\":\"\",\"overallRating\":4.4,\"scoreItemList\":[{\"scoreStr\":\"4.49\",\"scoreType\":1,\"title\":\"整体评分\"},{\"scoreStr\":\"4.2\",\"scoreType\":2,\"title\":\"车辆状况\"},{\"scoreStr\":\"4.1\",\"scoreType\":4,\"title\":\"取还便捷\"},{\"scoreStr\":\"4.8\",\"scoreType\":5,\"title\":\"门店服务\"},{\"scoreStr\":\"4.4\",\"scoreType\":6,\"title\":\"用户点评\"}],\"vendorDesc\":\"\"},\"continentId\":3,\"countryId\":98,\"countryName\":\"New Zealand\",\"distance\":0.6,\"driverLicenceItemList\":[{\"groupCode\":\"lt1011\",\"groupSortNum\":11,\"licenceDesc\":\"Original full valid driving license issued by the lead driver's country.\",\"licenceName\":\"Original Driving License\",\"licenceType\":\"ODL\",\"sortNum\":2},{\"groupCode\":\"lt1011\",\"groupSortNum\":11,\"licenceDesc\":\"An identity document that allows the holder to drive a private motor vehicle in any country that recognises IDPs.\",\"licenceName\":\"International Driving Permit\",\"licenceType\":\"IDP\",\"sortNum\":14}],\"id\":332407,\"isAirportStore\":true,\"isInside\":true,\"latitude\":-37.005603000000000,\"longitude\":174.791014000000000,\"pickupStoreGuild\":\"The Firefly belongs to Hertz, which needs to go to Hertz. The store is located on the right side of the airport and can be reached on foot. Note that an effective flight number is required at the time of booking, otherwise the vehicle will be placed in the airports domestic terminal.\",\"postCode\":\"2022\",\"provinceId\":10728,\"provinceName\":\"Auckland\",\"returnStoreGuild\":\"\",\"returnStoreLocation\":\"On Airport\",\"storeCode\":\"AKLFF01\",\"storeLabelInfos\":[{\"labelItems\":[{\"category\":1,\"dimension\":1,\"name\":\"强烈推荐\",\"type\":1},{\"category\":2,\"dimension\":2,\"name\":\"车况佳\",\"type\":1},{\"category\":3,\"dimension\":1,\"name\":\"服务态度好\",\"type\":1}],\"packageType\":1},{\"labelItems\":[{\"category\":1,\"dimension\":1,\"name\":\"好\",\"type\":1}],\"packageType\":0}],\"storeLocation\":\"On Airport\",\"storeName\":\"AUCKLAND AIRPORT\",\"storeScoreInfos\":[{\"carScore\":4.2,\"convenienceScore\":4.1,\"exposedScore\":4.4,\"isNewVendor\":0,\"level\":\"Good\",\"packageType\":0,\"serviceScore\":89.92,\"suportScore\":4.8},{\"carScore\":4.9,\"convenienceScore\":4.9,\"exposedScore\":4.9,\"isNewVendor\":0,\"level\":\"Excellent\",\"packageType\":1,\"serviceScore\":100,\"suportScore\":4.9}],\"storeServiceList\":[{\"description\":\"使用电子版提车凭证取车更加方便，免去打印纸质提车凭证的麻烦\",\"title\":\"电子提车凭证\",\"typeCode\":\"F\"}],\"storeTerms\":[{\"longDescription\":\"The Firefly belongs to Hertz, which needs to go to Hertz. The store is located on the right side of the airport and can be reached on foot. Note that an effective flight number is required at the time of booking, otherwise the vehicle will be placed in the airports domestic terminal.\",\"shortDescription\":\"pick up direction\",\"title\":\"Directions\",\"type\":4},{\"longDescription\":\"\",\"shortDescription\":\"\",\"title\":\"Cross Border Policy\",\"type\":12},{\"longDescription\":\"\",\"shortDescription\":\"\",\"title\":\"Cross Border Policy\",\"type\":12},{\"longDescription\":\"Flight Number Mandatory\",\"shortDescription\":\"Flight Number Restriction\",\"title\":\"Flight Number Restriction\",\"type\":13}],\"storeWay\":\"Within walking distance\",\"telephone\":\"0064-9-2568692\",\"vendorStoreCode\":\"AKL\",\"workTime\":{\"pickupWorkTime\":{\"currencyCode\":\"\",\"fee\":0.0,\"isOutOfHour\":false,\"isSupportSelfService\":false,\"openTimeDesc\":\"0:01 - 2:00,05:00 - 23:59\",\"outOfHourDescription\":\"\",\"workingHours\":[{\"begin\":\"0:01\",\"end\":\"2:00\"},{\"begin\":\"05:00\",\"end\":\"23:59\"}]},\"returnWorkTime\":{\"currencyCode\":\"\",\"fee\":0.0,\"isOutOfHour\":false,\"isSupportSelfService\":false,\"openTimeDesc\":\"00:01 - 01:30,5:00 - 23:59\",\"outOfHourDescription\":\"\",\"workingHours\":[{\"begin\":\"00:01\",\"end\":\"01:30\"},{\"begin\":\"5:00\",\"end\":\"23:59\"}]}}}],\"vendorCode\":\"SD0051\",\"vendorConfirmModeType\":4,\"vendorImageUrl\":\"//pic.c-ctrip.com/car/osd/ctrip/vendor_logo/firefly.png\",\"vendorName\":\"Firefly\",\"vendorShortCode\":\"FF\"}]}\n";
}