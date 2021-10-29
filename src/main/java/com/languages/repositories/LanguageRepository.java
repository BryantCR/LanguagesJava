package com.languages.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.languages.models.LanguageModel;

@Repository
public interface LanguageRepository extends CrudRepository< LanguageModel, Long >{
	
	List<LanguageModel> findAll(); // SELECT * FROM languages
	@SuppressWarnings("unchecked")
	//---------------------------------------------------------
	LanguageModel save( LanguageModel languageModel ); // INSERT INTO ...
	
	Optional<LanguageModel> findById(Long id);
	
	void deleteById(Long id);
}
