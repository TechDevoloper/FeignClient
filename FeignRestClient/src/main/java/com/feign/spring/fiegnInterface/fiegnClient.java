package com.feign.spring.fiegnInterface;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.feign.spring.model.Post;

@FeignClient(name="fienClient", url = "https://jsonplaceholder.typicode.com")
public interface fiegnClient {
	@GetMapping("/posts")
	List<Post>getPost();
	

}
