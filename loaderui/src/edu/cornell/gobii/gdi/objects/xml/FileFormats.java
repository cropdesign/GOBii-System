//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.13 at 02:59:53 PM EDT 
//


package edu.cornell.gobii.gdi.objects.xml;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="FileFormat" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="extention" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="delim" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "fileFormat"
})
@XmlRootElement(name = "FileFormats")
public class FileFormats {

    @XmlElement(name = "FileFormat")
    protected List<FileFormats.FileFormat> fileFormat;

    /**
     * Gets the value of the fileFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileFormats.FileFormat }
     * 
     * 
     */
    public List<FileFormats.FileFormat> getFileFormat() {
        if (fileFormat == null) {
            fileFormat = new ArrayList<FileFormats.FileFormat>();
        }
        return this.fileFormat;
    }


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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="extention" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="delim" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "name",
        "extention",
        "delim"
    })
    public static class FileFormat {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String extention;
        @XmlElement(required = true)
        protected String delim;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the extention property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtention() {
            return extention;
        }

        /**
         * Sets the value of the extention property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtention(String value) {
            this.extention = value;
        }

        /**
         * Gets the value of the delim property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDelim() {
            return delim;
        }

        /**
         * Sets the value of the delim property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDelim(String value) {
            this.delim = value;
        }

        public String toString(){
        	return name + " ("+extention+")";
        }
    }

}
