//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.10 at 11:06:37 AM UYT 
//


package client.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UNSPSCClassList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UNSPSCClassList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Records" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UNSPSCClassData" type="{http://www.webservicex.net/}ArrayOfUNSPSCClass" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UNSPSCClassList", propOrder = {
    "records",
    "unspscClassData"
})
public class UNSPSCClassList {

    @XmlElement(name = "Records")
    protected int records;
    @XmlElement(name = "UNSPSCClassData")
    protected ArrayOfUNSPSCClass unspscClassData;

    /**
     * Gets the value of the records property.
     * 
     */
    public int getRecords() {
        return records;
    }

    /**
     * Sets the value of the records property.
     * 
     */
    public void setRecords(int value) {
        this.records = value;
    }

    /**
     * Gets the value of the unspscClassData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUNSPSCClass }
     *     
     */
    public ArrayOfUNSPSCClass getUNSPSCClassData() {
        return unspscClassData;
    }

    /**
     * Sets the value of the unspscClassData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUNSPSCClass }
     *     
     */
    public void setUNSPSCClassData(ArrayOfUNSPSCClass value) {
        this.unspscClassData = value;
    }

}