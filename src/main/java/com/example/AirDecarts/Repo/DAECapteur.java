package com.example.AirDecarts.Repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AirDecarts.Model.CapteurData;

public interface DAECapteur extends JpaRepository<CapteurData, Integer>{
	
	List<CapteurData> findByid (int id);
	List<CapteurData> findBycapteurfullname (String capteur_fullname);
	List<CapteurData> findBycodecapteur (int codecapteur );
	int deleteBycodecapteur (int codecapteur);
	

}
