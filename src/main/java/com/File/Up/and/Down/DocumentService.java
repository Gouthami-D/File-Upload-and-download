package com.File.Up.and.Down;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DocumentService {
	
	@Autowired
	public DocumentRepository documentRepository;
	
	public Doc saveFile(MultipartFile file) {
		String docname = file.getOriginalFilename();
		try {
			Doc doc = new Doc(docname,file.getContentType(),file.getBytes());
			return documentRepository.save(doc);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Optional<Doc> getFile(Integer fileId) {
		return documentRepository.findById(fileId);
		
	}
	public List<Doc> getFiles(){
		return documentRepository.findAll();
	}

}
