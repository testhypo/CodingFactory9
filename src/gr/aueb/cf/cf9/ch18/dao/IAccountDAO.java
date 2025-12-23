package gr.aueb.cf.cf9.ch18.dao;

import gr.aueb.cf.cf9.ch18.model.Account;

import java.util.List;
import java.util.Optional;

public interface IAccountDAO {
    Account saveOrUpdate(Account account);
    void remove(String iban);
    Optional<Account> findByIban(String iban);
    List<Account> getAllAccounts();
    // Queries
    boolean isAccountExists(String iban);
}
