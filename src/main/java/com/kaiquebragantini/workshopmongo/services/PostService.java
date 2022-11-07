package com.kaiquebragantini.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaiquebragantini.workshopmongo.domain.Post;
import com.kaiquebragantini.workshopmongo.repositories.PostRepository;
import com.kaiquebragantini.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	public List<Post> findAll() {
		return repository.findAll();
	}

	public Post findById(String id) {
		Optional<Post> post = repository.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado"));
	}
	
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}

	public Post update(Post obj) {
		Post post = findById(obj.getId());
		updateData(post, obj);
		return repository.save(post);
	}

	private void updateData(Post post, Post obj) {
		post.setTitle(obj.getTitle());
		post.setBody(obj.getBody());
	}
}
