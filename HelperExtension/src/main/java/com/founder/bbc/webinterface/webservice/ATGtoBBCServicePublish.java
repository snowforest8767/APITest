package com.founder.bbc.webinterface.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2016-04-01T16:20:40.456+08:00
 * Generated source version: 2.7.3
 * 
 */
@WebService(targetNamespace = "http://webservice.webInterface.bbc.founder.com/", name = "ATGtoBBCServicePublish")
@XmlSeeAlso({ObjectFactory.class})
public interface ATGtoBBCServicePublish {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCSearchTemplate", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCSearchTemplate")
    @WebMethod
    @ResponseWrapper(localName = "toBBCSearchTemplateResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCSearchTemplateResponse")
    public java.lang.String toBBCSearchTemplate(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCAreaPrice", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCAreaPrice")
    @WebMethod
    @ResponseWrapper(localName = "toBBCAreaPriceResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCAreaPriceResponse")
    public java.lang.String toBBCAreaPrice(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCPromotionsInfo", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCPromotionsInfo")
    @WebMethod
    @ResponseWrapper(localName = "toBBCPromotionsInfoResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCPromotionsInfoResponse")
    public java.lang.String toBBCPromotionsInfo(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCResult", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCResult")
    @WebMethod
    @ResponseWrapper(localName = "toBBCResultResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCResultResponse")
    public java.lang.String toBBCResult(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCAppraiseInfo", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCAppraiseInfo")
    @WebMethod
    @ResponseWrapper(localName = "toBBCAppraiseInfoResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCAppraiseInfoResponse")
    public java.lang.String toBBCAppraiseInfo(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCSkuInfo", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCSkuInfo")
    @WebMethod
    @ResponseWrapper(localName = "toBBCSkuInfoResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCSkuInfoResponse")
    public java.lang.String toBBCSkuInfo(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCVipEvents", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCVipEvents")
    @WebMethod
    @ResponseWrapper(localName = "toBBCVipEventsResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCVipEventsResponse")
    public java.lang.String toBBCVipEvents(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCSpecItemValue", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCSpecItemValue")
    @WebMethod
    @ResponseWrapper(localName = "toBBCSpecItemValueResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCSpecItemValueResponse")
    public java.lang.String toBBCSpecItemValue(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCVip06", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCVip06")
    @WebMethod
    @ResponseWrapper(localName = "toBBCVip06Response", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCVip06Response")
    public java.lang.String toBBCVip06(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCShopCollect", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCShopCollect")
    @WebMethod
    @ResponseWrapper(localName = "toBBCShopCollectResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCShopCollectResponse")
    public java.lang.String toBBCShopCollect(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCConsultationInfo", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCConsultationInfo")
    @WebMethod
    @ResponseWrapper(localName = "toBBCConsultationInfoResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCConsultationInfoResponse")
    public java.lang.String toBBCConsultationInfo(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCSpecTemplate", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCSpecTemplate")
    @WebMethod
    @ResponseWrapper(localName = "toBBCSpecTemplateResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCSpecTemplateResponse")
    public java.lang.String toBBCSpecTemplate(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCShopBlack", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCShopBlack")
    @WebMethod
    @ResponseWrapper(localName = "toBBCShopBlackResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCShopBlackResponse")
    public java.lang.String toBBCShopBlack(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCShopAppraise", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCShopAppraise")
    @WebMethod
    @ResponseWrapper(localName = "toBBCShopAppraiseResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCShopAppraiseResponse")
    public java.lang.String toBBCShopAppraise(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCGoods3DFlag", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCGoods3DFlag")
    @WebMethod
    @ResponseWrapper(localName = "toBBCGoods3DFlagResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCGoods3DFlagResponse")
    public java.lang.String toBBCGoods3DFlag(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCBackOrderApply", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCBackOrderApply")
    @WebMethod
    @ResponseWrapper(localName = "toBBCBackOrderApplyResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCBackOrderApplyResponse")
    public java.lang.String toBBCBackOrderApply(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCBrandInfo", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCBrandInfo")
    @WebMethod
    @ResponseWrapper(localName = "toBBCBrandInfoResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCBrandInfoResponse")
    public java.lang.String toBBCBrandInfo(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCGomeCtgyInfo", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCGomeCtgyInfo")
    @WebMethod
    @ResponseWrapper(localName = "toBBCGomeCtgyInfoResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCGomeCtgyInfoResponse")
    public java.lang.String toBBCGomeCtgyInfo(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCComplainInfo", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCComplainInfo")
    @WebMethod
    @ResponseWrapper(localName = "toBBCComplainInfoResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCComplainInfoResponse")
    public java.lang.String toBBCComplainInfo(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "toBBCVipProgramAudit", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCVipProgramAudit")
    @WebMethod
    @ResponseWrapper(localName = "toBBCVipProgramAuditResponse", targetNamespace = "http://webservice.webInterface.bbc.founder.com/", className = "com.founder.bbc.webinterface.webservice.ToBBCVipProgramAuditResponse")
    public java.lang.String toBBCVipProgramAudit(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
