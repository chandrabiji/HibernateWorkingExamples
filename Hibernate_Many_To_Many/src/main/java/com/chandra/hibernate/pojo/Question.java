package com.chandra.hibernate.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="QUESTION_MM")
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int qid;
	private String qname;
	@ManyToMany(targetEntity=Answer.class,cascade={CascadeType.ALL})
	@JoinTable(name="ANSWER_J", joinColumns={@JoinColumn(name="q_id")},
	   inverseJoinColumns={@JoinColumn(name="ans_id")})
	private List<Answer> ansers;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<Answer> getAnsers() {
		return ansers;
	}
	public void setAnsers(List<Answer> ansers) {
		this.ansers = ansers;
	}
	
	

}
