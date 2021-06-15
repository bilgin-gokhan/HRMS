package com.gokhanbilgin.business.abstracts;

import java.util.List;

import com.gokhanbilgin.core.utilities.results.DataResult;
import com.gokhanbilgin.core.utilities.results.Result;
import com.gokhanbilgin.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	DataResult<List<JobAdvertisement>> getAll();

	Result add(JobAdvertisement jobAdvertisement);

	Result setJobAdvertisementPassive(int id);

	DataResult<List<JobAdvertisement>> findByIsActiveTrue();

	DataResult<List<JobAdvertisement>> findByIsActiveTrueOrderByCreatedAt();

	DataResult<List<JobAdvertisement>> findByIsActiveTrueAndByEmployer(int id);

}
