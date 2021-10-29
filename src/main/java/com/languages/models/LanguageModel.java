package com.languages.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/*import org.springframework.data.repository.CrudRepository;*/

@Entity
@Table(name = "languages")
public class LanguageModel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 2, max = 100)
    private String languageName;
    @NotNull
    @Size(min = 5, max = 200)
    private String creatorName;
    @NotNull
    private Float languageVersion;
    
    /*// This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date created_at;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updated_at;*/
    
    // COSTRUCTOR
    
    public LanguageModel() {
    	// Empty Constructor
    }
    
    public LanguageModel(String languageName, String creatorName, Float languageVersion) {
        this.languageName = languageName;
        this.creatorName = creatorName;
        this.languageVersion = languageVersion;
    }
    
    public LanguageModel(Long id, String languageName, String creatorName, Float languageVersion) {
		this.id = id;
        this.languageName = languageName;
        this.creatorName = creatorName;
        this.languageVersion = languageVersion;
    }
    
    /*@PrePersist
    protected void onCreate(){
        this.created_at = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updated_at = new Date();
    }*/

    // GETTERS
    
    public Long getId() {
		return id;
	}
    public String getLanguageName() {
		return languageName;
	}
    public String getCreatorName() {
		return creatorName;
	}
    public Float getLanguageVersion() {
		return languageVersion;
	}
    /*public Date getCreated_at() {
		return created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}*/
    
    
    // SETTERS
    
    public void setId(Long id) {
		this.id = id;
	}
    public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
    public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
    public void setLanguageVersion(Float languageVersion) {
		this.languageVersion = languageVersion;
	}
    /*public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
    public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}*/
    
}
