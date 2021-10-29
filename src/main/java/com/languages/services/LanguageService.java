package com.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.languages.models.LanguageModel;
import com.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository languageRepository;
	
    public LanguageService(LanguageRepository languageRepository) {
    	this.languageRepository = languageRepository;
    }
	
    public List<LanguageModel> allLanguages() {
        return languageRepository.findAll();
    }
    
    public LanguageModel createLanguage( LanguageModel languageModel ) {
		return languageRepository.save( languageModel );
	}
    
    public LanguageModel updateLanguage(LanguageModel languageModel) {
		return languageRepository.save(languageModel);
	}
    
    /*public LanguageModel updateLanguage(Long id, String languageName, String creatorName, float languageVersion) {
    	LanguageModel languageModel = new LanguageModel (languageName, creatorName, languageVersion);
        return languageRepository.save(languageModel);
    }*/
    
    public LanguageModel getLanguageById(Long id) {
        Optional<LanguageModel> optionalLanguageModel = languageRepository.findById(id);
        if(optionalLanguageModel.isPresent()) {
            return optionalLanguageModel.get();
        } else {
            return null;
        }
    } 
    
    public void deleteLanguage(Long id) {
    	languageRepository.deleteById(id);  
    }
    
}
