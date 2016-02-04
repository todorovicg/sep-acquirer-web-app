package app.model.transferData;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PaymentCardInfo {

	@NotNull(message = "error.creditCard.notnull")
	private String creditCard;

	@NotNull(message = "error.cardNumber.notnull")
	@Size(min = 16, max = 16, message = "error.pan.size")
	private String cardNumber;

	@NotNull(message = "error.expirationMonth.notnull")
	private Integer expirationMonth;

	@NotNull(message = "error.expirationYear.notnull")
	private Integer expirationYear;

	@NotNull(message = "error.cardHolderName.notnull")
	private String cardholderName;

	@NotNull(message = "error.cardHolderSurname.notnull")
	private String cardholderSurname;

	private Integer securityCode;

	public PaymentCardInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentCardInfo(String creditCard, String cardNumber, Integer expirationMonth, Integer expirationYear,
			String cardHolderName, String cardHolderSurname, Integer securityCode) {
		super();
		this.creditCard = creditCard;
		this.cardNumber = cardNumber;
		this.expirationMonth = expirationMonth;
		this.expirationYear = expirationYear;
		this.cardholderName = cardHolderName;
		this.cardholderSurname = cardHolderSurname;
		this.securityCode = securityCode;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Integer getExpirationMonth() {
		return expirationMonth;
	}

	public void setExpirationMonth(Integer expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	public Integer getExpirationYear() {
		return expirationYear;
	}

	public void setExpirationYear(Integer expirationYear) {
		this.expirationYear = expirationYear;
	}

	public Integer getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(Integer securityCode) {
		this.securityCode = securityCode;
	}

	public String getCardholderName() {
		return cardholderName;
	}

	public void setCardholderName(String cardholderName) {
		this.cardholderName = cardholderName;
	}

	public String getCardholderSurname() {
		return cardholderSurname;
	}

	public void setCardholderSurname(String cardholderSurname) {
		this.cardholderSurname = cardholderSurname;
	}

	@Override
	public String toString() {
		return "PaymentCardInfo [creditCard=" + creditCard + ", cardNumber=" + cardNumber + ", expirationMonth="
				+ expirationMonth + ", expirationYear=" + expirationYear + ", cardHolderName=" + cardholderName
				+ ", cardHolderSurname=" + cardholderSurname + ", securityCode=" + securityCode + "]";
	}

}