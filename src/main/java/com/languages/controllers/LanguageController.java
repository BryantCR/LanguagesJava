package com.languages.controllers;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.languages.models.LanguageModel;
import com.languages.services.LanguageService;

@Controller
public class LanguageController {

	private final LanguageService languageService;
	
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@RequestMapping(value = "/languages", method = RequestMethod.GET)
    public String homePageLanguage(@ModelAttribute("languageModel") LanguageModel languageModel, Model model ) {
		List<LanguageModel> languageList = languageService.allLanguages();
		System.out.println("AA"+ languageList);
		
		model.addAttribute( "languageList", languageList );
        return "index.jsp";
    }
	
	@RequestMapping(value = "/addlanguages", method = RequestMethod.POST)
	public String homePageAddLanguage( @RequestParam( value = "languageName" ) String languageName, @RequestParam( value = "creatorName" ) String creatorName, 
									   @RequestParam(value = "languageVersion") float languageVersion, RedirectAttributes redirectAttributes)
	{
		LanguageModel langM = new LanguageModel(languageName, creatorName, languageVersion);
		System.out.println("BB"+ langM);
		languageService.createLanguage(langM);
        return "redirect:/languages";
		
	}
	
	@RequestMapping(value = "/languages/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable("id") Long id, Model model) {
		LanguageModel languageModel = languageService.getLanguageById(id);
		//languageService.getLanguageById(id);
		model.addAttribute( "languageList", languageModel );
        return "edit.jsp";
    }
	
	@RequestMapping(value ="/update/language/{id}", method = RequestMethod.POST)
	public String updateLanguage(@RequestParam(value = "id") Long id,
								 @RequestParam(value = "editlanguageName") String languageName,
								 @RequestParam(value = "editcreatorName") String creatorName,
								 @RequestParam(value = "editlanguageVersion") float languageVersion) {
		
		LanguageModel langM = new LanguageModel(id,languageName,creatorName,languageVersion);
		languageService.updateLanguage(langM);
			return "redirect:/languages";
	}
	
    /*@RequestMapping(value="/edit/{id}", method = RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("languageModel") LanguageModel languageModel, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
        	languageService.updateLanguage(languageModel);
            return "redirect:/books";
        }
    }*/
	
	@RequestMapping( value="/showlanguage/{id}", method = RequestMethod.GET )
	public String showLanguageInfo(@PathVariable("id") Long id, Model model) {
		
		LanguageModel languageModel = languageService.getLanguageById(id);
		
		model.addAttribute("languageList", languageModel);
		
		return "showview.jsp";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.POST)
	public String Delete(@PathVariable("id") Long id) {
		languageService.deleteLanguage(id);
		return "redirect:/languages";
	}
	
}
