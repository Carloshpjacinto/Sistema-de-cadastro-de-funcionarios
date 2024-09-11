package br.com.kontopp.APIJAVA.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

public interface UserRepository extends CrudRepository<User, Integer>, ListPagingAndSortingRepository<User, Integer> {

}
