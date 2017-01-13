package org.gobiiproject.gobiidao.entity.pojos;
// Generated Mar 31, 2016 1:44:38 PM by Hibernate Tools 3.2.2.GA


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Dataset generated by hbm2java
 */
@Entity
@Table(name="dataset"
    ,schema="public"
)
public class Dataset  implements java.io.Serializable {


     private int datasetId;
     private int experimentId;
     private int callinganalysisId;
     private Serializable analyses;
     private String dataTable;
     private String dataFile;
     private String qualityTable;
     private String qualityFile;
     private Serializable scores;
     private String createdBy;
     private Date createdDate;
     private String modifiedBy;
     private Date modifiedDate;
     private Integer status;

    public Dataset() {
    }

	
    public Dataset(int datasetId, int experimentId, int callinganalysisId, Serializable analyses, String dataTable, String dataFile) {
        this.datasetId = datasetId;
        this.experimentId = experimentId;
        this.callinganalysisId = callinganalysisId;
        this.analyses = analyses;
        this.dataTable = dataTable;
        this.dataFile = dataFile;
    }
    public Dataset(int datasetId, int experimentId, int callinganalysisId, Serializable analyses, String dataTable, String dataFile, String qualityTable, String qualityFile, Serializable scores, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate, Integer status) {
       this.datasetId = datasetId;
       this.experimentId = experimentId;
       this.callinganalysisId = callinganalysisId;
       this.analyses = analyses;
       this.dataTable = dataTable;
       this.dataFile = dataFile;
       this.qualityTable = qualityTable;
       this.qualityFile = qualityFile;
       this.scores = scores;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.modifiedBy = modifiedBy;
       this.modifiedDate = modifiedDate;
       this.status = status;
    }
   
     @Id 
    
    @Column(name="dataset_id", unique=true, nullable=false)
    public int getDatasetId() {
        return this.datasetId;
    }
    
    public void setDatasetId(int datasetId) {
        this.datasetId = datasetId;
    }
    
    @Column(name="experiment_id", nullable=false)
    public int getExperimentId() {
        return this.experimentId;
    }
    
    public void setExperimentId(int experimentId) {
        this.experimentId = experimentId;
    }
    
    @Column(name="callinganalysis_id", nullable=false)
    public int getCallinganalysisId() {
        return this.callinganalysisId;
    }
    
    public void setCallinganalysisId(int callinganalysisId) {
        this.callinganalysisId = callinganalysisId;
    }
    
    @Column(name="analyses", nullable=false)
    public Serializable getAnalyses() {
        return this.analyses;
    }
    
    public void setAnalyses(Serializable analyses) {
        this.analyses = analyses;
    }
    
    @Column(name="data_table", nullable=false)
    public String getDataTable() {
        return this.dataTable;
    }
    
    public void setDataTable(String dataTable) {
        this.dataTable = dataTable;
    }
    
    @Column(name="data_file", nullable=false)
    public String getDataFile() {
        return this.dataFile;
    }
    
    public void setDataFile(String dataFile) {
        this.dataFile = dataFile;
    }
    
    @Column(name="quality_table")
    public String getQualityTable() {
        return this.qualityTable;
    }
    
    public void setQualityTable(String qualityTable) {
        this.qualityTable = qualityTable;
    }
    
    @Column(name="quality_file")
    public String getQualityFile() {
        return this.qualityFile;
    }
    
    public void setQualityFile(String qualityFile) {
        this.qualityFile = qualityFile;
    }
    
    @Column(name="scores")
    public Serializable getScores() {
        return this.scores;
    }
    
    public void setScores(Serializable scores) {
        this.scores = scores;
    }
    
    @Column(name="created_by")
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="created_date", length=13)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    @Column(name="modified_by")
    public String getModifiedBy() {
        return this.modifiedBy;
    }
    
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="modified_date", length=13)
    public Date getModifiedDate() {
        return this.modifiedDate;
    }
    
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
    
    @Column(name="status")
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }




}


