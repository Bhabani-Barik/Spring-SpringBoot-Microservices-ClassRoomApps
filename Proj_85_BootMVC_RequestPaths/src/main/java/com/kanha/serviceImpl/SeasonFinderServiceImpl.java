package com.kanha.serviceImpl;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.kanha.service.ISeasonFinderService;

@Service
public class SeasonFinderServiceImpl implements ISeasonFinderService {

	@Override
	public String findSeason() {

		// get System Date
		LocalDate ldate = LocalDate.now();

		// get current month value
		int month = ldate.getMonthValue();

		if (month >= 3 && month <= 6) {
			return "Summer Season";
		} else if (month >= 7 && month <= 10) {
			return "Rainy Season";
		} else {
			return "winter season";
		}
	}

}
