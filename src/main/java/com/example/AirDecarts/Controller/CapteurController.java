package com.example.AirDecarts.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.AirDecarts.Model.CapteurData;
import com.example.AirDecarts.Service.CapteurService;

@RestController

public class CapteurController {
	
	
	@Autowired
	@Resource
	private CapteurService CapteurService ;
	
	
	
	@GetMapping("/AllCapteurData")
	public 	List<CapteurData> AllDataCapteur() {
		
		return this.CapteurService.ReturnAllCapteurData();
		
	}
	
	@PostMapping("/AddData")
	public  void addUser ( @RequestBody CapteurData Data) {
		
		this.CapteurService.SaveCapteurData(Data);
		 
	}

	@GetMapping("/AllCapteurDataByDate")
	public 	List<CapteurData> AllDataCapteur(@RequestParam int yearStart ,@RequestParam int MonthStart ,@RequestParam int DayStart ,@RequestParam int hourStart ,@RequestParam int MinStart,@RequestParam int yearEnd ,@RequestParam int MonthEnd ,@RequestParam int DayEnd ,@RequestParam int hourEnd ,@RequestParam int MinEnd) {
		
		return this.CapteurService.FiltreByDate(yearStart, MonthStart, DayStart, hourStart, MinStart, yearEnd, MonthEnd, DayEnd, hourEnd, MinEnd);
		
	}
}
