
package com.genscript.gsscm.epicorwebservice.stub.part;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipRowType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipRowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callContextIn" type="{http://epicor.com/schemas}CallContextDataSetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "companyID",
    "ipRowType",
    "ipRowID",
    "callContextIn"
})
@XmlRootElement(name = "GetMfgPartFromRowID")
public class GetMfgPartFromRowID {

    @XmlElement(name = "CompanyID", namespace = "http://epicor.com/webservices/")
    protected String companyID;
    @XmlElement(namespace = "http://epicor.com/webservices/")
    protected String ipRowType;
    @XmlElement(namespace = "http://epicor.com/webservices/")
    protected String ipRowID;
    @XmlElement(namespace = "http://epicor.com/webservices/")
    protected CallContextDataSetType callContextIn;

    /**
     * Gets the value of the companyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyID(String value) {
        this.companyID = value;
    }

    /**
     * Gets the value of the ipRowType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpRowType() {
        return ipRowType;
    }

    /**
     * Sets the value of the ipRowType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpRowType(String value) {
        this.ipRowType = value;
    }

    /**
     * Gets the value of the ipRowID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpRowID() {
        return ipRowID;
    }

    /**
     * Sets the value of the ipRowID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpRowID(String value) {
        this.ipRowID = value;
    }

    /**
     * Gets the value of the callContextIn property.
     * 
     * @return
     *     possible object is
     *     {@link CallContextDataSetType }
     *     
     */
    public CallContextDataSetType getCallContextIn() {
        return callContextIn;
    }

    /**
     * Sets the value of the callContextIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallContextDataSetType }
     *     
     */
    public void setCallContextIn(CallContextDataSetType value) {
        this.callContextIn = value;
    }

}
