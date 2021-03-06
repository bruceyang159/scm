package com.genscript.gsscm.epicorwebservice.stub.invoiceService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.7
 * 2011-12-13T11:11:39.375+08:00
 * Generated source version: 2.3.7
 * 
 */
@WebService(targetNamespace = "http://www.genscript.com/", name = "ServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface ServiceSoap {

    /**
     * <br><div> 返回所传参数日期的付款信息(如果参数为null则返回当天的付款信息)<ul><li><b>参数:</b> <font color=#336699><b>String</b></font> tranDate (格式:yyyy-MM-dd)</li><li><b>返回:</b> paymentInfoDataSet</li></ui></div>
     */
    @WebResult(name = "getPaymentListResult", targetNamespace = "http://www.genscript.com/")
    @RequestWrapper(localName = "getPaymentList", targetNamespace = "http://www.genscript.com/", className = "com.genscript.GetPaymentList")
    @WebMethod(action = "http://www.genscript.com/getPaymentList")
    @ResponseWrapper(localName = "getPaymentListResponse", targetNamespace = "http://www.genscript.com/", className = "com.genscript.GetPaymentListResponse")
    public com.genscript.gsscm.epicorwebservice.stub.invoiceService.ArrayOfPayment getPaymentList(
        @WebParam(name = "tranDate", targetNamespace = "http://www.genscript.com/")
        java.lang.String tranDate
    );

    /**
     * <br><div> getInventoryQtyAdjList<ul><li><b>参数:</b> <font color=#336699><b>List</b></font> partNumList (List partNumList由两个string类型的字段PartNum,Company组成;顺序不能颠倒)</li><li><b>返回:</b> InventoryQtyAdjList</li></ui></div>
     */
    @WebResult(name = "getInventoryQtyAdjListResult", targetNamespace = "http://www.genscript.com/")
    @RequestWrapper(localName = "getInventoryQtyAdjList", targetNamespace = "http://www.genscript.com/", className = "com.genscript.GetInventoryQtyAdjList")
    @WebMethod(action = "http://www.genscript.com/getInventoryQtyAdjList")
    @ResponseWrapper(localName = "getInventoryQtyAdjListResponse", targetNamespace = "http://www.genscript.com/", className = "com.genscript.GetInventoryQtyAdjListResponse")
    public com.genscript.gsscm.epicorwebservice.stub.invoiceService.ArrayOfInventoryQtyAdjItem getInventoryQtyAdjList(
        @WebParam(name = "partNumList", targetNamespace = "http://www.genscript.com/")
        com.genscript.gsscm.epicorwebservice.stub.invoiceService.ArrayOfPartItem partNumList
    );

    /**
     * <br><div> 返回所传参数日期的发票信息(如果参数为null则返回当天的发票信息)<ul><li><b>参数:</b> <font color=#336699><b>String</b></font> changeDate (格式:yyyy-MM-dd)</li><li><b>返回:</b> invoiceInfoDataSet</li></ui></div>
     */
    @WebResult(name = "getInvoiceListResult", targetNamespace = "http://www.genscript.com/")
    @RequestWrapper(localName = "getInvoiceList", targetNamespace = "http://www.genscript.com/", className = "com.genscript.GetInvoiceList")
    @WebMethod(action = "http://www.genscript.com/getInvoiceList")
    @ResponseWrapper(localName = "getInvoiceListResponse", targetNamespace = "http://www.genscript.com/", className = "com.genscript.GetInvoiceListResponse")
    public com.genscript.gsscm.epicorwebservice.stub.invoiceService.ArrayOfInvoice getInvoiceList(
        @WebParam(name = "changeDate", targetNamespace = "http://www.genscript.com/")
        java.lang.String changeDate
    );
}
