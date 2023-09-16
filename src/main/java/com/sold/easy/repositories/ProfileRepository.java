package com.sold.easy.repositories;

import com.sold.easy.model.car.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long>
{
	
}
