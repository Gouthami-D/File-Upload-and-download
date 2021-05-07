package com.File.Up.and.Down;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "docs", schema = "public")
public class Doc {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "id_seq")
	@SequenceGenerator(name = "id_seq", sequenceName = "public.id_sequence", allocationSize = 1)

	@Column
	private Integer id;
	@Column
	private String docName;
	@Column
	private String docType;
	@Lob
	@Column
	private byte[] content;

	

	public Doc() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Doc(String docName, String docType, byte[] content) {
		this.docName = docName;
		this.docType = docType;
		this.content = content;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}
	
	
}