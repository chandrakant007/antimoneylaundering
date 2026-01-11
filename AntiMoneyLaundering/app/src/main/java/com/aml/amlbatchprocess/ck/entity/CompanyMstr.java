
package com.aml.amlbatchprocess.ck.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Chandrakant
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "chemr_customer_group")
@XmlRootElement
//@NamedQueries({ @NamedQuery(name = "CompanyMstr.findAll", query = "SELECT c FROM CompanyMstr c"),
//		@NamedQuery(name = "CompanyMstr.findByCompanyId", query = "SELECT c FROM CompanyMstr c WHERE c.companyId = :companyId"),
//		@NamedQuery(name = "CompanyMstr.findByCompanyName", query = "SELECT c FROM CompanyMstr c WHERE c.companyName = :companyName"),
//		@NamedQuery(name = "CompanyMstr.findByActive", query = "SELECT c FROM CompanyMstr c WHERE c.active = :active"),
//		@NamedQuery(name = "CompanyMstr.findByAddress", query = "SELECT c FROM CompanyMstr c WHERE c.address1 = :address1"),
//		@NamedQuery(name = "CompanyMstr.findByCity", query = "SELECT c FROM CompanyMstr c WHERE c.city = :city"),
//		@NamedQuery(name = "CompanyMstr.findByState", query = "SELECT c FROM CompanyMstr c WHERE c.state = :state"),
//		@NamedQuery(name = "CompanyMstr.findByZip", query = "SELECT c FROM CompanyMstr c WHERE c.zip = :zip"),
//		@NamedQuery(name = "CompanyMstr.findByLogo", query = "SELECT c FROM CompanyMstr c WHERE c.logoUrl = :logoUrl"),
//		@NamedQuery(name = "CompanyMstr.findByEmail", query = "SELECT c FROM CompanyMstr c WHERE c.email = :email"),
//		@NamedQuery(name = "CompanyMstr.findByPhone", query = "SELECT c FROM CompanyMstr c WHERE c.phone = :phone"),
//		@NamedQuery(name = "CompanyMstr.findByMobile", query = "SELECT c FROM CompanyMstr c WHERE c.mobile = :mobile") })
public class CompanyMstr implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id", nullable = false)
	private Integer companyId;

	@Column(name = "name", length = 255)
	private String companyName;

	@Column(name = "work_phone", length = 25)
	private String phone;

	@Column(name = "mobile_phone", length = 25)
	private String mobile;

	@Column(name = "primary_email", length = 100)
	private String email;

	@Column(name = "alternative_email", length = 100)
	private String alternativeEmail;

	@Column(name = "fax", length = 25)
	private String fax;

	@Column(name = "address1", length = 255)
	private String address1;

	@Column(name = "address2", length = 255)
	private String address2;

	@Column(name = "city", length = 45)
	private String city;

	@Column(name = "state", length = 45)
	private String state;

	@Column(name = "country", length = 45)
	private String country;

	// @Size(max = 6)
	@Column(name = "zipcode", length = 6)
	private Integer zip;

	@Column(name = "dl_no", length = 200)
	private String dlNo;

	@Column(name = "gst", length = 200)
	private String gst;

	@Column(name = "description", length = 255)
	private String description;

	@Column(name = "root_folder_path", length = 255)
	private String rootFolderPath;

	@Column(name = "enable_status", length = 1)
	private Boolean active;

	@Column(name = "logo_url", length = 255)
	private String logoUrl;

	@Column(name = "logo_path", length = 255)
	private String logoPath;

	@Column(name = "meta_super_admin_date_created")
	private Date createdDate;

	@Column(name = "meta_super_admin_created")
	private Integer createdById;

	@Column(name = "meta_super_admin_date_modified")
	private Date modifiedDate;

	@Column(name = "meta_super_admin_modified")
	private Integer modifiedById;

	@Column(name = "patient_id_prefix")
	private String patientIdPrefix;
	
	@Column(name = "meta_status", length = 1)
	private Boolean metaStatus;

	public CompanyMstr() {

	}

	public CompanyMstr(Integer companyId) {
		this.companyId = companyId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (companyId != null ? companyId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the companyId
		// fields are
		// not set
		if (!(object instanceof CompanyMstr)) {
			return false;
		}
		CompanyMstr other = (CompanyMstr) object;
		if ((this.companyId == null && other.companyId != null)
				|| (this.companyId != null && !this.companyId.equals(other.companyId))) {
			return false;
		}
		return true;
	}

}
