//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.10 at 11:06:37 AM UYT 
//


package client.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUNSPSCCommodity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUNSPSCCommodity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UNSPSCCommodity" type="{http://www.webservicex.net/}UNSPSCCommodity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUNSPSCCommodity", propOrder = {
    "unspscCommodity"
})
public class ArrayOfUNSPSCCommodity {

    @XmlElement(name = "UNSPSCCommodity")
    protected List<UNSPSCCommodity> unspscCommodity;

    /**
     * Gets the value of the unspscCommodity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unspscCommodity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUNSPSCCommodity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UNSPSCCommodity }
     * 
     * 
     */
    public List<UNSPSCCommodity> getUNSPSCCommodity() {
        if (unspscCommodity == null) {
            unspscCommodity = new ArrayList<UNSPSCCommodity>();
        }
        return this.unspscCommodity;
    }

}