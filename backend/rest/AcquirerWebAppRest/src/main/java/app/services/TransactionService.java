package app.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.Transaction;
import app.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;

	public Transaction save(Transaction transaction) {

		return transactionRepository.save(transaction);
	}

	public List<Transaction> findAll() {

		return (List<Transaction>) transactionRepository.findAll();
	}

	public Transaction findById(String id) {

		return transactionRepository.findOne(id);
	}

	public Transaction findByOrderIdAndTimestamp(int acquirerOrderId, Date acquirerTimestamp) {

		return transactionRepository.findByAcquirerOrderIdAndTimestamp(acquirerOrderId, acquirerTimestamp);
	}

	public Transaction findByPaymentId(int paymentId) {

		return transactionRepository.findByPaymentId(paymentId);
	}
	
	 List<Transaction>  findByTimestamp(Date d)
	  {
			return transactionRepository.findByTimestamp(d);
	  }

	public void remove(String id) {

		transactionRepository.delete(id);
	}

	public Transaction update(Transaction transaction) {

		return transactionRepository.save(transaction);
	}
}