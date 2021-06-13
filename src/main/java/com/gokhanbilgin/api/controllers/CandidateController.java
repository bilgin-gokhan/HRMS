package com.gokhanbilgin.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gokhanbilgin.business.abstracts.CandidateService;
import com.gokhanbilgin.core.utilities.results.DataResult;
import com.gokhanbilgin.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

	private CandidateService candidateService;

	@Autowired
	public CandidateController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}

	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll() {
		return this.candidateService.getAll();
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody Candidate candidate) {
		return ResponseEntity.ok(this.candidateService.add(candidate));
	}

}
