package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Oct 5, 2021
 */

@Entity
@Table(name="HOUSE")
public class House {
		
	@Id
	@GeneratedValue
	@Column(name="HOUSEID")
	private int houseId;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="ZIPCODE")
	private int zipcode;
	
	@Column(name="SELLINGPRICE")
	private int sellingPrice;
	
	@Column(name="MARKETDATE")
	private Date marketDate;

	/**
	 * @return the houseId
	 */
	public int getHouseId() {
		return houseId;
	}

	/**
	 * @param houseId the houseId to set
	 */
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the zipcode
	 */
	public int getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @return the sellingPrice
	 */
	public int getSellingPrice() {
		return sellingPrice;
	}

	/**
	 * @param sellingPrice the sellingPrice to set
	 */
	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	/**
	 * @return the marketDate
	 */
	public Date getMarketDate() {
		return marketDate;
	}

	/**
	 * @param marketDate the marketDate to set
	 */
	public void setMarketDate(Date marketDate) {
		this.marketDate = marketDate;
	}

	@Override
	public String toString() {
		return "Address [houseId=" + houseId + ", address=" + address + ", zipcode=" + zipcode + ", sellingPrice="
				+ sellingPrice + ", marketDate=" + marketDate + "]";
	}
}
