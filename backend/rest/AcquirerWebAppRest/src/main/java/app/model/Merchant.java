package app.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Merchant {

	@Id
	private String id;
	
	@NotNull(message = "error.merchantId.notnull")
	@Size(min = 5, max = 30, message = "error.merchantId.size")
	private String merchantId;

	@NotNull(message = "error.merchatPassword.notnull")
	@Size(min = 5, max = 30, message = "error.merchatPassword.size")
	private String merchantPassword;

	public Merchant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Merchant(String id, String merchantId, String merchantPassword) {
		super();
		this.id = id;
		this.merchantId = merchantId;
		this.merchantPassword = merchantPassword;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantPassword() {
		return merchantPassword;
	}

	public void setMerchantPassword(String merchantPassword) {
		this.merchantPassword = merchantPassword;
	}

	@Override
	public String toString() {
		return "MerchantRegistar [id=" + id + ", merchantId=" + merchantId + ", merchantPassword=" + merchantPassword
				+ "]";
	}
	
	
}
