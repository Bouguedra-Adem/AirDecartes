package com.example.AirDecarts.Service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.AirDecarts.Model.CapteurData;
import com.example.AirDecarts.Repo.DAECapteur;






@Service
public class CapteurService {

	@Resource
	private DAECapteur RepoCapteur ;
	
	

	public List<CapteurData> ReturnAllCapteurData () {
		
		
		return this.RepoCapteur.findAll();
		
	}
	
	
    public void SaveCapteurData(CapteurData data) {
    	
    	   this.RepoCapteur.save(data) ;
    }
	
    public void DeliteCapteurData(int code) {
    	
 	    this.RepoCapteur.deleteById(code); 
 	   
    } 
       
	public ArrayList<CapteurData> FiltreByDate (int yearStart , int MonthStart , int DayStart , int hourStart ,int MinStart,int yearEnd , int MonthEnd , int DayEnd , int hourEnd , int MinEnd) 
	{
	
		ArrayList<CapteurData> tmp = (ArrayList<CapteurData>) RepoCapteur.findAll() ;
		ArrayList<CapteurData> To_Return = new ArrayList<CapteurData>();
		
		for ( int i =0 ; i < tmp.size() ; i++  ) {
			
			
			if ( tmp.get(i).getYearobservation() > yearStart & tmp.get(i).getMonthobservation() > MonthStart & tmp.get(i).getDayobservation() > DayStart & tmp.get(i).getHourobservation() > hourStart & tmp.get(i).getMinuteobservation() > MinStart & tmp.get(i).getYearobservation() < yearEnd & tmp.get(i).getMonthobservation() < MonthEnd & tmp.get(i).getDayobservation() < DayEnd & tmp.get(i).getHourobservation() <= hourEnd & tmp.get(i).getMinuteobservation() > MinEnd )
			   {
				 
				 To_Return.add(tmp.get(i));
			   }
		}
		return To_Return;
	}
	
	
	
}
